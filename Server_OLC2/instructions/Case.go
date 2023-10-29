package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strings"
)

type Case struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewCase(lin int, col int, expr1 interfaces.Expression, bloque []interface{}) Case {
	caseInstr := Case{lin, col, expr1, bloque}
	return caseInstr
}

func (p Case) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	var expresion = p.Expresion.Ejecutar(ast, env, gen)

	fmt.Println("--???", expresion)
	fmt.Println(gen.Temp_Case)

	label1 := gen.NewLabel()
	label0 := gen.NewLabel()
	var OutLvls []interface{}

	if gen.Temp_Case2 < gen.Temp_Case-1 {
		gen.AddComment("Se generan los if para switch")
		gen.Temp_Case2 += 1
		gen.AddIf(gen.Temp_Case_ifs, expresion.Value, "==", label1)
		gen.Labels_Cases = append(gen.Labels_Cases, label1)
		//gen.Block_Cases = append(p.Bloque)

		for _, s := range p.Bloque {
			if strings.Contains(fmt.Sprintf("%T", s), "instructions") {

				gen.Block_Cases = append(gen.Block_Cases, s.(interfaces.Instruction))

			} else {
				fmt.Println("Error en bloque")
			}
		}
		fmt.Println("Cantidad de instrucciones: ", len(gen.Block_Cases))

	} else {
		gen.AddComment("Se generan instrucciones de case")
		gen.AddIf(gen.Temp_Case_ifs, expresion.Value, "==", label1)
		gen.AddGoto(label0)
		gen.Temp_Default = label0

		fmt.Println("CANTIDAD BLOQ ", len(gen.Block_Cases))
		//gen.Labels_Cases = eliminarDuplicados(gen.Labels_Cases)
		if gen.Cont_case < gen.Temp_Case-1 && len(gen.Labels_Cases) != 0 && gen.Cont_case == 0 {
			gen.AddLabel(gen.Labels_Cases[gen.Cont_case])
			fmt.Println("SWITCHH->", gen.Labels_Cases)
			gen.AddComment("PRUEBAAAA2")
			fmt.Println("CONTADORSSSS222222->>>>>>>>", len(gen.Labels_Cases))
			//gen.Labels_Cases = eliminarElemento(gen.Labels_Cases, gen.Cont_case)
			fmt.Println("SWITCHH->", gen.Labels_Cases)

		}
		for _, s := range gen.Block_Cases {

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
				gen.AddComment("PRUEBAAAA")

				//var aux = eliminarDuplicados(gen.Labels_Cases)
				fmt.Println("CONTADORSSSS->>>>>>>>", gen.Cont_case)

				if gen.Cont_case < gen.Temp_Case-1 && len(gen.Labels_Cases) != 0 && gen.Cont_case != 0{
					gen.AddLabel(gen.Labels_Cases[gen.Cont_case])
					fmt.Println("SWITCHH->", gen.Labels_Cases)
					gen.AddComment("PRUEBAAAA2")
					fmt.Println("CONTADORSSSS222222->>>>>>>>", len(gen.Labels_Cases))
					//gen.Labels_Cases = eliminarElemento(gen.Labels_Cases, gen.Cont_case)
					fmt.Println("SWITCHH->", gen.Labels_Cases)

				}
				gen.Cont_case += 1
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
		gen.AddLabel(label1)
		for _, s := range p.Bloque {

			if strings.Contains(fmt.Sprintf("%T", s), "instructions") {
				if gen.Breakbool == true {
					gen.AddComment("BREAK")
					out := gen.NewLabel()
					gen.AddGoto(out)
					OutLvls = append(OutLvls, out)
					gen.Breakbool = false
					//break
				}
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
	copiedSlice := make([]interface{}, len(OutLvls))
	for i, item := range OutLvls {
		copiedSlice[i] = item
	}

	result.OutLabel = copiedSlice

	return result

}

func eliminarDuplicados(arr []string) []string {
	encontrado := make(map[string]bool)
	resultado := []string{}

	for _, valor := range arr {
		if _, ok := encontrado[valor]; !ok {
			encontrado[valor] = true
			resultado = append(resultado, valor)
		}
	}

	return resultado
}

func eliminarElemento(arr []string, pos int) []string {
	if pos < 0 || pos >= len(arr) {
		fmt.Println("Posición inválida")
		return arr
	}

	// Crear un nuevo slice que excluya el elemento en la posición pos
	nuevoSlice := append(arr[:pos], arr[pos+1:]...)

	return nuevoSlice
}
