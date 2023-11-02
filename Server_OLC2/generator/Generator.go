package generator

import (
	"fmt"
)

type Generator struct {
	Temporal             int
	Label                int
	Code                 []interface{}
	FinalCode            []interface{}
	Natives              []interface{}
	FuncCode             []interface{}
	TempList             []interface{}
	PrintStringFlag      bool
	BreakLabel           string
	ContinueLabel        string
	MainCode             bool
	Concat               bool
	Temp_Concat          string
	ConcatFlag           bool
	Temp_Label1          string
	Temp_Label2          string
	Temp_Case            int
	Temp_Case2           int
	Temp_Case_ifs        string
	Block_Cases          []interface{}
	Labels_Cases         []string
	Temp_Default         string
	Label_Break          string
	Breakbool            bool
	ContinueBool         bool
	ReturnBool           bool
	Auxbool              bool
	Labelret_for         string
	Cont_case            int
	bool_cast_int_string bool
	Temporales_print     [][]string
}

func NewGenerator() Generator {
	generator := Generator{
		Temporal:        0,
		Label:           0,
		BreakLabel:      "",
		ContinueLabel:   "",
		PrintStringFlag: true,
		ConcatFlag:      true,
		MainCode:        false,
	}
	return generator
}

func (g Generator) GetCode() []interface{} {
	return g.Code
}

func (g Generator) GetFinalCode() []interface{} {
	return g.FinalCode
}

func (g Generator) GetTemps() []interface{} {
	return g.TempList
}

func (g *Generator) SetMainFlag(newVal bool) {
	g.MainCode = newVal
}

// add break lvl
func (g *Generator) AddBreak(lvl string) {
	g.BreakLabel = lvl
}

// add continue lvl
func (g *Generator) AddContinue(lvl string) {
	g.ContinueLabel = lvl
}

// Generar un nuevo temporal
func (g *Generator) NewTemp() string {
	temp := "t" + fmt.Sprintf("%v", g.Temporal)
	g.Temporal = g.Temporal + 1
	//Lo guardamos para declararlo
	g.TempList = append(g.TempList, temp)
	return temp
}

// Generador de Label
func (g *Generator) NewLabel() string {
	temp := g.Label
	g.Label = g.Label + 1
	return "L" + fmt.Sprintf("%v", temp)
}

// Añade Label al codigo
func (g *Generator) AddLabel(Label string) {
	if g.MainCode {
		g.Code = append(g.Code, Label+":\n")
	} else {
		g.FuncCode = append(g.FuncCode, Label+":\n")
	}
}

func (g *Generator) AddIf(left string, right string, operator string, Label string) {
	if g.MainCode {
		g.Code = append(g.Code, "if("+left+" "+operator+" "+right+") goto "+Label+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "if("+left+" "+operator+" "+right+") goto "+Label+";\n")
	}
}

func (g *Generator) AddGoto(Label string) {
	if g.MainCode {
		g.Code = append(g.Code, "goto "+Label+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "goto "+Label+";\n")
	}
}

func (g *Generator) AddExpression(target string, left string, right string, operator string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = "+left+" "+operator+" "+right+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = "+left+" "+operator+" "+right+";\n")
	}
}

func (g *Generator) AddAssign(target, val string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = "+val+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = "+val+";\n")
	}
}

func (g *Generator) AddPrintf(typePrint string, value string) {
	if g.MainCode {
		g.Code = append(g.Code, "printf(\"%"+typePrint+"\", "+value+");\n")
	} else {
		g.FuncCode = append(g.FuncCode, "printf(\"%"+typePrint+"\", "+value+");\n")
	}
}

func (g *Generator) AddSetHeap(index string, value string) {
	if g.MainCode {
		g.Code = append(g.Code, "heap["+index+"] = "+value+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "heap["+index+"] = "+value+";\n")
	}
}

func (g *Generator) AddGetHeap(target string, index string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = heap["+index+"];\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = heap["+index+"];\n")
	}
}

func (g *Generator) AddSetStack(index string, value string) {
	if g.MainCode {
		g.Code = append(g.Code, "stack["+index+"] = "+value+";\n")
	} else {
		g.FuncCode = append(g.FuncCode, "stack["+index+"] = "+value+";\n")
	}
}

