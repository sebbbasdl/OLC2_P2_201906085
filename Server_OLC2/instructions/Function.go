package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
	"strings"
)

type Function struct {
	Lin     int
	Col     int
	Id      string
	ListDec []interface{}
	Tipo    environment.TipoExpresion
	Bloque  []interface{}
}

func NewFunction(lin int, col int, id string, listd []interface{}, tipo environment.TipoExpresion, bloc []interface{}) Function {
	instr := Function{lin, col, id, listd, tipo, bloc}
	return instr
}

func (p Function) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	gen.SetMainFlag(false)
	gen.AddComment("******** Funcion " + p.Id)
	gen.AddTittle(p.Id)
	//entorno
	var envFunc environment.Environment
	envFunc = environment.NewEnvironment(env.(environment.Environment), p.Id)
	envFunc.Size["size"] = envFunc.Size["size"] + 1

	/*********TABLA DE SIMBOLOS***********/
	if result.Type == environment.INTEGER {
		datos := []string{"1", "Función", "Int", env.(environment.Environment).Id, strconv.Itoa(p.Col), strconv.Itoa(p.Lin), p.Id}
		ast.Tabla = append(ast.Tabla, datos)
	} else if result.Type == environment.FLOAT {
		datos := []string{"1", "Función", "Float", env.(environment.Environment).Id, strconv.Itoa(p.Col), strconv.Itoa(p.Lin), p.Id}
		ast.Tabla = append(ast.Tabla, datos)
	} else if result.Type == environment.STRING {
		datos := []string{"1", "Función", "String", env.(environment.Environment).Id, strconv.Itoa(p.Col), strconv.Itoa(p.Lin), p.Id}
		ast.Tabla = append(ast.Tabla, datos)
	} else if result.Type == environment.BOOLEAN {
		datos := []string{"1", "Función", "Bool", env.(environment.Environment).Id, strconv.Itoa(p.Col), strconv.Itoa(p.Lin), p.Id}
		ast.Tabla = append(ast.Tabla, datos)
	}
	/*********TABLA DE SIMBOLOS***********/

	//variables
	for _, s := range p.ListDec {
		res := s.(interfaces.Instruction).Ejecutar(ast, env, gen)
		envFunc.SaveVariable(res.(environment.Value).Value, res.(environment.Value).Type)
	}
	//instrucciones func
	for _, s := range p.Bloque {
		if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
			resInst := s.(interfaces.Instruction).Ejecutar(ast, envFunc, gen)
			if gen.ReturnBool {
				gen.AddComment("Return")

				out := gen.NewLabel()
				//gen.AddGoto(out)
				gen.AddLabel(out)
				//OutLvls = append(OutLvls, out)
				gen.ReturnBool = false
				//break
			}
			if resInst != nil {
				//agregando etiquetas de salida
				for _, lvl := range resInst.(environment.Value).OutLabel {
					gen.AddLabel(lvl.(string))
				}
			}
		} else if strings.Contains(fmt.Sprintf("%T", s), "expressions") {
			result = s.(interfaces.Expression).Ejecutar(ast, envFunc, gen)
			//agregando etiquetas de salida
			for _, lvl := range result.OutLabel {
				gen.AddLabel(lvl.(string))
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}
	gen.AddEnd()
	gen.SetMainFlag(true)
	return nil
}
