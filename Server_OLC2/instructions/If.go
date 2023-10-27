package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strings"
)

type If struct {
	Lin         int
	Col         int
	Expresion   interfaces.Expression
	Bloque      []interface{}
	ElseIfBlock []interface{}
	ElseBlock   []interface{}
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque []interface{}, elseifblock []interface{}, elseblock []interface{}) If {
	ifInstr := If{lin, col, condition, bloque, elseifblock, elseblock}
	return ifInstr
}

func (p If) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	gen.AddComment("****** Generando If")
	var condicion, result environment.Value
	var OutLvls []interface{}
	gen.AddComment("HOLa11")
	condicion = p.Expresion.Ejecutar(ast, env, gen)
	fmt.Println("cond",condicion)
	gen.AddComment("HOLa00")
	newLabel := gen.NewLabel()
	//*****************************************add true labels

	for _, lvl := range condicion.TrueLabel {
		gen.AddComment("HOLa")
		gen.AddLabel(lvl.(string))
	}
	//instrucciones if
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
	//*****************************************add out labels
	gen.AddComment("out labels")
	gen.AddGoto(newLabel)
	println("Soy label 1", newLabel)

	//*****************************************add false labels
	gen.AddComment("False labels")
	for _, lvl := range condicion.FalseLabel {
		gen.AddLabel(lvl.(string))
	}
	gen.AddComment("False labels")

	gen.AddComment("Comienza ElseIF")
	//newLabel2 := gen.NewLabel()
	if p.ElseIfBlock != nil {
		println("-------------ENTRE A ELSE IFFFF---------")
		for _, s := range p.ElseIfBlock {
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
	}
	//gen.AddComment("out labels2")
	//gen.AddGoto(newLabel2)
	//println("Soy label 2", newLabel2)

	gen.AddComment("FIN ElseIF")

	//*****************************************add false labels
	gen.AddComment("False labels")
	/*for _, lvl := range condicion.FalseLabel {
		gen.AddLabel(lvl.(string))
		println("Etiquetas Falsas ", lvl.(string))
	}*/
	gen.AddComment("False labels")

	gen.AddComment("Comienza Else")
	//newLabel3 := gen.NewLabel()
	//println("Soy label 3",newLabel3)
	if p.ElseBlock != nil {
		println("-------------ENTRE A ELSE---------")
		for _, s := range p.ElseBlock {
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
	}
	gen.AddComment("out labels2")
	//gen.AddGoto(newLabel3)
	gen.AddComment("FIN Else")
	OutLvls = append(OutLvls, newLabel)
	//OutLvls = append(OutLvls, newLabel2)
	//OutLvls = append(OutLvls, newLabel3)
	fmt.Println(OutLvls)

	copiedSlice := make([]interface{}, len(OutLvls))
	for i, item := range OutLvls {
		copiedSlice[i] = item
	}

	result.OutLabel = copiedSlice
	return result
}
