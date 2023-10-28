package instructions

import (
	"Server2/environment"
	"Server2/generator"
)

type Break struct {
	Lin int
	Col int
}

func NewBreak(lin int, col int) Break {
	breakinstr := Break{lin, col}
	return breakinstr
}

func (p Break) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value

	gen.Breakbool = true
	return result

}