func (g *Generator) AddGetStack(target string, index string) {
	if g.MainCode {
		g.Code = append(g.Code, target+" = stack["+index+"];\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+" = stack["+index+"];\n")
	}
}

func (g *Generator) AddCall(target string) {
	if g.MainCode {
		g.Code = append(g.Code, target+"();\n")
	} else {
		g.FuncCode = append(g.FuncCode, target+"();\n")
	}
}

func (g *Generator) AddBr() {
	if g.MainCode {
		g.Code = append(g.Code, "\n")
	} else {
		g.FuncCode = append(g.FuncCode, "\n")
	}
}

func (g *Generator) AddComment(target string) {
	if g.MainCode {
		g.Code = append(g.Code, "//"+target+"\n")
	} else {
		g.FuncCode = append(g.FuncCode, "//"+target+"\n")
	}
}

func (g *Generator) AddTittle(target string) {
	if g.MainCode {
		g.Code = append(g.Code, "void "+target+"() {\n")
	} else {
		g.FuncCode = append(g.FuncCode, "void "+target+"() {\n")
	}
}

func (g *Generator) AddEnd() {
	if g.MainCode {
		g.Code = append(g.Code, "\treturn;\n")
		g.Code = append(g.Code, "}\n\n")
	} else {
		g.FuncCode = append(g.FuncCode, "\treturn;\n")
		g.FuncCode = append(g.FuncCode, "}\n\n")
	}
}

// agregar headers
func (g *Generator) GenerateFinalCode() {
	//****************** add head
	g.FinalCode = append(g.FinalCode, "/*------HEADER------*/\n")
	g.FinalCode = append(g.FinalCode, "#include <stdio.h>\n")
	g.FinalCode = append(g.FinalCode, "#include <math.h>\n")
	g.FinalCode = append(g.FinalCode, "double heap[30101999];\n")
	g.FinalCode = append(g.FinalCode, "double stack[30101999];\n")
	g.FinalCode = append(g.FinalCode, "double P;\n")
	g.FinalCode = append(g.FinalCode, "double H;\n")
	//g.FinalCode = append(g.FinalCode, "double ")
	//****************** add temporal declaration
	tempArr := g.GetTemps()

	if len(tempArr) != 0 {
		g.FinalCode = append(g.FinalCode, "double ")
	}
	if len(tempArr) > 0 {
		tmpDec := fmt.Sprintf("%v", tempArr[0])
		tempArr = tempArr[1:]
		for _, s := range tempArr {
			tmpDec += ", "
			tmpDec += fmt.Sprintf("%v", s)
		}
		tmpDec += ";\n\n"
		g.FinalCode = append(g.FinalCode, tmpDec)
	}
	//****************** add natives functions
	if len(g.Natives) > 0 {
		g.FinalCode = append(g.FinalCode, "/*------NATIVES------*/\n")
		for _, s := range g.Natives {
			g.FinalCode = append(g.FinalCode, s)
		}
	}
	//****************** add functions
	if len(g.FuncCode) > 0 {
		g.FinalCode = append(g.FinalCode, "/*------FUNCTIONS------*/\n")
		for _, s := range g.FuncCode {
			g.FinalCode = append(g.FinalCode, s)
		}
	}
	//****************** add main
	g.FinalCode = append(g.FinalCode, "/*------MAIN------*/\n")
	g.FinalCode = append(g.FinalCode, "void main() {\n")
	g.FinalCode = append(g.FinalCode, "\tP = 0; H = 0;\n\n")
	for _, s := range g.Code {
		g.FinalCode = append(g.FinalCode, "\t"+s.(string))
	}
	g.FinalCode = append(g.FinalCode, "\n\treturn;\n}\n")
}

func (g *Generator) GeneratePrintString() {
	if g.PrintStringFlag {
		//generando temporales y etiquetas
		newTemp1 := g.NewTemp()
		newTemp2 := g.NewTemp()
		newTemp3 := g.NewTemp()
		newLvl1 := g.NewLabel()
		newLvl2 := g.NewLabel()
		//se genera la funcion printstring
		g.Natives = append(g.Natives, "void dbrust_printString() {\n")
		g.Natives = append(g.Natives, "\t"+newTemp1+" = P + 1;\n")
		g.Natives = append(g.Natives, "\t"+newTemp2+" = stack[(int)"+newTemp1+"];\n")
		g.Natives = append(g.Natives, "\t"+newLvl2+":\n")
		g.Natives = append(g.Natives, "\t"+newTemp3+" = heap[(int)"+newTemp2+"];\n")
		g.Natives = append(g.Natives, "\tif("+newTemp3+" == -1) goto "+newLvl1+";\n")
		g.Natives = append(g.Natives, "\tprintf(\"%c\", (char)"+newTemp3+");\n")
		g.Natives = append(g.Natives, "\t"+newTemp2+" = "+newTemp2+" + 1;\n")
		g.Natives = append(g.Natives, "\tgoto "+newLvl2+";\n")
		g.Natives = append(g.Natives, "\t"+newLvl1+":\n")
		g.Natives = append(g.Natives, "\treturn;\n")
		g.Natives = append(g.Natives, "}\n\n")
		g.PrintStringFlag = false
	}
}

func (g *Generator) AddConcatString() {
	if g.ConcatFlag {
		// Generar temporales y etiquetas
		temp1 := g.NewTemp()   // 8
		temp2 := g.NewTemp()   // 9
		temp3 := g.NewTemp()   // 10
		temp4 := g.NewTemp()   // 11
		temp5 := g.NewTemp()   // 12
		temp6 := g.NewTemp()   // 13
		label1 := g.NewLabel() // 6
		label2 := g.NewLabel() // 7
		label3 := g.NewLabel() // 8
		label4 := g.NewLabel() // 9
		label5 := g.NewLabel() // 10

		// Generar la función de concatenación de strings
		g.Natives = append(g.Natives, "void concatenar_strings() {\n")
		g.Natives = append(g.Natives, "\t", temp1, " = ", "H;\n")
		g.Natives = append(g.Natives, "\t", temp2, " = ", "P + 1;\n")
		g.Natives = append(g.Natives, "\t", temp3, " = stack[(int)"+temp2+"];\n")
		g.Natives = append(g.Natives, "\t", temp4, " = ", "P + 2;\n")
		g.Natives = append(g.Natives, "\t", temp5, " = stack[(int)"+temp4+"];\n")
		g.Natives = append(g.Natives, "\t", label3+":\n")
		g.Natives = append(g.Natives, "\t", temp6, " = heap[(int)"+temp3+"];\n")
		g.Natives = append(g.Natives, "\t", "if("+temp6+" != -1) goto "+label1+";\n")
		g.Natives = append(g.Natives, "\t", "goto "+label2+";\n")
		g.Natives = append(g.Natives, "\t", label1+":\n")
		g.Natives = append(g.Natives, "\t", "heap[(int)H] = "+temp6+";\n")
		g.Natives = append(g.Natives, "\t", "H = H + 1;\n")
		g.Natives = append(g.Natives, "\t", temp3, " = ", temp3, " + 1;\n")
		g.Natives = append(g.Natives, "\t", "goto "+label3+";\n")
		// Lógica para el segundo string
		g.Natives = append(g.Natives, "\t", label2+":\n")
		g.Natives = append(g.Natives, "\t", temp6, " = heap[(int)"+temp5+"];\n")
		g.Natives = append(g.Natives, "\t", "if("+temp6+" != -1) goto "+label4+";\n")
		g.Natives = append(g.Natives, "\t", "goto "+label5+";\n")
		g.Natives = append(g.Natives, "\t", label4+":\n")
		g.Natives = append(g.Natives, "\t", "heap[(int)H] = "+temp6+";\n")
		g.Natives = append(g.Natives, "\t", "H = H + 1;\n")
		g.Natives = append(g.Natives, "\t", temp5, " = ", temp5, " + 1;\n")
		g.Natives = append(g.Natives, "\t", "goto "+label2+";\n")
		g.Natives = append(g.Natives, "\t", label5+":\n")
		g.Natives = append(g.Natives, "\t", "heap[(int)H] = -1;\n")
		g.Natives = append(g.Natives, "\t", "H = H + 1;\n")
		g.Natives = append(g.Natives, "\t", "stack[(int)P] = "+temp1+";\n")
		g.Natives = append(g.Natives, "\t", "return;\n")
		g.Natives = append(g.Natives, "}\n\n")

		// Llamar a la función de concatenación de strings en el código principal
		if g.MainCode {
			//g.Code = append(g.Code, "\tconcat_string_proc();\n")
			//g.Code = append(g.Code, )
		} else {
			g.FuncCode = append(g.FuncCode, "\tconcatenar_strings();\n")
		}
		g.ConcatFlag = false
	}

}

func (g *Generator) casteo_int_string() {
	if g.bool_cast_int_string {

		t14 := g.NewTemp()
		t15 := g.NewTemp()
		t16 := g.NewTemp()
		t17 := g.NewTemp()
		t18 := g.NewTemp()
		t19 := g.NewTemp()
		t20 := g.NewTemp()

		l11 := g.NewLabel()
		l12 := g.NewLabel()
		l13 := g.NewLabel()
		l14 := g.NewLabel()
		l15 := g.NewLabel()
		l16 := g.NewLabel()
		l17 := g.NewLabel()
		l18 := g.NewLabel()
		l19 := g.NewLabel()
		l20 := g.NewLabel()
		l21 := g.NewLabel()
		l22 := g.NewLabel()
		l23 := g.NewLabel()

		g.Natives = append(g.Natives, "void casteo_int_string() {\n")
		g.Natives = append(g.Natives, t14+" = H ;")
		g.Natives = append(g.Natives, t15+" = P + 1;")
		g.Natives = append(g.Natives, t16+" = stack[int]t15;")
		g.Natives = append(g.Natives, "if( "+t16+" == 0 goto "+l22+" ;")
		g.Natives = append(g.Natives, "goto "+l23+";")
		g.Natives = append(g.Natives, l22+" :")
		g.Natives = append(g.Natives, "heap[(int)H] = 48 ;")
		g.Natives = append(g.Natives, "H = H + 1 ;")
		g.Natives = append(g.Natives, l23+":")
		g.Natives = append(g.Natives, "if( "+t16+" < 0 goto "+l20+" ;")
		g.Natives = append(g.Natives, "goto "+l21+" ;")
		g.Natives = append(g.Natives, l20+":")
		g.Natives = append(g.Natives, "heap[(int)H] = 45")
		g.Natives = append(g.Natives, "H = H + 1 ;")
		g.Natives = append(g.Natives, t16+" = "+"0 "+" - "+t16+";")
		g.Natives = append(g.Natives, l21+":")
		g.Natives = append(g.Natives, t17+"= 0 ;")
		g.Natives = append(g.Natives, l13+":")
		g.Natives = append(g.Natives, "if("+t16+" > 0) goto "+l11+" ;")
		g.Natives = append(g.Natives, "goto "+l12+"; ")
		g.Natives = append(g.Natives, l11+":")
		g.Natives = append(g.Natives, t17+" = "+t17+" * 10 ;")
		g.Natives = append(g.Natives, t18+" = (int)"+t16+" % 10 ;")
		g.Natives = append(g.Natives, t17+" = "+t17+" + "+t18+";")
		g.Natives = append(g.Natives, "if("+t17+"== 0) goto "+l16+";")
		g.Natives = append(g.Natives, "goto "+l17+";")
		g.Natives = append(g.Natives, l16+":")
		g.Natives = append(g.Natives, t20+" = "+t20+" + 1 ;")
		g.Natives = append(g.Natives, l17+":")
		g.Natives = append(g.Natives, t16+" = (int)"+t16+" / 10;")
		g.Natives = append(g.Natives, "goto "+l13+";")
		g.Natives = append(g.Natives, l12+":")
		g.Natives = append(g.Natives, "if(+"+t17+"> 0) goto "+l14+";")
		g.Natives = append(g.Natives, "goto "+l15+";")
		g.Natives = append(g.Natives, l14+":")
		g.Natives = append(g.Natives, t19+" = (int)"+t17+" % 10;")
		g.Natives = append(g.Natives, t19+" = "+t19+" + 48;")
		g.Natives = append(g.Natives, "heap[(int)H] = "+t19+";")
		g.Natives = append(g.Natives, "H = H + 1;")
		g.Natives = append(g.Natives, t17+" = (int)"+t17+" / 10;")
		g.Natives = append(g.Natives, "goto "+l12+";")
		g.Natives = append(g.Natives, l15+":")
		g.Natives = append(g.Natives, "if("+t20+" > 0) goto "+l18+";")
		g.Natives = append(g.Natives, "goto "+l19+";")
		g.Natives = append(g.Natives, l18+":")
		g.Natives = append(g.Natives, "heap[(int)H] = 48;")
		g.Natives = append(g.Natives, "H = H + 1;")
		g.Natives = append(g.Natives, t20+" = "+t20+" - 1;")
		g.Natives = append(g.Natives, "goto "+l15+";")
		g.Natives = append(g.Natives, l19+":")
		g.Natives = append(g.Natives, "heap[(int)H] = -1;")
		g.Natives = append(g.Natives, "H = H + 1;")
		g.Natives = append(g.Natives, "stack[(int)P] ="+t14+";")
		g.Natives = append(g.Natives, "return;")

		g.FuncCode = append(g.FuncCode, "\tcasteo_int_string();\n")
	}
	g.bool_cast_int_string = false

}
