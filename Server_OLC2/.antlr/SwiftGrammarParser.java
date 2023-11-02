// Generated from c://Users//Usuario//Documents//OLC2_P2_201906085//Server_OLC2//SwiftGrammar.g4 by ANTLR 4.13.1

    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SwiftGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STR=4, TRU=5, FAL=6, PRINT=7, IF=8, ELSE=9, WHILE=10, 
		FOR=11, SWITCH=12, CASE=13, DEFAULT=14, IN=15, VAR=16, LET=17, BREAK=18, 
		CONTINUE=19, RETURN=20, GUARD=21, APPEND=22, REMOVELAST=23, REMOVE=24, 
		COUNT=25, ISEMPTY=26, AT=27, FUNC=28, STRUCT=29, NUMBER=30, STRING=31, 
		ID=32, DIF=33, IG_IG=34, NOT=35, OR=36, AND=37, IG=38, MAY_IG=39, MEN_IG=40, 
		MAYOR=41, MENOR=42, MUL=43, DIV=44, ADD=45, SUB=46, PARIZQ=47, PARDER=48, 
		LLAVEIZQ=49, LLAVEDER=50, D_PTS=51, CORIZQ=52, CORDER=53, COMA=54, ARROW1=55, 
		PUNTO=56, MODULO=57, GUIONB=58, WHITESPACE=59, COMMENT=60, LINE_COMMENT=61;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_structCreation = 3, 
		RULE_listStructDec = 4, RULE_function = 5, RULE_callFunctionInst = 6, 
		RULE_listParamsFunc = 7, RULE_assignment = 8, RULE_printstmt = 9, RULE_ifstmt = 10, 
		RULE_elseiflist = 11, RULE_elseif = 12, RULE_switchtmt = 13, RULE_caselist = 14, 
		RULE_case = 15, RULE_whilestmt = 16, RULE_forstmt = 17, RULE_guardtmt = 18, 
		RULE_breaktmt = 19, RULE_returntmt = 20, RULE_continuetmt = 21, RULE_declarationstmt = 22, 
		RULE_types = 23, RULE_expr = 24, RULE_listParams = 25, RULE_listArray = 26, 
		RULE_callFunction = 27, RULE_listParamsCall = 28, RULE_listStructExp = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "structCreation", "listStructDec", "function", 
			"callFunctionInst", "listParamsFunc", "assignment", "printstmt", "ifstmt", 
			"elseiflist", "elseif", "switchtmt", "caselist", "case", "whilestmt", 
			"forstmt", "guardtmt", "breaktmt", "returntmt", "continuetmt", "declarationstmt", 
			"types", "expr", "listParams", "listArray", "callFunction", "listParamsCall", 
			"listStructExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", 
			"'default'", "'in'", "'var'", "'let'", "'break'", "'continue'", "'return'", 
			"'guard'", "'append'", "'removeLast'", "'remove'", "'count'", "'isEmpty'", 
			"'at'", "'func'", "'struct'", null, null, null, "'!='", "'=='", "'!'", 
			"'||'", "'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", 
			"'-'", "'('", "')'", "'{'", "'}'", "':'", "'['", "']'", "','", "'->'", 
			"'.'", "'%'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "FOR", "SWITCH", "CASE", "DEFAULT", "IN", "VAR", "LET", "BREAK", 
			"CONTINUE", "RETURN", "GUARD", "APPEND", "REMOVELAST", "REMOVE", "COUNT", 
			"ISEMPTY", "AT", "FUNC", "STRUCT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", 
			"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", 
			"CORIZQ", "CORDER", "COMA", "ARROW1", "PUNTO", "MODULO", "GUIONB", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((SContext)_localctx).block = block();
			setState(61);
			match(EOF);
			   
			        _localctx.code = ((SContext)_localctx).block.blk
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		    _localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public IfstmtContext ifstmt;
		public DeclarationstmtContext declarationstmt;
		public AssignmentContext assignment;
		public FunctionContext function;
		public StructCreationContext structCreation;
		public WhilestmtContext whilestmt;
		public ForstmtContext forstmt;
		public GuardtmtContext guardtmt;
		public SwitchtmtContext switchtmt;
		public BreaktmtContext breaktmt;
		public ContinuetmtContext continuetmt;
		public ReturntmtContext returntmt;
		public CallFunctionInstContext callFunctionInst;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DeclarationstmtContext declarationstmt() {
			return getRuleContext(DeclarationstmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StructCreationContext structCreation() {
			return getRuleContext(StructCreationContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public GuardtmtContext guardtmt() {
			return getRuleContext(GuardtmtContext.class,0);
		}
		public SwitchtmtContext switchtmt() {
			return getRuleContext(SwitchtmtContext.class,0);
		}
		public BreaktmtContext breaktmt() {
			return getRuleContext(BreaktmtContext.class,0);
		}
		public ContinuetmtContext continuetmt() {
			return getRuleContext(ContinuetmtContext.class,0);
		}
		public ReturntmtContext returntmt() {
			return getRuleContext(ReturntmtContext.class,0);
		}
		public CallFunctionInstContext callFunctionInst() {
			return getRuleContext(CallFunctionInstContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				((InstructionContext)_localctx).assignment = assignment();
				 _localctx.inst = ((InstructionContext)_localctx).assignment.ass 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				((InstructionContext)_localctx).function = function();
				 _localctx.inst = ((InstructionContext)_localctx).function.fun 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whiles 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.fors 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				((InstructionContext)_localctx).guardtmt = guardtmt();
				 _localctx.inst = ((InstructionContext)_localctx).guardtmt.guard 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(98);
				((InstructionContext)_localctx).switchtmt = switchtmt();
				 _localctx.inst = ((InstructionContext)_localctx).switchtmt.swtch 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
				((InstructionContext)_localctx).breaktmt = breaktmt();
				 _localctx.inst = ((InstructionContext)_localctx).breaktmt.break_ 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				((InstructionContext)_localctx).continuetmt = continuetmt();
				 _localctx.inst = ((InstructionContext)_localctx).continuetmt.continue_ 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				((InstructionContext)_localctx).returntmt = returntmt();
				 _localctx.inst = ((InstructionContext)_localctx).returntmt.ret 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(110);
				((InstructionContext)_localctx).callFunctionInst = callFunctionInst();
				 _localctx.inst = ((InstructionContext)_localctx).callFunctionInst.cfi 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructCreationContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token STRUCT;
		public Token ID;
		public ListStructDecContext listStructDec;
		public TerminalNode STRUCT() { return getToken(SwiftGrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public StructCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterStructCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitStructCreation(this);
		}
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(116);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(117);
			match(LLAVEIZQ);
			setState(118);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(119);
			match(LLAVEDER);
			 _localctx.dec = instructions.NewStruct((((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getLine():0), (((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getCharPositionInLine():0), (((StructCreationContext)_localctx).ID!=null?((StructCreationContext)_localctx).ID.getText():null), ((StructCreationContext)_localctx).listStructDec.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListStructDecContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructDecContext list;
		public Token ID;
		public TypesContext types;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public ListStructDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListStructDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListStructDec(this);
		}
	}

	public final ListStructDecContext listStructDec() throws RecognitionException {
		return listStructDec(0);
	}

	private ListStructDecContext listStructDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructDecContext _localctx = new ListStructDecContext(_ctx, _parentState);
		ListStructDecContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_listStructDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(123);
				match(VAR);
				setState(124);
				((ListStructDecContext)_localctx).ID = match(ID);
				setState(125);
				match(D_PTS);
				setState(126);
				((ListStructDecContext)_localctx).types = types();

				                        var arr []interface{}
				                        newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
				                        arr = append(arr, newParams)
				                        _localctx.l = arr
				                    
				}
				break;
			case 2:
				{
				 _localctx.l = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructDecContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructDec);
					setState(132);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(133);
					match(COMA);
					setState(134);
					match(VAR);
					setState(135);
					((ListStructDecContext)_localctx).ID = match(ID);
					setState(136);
					match(D_PTS);
					setState(137);
					((ListStructDecContext)_localctx).types = types();

					                                                          var arr []interface{}
					                                                          newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
					                                                          arr = append(((ListStructDecContext)_localctx).list.l, newParams)
					                                                          _localctx.l = arr
					                                                      
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public interfaces.Instruction fun;
		public Token FUNC;
		public Token ID;
		public ListParamsFuncContext listParamsFunc;
		public BlockContext block;
		public TypesContext types;
		public TerminalNode FUNC() { return getToken(SwiftGrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TerminalNode ARROW1() { return getToken(SwiftGrammarParser.ARROW1, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(146);
				((FunctionContext)_localctx).ID = match(ID);
				setState(147);
				match(PARIZQ);
				setState(148);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(149);
				match(PARDER);
				setState(150);
				match(LLAVEIZQ);
				setState(151);
				((FunctionContext)_localctx).block = block();
				setState(152);
				match(LLAVEDER);

				    _localctx.fun = instructions.NewFunction((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, environment.NULL, ((FunctionContext)_localctx).block.blk)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(156);
				((FunctionContext)_localctx).ID = match(ID);
				setState(157);
				match(PARIZQ);
				setState(158);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(159);
				match(PARDER);
				setState(160);
				match(ARROW1);
				setState(161);
				((FunctionContext)_localctx).types = types();
				setState(162);
				match(LLAVEIZQ);
				setState(163);
				((FunctionContext)_localctx).block = block();
				setState(164);
				match(LLAVEDER);

				    _localctx.fun = instructions.NewFunction((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, ((FunctionContext)_localctx).types.ty, ((FunctionContext)_localctx).block.blk)

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionInstContext extends ParserRuleContext {
		public interfaces.Instruction cfi;
		public Token ID;
		public ListParamsContext listParams;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public CallFunctionInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunctionInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterCallFunctionInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitCallFunctionInst(this);
		}
	}

	public final CallFunctionInstContext callFunctionInst() throws RecognitionException {
		CallFunctionInstContext _localctx = new CallFunctionInstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callFunctionInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((CallFunctionInstContext)_localctx).ID = match(ID);
			setState(170);
			match(PARIZQ);
			setState(171);
			((CallFunctionInstContext)_localctx).listParams = listParams(0);
			setState(172);
			match(PARDER);
			 _localctx.cfi = instructions.NewCall_Function((((CallFunctionInstContext)_localctx).ID!=null?((CallFunctionInstContext)_localctx).ID.getLine():0), (((CallFunctionInstContext)_localctx).ID!=null?((CallFunctionInstContext)_localctx).ID.getCharPositionInLine():0), (((CallFunctionInstContext)_localctx).ID!=null?((CallFunctionInstContext)_localctx).ID.getText():null), ((CallFunctionInstContext)_localctx).listParams.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListParamsFuncContext extends ParserRuleContext {
		public []interface{} lpf;
		public ListParamsFuncContext list;
		public Token ID;
		public TypesContext types;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode GUIONB() { return getToken(SwiftGrammarParser.GUIONB, 0); }
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public ListParamsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListParamsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListParamsFunc(this);
		}
	}

	public final ListParamsFuncContext listParamsFunc() throws RecognitionException {
		return listParamsFunc(0);
	}

	private ListParamsFuncContext listParamsFunc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsFuncContext _localctx = new ListParamsFuncContext(_ctx, _parentState);
		ListParamsFuncContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_listParamsFunc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(176);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(177);
				match(D_PTS);
				setState(178);
				((ListParamsFuncContext)_localctx).types = types();

				    _localctx.lpf = []interface{}{}
				    newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 2:
				{
				setState(181);
				match(GUIONB);
				setState(182);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(183);
				match(D_PTS);
				setState(184);
				((ListParamsFuncContext)_localctx).types = types();

				    _localctx.lpf = []interface{}{}
				    newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 3:
				{
				 _localctx.lpf = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ListParamsFuncContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
						setState(190);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(191);
						match(COMA);
						setState(192);
						((ListParamsFuncContext)_localctx).ID = match(ID);
						setState(193);
						match(D_PTS);
						setState(194);
						((ListParamsFuncContext)_localctx).types = types();

						              var arr []interface{}
						              newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
						              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
						              _localctx.lpf = arr
						              
						}
						break;
					case 2:
						{
						_localctx = new ListParamsFuncContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(COMA);
						setState(199);
						match(GUIONB);
						setState(200);
						((ListParamsFuncContext)_localctx).ID = match(ID);
						setState(201);
						match(D_PTS);
						setState(202);
						((ListParamsFuncContext)_localctx).types = types();

						              var arr []interface{}
						              newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
						              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
						              _localctx.lpf = arr
						              
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public interfaces.Instruction ass;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(211);
			match(IG);
			setState(212);
			((AssignmentContext)_localctx).expr = expr(0);
			 _localctx.ass = instructions.NewAssignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getLine():0), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getCharPositionInLine():0), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(216);
			match(PARIZQ);
			setState(217);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(218);
			match(PARDER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ifinst;
		public Token IF;
		public ExprContext expr;
		public BlockContext block;
		public BlockContext b1;
		public BlockContext b2;
		public ElseiflistContext elseiflist;
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVEIZQ() { return getTokens(SwiftGrammarParser.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(SwiftGrammarParser.LLAVEIZQ, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(SwiftGrammarParser.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(SwiftGrammarParser.LLAVEDER, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public ElseiflistContext elseiflist() {
			return getRuleContext(ElseiflistContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifstmt);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(222);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(223);
				match(LLAVEIZQ);
				setState(224);
				((IfstmtContext)_localctx).block = block();
				setState(225);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(229);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(230);
				match(LLAVEIZQ);
				setState(231);
				((IfstmtContext)_localctx).b1 = block();
				setState(232);
				match(LLAVEDER);
				setState(233);
				match(ELSE);
				setState(234);
				match(LLAVEIZQ);
				setState(235);
				((IfstmtContext)_localctx).b2 = block();
				setState(236);
				match(LLAVEDER);
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).b1.blk, nil, ((IfstmtContext)_localctx).b2.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(240);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(241);
				match(LLAVEIZQ);
				setState(242);
				((IfstmtContext)_localctx).block = block();
				setState(243);
				match(LLAVEDER);
				setState(244);
				((IfstmtContext)_localctx).elseiflist = elseiflist(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, ((IfstmtContext)_localctx).elseiflist.else_if_list, nil) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(248);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(249);
				match(LLAVEIZQ);
				setState(250);
				((IfstmtContext)_localctx).b1 = block();
				setState(251);
				match(LLAVEDER);
				setState(252);
				((IfstmtContext)_localctx).elseiflist = elseiflist(0);
				setState(253);
				match(ELSE);
				setState(254);
				match(LLAVEIZQ);
				setState(255);
				((IfstmtContext)_localctx).b2 = block();
				setState(256);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).b1.blk, ((IfstmtContext)_localctx).elseiflist.else_if_list, ((IfstmtContext)_localctx).b2.blk) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseiflistContext extends ParserRuleContext {
		public []interface{} else_if_list;
		public ElseiflistContext listif;
		public ElseifContext elseif;
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElseiflistContext elseiflist() {
			return getRuleContext(ElseiflistContext.class,0);
		}
		public ElseiflistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseiflist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterElseiflist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitElseiflist(this);
		}
	}

	public final ElseiflistContext elseiflist() throws RecognitionException {
		return elseiflist(0);
	}

	private ElseiflistContext elseiflist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElseiflistContext _localctx = new ElseiflistContext(_ctx, _parentState);
		ElseiflistContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_elseiflist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262);
			((ElseiflistContext)_localctx).elseif = elseif();

			                _localctx.else_if_list = []interface{}{}
			                _localctx.else_if_list = append(_localctx.else_if_list, ((ElseiflistContext)_localctx).elseif.ifinst)

			            
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseiflistContext(_parentctx, _parentState);
					_localctx.listif = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_elseiflist);
					setState(265);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(266);
					((ElseiflistContext)_localctx).elseif = elseif();
					   var arr2 []interface{}
					                                  arr2 = append(((ElseiflistContext)_localctx).listif.else_if_list, ((ElseiflistContext)_localctx).elseif.ifinst)
					                                  _localctx.else_if_list = arr2
					                              
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifContext extends ParserRuleContext {
		public interfaces.Instruction ifinst;
		public Token IF;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitElseif(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ELSE);
			setState(275);
			((ElseifContext)_localctx).IF = match(IF);
			setState(276);
			((ElseifContext)_localctx).expr = expr(0);
			setState(277);
			match(LLAVEIZQ);
			setState(278);
			((ElseifContext)_localctx).block = block();
			setState(279);
			match(LLAVEDER);
			 _localctx.ifinst = instructions.NewIf((((ElseifContext)_localctx).IF!=null?((ElseifContext)_localctx).IF.getLine():0), (((ElseifContext)_localctx).IF!=null?((ElseifContext)_localctx).IF.getCharPositionInLine():0), ((ElseifContext)_localctx).expr.e, ((ElseifContext)_localctx).block.blk, nil, nil) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchtmtContext extends ParserRuleContext {
		public interfaces.Instruction swtch;
		public Token SWITCH;
		public ExprContext expr;
		public CaselistContext caselist;
		public BlockContext block;
		public TerminalNode SWITCH() { return getToken(SwiftGrammarParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public CaselistContext caselist() {
			return getRuleContext(CaselistContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SwiftGrammarParser.DEFAULT, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public SwitchtmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchtmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterSwitchtmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitSwitchtmt(this);
		}
	}

	public final SwitchtmtContext switchtmt() throws RecognitionException {
		SwitchtmtContext _localctx = new SwitchtmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchtmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((SwitchtmtContext)_localctx).SWITCH = match(SWITCH);
			setState(283);
			((SwitchtmtContext)_localctx).expr = expr(0);
			setState(284);
			match(LLAVEIZQ);
			setState(285);
			((SwitchtmtContext)_localctx).caselist = caselist(0);
			setState(286);
			match(DEFAULT);
			setState(287);
			match(D_PTS);
			setState(288);
			((SwitchtmtContext)_localctx).block = block();
			setState(289);
			match(LLAVEDER);
			 _localctx.swtch = instructions.NewSwitch( (((SwitchtmtContext)_localctx).SWITCH!=null?((SwitchtmtContext)_localctx).SWITCH.getLine():0), (((SwitchtmtContext)_localctx).SWITCH!=null?((SwitchtmtContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchtmtContext)_localctx).expr.e,((SwitchtmtContext)_localctx).caselist.cases, ((SwitchtmtContext)_localctx).block.blk ) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaselistContext extends ParserRuleContext {
		public []interface{} cases;
		public CaselistContext listcases;
		public CaseContext case_;
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public CaselistContext caselist() {
			return getRuleContext(CaselistContext.class,0);
		}
		public CaselistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caselist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterCaselist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitCaselist(this);
		}
	}

	public final CaselistContext caselist() throws RecognitionException {
		return caselist(0);
	}

	private CaselistContext caselist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaselistContext _localctx = new CaselistContext(_ctx, _parentState);
		CaselistContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_caselist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			((CaselistContext)_localctx).case_ = case_();

			                            _localctx.cases= []interface{}{}
			                            _localctx.cases = append(_localctx.cases, ((CaselistContext)_localctx).case.swtch)
			                        
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaselistContext(_parentctx, _parentState);
					_localctx.listcases = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_caselist);
					setState(296);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(297);
					((CaselistContext)_localctx).case_ = case_();
					 var arr3 []interface{}
					                                  arr3= append(((CaselistContext)_localctx).listcases.cases, ((CaselistContext)_localctx).case.swtch)
					                                  _localctx.cases= arr3
					                                  
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public interfaces.Instruction swtch;
		public Token CASE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode CASE() { return getToken(SwiftGrammarParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitCase(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((CaseContext)_localctx).CASE = match(CASE);
			setState(306);
			((CaseContext)_localctx).expr = expr(0);
			setState(307);
			match(D_PTS);
			setState(308);
			((CaseContext)_localctx).block = block();
			 _localctx.swtch = instructions.NewCase( (((CaseContext)_localctx).CASE!=null?((CaseContext)_localctx).CASE.getLine():0), (((CaseContext)_localctx).CASE!=null?((CaseContext)_localctx).CASE.getCharPositionInLine():0),((CaseContext)_localctx).expr.e, ((CaseContext)_localctx).block.blk ) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends ParserRuleContext {
		public interfaces.Instruction whiles;
		public Token WHILE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(SwiftGrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(312);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(313);
			match(LLAVEIZQ);
			setState(314);
			((WhilestmtContext)_localctx).block = block();
			setState(315);
			match(LLAVEDER);
			 _localctx.whiles =instructions.NewWhiles((((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getLine():0), (((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getCharPositionInLine():0), ((WhilestmtContext)_localctx).expr.e, ((WhilestmtContext)_localctx).block.blk) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction fors;
		public Token FOR;
		public Token ID;
		public ExprContext e1;
		public ExprContext e2;
		public BlockContext block;
		public Token GUIONB;
		public Token ope;
		public TerminalNode FOR() { return getToken(SwiftGrammarParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(SwiftGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftGrammarParser.ID, i);
		}
		public TerminalNode IN() { return getToken(SwiftGrammarParser.IN, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(SwiftGrammarParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(SwiftGrammarParser.PUNTO, i);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GUIONB() { return getToken(SwiftGrammarParser.GUIONB, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forstmt);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(319);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(320);
				match(IN);
				setState(321);
				((ForstmtContext)_localctx).e1 = expr(0);
				setState(322);
				match(PUNTO);
				setState(323);
				match(PUNTO);
				setState(324);
				match(PUNTO);
				setState(325);
				((ForstmtContext)_localctx).e2 = expr(0);
				setState(326);
				match(LLAVEIZQ);
				setState(327);
				((ForstmtContext)_localctx).block = block();
				setState(328);
				match(LLAVEDER);
				 _localctx.fors = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).e1.e,((ForstmtContext)_localctx).e2.e,"nil", ((ForstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(332);
				((ForstmtContext)_localctx).GUIONB = match(GUIONB);
				setState(333);
				match(IN);
				setState(334);
				((ForstmtContext)_localctx).e1 = expr(0);
				setState(335);
				match(PUNTO);
				setState(336);
				match(PUNTO);
				setState(337);
				match(PUNTO);
				setState(338);
				((ForstmtContext)_localctx).e2 = expr(0);
				setState(339);
				match(LLAVEIZQ);
				setState(340);
				((ForstmtContext)_localctx).block = block();
				setState(341);
				match(LLAVEDER);
				 _localctx.fors = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).GUIONB!=null?((ForstmtContext)_localctx).GUIONB.getText():null), ((ForstmtContext)_localctx).e1.e,((ForstmtContext)_localctx).e2.e,"nil", ((ForstmtContext)_localctx).block.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(345);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(346);
				match(IN);
				setState(347);
				((ForstmtContext)_localctx).ope = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
					((ForstmtContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(348);
				match(LLAVEIZQ);
				setState(349);
				((ForstmtContext)_localctx).block = block();
				setState(350);
				match(LLAVEDER);
				 _localctx.fors = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), nil,nil, (((ForstmtContext)_localctx).ope!=null?((ForstmtContext)_localctx).ope.getText():null) ,((ForstmtContext)_localctx).block.blk ) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardtmtContext extends ParserRuleContext {
		public interfaces.Instruction guard;
		public Token GUARD;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode GUARD() { return getToken(SwiftGrammarParser.GUARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public GuardtmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardtmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterGuardtmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitGuardtmt(this);
		}
	}

	public final GuardtmtContext guardtmt() throws RecognitionException {
		GuardtmtContext _localctx = new GuardtmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_guardtmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((GuardtmtContext)_localctx).GUARD = match(GUARD);
			setState(356);
			((GuardtmtContext)_localctx).expr = expr(0);
			setState(357);
			match(ELSE);
			setState(358);
			match(LLAVEIZQ);
			setState(359);
			((GuardtmtContext)_localctx).block = block();
			setState(360);
			match(LLAVEDER);
			_localctx.guard = instructions.NewGuard( (((GuardtmtContext)_localctx).GUARD!=null?((GuardtmtContext)_localctx).GUARD.getLine():0), (((GuardtmtContext)_localctx).GUARD!=null?((GuardtmtContext)_localctx).GUARD.getCharPositionInLine():0), ((GuardtmtContext)_localctx).expr.e, ((GuardtmtContext)_localctx).block.blk )
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreaktmtContext extends ParserRuleContext {
		public interfaces.Instruction break_;
		public Token BREAK;
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public BreaktmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breaktmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterBreaktmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitBreaktmt(this);
		}
	}

	public final BreaktmtContext breaktmt() throws RecognitionException {
		BreaktmtContext _localctx = new BreaktmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_breaktmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((BreaktmtContext)_localctx).BREAK = match(BREAK);
			 _localctx.break_ = instructions.NewBreak((((BreaktmtContext)_localctx).BREAK!=null?((BreaktmtContext)_localctx).BREAK.getLine():0), (((BreaktmtContext)_localctx).BREAK!=null?((BreaktmtContext)_localctx).BREAK.getCharPositionInLine():0))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturntmtContext extends ParserRuleContext {
		public interfaces.Instruction ret;
		public Token RETURN;
		public ExprContext expr;
		public TerminalNode RETURN() { return getToken(SwiftGrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturntmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterReturntmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitReturntmt(this);
		}
	}

	public final ReturntmtContext returntmt() throws RecognitionException {
		ReturntmtContext _localctx = new ReturntmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returntmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((ReturntmtContext)_localctx).RETURN = match(RETURN);
			setState(367);
			((ReturntmtContext)_localctx).expr = expr(0);
			  _localctx.ret = instructions.NewReturn((((ReturntmtContext)_localctx).RETURN!=null?((ReturntmtContext)_localctx).RETURN.getLine():0), (((ReturntmtContext)_localctx).RETURN!=null?((ReturntmtContext)_localctx).RETURN.getCharPositionInLine():0), ((ReturntmtContext)_localctx).expr.e)  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinuetmtContext extends ParserRuleContext {
		public interfaces.Instruction continue_;
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public ContinuetmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuetmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterContinuetmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitContinuetmt(this);
		}
	}

	public final ContinuetmtContext continuetmt() throws RecognitionException {
		ContinuetmtContext _localctx = new ContinuetmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continuetmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			((ContinuetmtContext)_localctx).CONTINUE = match(CONTINUE);
			 _localctx.continue_ = instructions.NewContinue((((ContinuetmtContext)_localctx).CONTINUE!=null?((ContinuetmtContext)_localctx).CONTINUE.getLine():0), (((ContinuetmtContext)_localctx).CONTINUE!=null?((ContinuetmtContext)_localctx).CONTINUE.getCharPositionInLine():0))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationstmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypesContext types;
		public ExprContext expr;
		public Token LET;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterDeclarationstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitDeclarationstmt(this);
		}
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarationstmt);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(374);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(375);
				match(D_PTS);
				setState(376);
				((DeclarationstmtContext)_localctx).types = types();
				setState(377);
				match(IG);
				setState(378);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e, false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(382);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(383);
				match(IG);
				setState(384);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.NULL, ((DeclarationstmtContext)_localctx).expr.e, false);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(388);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(389);
				match(IG);
				setState(390);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.NULL, ((DeclarationstmtContext)_localctx).expr.e, true);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(394);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(395);
				match(D_PTS);
				setState(396);
				((DeclarationstmtContext)_localctx).types = types();
				setState(397);
				match(IG);
				setState(398);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e, true);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public environment.TipoExpresion ty;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(SwiftGrammarParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_types);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(CORIZQ);
				setState(412);
				match(CORDER);
				 _localctx.ty = environment.ARRAY 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public ExprContext expr;
		public CallFunctionContext callFunction;
		public Token ID;
		public ListStructExpContext listStructExp;
		public ListArrayContext list;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public Token INT;
		public Token STR;
		public Token FLOAT;
		public Token NUMBER;
		public Token STRING;
		public Token TRU;
		public Token FAL;
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode STR() { return getToken(SwiftGrammarParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(SwiftGrammarParser.MODULO, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(417);
				((ExprContext)_localctx).op = match(SUB);
				setState(418);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
				 _localctx.e = expressions.NewOperation(((ExprContext)_localctx).op.GetLine(), ((ExprContext)_localctx).op.GetColumn(), ((ExprContext)_localctx).right.e, "neg", ((ExprContext)_localctx).right.e) 
				}
				break;
			case 2:
				{
				setState(421);
				((ExprContext)_localctx).callFunction = callFunction();
				 _localctx.e = ((ExprContext)_localctx).callFunction.cf 
				}
				break;
			case 3:
				{
				setState(424);
				((ExprContext)_localctx).ID = match(ID);
				setState(425);
				match(LLAVEIZQ);
				setState(426);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(427);
				match(LLAVEDER);
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 4:
				{
				setState(430);
				match(PARIZQ);
				setState(431);
				((ExprContext)_localctx).expr = expr(0);
				setState(432);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 5:
				{
				setState(435);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 6:
				{
				setState(438);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(439);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(440);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 7:
				{
				setState(443);
				((ExprContext)_localctx).INT = match(INT);
				setState(444);
				match(PARIZQ);
				setState(445);
				((ExprContext)_localctx).expr = expr(0);
				setState(446);
				match(PARDER);
				 _localctx.e = expressions.NewConversion(((ExprContext)_localctx).INT.GetLine(),((ExprContext)_localctx).INT.GetColumn(),((ExprContext)_localctx).expr.e, environment.INTEGER,  (((ExprContext)_localctx).expr!=null?_input.getText(((ExprContext)_localctx).expr.start,((ExprContext)_localctx).expr.stop):null)) 
				}
				break;
			case 8:
				{
				setState(449);
				((ExprContext)_localctx).STR = match(STR);
				setState(450);
				match(PARIZQ);
				setState(451);
				((ExprContext)_localctx).expr = expr(0);
				setState(452);
				match(PARDER);
				 _localctx.e = expressions.NewConversion(((ExprContext)_localctx).STR.GetLine(),((ExprContext)_localctx).STR.GetColumn(),((ExprContext)_localctx).expr.e, environment.STRING, (((ExprContext)_localctx).expr!=null?_input.getText(((ExprContext)_localctx).expr.start,((ExprContext)_localctx).expr.stop):null)) 
				}
				break;
			case 9:
				{
				setState(455);
				((ExprContext)_localctx).FLOAT = match(FLOAT);
				setState(456);
				match(PARIZQ);
				setState(457);
				((ExprContext)_localctx).expr = expr(0);
				setState(458);
				match(PARDER);
				 _localctx.e = expressions.NewConversion(((ExprContext)_localctx).FLOAT.GetLine(),((ExprContext)_localctx).FLOAT.GetColumn(),((ExprContext)_localctx).expr.e, environment.FLOAT, (((ExprContext)_localctx).expr!=null?_input.getText(((ExprContext)_localctx).expr.start,((ExprContext)_localctx).expr.stop):null)) 
				}
				break;
			case 10:
				{
				setState(461);
				((ExprContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case 11:
				{
				setState(463);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 12:
				{
				setState(465);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 13:
				{
				setState(467);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(471);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(472);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144141576354922496L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(473);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(476);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(477);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(478);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(481);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(482);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAY_IG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(483);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(486);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(487);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MEN_IG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(488);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(491);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(492);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(493);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(496);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(497);
						((ExprContext)_localctx).op = match(AND);
						setState(498);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(501);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(502);
						((ExprContext)_localctx).op = match(OR);
						setState(503);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListParamsContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListParams(this);
		}
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(512);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(515);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(516);
					match(COMA);
					setState(517);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListArray(this);
		}
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(526);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(539);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(529);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(530);
						match(CORIZQ);
						setState(531);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(532);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(535);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(536);
						match(PUNTO);
						setState(537);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public interfaces.Expression cf;
		public Token ID;
		public ListParamsCallContext listParamsCall;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitCallFunction(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			((CallFunctionContext)_localctx).ID = match(ID);
			setState(545);
			match(PARIZQ);
			setState(546);
			((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
			setState(547);
			match(PARDER);
			 _localctx.cf = expressions.NewCallExp((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParamsCall.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListParamsCallContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsCallContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public ListParamsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListParamsCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListParamsCall(this);
		}
	}

	public final ListParamsCallContext listParamsCall() throws RecognitionException {
		return listParamsCall(0);
	}

	private ListParamsCallContext listParamsCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsCallContext _localctx = new ListParamsCallContext(_ctx, _parentState);
		ListParamsCallContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_listParamsCall, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(551);
				((ListParamsCallContext)_localctx).expr = expr(0);

				            _localctx.l = []interface{}{}
				            _localctx.l = append(_localctx.l, ((ListParamsCallContext)_localctx).expr.e)
				        
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(557);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(558);
					match(COMA);
					setState(559);
					((ListParamsCallContext)_localctx).expr = expr(0);

					                                              var arr []interface{}
					                                              arr = append(((ListParamsCallContext)_localctx).list.l, ((ListParamsCallContext)_localctx).expr.e)
					                                              _localctx.l = arr
					                                          
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListStructExpContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructExpContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public ListStructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).enterListStructExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftGrammarListener ) ((SwiftGrammarListener)listener).exitListStructExp(this);
		}
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_listStructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(568);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(569);
				match(D_PTS);
				setState(570);
				((ListStructExpContext)_localctx).expr = expr(0);

				                    var arr []interface{}
				                    StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
				                    arr = append(arr, StrExp)
				                    _localctx.l = arr
				                
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(576);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(577);
					match(COMA);
					setState(578);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(579);
					match(D_PTS);
					setState(580);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return listStructDec_sempred((ListStructDecContext)_localctx, predIndex);
		case 7:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 11:
			return elseiflist_sempred((ElseiflistContext)_localctx, predIndex);
		case 14:
			return caselist_sempred((CaselistContext)_localctx, predIndex);
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 25:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 26:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 28:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 29:
			return listStructExp_sempred((ListStructExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listStructDec_sempred(ListStructDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listParamsFunc_sempred(ListParamsFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean elseiflist_sempred(ElseiflistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean caselist_sempred(CaselistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u024d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001B\b\u0001\u000b\u0001"+
		"\f\u0001C\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002r\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u008d\b\u0004\n\u0004\f\u0004\u0090\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a8\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ce"+
		"\b\u0007\n\u0007\f\u0007\u00d1\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0104\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010e\b\u000b\n"+
		"\u000b\f\u000b\u0111\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u012d\b\u000e"+
		"\n\u000e\f\u000e\u0130\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0162\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0192\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u019f\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d6"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01fb\b\u0018\n\u0018\f\u0018\u01fe\t\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0209\b\u0019\n\u0019\f\u0019\u020c\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u021c\b\u001a\n\u001a\f\u001a\u021f\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u022c\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0233\b\u001c\n\u001c\f\u001c\u0236\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u023f\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0248\b\u001d\n\u001d\f\u001d"+
		"\u024b\t\u001d\u0001\u001d\u0000\t\b\u000e\u0016\u001c0248:\u001e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:\u0000\u0006\u0001\u0000\u001f \u0002\u0000+,99\u0001"+
		"\u0000-.\u0002\u0000\'\'))\u0002\u0000((**\u0001\u0000!\"\u026b\u0000"+
		"<\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004q\u0001"+
		"\u0000\u0000\u0000\u0006s\u0001\u0000\u0000\u0000\b\u0082\u0001\u0000"+
		"\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00a9\u0001\u0000\u0000"+
		"\u0000\u000e\u00bc\u0001\u0000\u0000\u0000\u0010\u00d2\u0001\u0000\u0000"+
		"\u0000\u0012\u00d7\u0001\u0000\u0000\u0000\u0014\u0103\u0001\u0000\u0000"+
		"\u0000\u0016\u0105\u0001\u0000\u0000\u0000\u0018\u0112\u0001\u0000\u0000"+
		"\u0000\u001a\u011a\u0001\u0000\u0000\u0000\u001c\u0124\u0001\u0000\u0000"+
		"\u0000\u001e\u0131\u0001\u0000\u0000\u0000 \u0137\u0001\u0000\u0000\u0000"+
		"\"\u0161\u0001\u0000\u0000\u0000$\u0163\u0001\u0000\u0000\u0000&\u016b"+
		"\u0001\u0000\u0000\u0000(\u016e\u0001\u0000\u0000\u0000*\u0172\u0001\u0000"+
		"\u0000\u0000,\u0191\u0001\u0000\u0000\u0000.\u019e\u0001\u0000\u0000\u0000"+
		"0\u01d5\u0001\u0000\u0000\u00002\u01ff\u0001\u0000\u0000\u00004\u020d"+
		"\u0001\u0000\u0000\u00006\u0220\u0001\u0000\u0000\u00008\u022b\u0001\u0000"+
		"\u0000\u0000:\u023e\u0001\u0000\u0000\u0000<=\u0003\u0002\u0001\u0000"+
		"=>\u0005\u0000\u0000\u0001>?\u0006\u0000\uffff\uffff\u0000?\u0001\u0001"+
		"\u0000\u0000\u0000@B\u0003\u0004\u0002\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0006\u0001\uffff\uffff\u0000F\u0003"+
		"\u0001\u0000\u0000\u0000GH\u0003\u0012\t\u0000HI\u0006\u0002\uffff\uffff"+
		"\u0000Ir\u0001\u0000\u0000\u0000JK\u0003\u0014\n\u0000KL\u0006\u0002\uffff"+
		"\uffff\u0000Lr\u0001\u0000\u0000\u0000MN\u0003,\u0016\u0000NO\u0006\u0002"+
		"\uffff\uffff\u0000Or\u0001\u0000\u0000\u0000PQ\u0003\u0010\b\u0000QR\u0006"+
		"\u0002\uffff\uffff\u0000Rr\u0001\u0000\u0000\u0000ST\u0003\n\u0005\u0000"+
		"TU\u0006\u0002\uffff\uffff\u0000Ur\u0001\u0000\u0000\u0000VW\u0003\u0006"+
		"\u0003\u0000WX\u0006\u0002\uffff\uffff\u0000Xr\u0001\u0000\u0000\u0000"+
		"YZ\u0003 \u0010\u0000Z[\u0006\u0002\uffff\uffff\u0000[r\u0001\u0000\u0000"+
		"\u0000\\]\u0003\"\u0011\u0000]^\u0006\u0002\uffff\uffff\u0000^r\u0001"+
		"\u0000\u0000\u0000_`\u0003$\u0012\u0000`a\u0006\u0002\uffff\uffff\u0000"+
		"ar\u0001\u0000\u0000\u0000bc\u0003\u001a\r\u0000cd\u0006\u0002\uffff\uffff"+
		"\u0000dr\u0001\u0000\u0000\u0000ef\u0003&\u0013\u0000fg\u0006\u0002\uffff"+
		"\uffff\u0000gr\u0001\u0000\u0000\u0000hi\u0003*\u0015\u0000ij\u0006\u0002"+
		"\uffff\uffff\u0000jr\u0001\u0000\u0000\u0000kl\u0003(\u0014\u0000lm\u0006"+
		"\u0002\uffff\uffff\u0000mr\u0001\u0000\u0000\u0000no\u0003\f\u0006\u0000"+
		"op\u0006\u0002\uffff\uffff\u0000pr\u0001\u0000\u0000\u0000qG\u0001\u0000"+
		"\u0000\u0000qJ\u0001\u0000\u0000\u0000qM\u0001\u0000\u0000\u0000qP\u0001"+
		"\u0000\u0000\u0000qS\u0001\u0000\u0000\u0000qV\u0001\u0000\u0000\u0000"+
		"qY\u0001\u0000\u0000\u0000q\\\u0001\u0000\u0000\u0000q_\u0001\u0000\u0000"+
		"\u0000qb\u0001\u0000\u0000\u0000qe\u0001\u0000\u0000\u0000qh\u0001\u0000"+
		"\u0000\u0000qk\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000r\u0005"+
		"\u0001\u0000\u0000\u0000st\u0005\u001d\u0000\u0000tu\u0005 \u0000\u0000"+
		"uv\u00051\u0000\u0000vw\u0003\b\u0004\u0000wx\u00052\u0000\u0000xy\u0006"+
		"\u0003\uffff\uffff\u0000y\u0007\u0001\u0000\u0000\u0000z{\u0006\u0004"+
		"\uffff\uffff\u0000{|\u0005\u0010\u0000\u0000|}\u0005 \u0000\u0000}~\u0005"+
		"3\u0000\u0000~\u007f\u0003.\u0017\u0000\u007f\u0080\u0006\u0004\uffff"+
		"\uffff\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0006\u0004"+
		"\uffff\uffff\u0000\u0082z\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u008e\u0001\u0000\u0000\u0000\u0084\u0085\n\u0003\u0000"+
		"\u0000\u0085\u0086\u00056\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000"+
		"\u0087\u0088\u0005 \u0000\u0000\u0088\u0089\u00053\u0000\u0000\u0089\u008a"+
		"\u0003.\u0017\u0000\u008a\u008b\u0006\u0004\uffff\uffff\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u0093\u0005"+
		" \u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0003\u000e\u0007"+
		"\u0000\u0095\u0096\u00050\u0000\u0000\u0096\u0097\u00051\u0000\u0000\u0097"+
		"\u0098\u0003\u0002\u0001\u0000\u0098\u0099\u00052\u0000\u0000\u0099\u009a"+
		"\u0006\u0005\uffff\uffff\u0000\u009a\u00a8\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u001c\u0000\u0000\u009c\u009d\u0005 \u0000\u0000\u009d\u009e"+
		"\u0005/\u0000\u0000\u009e\u009f\u0003\u000e\u0007\u0000\u009f\u00a0\u0005"+
		"0\u0000\u0000\u00a0\u00a1\u00057\u0000\u0000\u00a1\u00a2\u0003.\u0017"+
		"\u0000\u00a2\u00a3\u00051\u0000\u0000\u00a3\u00a4\u0003\u0002\u0001\u0000"+
		"\u00a4\u00a5\u00052\u0000\u0000\u00a5\u00a6\u0006\u0005\uffff\uffff\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u0091\u0001\u0000\u0000\u0000"+
		"\u00a7\u009b\u0001\u0000\u0000\u0000\u00a8\u000b\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005 \u0000\u0000\u00aa\u00ab\u0005/\u0000\u0000\u00ab\u00ac"+
		"\u00032\u0019\u0000\u00ac\u00ad\u00050\u0000\u0000\u00ad\u00ae\u0006\u0006"+
		"\uffff\uffff\u0000\u00ae\r\u0001\u0000\u0000\u0000\u00af\u00b0\u0006\u0007"+
		"\uffff\uffff\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u00053\u0000"+
		"\u0000\u00b2\u00b3\u0003.\u0017\u0000\u00b3\u00b4\u0006\u0007\uffff\uffff"+
		"\u0000\u00b4\u00bd\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005:\u0000\u0000"+
		"\u00b6\u00b7\u0005 \u0000\u0000\u00b7\u00b8\u00053\u0000\u0000\u00b8\u00b9"+
		"\u0003.\u0017\u0000\u00b9\u00ba\u0006\u0007\uffff\uffff\u0000\u00ba\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bd\u0006\u0007\uffff\uffff\u0000\u00bc"+
		"\u00af\u0001\u0000\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00cf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\n\u0005\u0000\u0000\u00bf\u00c0\u00056\u0000\u0000\u00c0\u00c1"+
		"\u0005 \u0000\u0000\u00c1\u00c2\u00053\u0000\u0000\u00c2\u00c3\u0003."+
		"\u0017\u0000\u00c3\u00c4\u0006\u0007\uffff\uffff\u0000\u00c4\u00ce\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\n\u0003\u0000\u0000\u00c6\u00c7\u00056"+
		"\u0000\u0000\u00c7\u00c8\u0005:\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000"+
		"\u00c9\u00ca\u00053\u0000\u0000\u00ca\u00cb\u0003.\u0017\u0000\u00cb\u00cc"+
		"\u0006\u0007\uffff\uffff\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00be\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u000f\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005 \u0000\u0000\u00d3\u00d4"+
		"\u0005&\u0000\u0000\u00d4\u00d5\u00030\u0018\u0000\u00d5\u00d6\u0006\b"+
		"\uffff\uffff\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\u0007\u0000\u0000\u00d8\u00d9\u0005/\u0000\u0000\u00d9\u00da\u00030\u0018"+
		"\u0000\u00da\u00db\u00050\u0000\u0000\u00db\u00dc\u0006\t\uffff\uffff"+
		"\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\b\u0000\u0000"+
		"\u00de\u00df\u00030\u0018\u0000\u00df\u00e0\u00051\u0000\u0000\u00e0\u00e1"+
		"\u0003\u0002\u0001\u0000\u00e1\u00e2\u00052\u0000\u0000\u00e2\u00e3\u0006"+
		"\n\uffff\uffff\u0000\u00e3\u0104\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\b\u0000\u0000\u00e5\u00e6\u00030\u0018\u0000\u00e6\u00e7\u00051\u0000"+
		"\u0000\u00e7\u00e8\u0003\u0002\u0001\u0000\u00e8\u00e9\u00052\u0000\u0000"+
		"\u00e9\u00ea\u0005\t\u0000\u0000\u00ea\u00eb\u00051\u0000\u0000\u00eb"+
		"\u00ec\u0003\u0002\u0001\u0000\u00ec\u00ed\u00052\u0000\u0000\u00ed\u00ee"+
		"\u0006\n\uffff\uffff\u0000\u00ee\u0104\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\b\u0000\u0000\u00f0\u00f1\u00030\u0018\u0000\u00f1\u00f2\u0005"+
		"1\u0000\u0000\u00f2\u00f3\u0003\u0002\u0001\u0000\u00f3\u00f4\u00052\u0000"+
		"\u0000\u00f4\u00f5\u0003\u0016\u000b\u0000\u00f5\u00f6\u0006\n\uffff\uffff"+
		"\u0000\u00f6\u0104\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\b\u0000\u0000"+
		"\u00f8\u00f9\u00030\u0018\u0000\u00f9\u00fa\u00051\u0000\u0000\u00fa\u00fb"+
		"\u0003\u0002\u0001\u0000\u00fb\u00fc\u00052\u0000\u0000\u00fc\u00fd\u0003"+
		"\u0016\u000b\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\u00ff\u00051"+
		"\u0000\u0000\u00ff\u0100\u0003\u0002\u0001\u0000\u0100\u0101\u00052\u0000"+
		"\u0000\u0101\u0102\u0006\n\uffff\uffff\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u00dd\u0001\u0000\u0000\u0000\u0103\u00e4\u0001\u0000\u0000"+
		"\u0000\u0103\u00ef\u0001\u0000\u0000\u0000\u0103\u00f7\u0001\u0000\u0000"+
		"\u0000\u0104\u0015\u0001\u0000\u0000\u0000\u0105\u0106\u0006\u000b\uffff"+
		"\uffff\u0000\u0106\u0107\u0003\u0018\f\u0000\u0107\u0108\u0006\u000b\uffff"+
		"\uffff\u0000\u0108\u010f\u0001\u0000\u0000\u0000\u0109\u010a\n\u0002\u0000"+
		"\u0000\u010a\u010b\u0003\u0018\f\u0000\u010b\u010c\u0006\u000b\uffff\uffff"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0017\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005\t\u0000\u0000"+
		"\u0113\u0114\u0005\b\u0000\u0000\u0114\u0115\u00030\u0018\u0000\u0115"+
		"\u0116\u00051\u0000\u0000\u0116\u0117\u0003\u0002\u0001\u0000\u0117\u0118"+
		"\u00052\u0000\u0000\u0118\u0119\u0006\f\uffff\uffff\u0000\u0119\u0019"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005\f\u0000\u0000\u011b\u011c\u0003"+
		"0\u0018\u0000\u011c\u011d\u00051\u0000\u0000\u011d\u011e\u0003\u001c\u000e"+
		"\u0000\u011e\u011f\u0005\u000e\u0000\u0000\u011f\u0120\u00053\u0000\u0000"+
		"\u0120\u0121\u0003\u0002\u0001\u0000\u0121\u0122\u00052\u0000\u0000\u0122"+
		"\u0123\u0006\r\uffff\uffff\u0000\u0123\u001b\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0006\u000e\uffff\uffff\u0000\u0125\u0126\u0003\u001e\u000f\u0000"+
		"\u0126\u0127\u0006\u000e\uffff\uffff\u0000\u0127\u012e\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\n\u0002\u0000\u0000\u0129\u012a\u0003\u001e\u000f\u0000"+
		"\u012a\u012b\u0006\u000e\uffff\uffff\u0000\u012b\u012d\u0001\u0000\u0000"+
		"\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u001d\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\r\u0000\u0000\u0132\u0133\u00030\u0018\u0000"+
		"\u0133\u0134\u00053\u0000\u0000\u0134\u0135\u0003\u0002\u0001\u0000\u0135"+
		"\u0136\u0006\u000f\uffff\uffff\u0000\u0136\u001f\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\n\u0000\u0000\u0138\u0139\u00030\u0018\u0000\u0139"+
		"\u013a\u00051\u0000\u0000\u013a\u013b\u0003\u0002\u0001\u0000\u013b\u013c"+
		"\u00052\u0000\u0000\u013c\u013d\u0006\u0010\uffff\uffff\u0000\u013d!\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005\u000b\u0000\u0000\u013f\u0140\u0005"+
		" \u0000\u0000\u0140\u0141\u0005\u000f\u0000\u0000\u0141\u0142\u00030\u0018"+
		"\u0000\u0142\u0143\u00058\u0000\u0000\u0143\u0144\u00058\u0000\u0000\u0144"+
		"\u0145\u00058\u0000\u0000\u0145\u0146\u00030\u0018\u0000\u0146\u0147\u0005"+
		"1\u0000\u0000\u0147\u0148\u0003\u0002\u0001\u0000\u0148\u0149\u00052\u0000"+
		"\u0000\u0149\u014a\u0006\u0011\uffff\uffff\u0000\u014a\u0162\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005\u000b\u0000\u0000\u014c\u014d\u0005:\u0000"+
		"\u0000\u014d\u014e\u0005\u000f\u0000\u0000\u014e\u014f\u00030\u0018\u0000"+
		"\u014f\u0150\u00058\u0000\u0000\u0150\u0151\u00058\u0000\u0000\u0151\u0152"+
		"\u00058\u0000\u0000\u0152\u0153\u00030\u0018\u0000\u0153\u0154\u00051"+
		"\u0000\u0000\u0154\u0155\u0003\u0002\u0001\u0000\u0155\u0156\u00052\u0000"+
		"\u0000\u0156\u0157\u0006\u0011\uffff\uffff\u0000\u0157\u0162\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0005\u000b\u0000\u0000\u0159\u015a\u0005 \u0000"+
		"\u0000\u015a\u015b\u0005\u000f\u0000\u0000\u015b\u015c\u0007\u0000\u0000"+
		"\u0000\u015c\u015d\u00051\u0000\u0000\u015d\u015e\u0003\u0002\u0001\u0000"+
		"\u015e\u015f\u00052\u0000\u0000\u015f\u0160\u0006\u0011\uffff\uffff\u0000"+
		"\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u013e\u0001\u0000\u0000\u0000"+
		"\u0161\u014b\u0001\u0000\u0000\u0000\u0161\u0158\u0001\u0000\u0000\u0000"+
		"\u0162#\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0015\u0000\u0000\u0164"+
		"\u0165\u00030\u0018\u0000\u0165\u0166\u0005\t\u0000\u0000\u0166\u0167"+
		"\u00051\u0000\u0000\u0167\u0168\u0003\u0002\u0001\u0000\u0168\u0169\u0005"+
		"2\u0000\u0000\u0169\u016a\u0006\u0012\uffff\uffff\u0000\u016a%\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0005\u0012\u0000\u0000\u016c\u016d\u0006\u0013"+
		"\uffff\uffff\u0000\u016d\'\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0014"+
		"\u0000\u0000\u016f\u0170\u00030\u0018\u0000\u0170\u0171\u0006\u0014\uffff"+
		"\uffff\u0000\u0171)\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0013\u0000"+
		"\u0000\u0173\u0174\u0006\u0015\uffff\uffff\u0000\u0174+\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0005\u0010\u0000\u0000\u0176\u0177\u0005 \u0000\u0000"+
		"\u0177\u0178\u00053\u0000\u0000\u0178\u0179\u0003.\u0017\u0000\u0179\u017a"+
		"\u0005&\u0000\u0000\u017a\u017b\u00030\u0018\u0000\u017b\u017c\u0006\u0016"+
		"\uffff\uffff\u0000\u017c\u0192\u0001\u0000\u0000\u0000\u017d\u017e\u0005"+
		"\u0010\u0000\u0000\u017e\u017f\u0005 \u0000\u0000\u017f\u0180\u0005&\u0000"+
		"\u0000\u0180\u0181\u00030\u0018\u0000\u0181\u0182\u0006\u0016\uffff\uffff"+
		"\u0000\u0182\u0192\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0011\u0000"+
		"\u0000\u0184\u0185\u0005 \u0000\u0000\u0185\u0186\u0005&\u0000\u0000\u0186"+
		"\u0187\u00030\u0018\u0000\u0187\u0188\u0006\u0016\uffff\uffff\u0000\u0188"+
		"\u0192\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u0011\u0000\u0000\u018a"+
		"\u018b\u0005 \u0000\u0000\u018b\u018c\u00053\u0000\u0000\u018c\u018d\u0003"+
		".\u0017\u0000\u018d\u018e\u0005&\u0000\u0000\u018e\u018f\u00030\u0018"+
		"\u0000\u018f\u0190\u0006\u0016\uffff\uffff\u0000\u0190\u0192\u0001\u0000"+
		"\u0000\u0000\u0191\u0175\u0001\u0000\u0000\u0000\u0191\u017d\u0001\u0000"+
		"\u0000\u0000\u0191\u0183\u0001\u0000\u0000\u0000\u0191\u0189\u0001\u0000"+
		"\u0000\u0000\u0192-\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0001\u0000"+
		"\u0000\u0194\u019f\u0006\u0017\uffff\uffff\u0000\u0195\u0196\u0005\u0002"+
		"\u0000\u0000\u0196\u019f\u0006\u0017\uffff\uffff\u0000\u0197\u0198\u0005"+
		"\u0004\u0000\u0000\u0198\u019f\u0006\u0017\uffff\uffff\u0000\u0199\u019a"+
		"\u0005\u0003\u0000\u0000\u019a\u019f\u0006\u0017\uffff\uffff\u0000\u019b"+
		"\u019c\u00054\u0000\u0000\u019c\u019d\u00055\u0000\u0000\u019d\u019f\u0006"+
		"\u0017\uffff\uffff\u0000\u019e\u0193\u0001\u0000\u0000\u0000\u019e\u0195"+
		"\u0001\u0000\u0000\u0000\u019e\u0197\u0001\u0000\u0000\u0000\u019e\u0199"+
		"\u0001\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019f/\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0006\u0018\uffff\uffff\u0000\u01a1\u01a2"+
		"\u0005.\u0000\u0000\u01a2\u01a3\u00030\u0018\u0014\u01a3\u01a4\u0006\u0018"+
		"\uffff\uffff\u0000\u01a4\u01d6\u0001\u0000\u0000\u0000\u01a5\u01a6\u0003"+
		"6\u001b\u0000\u01a6\u01a7\u0006\u0018\uffff\uffff\u0000\u01a7\u01d6\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0005 \u0000\u0000\u01a9\u01aa\u00051\u0000"+
		"\u0000\u01aa\u01ab\u0003:\u001d\u0000\u01ab\u01ac\u00052\u0000\u0000\u01ac"+
		"\u01ad\u0006\u0018\uffff\uffff\u0000\u01ad\u01d6\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0005/\u0000\u0000\u01af\u01b0\u00030\u0018\u0000\u01b0\u01b1"+
		"\u00050\u0000\u0000\u01b1\u01b2\u0006\u0018\uffff\uffff\u0000\u01b2\u01d6"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b4\u00034\u001a\u0000\u01b4\u01b5\u0006"+
		"\u0018\uffff\uffff\u0000\u01b5\u01d6\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u00054\u0000\u0000\u01b7\u01b8\u00032\u0019\u0000\u01b8\u01b9\u00055"+
		"\u0000\u0000\u01b9\u01ba\u0006\u0018\uffff\uffff\u0000\u01ba\u01d6\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0005\u0001\u0000\u0000\u01bc\u01bd\u0005"+
		"/\u0000\u0000\u01bd\u01be\u00030\u0018\u0000\u01be\u01bf\u00050\u0000"+
		"\u0000\u01bf\u01c0\u0006\u0018\uffff\uffff\u0000\u01c0\u01d6\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0005\u0004\u0000\u0000\u01c2\u01c3\u0005/\u0000"+
		"\u0000\u01c3\u01c4\u00030\u0018\u0000\u01c4\u01c5\u00050\u0000\u0000\u01c5"+
		"\u01c6\u0006\u0018\uffff\uffff\u0000\u01c6\u01d6\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0005\u0002\u0000\u0000\u01c8\u01c9\u0005/\u0000\u0000\u01c9"+
		"\u01ca\u00030\u0018\u0000\u01ca\u01cb\u00050\u0000\u0000\u01cb\u01cc\u0006"+
		"\u0018\uffff\uffff\u0000\u01cc\u01d6\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0005\u001e\u0000\u0000\u01ce\u01d6\u0006\u0018\uffff\uffff\u0000\u01cf"+
		"\u01d0\u0005\u001f\u0000\u0000\u01d0\u01d6\u0006\u0018\uffff\uffff\u0000"+
		"\u01d1\u01d2\u0005\u0005\u0000\u0000\u01d2\u01d6\u0006\u0018\uffff\uffff"+
		"\u0000\u01d3\u01d4\u0005\u0006\u0000\u0000\u01d4\u01d6\u0006\u0018\uffff"+
		"\uffff\u0000\u01d5\u01a0\u0001\u0000\u0000\u0000\u01d5\u01a5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01a8\u0001\u0000\u0000\u0000\u01d5\u01ae\u0001\u0000"+
		"\u0000\u0000\u01d5\u01b3\u0001\u0000\u0000\u0000\u01d5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01d5\u01bb\u0001\u0000\u0000\u0000\u01d5\u01c1\u0001\u0000"+
		"\u0000\u0000\u01d5\u01c7\u0001\u0000\u0000\u0000\u01d5\u01cd\u0001\u0000"+
		"\u0000\u0000\u01d5\u01cf\u0001\u0000\u0000\u0000\u01d5\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01fc\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\n\u0013\u0000\u0000\u01d8\u01d9\u0007\u0001\u0000"+
		"\u0000\u01d9\u01da\u00030\u0018\u0014\u01da\u01db\u0006\u0018\uffff\uffff"+
		"\u0000\u01db\u01fb\u0001\u0000\u0000\u0000\u01dc\u01dd\n\u0012\u0000\u0000"+
		"\u01dd\u01de\u0007\u0002\u0000\u0000\u01de\u01df\u00030\u0018\u0013\u01df"+
		"\u01e0\u0006\u0018\uffff\uffff\u0000\u01e0\u01fb\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\n\u0011\u0000\u0000\u01e2\u01e3\u0007\u0003\u0000\u0000\u01e3"+
		"\u01e4\u00030\u0018\u0012\u01e4\u01e5\u0006\u0018\uffff\uffff\u0000\u01e5"+
		"\u01fb\u0001\u0000\u0000\u0000\u01e6\u01e7\n\u0010\u0000\u0000\u01e7\u01e8"+
		"\u0007\u0004\u0000\u0000\u01e8\u01e9\u00030\u0018\u0011\u01e9\u01ea\u0006"+
		"\u0018\uffff\uffff\u0000\u01ea\u01fb\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\n\u000f\u0000\u0000\u01ec\u01ed\u0007\u0005\u0000\u0000\u01ed\u01ee\u0003"+
		"0\u0018\u0010\u01ee\u01ef\u0006\u0018\uffff\uffff\u0000\u01ef\u01fb\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\n\u000e\u0000\u0000\u01f1\u01f2\u0005%"+
		"\u0000\u0000\u01f2\u01f3\u00030\u0018\u000f\u01f3\u01f4\u0006\u0018\uffff"+
		"\uffff\u0000\u01f4\u01fb\u0001\u0000\u0000\u0000\u01f5\u01f6\n\r\u0000"+
		"\u0000\u01f6\u01f7\u0005$\u0000\u0000\u01f7\u01f8\u00030\u0018\u000e\u01f8"+
		"\u01f9\u0006\u0018\uffff\uffff\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fa\u01d7\u0001\u0000\u0000\u0000\u01fa\u01dc\u0001\u0000\u0000\u0000"+
		"\u01fa\u01e1\u0001\u0000\u0000\u0000\u01fa\u01e6\u0001\u0000\u0000\u0000"+
		"\u01fa\u01eb\u0001\u0000\u0000\u0000\u01fa\u01f0\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f5\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fd1\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0006\u0019\uffff\uffff\u0000\u0200\u0201\u00030\u0018\u0000\u0201"+
		"\u0202\u0006\u0019\uffff\uffff\u0000\u0202\u020a\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\n\u0002\u0000\u0000\u0204\u0205\u00056\u0000\u0000\u0205"+
		"\u0206\u00030\u0018\u0000\u0206\u0207\u0006\u0019\uffff\uffff\u0000\u0207"+
		"\u0209\u0001\u0000\u0000\u0000\u0208\u0203\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0001\u0000\u0000\u0000\u020b3\u0001\u0000\u0000\u0000\u020c\u020a"+
		"\u0001\u0000\u0000\u0000\u020d\u020e\u0006\u001a\uffff\uffff\u0000\u020e"+
		"\u020f\u0005 \u0000\u0000\u020f\u0210\u0006\u001a\uffff\uffff\u0000\u0210"+
		"\u021d\u0001\u0000\u0000\u0000\u0211\u0212\n\u0003\u0000\u0000\u0212\u0213"+
		"\u00054\u0000\u0000\u0213\u0214\u00030\u0018\u0000\u0214\u0215\u00055"+
		"\u0000\u0000\u0215\u0216\u0006\u001a\uffff\uffff\u0000\u0216\u021c\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\n\u0002\u0000\u0000\u0218\u0219\u00058"+
		"\u0000\u0000\u0219\u021a\u0005 \u0000\u0000\u021a\u021c\u0006\u001a\uffff"+
		"\uffff\u0000\u021b\u0211\u0001\u0000\u0000\u0000\u021b\u0217\u0001\u0000"+
		"\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e5\u0001\u0000\u0000"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0221\u0005 \u0000\u0000"+
		"\u0221\u0222\u0005/\u0000\u0000\u0222\u0223\u00038\u001c\u0000\u0223\u0224"+
		"\u00050\u0000\u0000\u0224\u0225\u0006\u001b\uffff\uffff\u0000\u02257\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0006\u001c\uffff\uffff\u0000\u0227\u0228"+
		"\u00030\u0018\u0000\u0228\u0229\u0006\u001c\uffff\uffff\u0000\u0229\u022c"+
		"\u0001\u0000\u0000\u0000\u022a\u022c\u0006\u001c\uffff\uffff\u0000\u022b"+
		"\u0226\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c"+
		"\u0234\u0001\u0000\u0000\u0000\u022d\u022e\n\u0003\u0000\u0000\u022e\u022f"+
		"\u00056\u0000\u0000\u022f\u0230\u00030\u0018\u0000\u0230\u0231\u0006\u001c"+
		"\uffff\uffff\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022d\u0001"+
		"\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234\u0232\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u02359\u0001\u0000"+
		"\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u0238\u0006\u001d"+
		"\uffff\uffff\u0000\u0238\u0239\u0005 \u0000\u0000\u0239\u023a\u00053\u0000"+
		"\u0000\u023a\u023b\u00030\u0018\u0000\u023b\u023c\u0006\u001d\uffff\uffff"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023f\u0006\u001d\uffff"+
		"\uffff\u0000\u023e\u0237\u0001\u0000\u0000\u0000\u023e\u023d\u0001\u0000"+
		"\u0000\u0000\u023f\u0249\u0001\u0000\u0000\u0000\u0240\u0241\n\u0003\u0000"+
		"\u0000\u0241\u0242\u00056\u0000\u0000\u0242\u0243\u0005 \u0000\u0000\u0243"+
		"\u0244\u00053\u0000\u0000\u0244\u0245\u00030\u0018\u0000\u0245\u0246\u0006"+
		"\u001d\uffff\uffff\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0240"+
		"\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a;\u0001"+
		"\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u0018Cq\u0082\u008e"+
		"\u00a7\u00bc\u00cd\u00cf\u0103\u010f\u012e\u0161\u0191\u019e\u01d5\u01fa"+
		"\u01fc\u020a\u021b\u021d\u022b\u0234\u023e\u0249";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}