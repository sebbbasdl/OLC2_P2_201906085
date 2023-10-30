package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
	"strings"
)

type Conversion struct {
	Line      int
	Column    int
	Expr      interfaces.Expression
	Tipo      environment.TipoExpresion
	valor_str string
}

func NewConversion(line int, column int, Expr interfaces.Expression, Tipo environment.TipoExpresion, val_str string) Conversion {
	exp := Conversion{line, column, Expr, Tipo, val_str}
	return exp
}

func (o Conversion) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value

	if o.Tipo == environment.INTEGER {
		expr := o.Expr.Ejecutar(ast, env, gen)

		if expr.Type == environment.STRING {
			gen.AddComment("Conversion")
			//valor := expr.Value
			fmt.Println("EXPRRR", o.valor_str)
			valor := strings.Trim(o.valor_str, "\"")

			intValue, err := strconv.Atoi(valor)

			if err != nil {
				// Manejar el error aquí, por ejemplo, imprimir un mensaje de error
				fmt.Println("Error al convertir a entero:", err)
				// Puedes decidir qué hacer en caso de error, por ejemplo, devolver un valor predeterminado
				ast.SetError("Hubo un error en la conversion de int a String")
				return environment.Value{IntValue: 0}
			}

			result = environment.NewValue(fmt.Sprintf("%v", intValue), false, o.Tipo)

			return result
		}
	} else if o.Tipo == environment.STRING {
		expr := o.Expr.Ejecutar(ast, env, gen)

		if expr.Type == environment.INTEGER {
			gen.AddComment("Conversion")
			//valor := expr.Value
			fmt.Println("EXPRRR", o.valor_str)
			valor := strings.Trim(o.valor_str, "\"")
			fmt.Println("----- aca es primitive", gen.Concat)
			gen.AddComment("Primitive")
			//nuevo temporal
			newTemp := gen.NewTemp()
			//iguala a heap pointer
			gen.AddAssign(newTemp, "H")
			//recorremos string en ascii

			byteArray := []byte(valor)
			for _, asc := range byteArray {
				//se agrega ascii al heap
				gen.AddSetHeap("(int)H", strconv.Itoa(int(asc)))
				//suma heap pointer
				gen.AddExpression("H", "H", "1", "+")
			}
			//caracteres de escape
			gen.AddSetHeap("(int)H", "-1")
			gen.AddExpression("H", "H", "1", "+")
			gen.AddBr()
			
			result = environment.NewValue(newTemp, true, o.Tipo)

			return result
		}
	}

	return result
}
