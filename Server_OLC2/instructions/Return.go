package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
)

type Return struct {
	Lin int
	Col int
	Exp interfaces.Expression
}

func NewReturn(lin int, col int, exp interfaces.Expression) Return {
	returninstr := Return{lin, col, exp}
	return returninstr
}

func (p Return) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	p.Exp.Ejecutar(ast, env, gen)
	gen.ReturnBool = true
	return result

}
