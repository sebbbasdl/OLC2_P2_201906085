package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
)

type Print struct {
	Lin   int
	Col   int
	Value interface{}
}

func NewPrint(lin int, col int, val interface{}) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	result = p.Value.(interfaces.Expression).Ejecutar(ast, env, gen)
	fmt.Println("TYPE----", result.Type)
	fmt.Println("HOLASIUUUUUU", result)
	if result.Type == environment.INTEGER || result.Type == environment.ARRAY {
		gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", result.Value))
		gen.AddPrintf("c", "10")
		gen.AddBr()
	} else if result.Type == environment.BOOLEAN {
		if result.IsTemp {
			//cuando es variable
		}
		newLabel := gen.NewLabel()
		//add labels
		for _, lvl := range result.TrueLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddPrintf("c", "(char)116")
		gen.AddPrintf("c", "(char)114")
		gen.AddPrintf("c", "(char)117")
		gen.AddPrintf("c", "(char)101")
		gen.AddGoto(newLabel)
		//add labels
		for _, lvl := range result.FalseLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddPrintf("c", "(char)102")
		gen.AddPrintf("c", "(char)97")
		gen.AddPrintf("c", "(char)108")
		gen.AddPrintf("c", "(char)115")
		gen.AddPrintf("c", "(char)101")
		gen.AddLabel(newLabel)
		gen.AddPrintf("c", "10")
		gen.AddBr()
	} else if result.Type == environment.STRING || result.Type == environment.FLOAT {
		//llamar a generar printstring
		gen.AddComment("Aqui string en print")

		if gen.Concat == true {
			gen.GeneratePrintString()
			//gen.AddComment("INICIO Concatenacion string")
			//temp1 := gen.NewTemp()   //12
			//temp2 := gen.NewTemp()   //13s
			println("temp3---> ", gen.Temp_Concat)
			temp3 := gen.Temp_Concat //14
			temp4 := gen.NewTemp()   //71
			label1 := gen.NewLabel() //58
			label2 := gen.NewLabel() //59

			//result1 := string(result.Value[0]) + string(result.Value[1])
			//result2 := string(result.Value[2]) + string(result.Value[3])

			size := strconv.Itoa(env.(environment.Environment).Size["size"])
			/*gen.AddExpression(temp1, "P", size, "+")
			gen.AddExpression(temp1, temp1, "1", "+")
			gen.AddSetStack("(int)"+temp1, result1)
			gen.AddExpression(temp2, temp1, "1", "+")
			gen.AddSetStack("(int)"+temp2, result2)
			gen.AddCall("concat_string_proc")
			gen.AddGetStack(temp3, "(int)P")
			gen.AddExpression("P", "P", size, "-")*/
			gen.AddIf(temp3, "-1", "==", label1)
			gen.AddExpression("P", "P", size, "+")
			gen.AddExpression(temp4, "P", "1", "+")
			gen.AddSetStack("(int)"+temp4, temp3)
			gen.AddCall("dbrust_printString")
			gen.AddExpression("P", "P", size, "-")
			gen.AddGoto(label2)
			gen.AddLabel(label1)
			gen.AddLabel(label2)
			gen.AddPrintf("c", "10")
			gen.AddBr()
			//gen.AddComment("FIN Concatenacion string")
			gen.Concat = false
			gen.Temp_Concat = ""
		} else if gen.Temporales_print != nil {
			aux := gen.Temporales_print
			if aux[0][1] == "string" {
				gen.GeneratePrintString()
				//agregar codigo en el main
				newTemp1 := gen.NewTemp()
				newTemp2 := gen.NewTemp()
				size := strconv.Itoa(env.(environment.Environment).Size["size"])
				gen.AddExpression(newTemp1, "P", size, "+")     //nuevo temporal en pos vacia
				gen.AddExpression(newTemp1, newTemp1, "1", "+") //se deja espacio de retorno
				gen.AddSetStack("(int)"+newTemp1, result.Value) //se coloca string en parametro que se manda
				gen.AddExpression("P", "P", size, "+")          // cambio de entorno
				gen.AddCall("dbrust_printString")               //Llamada
				gen.AddGetStack(newTemp2, "(int)P")             //obtencion retorno
				gen.AddExpression("P", "P", size, "-")          //regreso del entorno
				gen.AddPrintf("d", "("+aux[1][1]+")"+aux[1][0])
				gen.Code = append(gen.Code, ("printf(\"%c\",10);\n")) //salto de linea

				gen.AddBr()
			} else if aux[1][1] == "string" {

			}
			gen.Temporales_print = nil
		} else {
			gen.GeneratePrintString()
			//agregar codigo en el main
			newTemp1 := gen.NewTemp()
			newTemp2 := gen.NewTemp()
			size := strconv.Itoa(env.(environment.Environment).Size["size"])
			gen.AddExpression(newTemp1, "P", size, "+")     //nuevo temporal en pos vacia
			gen.AddExpression(newTemp1, newTemp1, "1", "+") //se deja espacio de retorno
			gen.AddSetStack("(int)"+newTemp1, result.Value) //se coloca string en parametro que se manda
			gen.AddExpression("P", "P", size, "+")          // cambio de entorno
			gen.AddCall("dbrust_printString")               //Llamada
			gen.AddGetStack(newTemp2, "(int)P")             //obtencion retorno
			gen.AddExpression("P", "P", size, "-")          //regreso del entorno
			gen.AddPrintf("c", "10")                        //salto de linea
			gen.AddBr()

		}

		//println(gen.Concat)
	} else if result.Type == environment.FUNC {
		gen.AddPrintf("c", "10")
		gen.AddBr()
	}

	return nil
}
