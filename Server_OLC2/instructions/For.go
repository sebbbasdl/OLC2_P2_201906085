package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
	"strings"
)

type Fors struct {
	Lin        int
	Col        int
	Id         string
	Expresion  interfaces.Expression
	Expresion2 interfaces.Expression
	Str        string
	Bloque     []interface{}
}

func NewFor(lin int, col int, id string, expr1 interfaces.Expression, expr2 interfaces.Expression, str string, bloque []interface{}) Fors {
	forInstr := Fors{lin, col, id, expr1, expr2, str, bloque}
	return forInstr
}

func (p Fors) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	//var result0 environment.Value
	var newVar environment.Symbol

	var num1 = p.Expresion.Ejecutar(ast, env, gen)
	var num2 = p.Expresion2.Ejecutar(ast, env, gen)
	fmt.Println("num1: ", num1)
	fmt.Println("num2: ", num2)

	newVar = env.(environment.Environment).SaveVariable(p.Id, num1.Type)
	temp1 := gen.NewTemp()
	gen.AddExpression(temp1, "P", "0", "+")
	gen.AddSetStack(strconv.Itoa(newVar.Posicion), num1.Value)
	gen.AddBr()

	gen.AddComment("****** Generando FOR")
	labelret := gen.NewLabel()
	gen.AddLabel(labelret)

	label1 := gen.NewLabel()//58

	var result environment.Value
	/*condicion.Value = ""
	condicion.IsTemp = false
	condicion.Type = 3
	fmt.Println(label1, label2)
	condicion.TrueLabel = make([]interface{}, 0)
	condicion.FalseLabel = make([]interface{}, 0)
	condicion.TrueLabel = append(condicion.TrueLabel, label1)
	condicion.FalseLabel = append(condicion.FalseLabel, label2)
	condicion.IntValue = 0*/
	var OutLvls []interface{}

	temp2 := gen.NewTemp()
	temp3 := gen.NewTemp()

	//*****************************************add true labels

	gen.AddLabel(label1)
	gen.AddExpression(temp3, "P", "0", "+")
	gen.AddGetStack(temp2, "(int)"+temp3)

	label2 := gen.NewLabel()//60
	label3 := gen.NewLabel()//61
	gen.AddIf(temp2, num2.Value, "<=", label2)
	gen.AddGoto(label3)

	gen.AddLabel(label2)


	for _, s := range p.Bloque {
		if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
			resInst := s.(interfaces.Instruction).Ejecutar(ast, env, gen)
			if resInst != nil {
				//agregando etiquetas de salida
				for _, lvl := range resInst.(environment.Value).OutLabel {
					OutLvls = append(OutLvls, lvl)
				}
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}

	label4 := gen.NewLabel()
	gen.AddLabel(label4)
	temp4 := gen.NewTemp()//69
	temp5 := gen.NewTemp()//70

	gen.AddExpression(temp5, "P","0","+")
	gen.AddGetStack(temp4, "(int)"+temp5)

	temp6 := gen.NewTemp()//71
	temp7 := gen.NewTemp()//72

	gen.AddExpression(temp7, temp4, "1","+")
	gen.AddExpression(temp6, "P","0","+")
	gen.AddSetStack("(int)"+temp6, temp7)

	



	
	//*****************************************add out labels
	gen.AddGoto(labelret)
	//*****************************************add false labels
	//for _, lvl := range condicion.FalseLabel {

	gen.AddLabel(label3)
	//}

	return result
}
