package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strings"
)

type Guard struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewGuard(lin int, col int, condition interfaces.Expression, bloque []interface{}) Guard {
	guardInstr := Guard{lin, col, condition, bloque}
	return guardInstr
}

func (p Guard) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	gen.AddComment("****** Generando If")
	var condicion, result environment.Value
	var OutLvls []interface{}
	condicion = p.Expresion.Ejecutar(ast, env, gen)
	newLabel := gen.NewLabel()
	//*****************************************add true labels
	for _, lvl := range condicion.FalseLabel {
		gen.AddLabel(lvl.(string))
	}
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
	//*****************************************add out labels
	gen.AddGoto(newLabel)
	//*****************************************add false labels
	for _, lvl := range condicion.TrueLabel {
		gen.AddLabel(lvl.(string))
	}
	OutLvls = append(OutLvls, newLabel)

	copiedSlice := make([]interface{}, len(OutLvls))
	for i, item := range OutLvls {
		copiedSlice[i] = item
	}

	result.OutLabel = copiedSlice
	return result
}
