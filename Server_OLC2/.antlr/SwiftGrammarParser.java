// Generated from c://Users//Usuario//Documents//OLC2 EJEMPLOS 2DO PROYECTO//OLC2_SegundoSemestre_2023-main (3)//OLC2_SegundoSemestre_2023-main//Proyecto2//Server2//SwiftGrammar.g4 by ANTLR 4.13.1

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
		VAR=11, FUNC=12, STRUCT=13, NUMBER=14, STRING=15, ID=16, DIF=17, IG_IG=18, 
		NOT=19, OR=20, AND=21, IG=22, MAY_IG=23, MEN_IG=24, MAYOR=25, MENOR=26, 
		MUL=27, DIV=28, ADD=29, SUB=30, PARIZQ=31, PARDER=32, LLAVEIZQ=33, LLAVEDER=34, 
		D_PTS=35, CORIZQ=36, CORDER=37, COMA=38, ARROW1=39, PUNTO=40, WHITESPACE=41, 
		COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_structCreation = 3, 
		RULE_listStructDec = 4, RULE_function = 5, RULE_listParamsFunc = 6, RULE_assignment = 7, 
		RULE_printstmt = 8, RULE_ifstmt = 9, RULE_elseiflist = 10, RULE_elseif = 11, 
		RULE_declarationstmt = 12, RULE_types = 13, RULE_expr = 14, RULE_listParams = 15, 
		RULE_listArray = 16, RULE_callFunction = 17, RULE_listParamsCall = 18, 
		RULE_listStructExp = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "structCreation", "listStructDec", "function", 
			"listParamsFunc", "assignment", "printstmt", "ifstmt", "elseiflist", 
			"elseif", "declarationstmt", "types", "expr", "listParams", "listArray", 
			"callFunction", "listParamsCall", "listStructExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'var'", "'func'", "'struct'", 
			null, null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", 
			"'}'", "':'", "'['", "']'", "','", "'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "VAR", "FUNC", "STRUCT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", 
			"NOT", "OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", 
			"CORIZQ", "CORDER", "COMA", "ARROW1", "PUNTO", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
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
			setState(40);
			((SContext)_localctx).block = block();
			setState(41);
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
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 80256L) != 0) );

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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				((InstructionContext)_localctx).assignment = assignment();
				 _localctx.inst = ((InstructionContext)_localctx).assignment.ass 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				((InstructionContext)_localctx).function = function();
				 _localctx.inst = ((InstructionContext)_localctx).function.fun 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
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
			setState(71);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(72);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(73);
			match(LLAVEIZQ);
			setState(74);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(75);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(79);
				match(VAR);
				setState(80);
				((ListStructDecContext)_localctx).ID = match(ID);
				setState(81);
				match(D_PTS);
				setState(82);
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
			setState(98);
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
					setState(88);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(89);
					match(COMA);
					setState(90);
					match(VAR);
					setState(91);
					((ListStructDecContext)_localctx).ID = match(ID);
					setState(92);
					match(D_PTS);
					setState(93);
					((ListStructDecContext)_localctx).types = types();

					                                                          var arr []interface{}
					                                                          newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
					                                                          arr = append(((ListStructDecContext)_localctx).list.l, newParams)
					                                                          _localctx.l = arr
					                                                      
					}
					} 
				}
				setState(100);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(102);
				((FunctionContext)_localctx).ID = match(ID);
				setState(103);
				match(PARIZQ);
				setState(104);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(105);
				match(PARDER);
				setState(106);
				match(LLAVEIZQ);
				setState(107);
				((FunctionContext)_localctx).block = block();
				setState(108);
				match(LLAVEDER);

				    _localctx.fun = instructions.NewFunction((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, environment.NULL, ((FunctionContext)_localctx).block.blk)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(112);
				((FunctionContext)_localctx).ID = match(ID);
				setState(113);
				match(PARIZQ);
				setState(114);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(115);
				match(PARDER);
				setState(116);
				match(ARROW1);
				setState(117);
				((FunctionContext)_localctx).types = types();
				setState(118);
				match(LLAVEIZQ);
				setState(119);
				((FunctionContext)_localctx).block = block();
				setState(120);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(126);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(127);
				match(D_PTS);
				setState(128);
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
			setState(143);
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
					setState(134);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(135);
					match(COMA);
					setState(136);
					((ListParamsFuncContext)_localctx).ID = match(ID);
					setState(137);
					match(D_PTS);
					setState(138);
					((ListParamsFuncContext)_localctx).types = types();

					              var arr []interface{}
					              newParam := instructions.NewParamsDeclaration((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
					              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
					              _localctx.lpf = arr
					              
					}
					} 
				}
				setState(145);
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
			setState(146);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(147);
			match(IG);
			setState(148);
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
			setState(151);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(152);
			match(PARIZQ);
			setState(153);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(154);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(158);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(159);
				match(LLAVEIZQ);
				setState(160);
				((IfstmtContext)_localctx).block = block();
				setState(161);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(165);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(166);
				match(LLAVEIZQ);
				setState(167);
				((IfstmtContext)_localctx).b1 = block();
				setState(168);
				match(LLAVEDER);
				setState(169);
				match(ELSE);
				setState(170);
				match(LLAVEIZQ);
				setState(171);
				((IfstmtContext)_localctx).b2 = block();
				setState(172);
				match(LLAVEDER);
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).b1.blk, nil, ((IfstmtContext)_localctx).b2.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(176);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(177);
				match(LLAVEIZQ);
				setState(178);
				((IfstmtContext)_localctx).block = block();
				setState(179);
				match(LLAVEDER);
				setState(180);
				((IfstmtContext)_localctx).elseiflist = elseiflist(0);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, ((IfstmtContext)_localctx).elseiflist.else_if_list, nil) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				((IfstmtContext)_localctx).elseiflist = elseiflist(0);
				setState(189);
				match(ELSE);
				setState(190);
				match(LLAVEIZQ);
				setState(191);
				((IfstmtContext)_localctx).b2 = block();
				setState(192);
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
			setState(198);
			((ElseiflistContext)_localctx).elseif = elseif();

			                _localctx.else_if_list = []interface{}{}
			                _localctx.else_if_list = append(_localctx.else_if_list, ((ElseiflistContext)_localctx).elseif.ifinst)

			            
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
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
					setState(201);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(202);
					((ElseiflistContext)_localctx).elseif = elseif();
					   var arr2 []interface{}
					                                  arr2 = append(((ElseiflistContext)_localctx).listif.else_if_list, ((ElseiflistContext)_localctx).elseif.ifinst)
					                                  _localctx.else_if_list = arr2
					                              
					}
					} 
				}
				setState(209);
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
			setState(210);
			match(ELSE);
			setState(211);
			((ElseifContext)_localctx).IF = match(IF);
			setState(212);
			((ElseifContext)_localctx).expr = expr(0);
			setState(213);
			match(LLAVEIZQ);
			setState(214);
			((ElseifContext)_localctx).block = block();
			setState(215);
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
	public static class DeclarationstmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypesContext types;
		public ExprContext expr;
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
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationstmt);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(219);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(220);
				match(D_PTS);
				setState(221);
				((DeclarationstmtContext)_localctx).types = types();
				setState(222);
				match(IG);
				setState(223);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(227);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(228);
				match(IG);
				setState(229);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.STRUCT , ((DeclarationstmtContext)_localctx).expr.e) 
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
		enterRule(_localctx, 26, RULE_types);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(CORIZQ);
				setState(243);
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
		public CallFunctionContext callFunction;
		public Token ID;
		public ListStructExpContext listStructExp;
		public ExprContext expr;
		public ListArrayContext list;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public Token NUMBER;
		public Token STRING;
		public Token TRU;
		public Token FAL;
		public Token op;
		public ExprContext right;
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(248);
				((ExprContext)_localctx).callFunction = callFunction();
				 _localctx.e = ((ExprContext)_localctx).callFunction.cf 
				}
				break;
			case 2:
				{
				setState(251);
				((ExprContext)_localctx).ID = match(ID);
				setState(252);
				match(LLAVEIZQ);
				setState(253);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(254);
				match(LLAVEDER);
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 3:
				{
				setState(257);
				match(PARIZQ);
				setState(258);
				((ExprContext)_localctx).expr = expr(0);
				setState(259);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 4:
				{
				setState(262);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 5:
				{
				setState(265);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(266);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(267);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 6:
				{
				setState(270);
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
			case 7:
				{
				setState(272);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 8:
				{
				setState(274);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 9:
				{
				setState(276);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(281);
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
						setState(282);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(286);
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
						setState(287);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(291);
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
						setState(292);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(296);
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
						setState(297);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(301);
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
						setState(302);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(306);
						((ExprContext)_localctx).op = match(AND);
						setState(307);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(311);
						((ExprContext)_localctx).op = match(OR);
						setState(312);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(321);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(324);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(325);
					match(COMA);
					setState(326);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(335);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(338);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(339);
						match(CORIZQ);
						setState(340);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(341);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(344);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(345);
						match(PUNTO);
						setState(346);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(352);
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
		enterRule(_localctx, 34, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((CallFunctionContext)_localctx).ID = match(ID);
			setState(354);
			match(PARIZQ);
			setState(355);
			((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
			setState(356);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_listParamsCall, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(360);
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
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(366);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(367);
					match(COMA);
					setState(368);
					((ListParamsCallContext)_localctx).expr = expr(0);

					                                              var arr []interface{}
					                                              arr = append(((ListParamsCallContext)_localctx).list.l, ((ListParamsCallContext)_localctx).expr.e)
					                                              _localctx.l = arr
					                                          
					}
					} 
				}
				setState(375);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_listStructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(377);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(378);
				match(D_PTS);
				setState(379);
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
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(385);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(386);
					match(COMA);
					setState(387);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(388);
					match(D_PTS);
					setState(389);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(396);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return listStructDec_sempred((ListStructDecContext)_localctx, predIndex);
		case 6:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 10:
			return elseiflist_sempred((ElseiflistContext)_localctx, predIndex);
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 16:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 18:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 19:
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
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u018e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004W\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004"+
		"\f\u0004d\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005|\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0085\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u008e\b\u0006\n\u0006\f\u0006\u0091\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c4\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n\n\f\n\u00d1\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f6\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0117"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u013c\b\u000e\n\u000e\f\u000e\u013f\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u014a\b\u000f\n\u000f\f\u000f\u014d\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u015d\b\u0010\n\u0010\f\u0010\u0160\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u016d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0174\b\u0012\n\u0012\f\u0012\u0177\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0180\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0189\b\u0013\n\u0013\f\u0013"+
		"\u018c\t\u0013\u0001\u0013\u0000\b\b\f\u0014\u001c\u001e $&\u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0005\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001e"+
		"\u0002\u0000\u0017\u0017\u0019\u0019\u0002\u0000\u0018\u0018\u001a\u001a"+
		"\u0001\u0000\u0011\u0012\u01a3\u0000(\u0001\u0000\u0000\u0000\u0002-\u0001"+
		"\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000"+
		"\u0000\bV\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000\u0000\f\u0084\u0001"+
		"\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0097\u0001"+
		"\u0000\u0000\u0000\u0012\u00c3\u0001\u0000\u0000\u0000\u0014\u00c5\u0001"+
		"\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000\u0018\u00e8\u0001"+
		"\u0000\u0000\u0000\u001a\u00f5\u0001\u0000\u0000\u0000\u001c\u0116\u0001"+
		"\u0000\u0000\u0000\u001e\u0140\u0001\u0000\u0000\u0000 \u014e\u0001\u0000"+
		"\u0000\u0000\"\u0161\u0001\u0000\u0000\u0000$\u016c\u0001\u0000\u0000"+
		"\u0000&\u017f\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005"+
		"\u0000\u0000\u0001*+\u0006\u0000\uffff\uffff\u0000+\u0001\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0006\u0001\uffff\uffff\u00002\u0003\u0001"+
		"\u0000\u0000\u000034\u0003\u0010\b\u000045\u0006\u0002\uffff\uffff\u0000"+
		"5F\u0001\u0000\u0000\u000067\u0003\u0012\t\u000078\u0006\u0002\uffff\uffff"+
		"\u00008F\u0001\u0000\u0000\u00009:\u0003\u0018\f\u0000:;\u0006\u0002\uffff"+
		"\uffff\u0000;F\u0001\u0000\u0000\u0000<=\u0003\u000e\u0007\u0000=>\u0006"+
		"\u0002\uffff\uffff\u0000>F\u0001\u0000\u0000\u0000?@\u0003\n\u0005\u0000"+
		"@A\u0006\u0002\uffff\uffff\u0000AF\u0001\u0000\u0000\u0000BC\u0003\u0006"+
		"\u0003\u0000CD\u0006\u0002\uffff\uffff\u0000DF\u0001\u0000\u0000\u0000"+
		"E3\u0001\u0000\u0000\u0000E6\u0001\u0000\u0000\u0000E9\u0001\u0000\u0000"+
		"\u0000E<\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000EB\u0001\u0000"+
		"\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005\r\u0000\u0000HI\u0005"+
		"\u0010\u0000\u0000IJ\u0005!\u0000\u0000JK\u0003\b\u0004\u0000KL\u0005"+
		"\"\u0000\u0000LM\u0006\u0003\uffff\uffff\u0000M\u0007\u0001\u0000\u0000"+
		"\u0000NO\u0006\u0004\uffff\uffff\u0000OP\u0005\u000b\u0000\u0000PQ\u0005"+
		"\u0010\u0000\u0000QR\u0005#\u0000\u0000RS\u0003\u001a\r\u0000ST\u0006"+
		"\u0004\uffff\uffff\u0000TW\u0001\u0000\u0000\u0000UW\u0006\u0004\uffff"+
		"\uffff\u0000VN\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000Wb\u0001"+
		"\u0000\u0000\u0000XY\n\u0003\u0000\u0000YZ\u0005&\u0000\u0000Z[\u0005"+
		"\u000b\u0000\u0000[\\\u0005\u0010\u0000\u0000\\]\u0005#\u0000\u0000]^"+
		"\u0003\u001a\r\u0000^_\u0006\u0004\uffff\uffff\u0000_a\u0001\u0000\u0000"+
		"\u0000`X\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005\f\u0000\u0000fg\u0005\u0010\u0000\u0000gh\u0005"+
		"\u001f\u0000\u0000hi\u0003\f\u0006\u0000ij\u0005 \u0000\u0000jk\u0005"+
		"!\u0000\u0000kl\u0003\u0002\u0001\u0000lm\u0005\"\u0000\u0000mn\u0006"+
		"\u0005\uffff\uffff\u0000n|\u0001\u0000\u0000\u0000op\u0005\f\u0000\u0000"+
		"pq\u0005\u0010\u0000\u0000qr\u0005\u001f\u0000\u0000rs\u0003\f\u0006\u0000"+
		"st\u0005 \u0000\u0000tu\u0005\'\u0000\u0000uv\u0003\u001a\r\u0000vw\u0005"+
		"!\u0000\u0000wx\u0003\u0002\u0001\u0000xy\u0005\"\u0000\u0000yz\u0006"+
		"\u0005\uffff\uffff\u0000z|\u0001\u0000\u0000\u0000{e\u0001\u0000\u0000"+
		"\u0000{o\u0001\u0000\u0000\u0000|\u000b\u0001\u0000\u0000\u0000}~\u0006"+
		"\u0006\uffff\uffff\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0080\u0005"+
		"#\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081\u0082\u0006\u0006"+
		"\uffff\uffff\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0085\u0006"+
		"\u0006\uffff\uffff\u0000\u0084}\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u008f\u0001\u0000\u0000\u0000\u0086\u0087\n\u0003"+
		"\u0000\u0000\u0087\u0088\u0005&\u0000\u0000\u0088\u0089\u0005\u0010\u0000"+
		"\u0000\u0089\u008a\u0005#\u0000\u0000\u008a\u008b\u0003\u001a\r\u0000"+
		"\u008b\u008c\u0006\u0006\uffff\uffff\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u0094\u0005\u0016\u0000\u0000"+
		"\u0094\u0095\u0003\u001c\u000e\u0000\u0095\u0096\u0006\u0007\uffff\uffff"+
		"\u0000\u0096\u000f\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0007\u0000"+
		"\u0000\u0098\u0099\u0005\u001f\u0000\u0000\u0099\u009a\u0003\u001c\u000e"+
		"\u0000\u009a\u009b\u0005 \u0000\u0000\u009b\u009c\u0006\b\uffff\uffff"+
		"\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0005\b\u0000\u0000"+
		"\u009e\u009f\u0003\u001c\u000e\u0000\u009f\u00a0\u0005!\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0002\u0001\u0000\u00a1\u00a2\u0005\"\u0000\u0000\u00a2\u00a3"+
		"\u0006\t\uffff\uffff\u0000\u00a3\u00c4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\b\u0000\u0000\u00a5\u00a6\u0003\u001c\u000e\u0000\u00a6\u00a7\u0005"+
		"!\u0000\u0000\u00a7\u00a8\u0003\u0002\u0001\u0000\u00a8\u00a9\u0005\""+
		"\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ab\u0005!\u0000"+
		"\u0000\u00ab\u00ac\u0003\u0002\u0001\u0000\u00ac\u00ad\u0005\"\u0000\u0000"+
		"\u00ad\u00ae\u0006\t\uffff\uffff\u0000\u00ae\u00c4\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000\u00b1"+
		"\u00b2\u0005!\u0000\u0000\u00b2\u00b3\u0003\u0002\u0001\u0000\u00b3\u00b4"+
		"\u0005\"\u0000\u0000\u00b4\u00b5\u0003\u0014\n\u0000\u00b5\u00b6\u0006"+
		"\t\uffff\uffff\u0000\u00b6\u00c4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\b\u0000\u0000\u00b8\u00b9\u0003\u001c\u000e\u0000\u00b9\u00ba\u0005!"+
		"\u0000\u0000\u00ba\u00bb\u0003\u0002\u0001\u0000\u00bb\u00bc\u0005\"\u0000"+
		"\u0000\u00bc\u00bd\u0003\u0014\n\u0000\u00bd\u00be\u0005\t\u0000\u0000"+
		"\u00be\u00bf\u0005!\u0000\u0000\u00bf\u00c0\u0003\u0002\u0001\u0000\u00c0"+
		"\u00c1\u0005\"\u0000\u0000\u00c1\u00c2\u0006\t\uffff\uffff\u0000\u00c2"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c3\u009d\u0001\u0000\u0000\u0000\u00c3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00c3\u00af\u0001\u0000\u0000\u0000\u00c3"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0006\n\uffff\uffff\u0000\u00c6\u00c7\u0003\u0016\u000b\u0000\u00c7"+
		"\u00c8\u0006\n\uffff\uffff\u0000\u00c8\u00cf\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\n\u0002\u0000\u0000\u00ca\u00cb\u0003\u0016\u000b\u0000\u00cb\u00cc"+
		"\u0006\n\uffff\uffff\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c9"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u0015"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\t\u0000\u0000\u00d3\u00d4\u0005\b\u0000\u0000\u00d4\u00d5\u0003"+
		"\u001c\u000e\u0000\u00d5\u00d6\u0005!\u0000\u0000\u00d6\u00d7\u0003\u0002"+
		"\u0001\u0000\u00d7\u00d8\u0005\"\u0000\u0000\u00d8\u00d9\u0006\u000b\uffff"+
		"\uffff\u0000\u00d9\u0017\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u000b"+
		"\u0000\u0000\u00db\u00dc\u0005\u0010\u0000\u0000\u00dc\u00dd\u0005#\u0000"+
		"\u0000\u00dd\u00de\u0003\u001a\r\u0000\u00de\u00df\u0005\u0016\u0000\u0000"+
		"\u00df\u00e0\u0003\u001c\u000e\u0000\u00e0\u00e1\u0006\f\uffff\uffff\u0000"+
		"\u00e1\u00e9\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u000b\u0000\u0000"+
		"\u00e3\u00e4\u0005\u0010\u0000\u0000\u00e4\u00e5\u0005\u0016\u0000\u0000"+
		"\u00e5\u00e6\u0003\u001c\u000e\u0000\u00e6\u00e7\u0006\f\uffff\uffff\u0000"+
		"\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00da\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e2\u0001\u0000\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0001\u0000\u0000\u00eb\u00f6\u0006\r\uffff\uffff\u0000"+
		"\u00ec\u00ed\u0005\u0002\u0000\u0000\u00ed\u00f6\u0006\r\uffff\uffff\u0000"+
		"\u00ee\u00ef\u0005\u0004\u0000\u0000\u00ef\u00f6\u0006\r\uffff\uffff\u0000"+
		"\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f6\u0006\r\uffff\uffff\u0000"+
		"\u00f2\u00f3\u0005$\u0000\u0000\u00f3\u00f4\u0005%\u0000\u0000\u00f4\u00f6"+
		"\u0006\r\uffff\uffff\u0000\u00f5\u00ea\u0001\u0000\u0000\u0000\u00f5\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000\u00f5\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u001b"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0006\u000e\uffff\uffff\u0000\u00f8"+
		"\u00f9\u0003\"\u0011\u0000\u00f9\u00fa\u0006\u000e\uffff\uffff\u0000\u00fa"+
		"\u0117\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0010\u0000\u0000\u00fc"+
		"\u00fd\u0005!\u0000\u0000\u00fd\u00fe\u0003&\u0013\u0000\u00fe\u00ff\u0005"+
		"\"\u0000\u0000\u00ff\u0100\u0006\u000e\uffff\uffff\u0000\u0100\u0117\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005\u001f\u0000\u0000\u0102\u0103\u0003"+
		"\u001c\u000e\u0000\u0103\u0104\u0005 \u0000\u0000\u0104\u0105\u0006\u000e"+
		"\uffff\uffff\u0000\u0105\u0117\u0001\u0000\u0000\u0000\u0106\u0107\u0003"+
		" \u0010\u0000\u0107\u0108\u0006\u000e\uffff\uffff\u0000\u0108\u0117\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005$\u0000\u0000\u010a\u010b\u0003\u001e"+
		"\u000f\u0000\u010b\u010c\u0005%\u0000\u0000\u010c\u010d\u0006\u000e\uffff"+
		"\uffff\u0000\u010d\u0117\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u000e"+
		"\u0000\u0000\u010f\u0117\u0006\u000e\uffff\uffff\u0000\u0110\u0111\u0005"+
		"\u000f\u0000\u0000\u0111\u0117\u0006\u000e\uffff\uffff\u0000\u0112\u0113"+
		"\u0005\u0005\u0000\u0000\u0113\u0117\u0006\u000e\uffff\uffff\u0000\u0114"+
		"\u0115\u0005\u0006\u0000\u0000\u0115\u0117\u0006\u000e\uffff\uffff\u0000"+
		"\u0116\u00f7\u0001\u0000\u0000\u0000\u0116\u00fb\u0001\u0000\u0000\u0000"+
		"\u0116\u0101\u0001\u0000\u0000\u0000\u0116\u0106\u0001\u0000\u0000\u0000"+
		"\u0116\u0109\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000\u0000"+
		"\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u013d\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\n\u0010\u0000\u0000\u0119\u011a\u0007\u0000\u0000\u0000\u011a"+
		"\u011b\u0003\u001c\u000e\u0011\u011b\u011c\u0006\u000e\uffff\uffff\u0000"+
		"\u011c\u013c\u0001\u0000\u0000\u0000\u011d\u011e\n\u000f\u0000\u0000\u011e"+
		"\u011f\u0007\u0001\u0000\u0000\u011f\u0120\u0003\u001c\u000e\u0010\u0120"+
		"\u0121\u0006\u000e\uffff\uffff\u0000\u0121\u013c\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\n\u000e\u0000\u0000\u0123\u0124\u0007\u0002\u0000\u0000\u0124"+
		"\u0125\u0003\u001c\u000e\u000f\u0125\u0126\u0006\u000e\uffff\uffff\u0000"+
		"\u0126\u013c\u0001\u0000\u0000\u0000\u0127\u0128\n\r\u0000\u0000\u0128"+
		"\u0129\u0007\u0003\u0000\u0000\u0129\u012a\u0003\u001c\u000e\u000e\u012a"+
		"\u012b\u0006\u000e\uffff\uffff\u0000\u012b\u013c\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\n\f\u0000\u0000\u012d\u012e\u0007\u0004\u0000\u0000\u012e"+
		"\u012f\u0003\u001c\u000e\r\u012f\u0130\u0006\u000e\uffff\uffff\u0000\u0130"+
		"\u013c\u0001\u0000\u0000\u0000\u0131\u0132\n\u000b\u0000\u0000\u0132\u0133"+
		"\u0005\u0015\u0000\u0000\u0133\u0134\u0003\u001c\u000e\f\u0134\u0135\u0006"+
		"\u000e\uffff\uffff\u0000\u0135\u013c\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\n\n\u0000\u0000\u0137\u0138\u0005\u0014\u0000\u0000\u0138\u0139\u0003"+
		"\u001c\u000e\u000b\u0139\u013a\u0006\u000e\uffff\uffff\u0000\u013a\u013c"+
		"\u0001\u0000\u0000\u0000\u013b\u0118\u0001\u0000\u0000\u0000\u013b\u011d"+
		"\u0001\u0000\u0000\u0000\u013b\u0122\u0001\u0000\u0000\u0000\u013b\u0127"+
		"\u0001\u0000\u0000\u0000\u013b\u012c\u0001\u0000\u0000\u0000\u013b\u0131"+
		"\u0001\u0000\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013c\u013f"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u001d\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0006\u000f\uffff\uffff\u0000\u0141"+
		"\u0142\u0003\u001c\u000e\u0000\u0142\u0143\u0006\u000f\uffff\uffff\u0000"+
		"\u0143\u014b\u0001\u0000\u0000\u0000\u0144\u0145\n\u0002\u0000\u0000\u0145"+
		"\u0146\u0005&\u0000\u0000\u0146\u0147\u0003\u001c\u000e\u0000\u0147\u0148"+
		"\u0006\u000f\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u0144\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u001f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0006\u0010\uffff\uffff\u0000\u014f\u0150\u0005\u0010\u0000\u0000"+
		"\u0150\u0151\u0006\u0010\uffff\uffff\u0000\u0151\u015e\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\n\u0003\u0000\u0000\u0153\u0154\u0005$\u0000\u0000"+
		"\u0154\u0155\u0003\u001c\u000e\u0000\u0155\u0156\u0005%\u0000\u0000\u0156"+
		"\u0157\u0006\u0010\uffff\uffff\u0000\u0157\u015d\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\n\u0002\u0000\u0000\u0159\u015a\u0005(\u0000\u0000\u015a"+
		"\u015b\u0005\u0010\u0000\u0000\u015b\u015d\u0006\u0010\uffff\uffff\u0000"+
		"\u015c\u0152\u0001\u0000\u0000\u0000\u015c\u0158\u0001\u0000\u0000\u0000"+
		"\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f!\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0010\u0000\u0000\u0162"+
		"\u0163\u0005\u001f\u0000\u0000\u0163\u0164\u0003$\u0012\u0000\u0164\u0165"+
		"\u0005 \u0000\u0000\u0165\u0166\u0006\u0011\uffff\uffff\u0000\u0166#\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0006\u0012\uffff\uffff\u0000\u0168\u0169"+
		"\u0003\u001c\u000e\u0000\u0169\u016a\u0006\u0012\uffff\uffff\u0000\u016a"+
		"\u016d\u0001\u0000\u0000\u0000\u016b\u016d\u0006\u0012\uffff\uffff\u0000"+
		"\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u0175\u0001\u0000\u0000\u0000\u016e\u016f\n\u0003\u0000\u0000\u016f"+
		"\u0170\u0005&\u0000\u0000\u0170\u0171\u0003\u001c\u000e\u0000\u0171\u0172"+
		"\u0006\u0012\uffff\uffff\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173"+
		"\u016e\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"%\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0006\u0013\uffff\uffff\u0000\u0179\u017a\u0005\u0010\u0000\u0000\u017a"+
		"\u017b\u0005#\u0000\u0000\u017b\u017c\u0003\u001c\u000e\u0000\u017c\u017d"+
		"\u0006\u0013\uffff\uffff\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e"+
		"\u0180\u0006\u0013\uffff\uffff\u0000\u017f\u0178\u0001\u0000\u0000\u0000"+
		"\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u018a\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\n\u0003\u0000\u0000\u0182\u0183\u0005&\u0000\u0000\u0183"+
		"\u0184\u0005\u0010\u0000\u0000\u0184\u0185\u0005#\u0000\u0000\u0185\u0186"+
		"\u0003\u001c\u000e\u0000\u0186\u0187\u0006\u0013\uffff\uffff\u0000\u0187"+
		"\u0189\u0001\u0000\u0000\u0000\u0188\u0181\u0001\u0000\u0000\u0000\u0189"+
		"\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\'\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u0015/EVb{\u0084\u008f\u00c3\u00cf\u00e8\u00f5"+
		"\u0116\u013b\u013d\u014b\u015c\u015e\u016c\u0175\u017f\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}