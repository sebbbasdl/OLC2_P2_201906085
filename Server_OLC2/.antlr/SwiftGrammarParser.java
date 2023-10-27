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
		RULE_listStructDec = 4, RULE_function = 5, RULE_listParamsFunc = 6, RULE_assignment = 7, 
		RULE_printstmt = 8, RULE_ifstmt = 9, RULE_elseiflist = 10, RULE_elseif = 11, 
		RULE_switchtmt = 12, RULE_caselist = 13, RULE_case = 14, RULE_whilestmt = 15, 
		RULE_forstmt = 16, RULE_declarationstmt = 17, RULE_types = 18, RULE_expr = 19, 
		RULE_listParams = 20, RULE_listArray = 21, RULE_callFunction = 22, RULE_listParamsCall = 23, 
		RULE_listStructExp = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "structCreation", "listStructDec", "function", 
			"listParamsFunc", "assignment", "printstmt", "ifstmt", "elseiflist", 
			"elseif", "switchtmt", "caselist", "case", "whilestmt", "forstmt", "declarationstmt", 
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
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((SContext)_localctx).block = block();
			setState(51);
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
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					((BlockContext)_localctx).instruction = instruction();
					((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
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
		public SwitchtmtContext switchtmt;
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
		public SwitchtmtContext switchtmt() {
			return getRuleContext(SwitchtmtContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				((InstructionContext)_localctx).assignment = assignment();
				 _localctx.inst = ((InstructionContext)_localctx).assignment.ass 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				((InstructionContext)_localctx).function = function();
				 _localctx.inst = ((InstructionContext)_localctx).function.fun 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whiles 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.fors 
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				((InstructionContext)_localctx).switchtmt = switchtmt();
				 _localctx.inst = ((InstructionContext)_localctx).switchtmt.swtch 
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
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(91);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(92);
			match(LLAVEIZQ);
			setState(93);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(94);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(98);
				match(VAR);
				setState(99);
				((ListStructDecContext)_localctx).ID = match(ID);
				setState(100);
				match(D_PTS);
				setState(101);
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
			setState(117);
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
					setState(107);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(108);
					match(COMA);
					setState(109);
					match(VAR);
					setState(110);
					((ListStructDecContext)_localctx).ID = match(ID);
					setState(111);
					match(D_PTS);
					setState(112);
					((ListStructDecContext)_localctx).types = types();

					                                                          var arr []interface{}
					                                                          newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
					                                                          arr = append(((ListStructDecContext)_localctx).list.l, newParams)
					                                                          _localctx.l = arr
					                                                      
					}
					} 
				}
				setState(119);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(121);
				((FunctionContext)_localctx).ID = match(ID);
				setState(122);
				match(PARIZQ);
				setState(123);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(124);
				match(PARDER);
				setState(125);
				match(LLAVEIZQ);
				setState(126);
				((FunctionContext)_localctx).block = block();
				setState(127);
				match(LLAVEDER);

				    _localctx.fun = instructions.NewFunction((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, environment.NULL, ((FunctionContext)_localctx).block.blk)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(131);
				((FunctionContext)_localctx).ID = match(ID);
				setState(132);
				match(PARIZQ);
				setState(133);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(134);
				match(PARDER);
				setState(135);
				match(ARROW1);
				setState(136);
				((FunctionContext)_localctx).types = types();
				setState(137);
				match(LLAVEIZQ);
				setState(138);
				((FunctionContext)_localctx).block = block();
				setState(139);
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
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public ListParamsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsFunc; }
	}

	public final ListParamsFuncContext listParamsFunc() throws RecognitionException {
		return listParamsFunc(0);
	}

	private ListParamsFuncContext listParamsFunc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsFuncContext _localctx = new ListParamsFuncContext(_ctx, _parentState);
		ListParamsFuncContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_listParamsFunc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(145);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(146);
				match(D_PTS);
				setState(147);
				((ListParamsFuncContext)_localctx).types = types();

				    _localctx.lpf = []interface{}{}
				    newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 2:
				{
				 _localctx.lpf = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsFuncContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
					setState(153);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(154);
					match(COMA);
					setState(155);
					((ListParamsFuncContext)_localctx).ID = match(ID);
					setState(156);
					match(D_PTS);
					setState(157);
					((ListParamsFuncContext)_localctx).types = types();

					              var arr []interface{}
					              newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
					              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
					              _localctx.lpf = arr
					              
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(166);
			match(IG);
			setState(167);
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
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(171);
			match(PARIZQ);
			setState(172);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(173);
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
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstmt);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(177);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(178);
				match(LLAVEIZQ);
				setState(179);
				((IfstmtContext)_localctx).block = block();
				setState(180);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(184);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(185);
				match(LLAVEIZQ);
				setState(186);
				((IfstmtContext)_localctx).b1 = block();
				setState(187);
				match(LLAVEDER);
				setState(188);
				match(ELSE);
				setState(189);
				match(LLAVEIZQ);
				setState(190);
				((IfstmtContext)_localctx).b2 = block();
				setState(191);
				match(LLAVEDER);
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).b1.blk, nil, ((IfstmtContext)_localctx).b2.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(195);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(196);
				match(LLAVEIZQ);
				setState(197);
				((IfstmtContext)_localctx).block = block();
				setState(198);
				match(LLAVEDER);
				setState(199);
				((IfstmtContext)_localctx).elseiflist = elseiflist(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, ((IfstmtContext)_localctx).elseiflist.else_if_list, nil) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(203);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(204);
				match(LLAVEIZQ);
				setState(205);
				((IfstmtContext)_localctx).b1 = block();
				setState(206);
				match(LLAVEDER);
				setState(207);
				((IfstmtContext)_localctx).elseiflist = elseiflist(0);
				setState(208);
				match(ELSE);
				setState(209);
				match(LLAVEIZQ);
				setState(210);
				((IfstmtContext)_localctx).b2 = block();
				setState(211);
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
	}

	public final ElseiflistContext elseiflist() throws RecognitionException {
		return elseiflist(0);
	}

	private ElseiflistContext elseiflist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElseiflistContext _localctx = new ElseiflistContext(_ctx, _parentState);
		ElseiflistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_elseiflist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			((ElseiflistContext)_localctx).elseif = elseif();

			                _localctx.else_if_list = []interface{}{}
			                _localctx.else_if_list = append(_localctx.else_if_list, ((ElseiflistContext)_localctx).elseif.ifinst)

			            
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseiflistContext(_parentctx, _parentState);
					_localctx.listif = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_elseiflist);
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(221);
					((ElseiflistContext)_localctx).elseif = elseif();
					   var arr2 []interface{}
					                                  arr2 = append(((ElseiflistContext)_localctx).listif.else_if_list, ((ElseiflistContext)_localctx).elseif.ifinst)
					                                  _localctx.else_if_list = arr2
					                              
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ELSE);
			setState(230);
			((ElseifContext)_localctx).IF = match(IF);
			setState(231);
			((ElseifContext)_localctx).expr = expr(0);
			setState(232);
			match(LLAVEIZQ);
			setState(233);
			((ElseifContext)_localctx).block = block();
			setState(234);
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
	}

	public final SwitchtmtContext switchtmt() throws RecognitionException {
		SwitchtmtContext _localctx = new SwitchtmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchtmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((SwitchtmtContext)_localctx).SWITCH = match(SWITCH);
			setState(238);
			((SwitchtmtContext)_localctx).expr = expr(0);
			setState(239);
			match(LLAVEIZQ);
			setState(240);
			((SwitchtmtContext)_localctx).caselist = caselist(0);
			setState(241);
			match(DEFAULT);
			setState(242);
			match(D_PTS);
			setState(243);
			((SwitchtmtContext)_localctx).block = block();
			setState(244);
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
	}

	public final CaselistContext caselist() throws RecognitionException {
		return caselist(0);
	}

	private CaselistContext caselist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaselistContext _localctx = new CaselistContext(_ctx, _parentState);
		CaselistContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_caselist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(248);
			((CaselistContext)_localctx).case_ = case_();

			                            _localctx.cases= []interface{}{}
			                            _localctx.cases = append(_localctx.cases, ((CaselistContext)_localctx).case.swtch)
			                        
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaselistContext(_parentctx, _parentState);
					_localctx.listcases = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_caselist);
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					((CaselistContext)_localctx).case_ = case_();
					 var arr3 []interface{}
					                                  arr3= append(((CaselistContext)_localctx).listcases.cases, ((CaselistContext)_localctx).case.swtch)
					                                  _localctx.cases= arr3
					                                  
					}
					} 
				}
				setState(259);
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
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((CaseContext)_localctx).CASE = match(CASE);
			setState(261);
			((CaseContext)_localctx).expr = expr(0);
			setState(262);
			match(D_PTS);
			setState(263);
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
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(267);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(268);
			match(LLAVEIZQ);
			setState(269);
			((WhilestmtContext)_localctx).block = block();
			setState(270);
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
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forstmt);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(274);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(275);
				match(IN);
				setState(276);
				((ForstmtContext)_localctx).e1 = expr(0);
				setState(277);
				match(PUNTO);
				setState(278);
				match(PUNTO);
				setState(279);
				match(PUNTO);
				setState(280);
				((ForstmtContext)_localctx).e2 = expr(0);
				setState(281);
				match(LLAVEIZQ);
				setState(282);
				((ForstmtContext)_localctx).block = block();
				setState(283);
				match(LLAVEDER);
				 _localctx.fors = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).e1.e,((ForstmtContext)_localctx).e2.e,"nil", ((ForstmtContext)_localctx).block.blk) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(287);
				((ForstmtContext)_localctx).GUIONB = match(GUIONB);
				setState(288);
				match(IN);
				setState(289);
				((ForstmtContext)_localctx).e1 = expr(0);
				setState(290);
				match(PUNTO);
				setState(291);
				match(PUNTO);
				setState(292);
				match(PUNTO);
				setState(293);
				((ForstmtContext)_localctx).e2 = expr(0);
				setState(294);
				match(LLAVEIZQ);
				setState(295);
				((ForstmtContext)_localctx).block = block();
				setState(296);
				match(LLAVEDER);
				 _localctx.fors = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).GUIONB!=null?((ForstmtContext)_localctx).GUIONB.getText():null), ((ForstmtContext)_localctx).e1.e,((ForstmtContext)_localctx).e2.e,"nil", ((ForstmtContext)_localctx).block.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(300);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(301);
				match(IN);
				setState(302);
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
				setState(303);
				match(LLAVEIZQ);
				setState(304);
				((ForstmtContext)_localctx).block = block();
				setState(305);
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
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarationstmt);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(311);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(312);
				match(D_PTS);
				setState(313);
				((DeclarationstmtContext)_localctx).types = types();
				setState(314);
				match(IG);
				setState(315);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e, false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(319);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(320);
				match(IG);
				setState(321);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.NULL, ((DeclarationstmtContext)_localctx).expr.e, false);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(325);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(326);
				match(IG);
				setState(327);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				((DeclarationstmtContext)_localctx).dec =  instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.NULL, ((DeclarationstmtContext)_localctx).expr.e, true);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(331);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(332);
				match(D_PTS);
				setState(333);
				((DeclarationstmtContext)_localctx).types = types();
				setState(334);
				match(IG);
				setState(335);
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
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_types);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(CORIZQ);
				setState(349);
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
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(354);
				((ExprContext)_localctx).op = match(SUB);
				setState(355);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
				 _localctx.e = expressions.NewOperation(((ExprContext)_localctx).op.GetLine(), ((ExprContext)_localctx).op.GetColumn(), ((ExprContext)_localctx).right.e, "neg", ((ExprContext)_localctx).right.e) 
				}
				break;
			case 2:
				{
				setState(358);
				((ExprContext)_localctx).callFunction = callFunction();
				 _localctx.e = ((ExprContext)_localctx).callFunction.cf 
				}
				break;
			case 3:
				{
				setState(361);
				((ExprContext)_localctx).ID = match(ID);
				setState(362);
				match(LLAVEIZQ);
				setState(363);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(364);
				match(LLAVEDER);
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 4:
				{
				setState(367);
				match(PARIZQ);
				setState(368);
				((ExprContext)_localctx).expr = expr(0);
				setState(369);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 5:
				{
				setState(372);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 6:
				{
				setState(375);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(376);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(377);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 7:
				{
				setState(380);
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
			case 8:
				{
				setState(382);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 9:
				{
				setState(384);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 10:
				{
				setState(386);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(390);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(391);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(392);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(395);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(396);
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
						setState(397);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(400);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(401);
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
						setState(402);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(405);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(406);
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
						setState(407);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(410);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(411);
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
						setState(412);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(415);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(416);
						((ExprContext)_localctx).op = match(AND);
						setState(417);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(420);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(421);
						((ExprContext)_localctx).op = match(OR);
						setState(422);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(434);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(435);
					match(COMA);
					setState(436);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(443);
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
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(458);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(448);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(449);
						match(CORIZQ);
						setState(450);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(451);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(454);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(455);
						match(PUNTO);
						setState(456);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((CallFunctionContext)_localctx).ID = match(ID);
			setState(464);
			match(PARIZQ);
			setState(465);
			((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
			setState(466);
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
	}

	public final ListParamsCallContext listParamsCall() throws RecognitionException {
		return listParamsCall(0);
	}

	private ListParamsCallContext listParamsCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsCallContext _localctx = new ListParamsCallContext(_ctx, _parentState);
		ListParamsCallContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listParamsCall, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(470);
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
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(476);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(477);
					match(COMA);
					setState(478);
					((ListParamsCallContext)_localctx).expr = expr(0);

					                                              var arr []interface{}
					                                              arr = append(((ListParamsCallContext)_localctx).list.l, ((ListParamsCallContext)_localctx).expr.e)
					                                              _localctx.l = arr
					                                          
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_listStructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(487);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(488);
				match(D_PTS);
				setState(489);
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
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(495);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(496);
					match(COMA);
					setState(497);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(498);
					match(D_PTS);
					setState(499);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 6:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 10:
			return elseiflist_sempred((ElseiflistContext)_localctx, predIndex);
		case 13:
			return caselist_sempred((CaselistContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 21:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 23:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 24:
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
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean elseiflist_sempred(ElseiflistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean caselist_sempred(CaselistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u01fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"8\b\u0001\u000b\u0001\f\u00019\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004j\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004t\b"+
		"\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u008f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00a1\b\u0006\n\u0006\f\u0006\u00a4\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d7\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e1\b\n\n"+
		"\n\f\n\u00e4\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0100\b\r\n\r\f\r\u0103"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0135\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0153\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0160\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0185\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01aa\b\u0013\n"+
		"\u0013\f\u0013\u01ad\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01b8\b\u0014\n\u0014\f\u0014\u01bb\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u01cb\b\u0015\n\u0015\f\u0015\u01ce\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01db\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01e2"+
		"\b\u0017\n\u0017\f\u0017\u01e5\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01ee\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u01f7\b\u0018\n\u0018\f\u0018\u01fa\t\u0018\u0001"+
		"\u0018\u0000\t\b\f\u0014\u001a&(*.0\u0019\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000"+
		"\u0006\u0001\u0000\u001f \u0001\u0000+,\u0001\u0000-.\u0002\u0000\'\'"+
		"))\u0002\u0000((**\u0001\u0000!\"\u0215\u00002\u0001\u0000\u0000\u0000"+
		"\u00027\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006Z"+
		"\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000"+
		"\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u00a5\u0001\u0000\u0000"+
		"\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00d6\u0001\u0000\u0000"+
		"\u0000\u0014\u00d8\u0001\u0000\u0000\u0000\u0016\u00e5\u0001\u0000\u0000"+
		"\u0000\u0018\u00ed\u0001\u0000\u0000\u0000\u001a\u00f7\u0001\u0000\u0000"+
		"\u0000\u001c\u0104\u0001\u0000\u0000\u0000\u001e\u010a\u0001\u0000\u0000"+
		"\u0000 \u0134\u0001\u0000\u0000\u0000\"\u0152\u0001\u0000\u0000\u0000"+
		"$\u015f\u0001\u0000\u0000\u0000&\u0184\u0001\u0000\u0000\u0000(\u01ae"+
		"\u0001\u0000\u0000\u0000*\u01bc\u0001\u0000\u0000\u0000,\u01cf\u0001\u0000"+
		"\u0000\u0000.\u01da\u0001\u0000\u0000\u00000\u01ed\u0001\u0000\u0000\u0000"+
		"23\u0003\u0002\u0001\u000034\u0005\u0000\u0000\u000145\u0006\u0000\uffff"+
		"\uffff\u00005\u0001\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u0000"+
		"76\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0006\u0001"+
		"\uffff\uffff\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0003\u0010\b\u0000"+
		">?\u0006\u0002\uffff\uffff\u0000?Y\u0001\u0000\u0000\u0000@A\u0003\u0012"+
		"\t\u0000AB\u0006\u0002\uffff\uffff\u0000BY\u0001\u0000\u0000\u0000CD\u0003"+
		"\"\u0011\u0000DE\u0006\u0002\uffff\uffff\u0000EY\u0001\u0000\u0000\u0000"+
		"FG\u0003\u000e\u0007\u0000GH\u0006\u0002\uffff\uffff\u0000HY\u0001\u0000"+
		"\u0000\u0000IJ\u0003\n\u0005\u0000JK\u0006\u0002\uffff\uffff\u0000KY\u0001"+
		"\u0000\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0006\u0002\uffff\uffff"+
		"\u0000NY\u0001\u0000\u0000\u0000OP\u0003\u001e\u000f\u0000PQ\u0006\u0002"+
		"\uffff\uffff\u0000QY\u0001\u0000\u0000\u0000RS\u0003 \u0010\u0000ST\u0006"+
		"\u0002\uffff\uffff\u0000TY\u0001\u0000\u0000\u0000UV\u0003\u0018\f\u0000"+
		"VW\u0006\u0002\uffff\uffff\u0000WY\u0001\u0000\u0000\u0000X=\u0001\u0000"+
		"\u0000\u0000X@\u0001\u0000\u0000\u0000XC\u0001\u0000\u0000\u0000XF\u0001"+
		"\u0000\u0000\u0000XI\u0001\u0000\u0000\u0000XL\u0001\u0000\u0000\u0000"+
		"XO\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000"+
		"\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0005\u001d\u0000\u0000[\\\u0005"+
		" \u0000\u0000\\]\u00051\u0000\u0000]^\u0003\b\u0004\u0000^_\u00052\u0000"+
		"\u0000_`\u0006\u0003\uffff\uffff\u0000`\u0007\u0001\u0000\u0000\u0000"+
		"ab\u0006\u0004\uffff\uffff\u0000bc\u0005\u0010\u0000\u0000cd\u0005 \u0000"+
		"\u0000de\u00053\u0000\u0000ef\u0003$\u0012\u0000fg\u0006\u0004\uffff\uffff"+
		"\u0000gj\u0001\u0000\u0000\u0000hj\u0006\u0004\uffff\uffff\u0000ia\u0001"+
		"\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000ju\u0001\u0000\u0000\u0000"+
		"kl\n\u0003\u0000\u0000lm\u00056\u0000\u0000mn\u0005\u0010\u0000\u0000"+
		"no\u0005 \u0000\u0000op\u00053\u0000\u0000pq\u0003$\u0012\u0000qr\u0006"+
		"\u0004\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sk\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\t\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005"+
		"\u001c\u0000\u0000yz\u0005 \u0000\u0000z{\u0005/\u0000\u0000{|\u0003\f"+
		"\u0006\u0000|}\u00050\u0000\u0000}~\u00051\u0000\u0000~\u007f\u0003\u0002"+
		"\u0001\u0000\u007f\u0080\u00052\u0000\u0000\u0080\u0081\u0006\u0005\uffff"+
		"\uffff\u0000\u0081\u008f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u001c"+
		"\u0000\u0000\u0083\u0084\u0005 \u0000\u0000\u0084\u0085\u0005/\u0000\u0000"+
		"\u0085\u0086\u0003\f\u0006\u0000\u0086\u0087\u00050\u0000\u0000\u0087"+
		"\u0088\u00057\u0000\u0000\u0088\u0089\u0003$\u0012\u0000\u0089\u008a\u0005"+
		"1\u0000\u0000\u008a\u008b\u0003\u0002\u0001\u0000\u008b\u008c\u00052\u0000"+
		"\u0000\u008c\u008d\u0006\u0005\uffff\uffff\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008ex\u0001\u0000\u0000\u0000\u008e\u0082\u0001\u0000\u0000"+
		"\u0000\u008f\u000b\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0006\uffff"+
		"\uffff\u0000\u0091\u0092\u0005 \u0000\u0000\u0092\u0093\u00053\u0000\u0000"+
		"\u0093\u0094\u0003$\u0012\u0000\u0094\u0095\u0006\u0006\uffff\uffff\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u0006\u0006\uffff\uffff"+
		"\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u00a2\u0001\u0000\u0000\u0000\u0099\u009a\n\u0003\u0000\u0000"+
		"\u009a\u009b\u00056\u0000\u0000\u009b\u009c\u0005 \u0000\u0000\u009c\u009d"+
		"\u00053\u0000\u0000\u009d\u009e\u0003$\u0012\u0000\u009e\u009f\u0006\u0006"+
		"\uffff\uffff\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0099\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005 \u0000"+
		"\u0000\u00a6\u00a7\u0005&\u0000\u0000\u00a7\u00a8\u0003&\u0013\u0000\u00a8"+
		"\u00a9\u0006\u0007\uffff\uffff\u0000\u00a9\u000f\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac\u0005/\u0000\u0000\u00ac"+
		"\u00ad\u0003&\u0013\u0000\u00ad\u00ae\u00050\u0000\u0000\u00ae\u00af\u0006"+
		"\b\uffff\uffff\u0000\u00af\u0011\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\b\u0000\u0000\u00b1\u00b2\u0003&\u0013\u0000\u00b2\u00b3\u00051\u0000"+
		"\u0000\u00b3\u00b4\u0003\u0002\u0001\u0000\u00b4\u00b5\u00052\u0000\u0000"+
		"\u00b5\u00b6\u0006\t\uffff\uffff\u0000\u00b6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\b\u0000\u0000\u00b8\u00b9\u0003&\u0013\u0000\u00b9"+
		"\u00ba\u00051\u0000\u0000\u00ba\u00bb\u0003\u0002\u0001\u0000\u00bb\u00bc"+
		"\u00052\u0000\u0000\u00bc\u00bd\u0005\t\u0000\u0000\u00bd\u00be\u0005"+
		"1\u0000\u0000\u00be\u00bf\u0003\u0002\u0001\u0000\u00bf\u00c0\u00052\u0000"+
		"\u0000\u00c0\u00c1\u0006\t\uffff\uffff\u0000\u00c1\u00d7\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u0003&\u0013\u0000"+
		"\u00c4\u00c5\u00051\u0000\u0000\u00c5\u00c6\u0003\u0002\u0001\u0000\u00c6"+
		"\u00c7\u00052\u0000\u0000\u00c7\u00c8\u0003\u0014\n\u0000\u00c8\u00c9"+
		"\u0006\t\uffff\uffff\u0000\u00c9\u00d7\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\b\u0000\u0000\u00cb\u00cc\u0003&\u0013\u0000\u00cc\u00cd\u0005"+
		"1\u0000\u0000\u00cd\u00ce\u0003\u0002\u0001\u0000\u00ce\u00cf\u00052\u0000"+
		"\u0000\u00cf\u00d0\u0003\u0014\n\u0000\u00d0\u00d1\u0005\t\u0000\u0000"+
		"\u00d1\u00d2\u00051\u0000\u0000\u00d2\u00d3\u0003\u0002\u0001\u0000\u00d3"+
		"\u00d4\u00052\u0000\u0000\u00d4\u00d5\u0006\t\uffff\uffff\u0000\u00d5"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d6\u00b0\u0001\u0000\u0000\u0000\u00d6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00d6\u00c2\u0001\u0000\u0000\u0000\u00d6"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d7\u0013\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0006\n\uffff\uffff\u0000\u00d9\u00da\u0003\u0016\u000b\u0000\u00da"+
		"\u00db\u0006\n\uffff\uffff\u0000\u00db\u00e2\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\n\u0002\u0000\u0000\u00dd\u00de\u0003\u0016\u000b\u0000\u00de\u00df"+
		"\u0006\n\uffff\uffff\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u0015"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\t\u0000\u0000\u00e6\u00e7\u0005\b\u0000\u0000\u00e7\u00e8\u0003"+
		"&\u0013\u0000\u00e8\u00e9\u00051\u0000\u0000\u00e9\u00ea\u0003\u0002\u0001"+
		"\u0000\u00ea\u00eb\u00052\u0000\u0000\u00eb\u00ec\u0006\u000b\uffff\uffff"+
		"\u0000\u00ec\u0017\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\f\u0000\u0000"+
		"\u00ee\u00ef\u0003&\u0013\u0000\u00ef\u00f0\u00051\u0000\u0000\u00f0\u00f1"+
		"\u0003\u001a\r\u0000\u00f1\u00f2\u0005\u000e\u0000\u0000\u00f2\u00f3\u0005"+
		"3\u0000\u0000\u00f3\u00f4\u0003\u0002\u0001\u0000\u00f4\u00f5\u00052\u0000"+
		"\u0000\u00f5\u00f6\u0006\f\uffff\uffff\u0000\u00f6\u0019\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0006\r\uffff\uffff\u0000\u00f8\u00f9\u0003\u001c\u000e"+
		"\u0000\u00f9\u00fa\u0006\r\uffff\uffff\u0000\u00fa\u0101\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\n\u0002\u0000\u0000\u00fc\u00fd\u0003\u001c\u000e\u0000"+
		"\u00fd\u00fe\u0006\r\uffff\uffff\u0000\u00fe\u0100\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fb\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u001b\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\r\u0000\u0000\u0105\u0106\u0003&\u0013\u0000\u0106"+
		"\u0107\u00053\u0000\u0000\u0107\u0108\u0003\u0002\u0001\u0000\u0108\u0109"+
		"\u0006\u000e\uffff\uffff\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\n\u0000\u0000\u010b\u010c\u0003&\u0013\u0000\u010c\u010d"+
		"\u00051\u0000\u0000\u010d\u010e\u0003\u0002\u0001\u0000\u010e\u010f\u0005"+
		"2\u0000\u0000\u010f\u0110\u0006\u000f\uffff\uffff\u0000\u0110\u001f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\u000b\u0000\u0000\u0112\u0113\u0005"+
		" \u0000\u0000\u0113\u0114\u0005\u000f\u0000\u0000\u0114\u0115\u0003&\u0013"+
		"\u0000\u0115\u0116\u00058\u0000\u0000\u0116\u0117\u00058\u0000\u0000\u0117"+
		"\u0118\u00058\u0000\u0000\u0118\u0119\u0003&\u0013\u0000\u0119\u011a\u0005"+
		"1\u0000\u0000\u011a\u011b\u0003\u0002\u0001\u0000\u011b\u011c\u00052\u0000"+
		"\u0000\u011c\u011d\u0006\u0010\uffff\uffff\u0000\u011d\u0135\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\u000b\u0000\u0000\u011f\u0120\u0005:\u0000"+
		"\u0000\u0120\u0121\u0005\u000f\u0000\u0000\u0121\u0122\u0003&\u0013\u0000"+
		"\u0122\u0123\u00058\u0000\u0000\u0123\u0124\u00058\u0000\u0000\u0124\u0125"+
		"\u00058\u0000\u0000\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u00051"+
		"\u0000\u0000\u0127\u0128\u0003\u0002\u0001\u0000\u0128\u0129\u00052\u0000"+
		"\u0000\u0129\u012a\u0006\u0010\uffff\uffff\u0000\u012a\u0135\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005\u000b\u0000\u0000\u012c\u012d\u0005 \u0000"+
		"\u0000\u012d\u012e\u0005\u000f\u0000\u0000\u012e\u012f\u0007\u0000\u0000"+
		"\u0000\u012f\u0130\u00051\u0000\u0000\u0130\u0131\u0003\u0002\u0001\u0000"+
		"\u0131\u0132\u00052\u0000\u0000\u0132\u0133\u0006\u0010\uffff\uffff\u0000"+
		"\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0111\u0001\u0000\u0000\u0000"+
		"\u0134\u011e\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000"+
		"\u0135!\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0010\u0000\u0000\u0137"+
		"\u0138\u0005 \u0000\u0000\u0138\u0139\u00053\u0000\u0000\u0139\u013a\u0003"+
		"$\u0012\u0000\u013a\u013b\u0005&\u0000\u0000\u013b\u013c\u0003&\u0013"+
		"\u0000\u013c\u013d\u0006\u0011\uffff\uffff\u0000\u013d\u0153\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005\u0010\u0000\u0000\u013f\u0140\u0005 \u0000"+
		"\u0000\u0140\u0141\u0005&\u0000\u0000\u0141\u0142\u0003&\u0013\u0000\u0142"+
		"\u0143\u0006\u0011\uffff\uffff\u0000\u0143\u0153\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005\u0011\u0000\u0000\u0145\u0146\u0005 \u0000\u0000\u0146"+
		"\u0147\u0005&\u0000\u0000\u0147\u0148\u0003&\u0013\u0000\u0148\u0149\u0006"+
		"\u0011\uffff\uffff\u0000\u0149\u0153\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005\u0011\u0000\u0000\u014b\u014c\u0005 \u0000\u0000\u014c\u014d\u0005"+
		"3\u0000\u0000\u014d\u014e\u0003$\u0012\u0000\u014e\u014f\u0005&\u0000"+
		"\u0000\u014f\u0150\u0003&\u0013\u0000\u0150\u0151\u0006\u0011\uffff\uffff"+
		"\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0136\u0001\u0000\u0000"+
		"\u0000\u0152\u013e\u0001\u0000\u0000\u0000\u0152\u0144\u0001\u0000\u0000"+
		"\u0000\u0152\u014a\u0001\u0000\u0000\u0000\u0153#\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0005\u0001\u0000\u0000\u0155\u0160\u0006\u0012\uffff\uffff"+
		"\u0000\u0156\u0157\u0005\u0002\u0000\u0000\u0157\u0160\u0006\u0012\uffff"+
		"\uffff\u0000\u0158\u0159\u0005\u0004\u0000\u0000\u0159\u0160\u0006\u0012"+
		"\uffff\uffff\u0000\u015a\u015b\u0005\u0003\u0000\u0000\u015b\u0160\u0006"+
		"\u0012\uffff\uffff\u0000\u015c\u015d\u00054\u0000\u0000\u015d\u015e\u0005"+
		"5\u0000\u0000\u015e\u0160\u0006\u0012\uffff\uffff\u0000\u015f\u0154\u0001"+
		"\u0000\u0000\u0000\u015f\u0156\u0001\u0000\u0000\u0000\u015f\u0158\u0001"+
		"\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u015f\u015c\u0001"+
		"\u0000\u0000\u0000\u0160%\u0001\u0000\u0000\u0000\u0161\u0162\u0006\u0013"+
		"\uffff\uffff\u0000\u0162\u0163\u0005.\u0000\u0000\u0163\u0164\u0003&\u0013"+
		"\u0011\u0164\u0165\u0006\u0013\uffff\uffff\u0000\u0165\u0185\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0003,\u0016\u0000\u0167\u0168\u0006\u0013\uffff"+
		"\uffff\u0000\u0168\u0185\u0001\u0000\u0000\u0000\u0169\u016a\u0005 \u0000"+
		"\u0000\u016a\u016b\u00051\u0000\u0000\u016b\u016c\u00030\u0018\u0000\u016c"+
		"\u016d\u00052\u0000\u0000\u016d\u016e\u0006\u0013\uffff\uffff\u0000\u016e"+
		"\u0185\u0001\u0000\u0000\u0000\u016f\u0170\u0005/\u0000\u0000\u0170\u0171"+
		"\u0003&\u0013\u0000\u0171\u0172\u00050\u0000\u0000\u0172\u0173\u0006\u0013"+
		"\uffff\uffff\u0000\u0173\u0185\u0001\u0000\u0000\u0000\u0174\u0175\u0003"+
		"*\u0015\u0000\u0175\u0176\u0006\u0013\uffff\uffff\u0000\u0176\u0185\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u00054\u0000\u0000\u0178\u0179\u0003(\u0014"+
		"\u0000\u0179\u017a\u00055\u0000\u0000\u017a\u017b\u0006\u0013\uffff\uffff"+
		"\u0000\u017b\u0185\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u001e\u0000"+
		"\u0000\u017d\u0185\u0006\u0013\uffff\uffff\u0000\u017e\u017f\u0005\u001f"+
		"\u0000\u0000\u017f\u0185\u0006\u0013\uffff\uffff\u0000\u0180\u0181\u0005"+
		"\u0005\u0000\u0000\u0181\u0185\u0006\u0013\uffff\uffff\u0000\u0182\u0183"+
		"\u0005\u0006\u0000\u0000\u0183\u0185\u0006\u0013\uffff\uffff\u0000\u0184"+
		"\u0161\u0001\u0000\u0000\u0000\u0184\u0166\u0001\u0000\u0000\u0000\u0184"+
		"\u0169\u0001\u0000\u0000\u0000\u0184\u016f\u0001\u0000\u0000\u0000\u0184"+
		"\u0174\u0001\u0000\u0000\u0000\u0184\u0177\u0001\u0000\u0000\u0000\u0184"+
		"\u017c\u0001\u0000\u0000\u0000\u0184\u017e\u0001\u0000\u0000\u0000\u0184"+
		"\u0180\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185"+
		"\u01ab\u0001\u0000\u0000\u0000\u0186\u0187\n\u0010\u0000\u0000\u0187\u0188"+
		"\u0007\u0001\u0000\u0000\u0188\u0189\u0003&\u0013\u0011\u0189\u018a\u0006"+
		"\u0013\uffff\uffff\u0000\u018a\u01aa\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\n\u000f\u0000\u0000\u018c\u018d\u0007\u0002\u0000\u0000\u018d\u018e\u0003"+
		"&\u0013\u0010\u018e\u018f\u0006\u0013\uffff\uffff\u0000\u018f\u01aa\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\n\u000e\u0000\u0000\u0191\u0192\u0007\u0003"+
		"\u0000\u0000\u0192\u0193\u0003&\u0013\u000f\u0193\u0194\u0006\u0013\uffff"+
		"\uffff\u0000\u0194\u01aa\u0001\u0000\u0000\u0000\u0195\u0196\n\r\u0000"+
		"\u0000\u0196\u0197\u0007\u0004\u0000\u0000\u0197\u0198\u0003&\u0013\u000e"+
		"\u0198\u0199\u0006\u0013\uffff\uffff\u0000\u0199\u01aa\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\n\f\u0000\u0000\u019b\u019c\u0007\u0005\u0000\u0000"+
		"\u019c\u019d\u0003&\u0013\r\u019d\u019e\u0006\u0013\uffff\uffff\u0000"+
		"\u019e\u01aa\u0001\u0000\u0000\u0000\u019f\u01a0\n\u000b\u0000\u0000\u01a0"+
		"\u01a1\u0005%\u0000\u0000\u01a1\u01a2\u0003&\u0013\f\u01a2\u01a3\u0006"+
		"\u0013\uffff\uffff\u0000\u01a3\u01aa\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\n\n\u0000\u0000\u01a5\u01a6\u0005$\u0000\u0000\u01a6\u01a7\u0003&\u0013"+
		"\u000b\u01a7\u01a8\u0006\u0013\uffff\uffff\u0000\u01a8\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a9\u0186\u0001\u0000\u0000\u0000\u01a9\u018b\u0001\u0000"+
		"\u0000\u0000\u01a9\u0190\u0001\u0000\u0000\u0000\u01a9\u0195\u0001\u0000"+
		"\u0000\u0000\u01a9\u019a\u0001\u0000\u0000\u0000\u01a9\u019f\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a4\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\'\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ae\u01af\u0006\u0014\uffff\uffff\u0000\u01af\u01b0\u0003&\u0013"+
		"\u0000\u01b0\u01b1\u0006\u0014\uffff\uffff\u0000\u01b1\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\n\u0002\u0000\u0000\u01b3\u01b4\u00056\u0000"+
		"\u0000\u01b4\u01b5\u0003&\u0013\u0000\u01b5\u01b6\u0006\u0014\uffff\uffff"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba)\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0006\u0015\uffff\uffff"+
		"\u0000\u01bd\u01be\u0005 \u0000\u0000\u01be\u01bf\u0006\u0015\uffff\uffff"+
		"\u0000\u01bf\u01cc\u0001\u0000\u0000\u0000\u01c0\u01c1\n\u0003\u0000\u0000"+
		"\u01c1\u01c2\u00054\u0000\u0000\u01c2\u01c3\u0003&\u0013\u0000\u01c3\u01c4"+
		"\u00055\u0000\u0000\u01c4\u01c5\u0006\u0015\uffff\uffff\u0000\u01c5\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\n\u0002\u0000\u0000\u01c7\u01c8\u0005"+
		"8\u0000\u0000\u01c8\u01c9\u0005 \u0000\u0000\u01c9\u01cb\u0006\u0015\uffff"+
		"\uffff\u0000\u01ca\u01c0\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd+\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005 \u0000\u0000"+
		"\u01d0\u01d1\u0005/\u0000\u0000\u01d1\u01d2\u0003.\u0017\u0000\u01d2\u01d3"+
		"\u00050\u0000\u0000\u01d3\u01d4\u0006\u0016\uffff\uffff\u0000\u01d4-\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0006\u0017\uffff\uffff\u0000\u01d6\u01d7"+
		"\u0003&\u0013\u0000\u01d7\u01d8\u0006\u0017\uffff\uffff\u0000\u01d8\u01db"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0006\u0017\uffff\uffff\u0000\u01da"+
		"\u01d5\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db"+
		"\u01e3\u0001\u0000\u0000\u0000\u01dc\u01dd\n\u0003\u0000\u0000\u01dd\u01de"+
		"\u00056\u0000\u0000\u01de\u01df\u0003&\u0013\u0000\u01df\u01e0\u0006\u0017"+
		"\uffff\uffff\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01dc\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4/\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e7\u0006\u0018"+
		"\uffff\uffff\u0000\u01e7\u01e8\u0005 \u0000\u0000\u01e8\u01e9\u00053\u0000"+
		"\u0000\u01e9\u01ea\u0003&\u0013\u0000\u01ea\u01eb\u0006\u0018\uffff\uffff"+
		"\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ee\u0006\u0018\uffff"+
		"\uffff\u0000\u01ed\u01e6\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f8\u0001\u0000\u0000\u0000\u01ef\u01f0\n\u0003\u0000"+
		"\u0000\u01f0\u01f1\u00056\u0000\u0000\u01f1\u01f2\u0005 \u0000\u0000\u01f2"+
		"\u01f3\u00053\u0000\u0000\u01f3\u01f4\u0003&\u0013\u0000\u01f4\u01f5\u0006"+
		"\u0018\uffff\uffff\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f91\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u00179Xiu\u008e"+
		"\u0097\u00a2\u00d6\u00e2\u0101\u0134\u0152\u015f\u0184\u01a9\u01ab\u01b9"+
		"\u01ca\u01cc\u01da\u01e3\u01ed\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}