package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strings"
)

type Switch struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	CaseBlock []interface{}
	Block     []interface{}
}

func NewSwitch(lin int, col int, expr1 interfaces.Expression, casebloque []interface{}, block []interface{}) Switch {
	switchInstr := Switch{lin, col, expr1, casebloque, block}
	return switchInstr
}

func (p Switch) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	println("ENTRO ACA")
	fmt.Println("Cantidad: ", len(p.CaseBlock))
	var expresion = p.Expresion.Ejecutar(ast, env, gen)
	fmt.Println("EXPP: ", expresion)
	gen.Temp_Case_ifs = expresion.Value
	gen.Temp_Case = len(p.CaseBlock)
	//newLabel := gen.NewLabel()
	var OutLvls []interface{}

	for _, s := range p.CaseBlock {
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
	gen.AddComment("Default")
	gen.AddLabel(gen.Temp_Default)
	for _, s := range p.Block {
		if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
			resInst := s.(interfaces.Instruction).Ejecutar(ast, env, gen)
			if gen.Breakbool == true {
				gen.AddComment("BREAK")
				out := gen.NewLabel()
				gen.AddGoto(out)
				OutLvls = append(OutLvls, out)
				gen.Breakbool=false
				//break
			}
			if resInst != nil {
				//agregando etiquetas de salida
				/*for _, lvl := range resInst.(environment.Value).OutLabel {
					OutLvls = append(OutLvls, lvl)
				}*/
			}
		} else {
			fmt.Println("Error en bloque")
		}
	}

	copiedSlice := make([]interface{}, len(OutLvls))
	for i, item := range OutLvls {
		copiedSlice[i] = item
	}

	result.OutLabel = copiedSlice
	gen.Cont_case = 0
	return result
}
