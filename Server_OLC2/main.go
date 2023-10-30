package main

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"Server2/parser"
	"fmt"
	"os"
	"os/exec"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/cors"
)

type TreeShapeListener struct {
	*parser.BaseSwiftGrammarListener
	Code []interface{}
}

type Resp struct {
	Output  string
	Flag    bool
	Message string
}

type Message struct {
	Content string `json:"content"`
}

// Tabla de simbolos DOT
func GenerateTableDOT(data [][]string) string {
	contador := 0
	dotTable := "digraph Table {\n"
	dotTable += "  node [shape=none fontname=Helvetica]\n"

	// Encabezado de la tabla
	dotTable += "  n1 [label = <<table>\n"
	dotTable += "    <tr><td colspan=\"9\" bgcolor=\"Peru\">Tabla</td></tr>\n"
	dotTable += "    <tr><td bgcolor=\"orange\">ID</td><td bgcolor=\"orange\">Tipo Símbolo</td><td bgcolor=\"orange\">Tipo Dato</td><td bgcolor=\"orange\">Ámbito</td><td bgcolor=\"orange\">Línea</td><td bgcolor=\"orange\">Columna</td><td bgcolor=\"orange\">Id</td></tr>"

	// Filas de datos
	for _, row := range data {
		if len(row) >= 6 {
			contador++
			contadorStr := fmt.Sprintf("%d", contador) // Convertir contador a cadena
			dotTable += fmt.Sprintf("    <tr><td bgcolor=\"#00bfff\">%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>\n", contadorStr, row[1], row[2], row[3], row[4], row[5], row[6])
		}
	}

	// Cierre de la tabla
	dotTable += "  </table>> ]\n"

	dotTable += "}\n"

	return dotTable
}

func generarDot(dotData string, rutaArchivo string, nombreArchivo string) error {
	// Crear el archivo DOT en la ubicación especificada
	archivo, err := os.Create(rutaArchivo + "/" + nombreArchivo + ".dot")
	if err != nil {
		return err
	}
	defer archivo.Close()

	// Escribir los datos DOT en el archivo
	_, err = archivo.WriteString(dotData)
	if err != nil {
		return err
	}

	return nil
}

func generarImagen(rutaDot string, rutaImagen string, nombreArchivo string) error {
	// Comando para generar la imagen SVG desde el archivo DOT
	cmd := exec.Command("dot", "-Tpng", rutaDot, "-o", rutaImagen+"\\"+nombreArchivo+".png")

	// Ejecutar el comando
	err := cmd.Run()
	if err != nil {
		return err
	}

	return nil
}

type ErrorType int

const (
	LexicalError ErrorType = iota
	SyntaxTypeError
)

type ErrorInfo struct {
	Type    ErrorType
	Line    int
	Column  int
	Message string
}

type ErrorListener struct {
	*antlr.DefaultErrorListener
	Errors []ErrorInfo
}

func NewErrorListener() *ErrorListener {
	return &ErrorListener{}
}

func (e *ErrorListener) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, ex antlr.RecognitionException) {
	errorType := LexicalError

	if _, ok := offendingSymbol.(antlr.Token); ok {
		errorType = SyntaxTypeError
	}

	errorInfo := ErrorInfo{
		Type:    errorType,
		Line:    line,
		Column:  column,
		Message: msg,
	}
	e.Errors = append(e.Errors, errorInfo)
}

func GenerateErrorDOT(errors []ErrorInfo, data [][]string) string {
	// Inicializar la cadena DOT
	dotTable := "digraph ErrorTable {\n"
	dotTable += "  node [shape=none fontname=Helvetica]\n"

	// Encabezado de la tabla
	dotTable += "  n1 [label = <<table>\n"
	dotTable += "    <tr><td colspan=\"4\" bgcolor=\"Peru\">Errores</td></tr>\n"
	dotTable += "    <tr><td bgcolor=\"orange\">Tipo</td><td bgcolor=\"orange\">Línea</td><td bgcolor=\"orange\">Columna</td><td bgcolor=\"orange\">Mensaje</td></tr>"

	// Filas de datos
	for _, errorInfo := range errors {
		errorType := ""
		switch errorInfo.Type {
		case LexicalError:
			errorType = "Lexico"
		case SyntaxTypeError:
			errorType = "Sintactico"
		default:
			errorType = "Desconocido"
		}

		// Escapar caracteres especiales en el mensaje para .dot
		message := strings.ReplaceAll(errorInfo.Message, "\"", "\\\"")
		message = strings.ReplaceAll(message, "<", "&lt;")
		message = strings.ReplaceAll(message, ">", "&gt;")

		dotTable += fmt.Sprintf("    <tr><td>%s</td><td>%d</td><td>%d</td><td>%s</td></tr>\n", errorType, errorInfo.Line, errorInfo.Column, message)
	}

	contador := 0
	println("ESTOY EN TABLA ERRORES")
	for _, row := range data {
		if len(row) >= 3 {
			contador++
			dotTable += fmt.Sprintf("    <tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>\n", row[0], row[1], row[2], row[3])
		}
	}

	// Cierre de la tabla
	dotTable += "  </table>> ]\n"

	dotTable += "}\n"

	return dotTable
}

