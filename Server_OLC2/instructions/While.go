package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strings"
)

type Whiles struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewWhiles(lin int, col int, condition interfaces.Expression, bloque []interface{}) Whiles {
	whileInstr := Whiles{lin, col, condition, bloque}
	return whileInstr
}

func (p Whiles) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	gen.AddComment("****** Generando While")
	labelret := gen.NewLabel()
	gen.AddLabel(labelret)
	var condicion, result environment.Value
	var OutLvls []interface{}
	condicion = p.Expresion.Ejecutar(ast, env, gen)

	

	//*****************************************add true labels
	for _, lvl := range condicion.TrueLabel {
		gen.AddLabel(lvl.(string))
	}

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
	gen.AddGoto(labelret)
	//*****************************************add false labels
	for _, lvl := range condicion.FalseLabel {
		println("---->>>", lvl.(string))
		gen.AddLabel(lvl.(string))
	}
	

	return result
}
