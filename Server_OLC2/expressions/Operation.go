package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
)

type Operation struct {
	Lin      int
	Col      int
	Op_izq   interfaces.Expression
	Operador string
	Op_der   interfaces.Expression
}

func NewOperation(lin int, col int, Op1 interfaces.Expression, Operador string, Op2 interfaces.Expression) Operation {
	exp := Operation{Lin: lin, Col: col, Op_izq: Op1, Operador: Operador, Op_der: Op2}
	return exp
}

func (o Operation) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var dominante environment.TipoExpresion

	tabla_dominante := [5][5]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				BOOLEAN				NULL
		{environment.INTEGER, environment.FLOAT, environment.STRING, environment.BOOLEAN, environment.NULL},
		//FLOAT
		{environment.FLOAT, environment.FLOAT, environment.STRING, environment.NULL, environment.NULL},
		//STRING
		{environment.STRING, environment.STRING, environment.STRING, environment.STRING, environment.NULL},
		//BOOLEAN
		{environment.BOOLEAN, environment.NULL, environment.STRING, environment.BOOLEAN, environment.NULL},
		//NULL
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
	}

	var op1, op2, result environment.Value

	newTemp := gen.NewTemp()

	switch o.Operador {
	case "+":
		{

			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)

			//validar tipo dominante
			dominante = tabla_dominante[op1.Type][op2.Type]
			//valida el tipo

			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				fmt.Println(op1.Value)
				fmt.Println(op2.Value)
				gen.AddExpression(newTemp, op1.Value, op2.Value, "+")
				result = environment.NewValue(newTemp, true, dominante)
				result.IntValue = op1.IntValue + op2.IntValue
				print("int: ")
				println(result.IntValue)
				return result
			} else if dominante == environment.STRING {
				/*var val = */ gen.AddConcatString( /*newTemp, op1.Value, op2.Value*/ )
				println("--------Conca")

				gen.Concat = true

				println(gen.Concat)
				temp1 := gen.NewTemp() //12
				temp2 := gen.NewTemp() //13
				temp3 := gen.NewTemp() //14
				//var result1 string
				/*for i := 0; i < len(op1.Value); i++ {
					result1 +=
				}

				for i := 0; i < len(op2.Value); i++ {

				}*/
				result1 := string(op1.Value)
				result2 := string(op2.Value)
				if gen.Temp_Concat != "" {
					println("si entre siuuu")
					result1 = gen.Temp_Concat
				}
				size := strconv.Itoa(env.(environment.Environment).Size["size"])
				gen.AddComment("Concatenacion en suma string----INICIO")
				gen.AddExpression("P", "P", size, "+")
				gen.AddExpression(temp1, "P", "1", "+")
				gen.AddSetStack("(int)"+temp1, result1)
				gen.AddExpression(temp2, "P", "2", "+")
				gen.AddSetStack("(int)"+temp2, result2)
				gen.AddCall("concat_string_proc")
				gen.AddGetStack(temp3, "(int)P")

				gen.AddExpression("P", "P", size, "-")
				gen.AddComment("Concatenacion en suma string---FIN")

				gen.Temp_Concat = temp3

				println("result 1 : ", gen.Temp_Concat)
				//fmt.Println(val)
				result = environment.NewValue(op1.Value+op2.Value, true, dominante)
				fmt.Println(result)
				return result
			} else {
				ast.SetError("ERROR: No es posible sumar")
			}
		}
	case "-":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "-")
				result = environment.NewValue(newTemp, true, dominante)
				result.IntValue = op1.IntValue - op2.IntValue
				return result
			} else {
				ast.SetError("ERROR: No es posible restar")
			}

		}
	case "%":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				if (string(op1.Value[0]) == "t") && string(op2.Value[0]) == "t" {
					fmt.Println("hay t op1")
					fmt.Println("op1: ", op1.Value, "op2: ", op2.Value)
					gen.AddExpression(newTemp, "(int)"+op1.Value, "(int)"+op2.Value, "%")
					result = environment.NewValue(newTemp, true, dominante)
					result.IntValue = op1.IntValue % op2.IntValue
					fmt.Println("MODULO: ", result.IntValue)
				} else if string(op1.Value[0]) == "t" {
					fmt.Println("hay t op1")
					fmt.Println("op1: ", op1.Value, "op2: ", op2.Value)
					gen.AddExpression(newTemp, "(int)"+op1.Value, op2.Value, "%")
					result = environment.NewValue(newTemp, true, dominante)
					result.IntValue = op1.IntValue % op2.IntValue
					fmt.Println("MODULO: ", result.IntValue)
				} else if string(op2.Value[0]) == "t" {
					fmt.Println("hay t op")
					fmt.Println("op1: ", op1.Value, "op2: ", "(int)"+op2.Value)
					gen.AddExpression(newTemp, op1.Value, op2.Value, "%")
					result = environment.NewValue(newTemp, true, dominante)
					result.IntValue = op1.IntValue % op2.IntValue
					fmt.Println("MODULO: ", result.IntValue)
				} else {
					fmt.Println("op1: ", op1.Value, "op2: ", op2.Value)
					gen.AddExpression(newTemp, op1.Value, op2.Value, "%")
					result = environment.NewValue(newTemp, true, dominante)
					result.IntValue = op1.IntValue % op2.IntValue
					fmt.Println("MODULO: ", result.IntValue)
				}

				return result
			} else {
				ast.SetError("ERROR: No es posible restar")
			}

		}
	case "neg":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]

			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, "0", op1.Value, "-")
				result = environment.NewValue(newTemp, true, dominante)
				result.IntValue = 0 - op2.IntValue
				return result
			} else {
				ast.SetError("ERROR: No es posible restar")
			}
		}
	case "*":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				gen.AddExpression(newTemp, op1.Value, op2.Value, "*")
				result = environment.NewValue(newTemp, true, dominante)
				result.IntValue = op1.IntValue * op2.IntValue
				return result
			} else {
				ast.SetError("ERROR: No es posible Multiplicar")
			}
		}
	case "/":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				lvl1 := gen.NewLabel() //70
				lvl2 := gen.NewLabel() //71
				lvl3 := gen.NewLabel() //72
				//lvl4 := gen.NewLabel() //73
				temp1 := gen.NewTemp() //82
				temp2 := gen.NewTemp() //83
				gen.AddIf(op2.Value, "0", "==", lvl1)
				gen.AddGoto(lvl2)
				gen.AddLabel(lvl1)
				gen.AddPrintf("c", "77")
				gen.AddPrintf("c", "97")
				gen.AddPrintf("c", "116")
				gen.AddPrintf("c", "104")
				gen.AddPrintf("c", "69")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "114")
				gen.AddPrintf("c", "111")
				gen.AddPrintf("c", "114")
				gen.AddExpression(temp1, "0", "", "")
				gen.AddGoto(lvl3)
				gen.AddLabel(lvl2)
				gen.AddExpression(newTemp, op1.Value, op2.Value, "/")
				gen.AddLabel(lvl3)
				gen.AddExpression(temp2, op1.Value, "1", "-")
				gen.AddSetStack("(int)0", temp2)
				result = environment.NewValue(newTemp, true, dominante)

				return result
			} else {
				ast.SetError("ERROR: No es posible Dividir")
			}

		}
	case "<":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {
				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "<", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueLabel)
				result.FalseLabel = append(result.FalseLabel, falseLabel)
				return result

			} else {
				ast.SetError("ERROR: No es posible comparar <")
			}
		}
	case ">":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, ">", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueLabel)
				result.FalseLabel = append(result.FalseLabel, falseLabel)
				return result
			} else {
				ast.SetError("ERROR: No es posible comparar >")
			}
		}
	case "<=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "<=", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueLabel)
				result.FalseLabel = append(result.FalseLabel, falseLabel)
				return result
			} else {
				ast.SetError("ERROR: No es posible comparar <=")
			}
		}
	case ">=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, ">=", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueLabel)
				result.FalseLabel = append(result.FalseLabel, falseLabel)
				return result
			} else {
				ast.SetError("ERROR: No es posible comparar >=")
			}
		}
	case "==":
		{
			fmt.Println("----->", o.Op_izq)
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "==", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueLabel)
				result.FalseLabel = append(result.FalseLabel, falseLabel)
				return result
			} else if dominante == environment.BOOLEAN {
				gen.AddComment("Validacion entre dos BOOL")
				println("-------EN BOOL------")

				fmt.Println("op1T", op1.TrueLabel)
				fmt.Println("op2T", op2.TrueLabel)
				fmt.Println("op1F", op1.FalseLabel)
				fmt.Println("op2F", op2.FalseLabel)

				label1 := op1.TrueLabel[0]
				label2 := op2.TrueLabel[0]
				label3 := op1.FalseLabel[0]
				label4 := op2.FalseLabel[0]

				label5 := gen.NewLabel() //64
				label6 := gen.NewLabel() //65
				label7 := gen.NewLabel() //62
				label8 := gen.NewLabel() //63

				temp1 := gen.NewTemp()

				gen.Code = append(gen.Code, label1, ":\n")
				gen.AddExpression(temp1, "1", "", "")
				gen.AddGoto(label5)
				gen.Code = append(gen.Code, label3, ":\n")
				gen.AddExpression(temp1, "0", "", "")
				gen.AddLabel(label5)
				println("->>>", gen.Temp_Label1)
				println("->>>", gen.Temp_Label2)
				println(label4.(string))
				if gen.Temp_Label1 == "" || gen.Temp_Label2 == "" {
					if gen.Temp_Label1 == "L2" {
						println("primer if")
						gen.Code = append(gen.Code, "goto", label2, ";\n")
						gen.Temp_Label1 = ""
						gen.Temp_Label2 = ""
					} else {

						println("else")
						gen.Code = append(gen.Code, "goto", label4, ";\n")
						gen.Temp_Label1 = ""
						gen.Temp_Label2 = ""
					}
				} else {
					if gen.Temp_Label2 == "L3" {
						gen.Code = append(gen.Code, "goto", label4, ";\n")
						gen.Temp_Label1 = ""
						gen.Temp_Label2 = ""
					} else {
						gen.Code = append(gen.Code, "goto", label2, ";\n")
						gen.Temp_Label1 = ""
						gen.Temp_Label2 = ""
					}

				}

				gen.Code = append(gen.Code, label2, ":\n")
				gen.AddExpression(temp1, temp1, "1", "+")
				gen.AddGoto(label6)
				gen.Code = append(gen.Code, label4, ":\n")
				gen.AddExpression(temp1, temp1, "0", "+")
				gen.AddLabel(label6)
				gen.AddIf(temp1, "1", "!=", label7)
				gen.AddGoto(label8)
				//gen.AddLabel(label7)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, label7)
				result.FalseLabel = append(result.FalseLabel, label8)
				return result

			} else {
				ast.SetError("ERROR: No es posible comparar ==")
			}
		}
	case "!=":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			op2 = o.Op_der.Ejecutar(ast, env, gen)
			dominante = tabla_dominante[op1.Type][op2.Type]
			if dominante == environment.INTEGER || dominante == environment.FLOAT {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(op1.Value, op2.Value, "!=", trueLabel)
				gen.AddGoto(falseLabel)

				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(result.TrueLabel, trueLabel)
				result.FalseLabel = append(result.FalseLabel, falseLabel)
				return result
			} else {
				ast.SetError("ERROR: No es posible comparar !=")
			}
		}
	case "&&":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			//add op1 labels
			for _, lvl := range op1.TrueLabel {
				gen.AddLabel(lvl.(string))
			}

			op2 = o.Op_der.Ejecutar(ast, env, gen)

			result = environment.NewValue("", false, environment.BOOLEAN)
			result.TrueLabel = append(op2.TrueLabel, result.TrueLabel...)
			result.FalseLabel = append(op1.FalseLabel, result.FalseLabel...)
			result.FalseLabel = append(op2.FalseLabel, result.FalseLabel...)
			return result
		}
	case "||":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)

			for _, lvl := range op1.FalseLabel {
				gen.AddLabel(lvl.(string))
			}
			op2 = o.Op_der.Ejecutar(ast, env, gen)

			result = environment.NewValue("", false, environment.BOOLEAN)

			result.TrueLabel = append(op1.TrueLabel, result.TrueLabel...)
			result.TrueLabel = append(op2.TrueLabel, result.TrueLabel...)
			result.FalseLabel = append(op2.FalseLabel, result.FalseLabel...)
			return result
		}
	case "!":
		{
			op1 = o.Op_izq.Ejecutar(ast, env, gen)
			if op1.Type == environment.BOOLEAN {
				result = environment.NewValue("", false, environment.BOOLEAN)
				result.TrueLabel = append(op1.FalseLabel, result.TrueLabel)
				result.FalseLabel = append(op1.TrueLabel, result.FalseLabel)
				return result
			} else {
				ast.SetError("ERROR: tipo no compatible !")
			}
		}
	}
	gen.AddBr()
	return environment.Value{}
}
