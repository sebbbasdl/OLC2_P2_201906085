package environment

type AST struct {
	Instructions       []interface{}
	Print              string
	Errors             string
	ElseIfFlag         bool
	IfReturn           bool
	Temp_Label1        string
	Temp_Label2        string
	SwitchBool         bool
	Tabla              [][]string
	Errores_Semanticos [][]string
}

func NewAST(inst []interface{}, print string, err string) AST {
	ast := AST{Instructions: inst, Print: print, Errors: err}
	return ast
}

func (a *AST) GetPrint() string {
	return a.Print
}

func (a *AST) SetPrint(ToPrint string) {
	a.Print = a.Print + ToPrint
}

func (a *AST) GetErrors() string {
	return a.Errors
}

func (a *AST) SetError(ToErr string) {
	a.Errors = a.Errors + ToErr + "\n"
}
