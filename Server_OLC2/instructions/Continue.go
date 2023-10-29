package instructions

import (
	"Server2/environment"
	"Server2/generator"
)

type Continue struct {
	Lin int
	Col int
}

func NewContinue(lin int, col int) Continue {
	continstr := Continue{lin, col}
	return continstr
}

func (p Continue) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	gen.ContinueBool = true
	return nil

}
