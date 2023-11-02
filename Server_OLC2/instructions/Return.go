package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
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
	gen.AddComment("Return")
	label := gen.NewLabel()
	expr := p.Exp.Ejecutar(ast, env, gen)
	gen.ReturnBool = true

	if expr.Type != environment.STRING && expr.Type != environment.INTEGER {
		for _, lvl := range expr.TrueLabel {

			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack("(int)P", "1")
		gen.AddGoto(label)
		for _, lvl := range expr.FalseLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack("(int)P", "1")
		gen.AddGoto(label)

		fmt.Println("Returno: ", expr)

		return result

	} else {
		gen.AddSetStack("(int)P", expr.Value)
		//gen.AddLabel(label)
		gen.Auxbool = true
		fmt.Println("Returno: ", expr)
		return result
	}

	fmt.Println("Returno: ", expr)
	return nil
}
