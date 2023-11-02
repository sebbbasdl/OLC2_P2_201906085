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

	condicion = p.Expresion.Ejecutar(ast, env, gen)
	fmt.Println("cond", condicion)

	newLabel := gen.NewLabel()
	//*****************************************add true labels
	for _, lvl := range condicion.TrueLabel {

		gen.AddLabel(lvl.(string))
	}
	if p.Bloque != nil {

		//instrucciones if

		for _, s := range p.Bloque {
			if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
				resInst := s.(interfaces.Instruction).Ejecutar(ast, env, gen)
				
				if gen.Breakbool == true {
					gen.AddComment("BREAK")
					out := gen.NewLabel()
					gen.AddGoto(out)
					OutLvls = append(OutLvls, out)
					gen.Breakbool = false
					//break
				}
				if gen.ContinueBool == true {
					gen.AddComment("Continue")

					gen.AddGoto(gen.Labelret_for)

					gen.ContinueBool = false
					//break
				}
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
		gen.AddGoto(newLabel)
		gen.AddComment("False labels")
		for _, lvl := range condicion.FalseLabel {
			gen.AddLabel(lvl.(string))
		}
		//OutLvls = append(OutLvls, newLabel)
		

	}

	//*****************************************add out labels

	//*****************************************add false labels

	gen.AddComment("Comienza ElseIF")
	//newLabel2 := gen.NewLabel()
	if p.ElseIfBlock != nil {
		/*for _, lvl := range condicion.TrueLabel {

			gen.AddLabel(lvl.(string))
		}*/
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
		gen.AddComment("False labels")
		/*for _, lvl := range condicion.FalseLabel {
			gen.AddLabel(lvl.(string))
			println("Etiquetas Falsas ", lvl.(string))
		}*/
	}
	//gen.AddComment("out labels2")
	//gen.AddGoto(newLabel2)
	//println("Soy label 2", newLabel2)

	gen.AddComment("FIN ElseIF")

	//*****************************************add false labels
	/*gen.AddComment("False labels")
	for _, lvl := range condicion.FalseLabel {
		gen.AddLabel(lvl.(string))
	}
	gen.AddComment("False labels")
	gen.AddComment("False labels")*/

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
	gen.AddComment("out labels")
	//gen.AddGoto(newLabel)
	println("Soy label 1", newLabel)
	//gen.AddLabel(newLabel)
	//OutLvls = append(OutLvls, newLabel2)
	//OutLvls = append(OutLvls, newLabel3)
	fmt.Println("---------------------->>>>>>>", OutLvls)

	copiedSlice := make([]interface{}, len(OutLvls))
	for i, item := range OutLvls {
		copiedSlice[i] = item
	}

	result.OutLabel = copiedSlice

	gen.AddComment("FIN OUTLABEL")

	return result
}