func handleInterpreter(c *fiber.Ctx) error {
	var message Message
	if err := c.BodyParser(&message); err != nil {
		return err
	}
	//Entrada
	code := message.Content
	//Leyendo entrada
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	errorListener := NewErrorListener()
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(errorListener)

	//creacion de parser
	p := parser.NewSwiftGrammarParser(tokens)
	p.RemoveErrorListeners() // Remove the default error listener
	p.AddErrorListener(errorListener)
	p.BuildParseTrees = true
	tree := p.S()
	//listener
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	//create ast
	var Ast environment.AST
	//create env
	var globalEnv environment.Environment = environment.NewEnvironment(nil, "GLOBAL")
	//create generator
	var Generator generator.Generator
	Generator = generator.NewGenerator()
	//running main
	Generator.MainCode = true
	//ejecución
	for _, bloc := range Code {
		if strings.Contains(fmt.Sprintf("%T", bloc), "instructions") {
			resInst := bloc.(interfaces.Instruction).Ejecutar(&Ast, globalEnv, &Generator)
			if resInst != nil {
				//agregando etiquetas de salida
				for _, lvl := range resInst.(environment.Value).OutLabel {
					Generator.AddLabel(lvl.(string))
				}
			}
		}
	}

	for _, errorInfo := range errorListener.Errors {
		errorType := ""
		switch errorInfo.Type {
		case LexicalError:
			errorType = "Lexical"
		case SyntaxTypeError:
			errorType = "Syntax Error"
		default:
			errorType = "Unknown"
		}

		fmt.Printf("%s error at line %d, column %d: %s\n", errorType, errorInfo.Line, errorInfo.Column, errorInfo.Message)
	}

	//add headers, natives & main
	Generator.GenerateFinalCode()
	var ConsoleOut = ""
	if Ast.GetErrors() == "" {
		for _, item := range Generator.GetFinalCode() {
			ConsoleOut += item.(string)
		}
	} else {
		ConsoleOut = Ast.GetErrors()
	}
	response := Resp{
		Output:  ConsoleOut,
		Flag:    true,
		Message: "Ejecución realizada con éxito",
	}
	//Tabla de simbolos
	dotTable := GenerateTableDOT(Ast.Tabla)
	rutaImagenTabla := "C:\\Users\\Usuario\\Documents\\OLC2_P2_201906085\\Server_OLC2\\imagenes"
	nombreArchivoTabla := "tabla"

	if err := generarDot(dotTable, rutaImagenTabla, nombreArchivoTabla); err != nil {
		fmt.Println("Error al generar el archivo DOT:", err)
		//return nil
	}

	// Llama a la función generarImagen para crear la imagen PNG a partir del archivo DOT
	if err := generarImagen(rutaImagenTabla+"/"+nombreArchivoTabla+".dot", rutaImagenTabla, nombreArchivoTabla); err != nil {
		fmt.Println("Error al generar la imagen Tabla:", err)
		//return nil
	}

	//Tabla de Errores
	errors := errorListener.Errors
	dotError := GenerateErrorDOT(errors, Ast.Errores_Semanticos)
	rutaImagenError := "C:\\Users\\Usuario\\Documents\\OLC2_P2_201906085\\Server_OLC2\\imagenes"
	nombreArchivoError := "errores"

	if err := generarDot(dotError, rutaImagenError, nombreArchivoError); err != nil {
		fmt.Println("Error al generar el archivo DOT:", err)
		//return nil
	}

	// Llama a la función generarImagen para crear la imagen SVG a partir del archivo DOT
	if err := generarImagen(rutaImagenError+"\\"+nombreArchivoError+".dot", rutaImagenError, nombreArchivoError); err != nil {
		fmt.Println("Error al generar la imagen Error:", err)
		//return nil
	}

	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {
	app := fiber.New()
	app.Use(cors.New())
	app.Post("/Interpreter", handleInterpreter)
	app.Listen(":3002")
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}
