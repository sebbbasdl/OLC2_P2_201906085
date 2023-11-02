// Generated from c://Users//Usuario//Documents//OLC2_P2_201906085//Server_OLC2//SwiftGrammar.g4 by ANTLR 4.13.1

    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftGrammarParser}.
 */
public interface SwiftGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SwiftGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SwiftGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SwiftGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SwiftGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SwiftGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SwiftGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#structCreation}.
	 * @param ctx the parse tree
	 */
	void enterStructCreation(SwiftGrammarParser.StructCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#structCreation}.
	 * @param ctx the parse tree
	 */
	void exitStructCreation(SwiftGrammarParser.StructCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listStructDec}.
	 * @param ctx the parse tree
	 */
	void enterListStructDec(SwiftGrammarParser.ListStructDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listStructDec}.
	 * @param ctx the parse tree
	 */
	void exitListStructDec(SwiftGrammarParser.ListStructDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SwiftGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SwiftGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#callFunctionInst}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionInst(SwiftGrammarParser.CallFunctionInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#callFunctionInst}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionInst(SwiftGrammarParser.CallFunctionInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listParamsFunc}.
	 * @param ctx the parse tree
	 */
	void enterListParamsFunc(SwiftGrammarParser.ListParamsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listParamsFunc}.
	 * @param ctx the parse tree
	 */
	void exitListParamsFunc(SwiftGrammarParser.ListParamsFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SwiftGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SwiftGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(SwiftGrammarParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(SwiftGrammarParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(SwiftGrammarParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(SwiftGrammarParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#elseiflist}.
	 * @param ctx the parse tree
	 */
	void enterElseiflist(SwiftGrammarParser.ElseiflistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#elseiflist}.
	 * @param ctx the parse tree
	 */
	void exitElseiflist(SwiftGrammarParser.ElseiflistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(SwiftGrammarParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(SwiftGrammarParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#switchtmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchtmt(SwiftGrammarParser.SwitchtmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#switchtmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchtmt(SwiftGrammarParser.SwitchtmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#caselist}.
	 * @param ctx the parse tree
	 */
	void enterCaselist(SwiftGrammarParser.CaselistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#caselist}.
	 * @param ctx the parse tree
	 */
	void exitCaselist(SwiftGrammarParser.CaselistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(SwiftGrammarParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(SwiftGrammarParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(SwiftGrammarParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(SwiftGrammarParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(SwiftGrammarParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(SwiftGrammarParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#guardtmt}.
	 * @param ctx the parse tree
	 */
	void enterGuardtmt(SwiftGrammarParser.GuardtmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#guardtmt}.
	 * @param ctx the parse tree
	 */
	void exitGuardtmt(SwiftGrammarParser.GuardtmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#breaktmt}.
	 * @param ctx the parse tree
	 */
	void enterBreaktmt(SwiftGrammarParser.BreaktmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#breaktmt}.
	 * @param ctx the parse tree
	 */
	void exitBreaktmt(SwiftGrammarParser.BreaktmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#returntmt}.
	 * @param ctx the parse tree
	 */
	void enterReturntmt(SwiftGrammarParser.ReturntmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#returntmt}.
	 * @param ctx the parse tree
	 */
	void exitReturntmt(SwiftGrammarParser.ReturntmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#continuetmt}.
	 * @param ctx the parse tree
	 */
	void enterContinuetmt(SwiftGrammarParser.ContinuetmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#continuetmt}.
	 * @param ctx the parse tree
	 */
	void exitContinuetmt(SwiftGrammarParser.ContinuetmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#declarationstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstmt(SwiftGrammarParser.DeclarationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#declarationstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstmt(SwiftGrammarParser.DeclarationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(SwiftGrammarParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(SwiftGrammarParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SwiftGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SwiftGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listParams}.
	 * @param ctx the parse tree
	 */
	void enterListParams(SwiftGrammarParser.ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listParams}.
	 * @param ctx the parse tree
	 */
	void exitListParams(SwiftGrammarParser.ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listArray}.
	 * @param ctx the parse tree
	 */
	void enterListArray(SwiftGrammarParser.ListArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listArray}.
	 * @param ctx the parse tree
	 */
	void exitListArray(SwiftGrammarParser.ListArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(SwiftGrammarParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(SwiftGrammarParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listParamsCall}.
	 * @param ctx the parse tree
	 */
	void enterListParamsCall(SwiftGrammarParser.ListParamsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listParamsCall}.
	 * @param ctx the parse tree
	 */
	void exitListParamsCall(SwiftGrammarParser.ListParamsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listStructExp}.
	 * @param ctx the parse tree
	 */
	void enterListStructExp(SwiftGrammarParser.ListStructExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listStructExp}.
	 * @param ctx the parse tree
	 */
	void exitListStructExp(SwiftGrammarParser.ListStructExpContext ctx);
}