package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
)

type Declaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	Expresion interfaces.Expression
	Global    bool
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression, global bool) Declaration {
	instr := Declaration{lin, col, id, tipo, val, global}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	var newVar environment.Symbol
	result = p.Expresion.Ejecutar(ast, env, gen)

	gen.AddComment("Agregando una declaracion")
	if p.Tipo == environment.NULL {
		newVar = env.(environment.Environment).SaveVariable(p.Id, result.Type)
	} else {
		newVar = env.(environment.Environment).SaveVariable(p.Id, p.Tipo)
	}

	println(p.Id)
	if result.Type == environment.BOOLEAN {
		print("ENTRO ACA")
		//si no es temp (boolean)
		newLabel := gen.NewLabel()
		//add labels
		for _, lvl := range result.TrueLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), "1")
		gen.AddGoto(newLabel)
		//add labels
		for _, lvl := range result.FalseLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), "0")
		gen.AddGoto(newLabel)
		gen.AddLabel(newLabel)
		gen.AddBr()
	} else {
		//si es temp (num,string,etc)
		println("--------SET STACK ESTOY EN DECLARACION------------")
		if gen.Temp_Concat != "" {

			result.Value = gen.Temp_Concat
			println("En declaracion", result.Value)
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), result.Value)
		gen.AddBr()
	}

	fmt.Println("decla 2-->", result)

	return result
}

func (p Declaration) ArrayValidation(result environment.Symbol) bool {
	return true
}
