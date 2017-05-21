// Generated from F:/Source Tree/Programmer/P4/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.7
package sourceParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FinalGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, COMMENT=54, LINE_COMMENT=55, Num=56, Bool=57, Identifier=58, 
		WS=59;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_methods = 2, RULE_dcl = 3, RULE_stmt = 4, 
		RULE_designSpecificDcl = 5, RULE_call = 6, RULE_type = 7, RULE_fprmt = 8, 
		RULE_returnval = 9, RULE_val = 10, RULE_expr = 11, RULE_term = 12, RULE_b = 13, 
		RULE_t = 14, RULE_f = 15, RULE_h = 16, RULE_i = 17, RULE_instancedcl = 18, 
		RULE_elsel = 19, RULE_elseif = 20, RULE_prmt = 21, RULE_invoke = 22, RULE_boolvalop = 23, 
		RULE_motorInvoke = 24, RULE_sensorInvoke = 25, RULE_listInvoke = 26, RULE_boolop = 27;
	public static final String[] ruleNames = {
		"program", "body", "methods", "dcl", "stmt", "designSpecificDcl", "call", 
		"type", "fprmt", "returnval", "val", "expr", "term", "b", "t", "f", "h", 
		"i", "instancedcl", "elsel", "elseif", "prmt", "invoke", "boolvalop", 
		"motorInvoke", "sensorInvoke", "listInvoke", "boolop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'Method'", "'('", "')'", "'return'", 
		"'void'", "'='", "'List'", "'['", "']'", "'if'", "'then'", "'while'", 
		"'do'", "'for'", "'to'", "'Sleep'", "'synchronize'", "'desynchronize'", 
		"'.'", "'number'", "'bool'", "','", "'-'", "'+'", "'*'", "'/'", "'and'", 
		"'or'", "'not'", "'Motor'", "'TouchSensor'", "'UltrasoundSensor'", "'else'", 
		"'lessThan'", "'greaterThan'", "'equal'", "'greaterThanOrEqual'", "'lessThanOrEqual'", 
		"'notEqual'", "'Forward'", "'Backwards'", "'ForwardSeconds'", "'BackwardsSeconds'", 
		"'Stop'", "'IsPressed'", "'Distance'", "'Add'", "'Remove'", "'Length'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", "Num", 
		"Bool", "Identifier", "WS"
	};
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
	public String getGrammarFileName() { return "FinalGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FinalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DesignSpecificDclContext> designSpecificDcl() {
			return getRuleContexts(DesignSpecificDclContext.class);
		}
		public DesignSpecificDclContext designSpecificDcl(int i) {
			return getRuleContext(DesignSpecificDclContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<MethodsContext> methods() {
			return getRuleContexts(MethodsContext.class);
		}
		public MethodsContext methods(int i) {
			return getRuleContext(MethodsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(56);
				designSpecificDcl();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__0);
			setState(63);
			match(T__1);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
				{
				{
				setState(64);
				body();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(71);
				methods();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BodyContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				dcl();
				setState(78);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				call();
				setState(82);
				match(T__3);
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

	public static class MethodsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public ReturnvalContext returnval() {
			return getRuleContext(ReturnvalContext.class,0);
		}
		public FprmtContext fprmt() {
			return getRuleContext(FprmtContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methods);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				type();
				setState(87);
				match(T__4);
				setState(88);
				match(Identifier);
				setState(89);
				match(T__5);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23 || _la==T__24) {
					{
					setState(90);
					fprmt();
					}
				}

				setState(93);
				match(T__6);
				setState(94);
				match(T__1);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
					{
					{
					setState(95);
					body();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__7);
				setState(102);
				returnval();
				setState(103);
				match(T__3);
				setState(104);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__8);
				setState(107);
				match(T__4);
				setState(108);
				match(Identifier);
				setState(109);
				match(T__5);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23 || _la==T__24) {
					{
					setState(110);
					fprmt();
					}
				}

				setState(113);
				match(T__6);
				setState(114);
				match(T__1);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
					{
					{
					setState(115);
					body();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__2);
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

	public static class DclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				type();
				setState(125);
				match(Identifier);
				setState(126);
				match(T__9);
				setState(127);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				type();
				setState(130);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__10);
				setState(133);
				match(T__11);
				setState(134);
				type();
				setState(135);
				match(T__12);
				setState(136);
				match(Identifier);
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

	public static class StmtContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(FinalGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FinalGrammarParser.Identifier, i);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElselContext elsel() {
			return getRuleContext(ElselContext.class,0);
		}
		public List<TerminalNode> Num() { return getTokens(FinalGrammarParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(FinalGrammarParser.Num, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(Identifier);
				setState(141);
				match(T__9);
				setState(142);
				b();
				setState(143);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__13);
				setState(146);
				match(T__5);
				setState(147);
				b();
				setState(148);
				match(T__6);
				setState(149);
				match(T__14);
				setState(150);
				match(T__1);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
					{
					{
					setState(151);
					body();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__2);
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						elseif();
						}
						} 
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(164);
					elsel();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__15);
				setState(168);
				match(T__5);
				setState(169);
				b();
				setState(170);
				match(T__6);
				setState(171);
				match(T__16);
				setState(172);
				match(T__1);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
					{
					{
					setState(173);
					body();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__17);
				setState(182);
				match(T__5);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==Num || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				match(T__18);
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==Num || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				match(T__6);
				setState(187);
				match(T__16);
				setState(188);
				match(T__1);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
					{
					{
					setState(189);
					body();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__19);
				setState(197);
				match(T__5);
				setState(198);
				match(Num);
				setState(199);
				match(T__6);
				setState(200);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(Identifier);
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				match(Identifier);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__26) | (1L << Num) | (1L << Identifier))) != 0)) {
					{
					setState(204);
					expr();
					}
				}

				setState(207);
				match(T__3);
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

	public static class DesignSpecificDclContext extends ParserRuleContext {
		public InstancedclContext instancedcl() {
			return getRuleContext(InstancedclContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(FinalGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FinalGrammarParser.Identifier, i);
		}
		public TerminalNode Num() { return getToken(FinalGrammarParser.Num, 0); }
		public DesignSpecificDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designSpecificDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterDesignSpecificDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitDesignSpecificDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitDesignSpecificDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignSpecificDclContext designSpecificDcl() throws RecognitionException {
		DesignSpecificDclContext _localctx = new DesignSpecificDclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_designSpecificDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			instancedcl();
			setState(211);
			match(T__11);
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==Num || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			match(T__12);
			setState(214);
			match(Identifier);
			setState(215);
			match(T__3);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public PrmtContext prmt() {
			return getRuleContext(PrmtContext.class,0);
		}
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_call);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(Identifier);
				setState(218);
				match(T__5);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__26) | (1L << T__32) | (1L << Num) | (1L << Bool) | (1L << Identifier))) != 0)) {
					{
					setState(219);
					prmt();
					}
				}

				setState(222);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(Identifier);
				setState(224);
				match(T__22);
				setState(225);
				invoke();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FprmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public FprmtContext fprmt() {
			return getRuleContext(FprmtContext.class,0);
		}
		public FprmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fprmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterFprmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitFprmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitFprmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FprmtContext fprmt() throws RecognitionException {
		FprmtContext _localctx = new FprmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fprmt);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				type();
				setState(231);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				type();
				setState(234);
				match(Identifier);
				setState(235);
				match(T__25);
				setState(236);
				fprmt();
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

	public static class ReturnvalContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ReturnvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterReturnval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitReturnval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitReturnval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnvalContext returnval() throws RecognitionException {
		ReturnvalContext _localctx = new ReturnvalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			b();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(FinalGrammarParser.Num, 0); }
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_val);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(T__26);
				setState(246);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(T__5);
				setState(248);
				b();
				setState(249);
				match(T__6);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				term();
				setState(254);
				match(T__27);
				setState(255);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				term();
				setState(258);
				match(T__26);
				setState(259);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				val();
				setState(265);
				match(T__28);
				setState(266);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				val();
				setState(269);
				match(T__29);
				setState(270);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				val();
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

	public static class BContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_b);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				t();
				setState(276);
				match(T__30);
				setState(277);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				t();
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

	public static class TContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				f();
				setState(283);
				match(T__31);
				setState(284);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				f();
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

	public static class FContext extends ParserRuleContext {
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public BoolopContext boolop() {
			return getRuleContext(BoolopContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_f);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				h();
				setState(290);
				boolop();
				setState(291);
				f();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				h();
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

	public static class HContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public BoolvalopContext boolvalop() {
			return getRuleContext(BoolvalopContext.class,0);
		}
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public HContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HContext h() throws RecognitionException {
		HContext _localctx = new HContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_h);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				i();
				setState(297);
				boolvalop();
				setState(298);
				h();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				i();
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

	public static class IContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Bool() { return getToken(FinalGrammarParser.Bool, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_i);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__26:
			case Num:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				expr();
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(Bool);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(T__32);
				setState(306);
				b();
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

	public static class InstancedclContext extends ParserRuleContext {
		public InstancedclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instancedcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterInstancedcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitInstancedcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitInstancedcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstancedclContext instancedcl() throws RecognitionException {
		InstancedclContext _localctx = new InstancedclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instancedcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ElselContext extends ParserRuleContext {
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ElselContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterElsel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitElsel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitElsel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElselContext elsel() throws RecognitionException {
		ElselContext _localctx = new ElselContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elsel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__36);
			setState(312);
			match(T__1);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
				{
				{
				setState(313);
				body();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(T__2);
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

	public static class ElseifContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__36);
			setState(322);
			match(T__13);
			setState(323);
			match(T__5);
			setState(324);
			b();
			setState(325);
			match(T__6);
			setState(326);
			match(T__14);
			setState(327);
			match(T__1);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << Identifier))) != 0)) {
				{
				{
				setState(328);
				body();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(T__2);
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

	public static class PrmtContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public PrmtContext prmt() {
			return getRuleContext(PrmtContext.class,0);
		}
		public PrmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterPrmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitPrmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitPrmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrmtContext prmt() throws RecognitionException {
		PrmtContext _localctx = new PrmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_prmt);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				b();
				setState(338);
				match(T__25);
				setState(339);
				prmt();
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

	public static class InvokeContext extends ParserRuleContext {
		public MotorInvokeContext motorInvoke() {
			return getRuleContext(MotorInvokeContext.class,0);
		}
		public SensorInvokeContext sensorInvoke() {
			return getRuleContext(SensorInvokeContext.class,0);
		}
		public ListInvokeContext listInvoke() {
			return getRuleContext(ListInvokeContext.class,0);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_invoke);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				motorInvoke();
				}
				break;
			case T__48:
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				sensorInvoke();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				listInvoke();
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

	public static class BoolvalopContext extends ParserRuleContext {
		public BoolvalopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolvalop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterBoolvalop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitBoolvalop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitBoolvalop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolvalopContext boolvalop() throws RecognitionException {
		BoolvalopContext _localctx = new BoolvalopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolvalop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MotorInvokeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MotorInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_motorInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterMotorInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitMotorInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitMotorInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MotorInvokeContext motorInvoke() throws RecognitionException {
		MotorInvokeContext _localctx = new MotorInvokeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_motorInvoke);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__43);
				setState(351);
				match(T__5);
				setState(352);
				expr();
				setState(353);
				match(T__6);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__44);
				setState(356);
				match(T__5);
				setState(357);
				expr();
				setState(358);
				match(T__6);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(T__45);
				setState(361);
				match(T__5);
				setState(362);
				expr();
				setState(363);
				match(T__25);
				setState(364);
				expr();
				setState(365);
				match(T__6);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(T__46);
				setState(368);
				match(T__5);
				setState(369);
				expr();
				setState(370);
				match(T__25);
				setState(371);
				expr();
				setState(372);
				match(T__6);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T__47);
				setState(375);
				match(T__5);
				setState(376);
				match(T__6);
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

	public static class SensorInvokeContext extends ParserRuleContext {
		public SensorInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensorInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterSensorInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitSensorInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitSensorInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensorInvokeContext sensorInvoke() throws RecognitionException {
		SensorInvokeContext _localctx = new SensorInvokeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sensorInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ListInvokeContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterListInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitListInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitListInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListInvokeContext listInvoke() throws RecognitionException {
		ListInvokeContext _localctx = new ListInvokeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listInvoke);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__50);
				setState(382);
				match(T__5);
				setState(383);
				b();
				setState(384);
				match(T__6);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__51);
				setState(387);
				match(T__5);
				setState(388);
				expr();
				setState(389);
				match(T__6);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(T__52);
				setState(392);
				match(T__5);
				setState(393);
				match(T__6);
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

	public static class BoolopContext extends ParserRuleContext {
		public BoolopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterBoolop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitBoolop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitBoolop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolopContext boolop() throws RecognitionException {
		BoolopContext _localctx = new BoolopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4"+
		"\3\4\7\4c\n\4\f\4\16\4f\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4r\n\4\3\4\3\4\3\4\7\4w\n\4\f\4\16\4z\13\4\3\4\5\4}\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3"+
		"\6\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5\13\6\3\6\5\6\u00a8\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00b1\n\6\f\6\16\6\u00b4\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c1\n\6\f\6\16\6\u00c4\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d0\n\6\3\6\5\6\u00d3\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00df\n\b\3\b\3\b\3\b\3\b\5\b\u00e5"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0109\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0114\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u011b\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0122\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0129\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\5\22\u0130\n\22\3\23\3\23\3\23\3\23\5\23"+
		"\u0136\n\23\3\24\3\24\3\25\3\25\3\25\7\25\u013d\n\25\f\25\16\25\u0140"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014c\n"+
		"\26\f\26\16\26\u014f\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0158"+
		"\n\27\3\30\3\30\3\30\5\30\u015d\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u017c\n\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018d"+
		"\n\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668\2\t\4\2::<<\3\2\27\30\3\2\32\33\3\2$&\3\2(-\3\2\63"+
		"\64\4\2**--\2\u01a7\2=\3\2\2\2\4V\3\2\2\2\6|\3\2\2\2\b\u008c\3\2\2\2\n"+
		"\u00d2\3\2\2\2\f\u00d4\3\2\2\2\16\u00e4\3\2\2\2\20\u00e6\3\2\2\2\22\u00f0"+
		"\3\2\2\2\24\u00f2\3\2\2\2\26\u00fd\3\2\2\2\30\u0108\3\2\2\2\32\u0113\3"+
		"\2\2\2\34\u011a\3\2\2\2\36\u0121\3\2\2\2 \u0128\3\2\2\2\"\u012f\3\2\2"+
		"\2$\u0135\3\2\2\2&\u0137\3\2\2\2(\u0139\3\2\2\2*\u0143\3\2\2\2,\u0157"+
		"\3\2\2\2.\u015c\3\2\2\2\60\u015e\3\2\2\2\62\u017b\3\2\2\2\64\u017d\3\2"+
		"\2\2\66\u018c\3\2\2\28\u018e\3\2\2\2:<\5\f\7\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\3\2\2AE\7\4\2\2BD\5\4\3\2CB\3"+
		"\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\7\5\2\2IK\5"+
		"\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NL\3\2\2\2OP"+
		"\5\b\5\2PQ\7\6\2\2QW\3\2\2\2RW\5\n\6\2ST\5\16\b\2TU\7\6\2\2UW\3\2\2\2"+
		"VO\3\2\2\2VR\3\2\2\2VS\3\2\2\2W\5\3\2\2\2XY\5\20\t\2YZ\7\7\2\2Z[\7<\2"+
		"\2[]\7\b\2\2\\^\5\22\n\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\t\2\2`d\7"+
		"\4\2\2ac\5\4\3\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3"+
		"\2\2\2gh\7\n\2\2hi\5\24\13\2ij\7\6\2\2jk\7\5\2\2k}\3\2\2\2lm\7\13\2\2"+
		"mn\7\7\2\2no\7<\2\2oq\7\b\2\2pr\5\22\n\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2"+
		"st\7\t\2\2tx\7\4\2\2uw\5\4\3\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y{\3\2\2\2zx\3\2\2\2{}\7\5\2\2|X\3\2\2\2|l\3\2\2\2}\7\3\2\2\2~\177\5\20"+
		"\t\2\177\u0080\7<\2\2\u0080\u0081\7\f\2\2\u0081\u0082\5\34\17\2\u0082"+
		"\u008d\3\2\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7<\2\2\u0085\u008d\3\2"+
		"\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7\16\2\2\u0088\u0089\5\20\t\2\u0089"+
		"\u008a\7\17\2\2\u008a\u008b\7<\2\2\u008b\u008d\3\2\2\2\u008c~\3\2\2\2"+
		"\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008d\t\3\2\2\2\u008e\u008f\7"+
		"<\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7\6\2\2\u0092"+
		"\u00d3\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0095\7\b\2\2\u0095\u0096\5"+
		"\34\17\2\u0096\u0097\7\t\2\2\u0097\u0098\7\21\2\2\u0098\u009c\7\4\2\2"+
		"\u0099\u009b\5\4\3\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a3\7\5\2\2\u00a0\u00a2\5*\26\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\5(\25\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00d3\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7\b\2\2\u00ab"+
		"\u00ac\5\34\17\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00b2"+
		"\7\4\2\2\u00af\u00b1\5\4\3\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00d3\3\2\2\2\u00b7\u00b8\7\24\2\2\u00b8"+
		"\u00b9\7\b\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\t"+
		"\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\7\23\2\2\u00be\u00c2\7\4\2\2\u00bf"+
		"\u00c1\5\4\3\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00d3\7\5\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\7"+
		":\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00d3\7\6\2\2\u00cb\u00cc\7<\2\2\u00cc"+
		"\u00cd\t\3\2\2\u00cd\u00cf\7<\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\6\2\2\u00d2"+
		"\u008e\3\2\2\2\u00d2\u0093\3\2\2\2\u00d2\u00a9\3\2\2\2\u00d2\u00b7\3\2"+
		"\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3\13\3\2\2\2\u00d4\u00d5"+
		"\5&\24\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\7\17\2\2"+
		"\u00d8\u00d9\7<\2\2\u00d9\u00da\7\6\2\2\u00da\r\3\2\2\2\u00db\u00dc\7"+
		"<\2\2\u00dc\u00de\7\b\2\2\u00dd\u00df\5,\27\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e5\7\t\2\2\u00e1\u00e2\7<"+
		"\2\2\u00e2\u00e3\7\31\2\2\u00e3\u00e5\5.\30\2\u00e4\u00db\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5\17\3\2\2\2\u00e6\u00e7\t\4\2\2\u00e7\21\3\2\2\2\u00e8"+
		"\u00e9\5\20\t\2\u00e9\u00ea\7<\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\5\20"+
		"\t\2\u00ec\u00ed\7<\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00ef\5\22\n\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\23\3\2\2"+
		"\2\u00f2\u00f3\5\34\17\2\u00f3\25\3\2\2\2\u00f4\u00fe\7:\2\2\u00f5\u00fe"+
		"\7<\2\2\u00f6\u00fe\5\16\b\2\u00f7\u00f8\7\35\2\2\u00f8\u00fe\5\30\r\2"+
		"\u00f9\u00fa\7\b\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\7\t\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd"+
		"\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\27\3\2\2\2\u00ff\u0100\5\32\16"+
		"\2\u0100\u0101\7\36\2\2\u0101\u0102\5\30\r\2\u0102\u0109\3\2\2\2\u0103"+
		"\u0104\5\32\16\2\u0104\u0105\7\35\2\2\u0105\u0106\5\30\r\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0109\5\32\16\2\u0108\u00ff\3\2\2\2\u0108\u0103\3\2\2\2"+
		"\u0108\u0107\3\2\2\2\u0109\31\3\2\2\2\u010a\u010b\5\26\f\2\u010b\u010c"+
		"\7\37\2\2\u010c\u010d\5\32\16\2\u010d\u0114\3\2\2\2\u010e\u010f\5\26\f"+
		"\2\u010f\u0110\7 \2\2\u0110\u0111\5\32\16\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0114\5\26\f\2\u0113\u010a\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u0112\3"+
		"\2\2\2\u0114\33\3\2\2\2\u0115\u0116\5\36\20\2\u0116\u0117\7!\2\2\u0117"+
		"\u0118\5\34\17\2\u0118\u011b\3\2\2\2\u0119\u011b\5\36\20\2\u011a\u0115"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b\35\3\2\2\2\u011c\u011d\5 \21\2\u011d"+
		"\u011e\7\"\2\2\u011e\u011f\5\36\20\2\u011f\u0122\3\2\2\2\u0120\u0122\5"+
		" \21\2\u0121\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122\37\3\2\2\2\u0123"+
		"\u0124\5\"\22\2\u0124\u0125\58\35\2\u0125\u0126\5 \21\2\u0126\u0129\3"+
		"\2\2\2\u0127\u0129\5\"\22\2\u0128\u0123\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"!\3\2\2\2\u012a\u012b\5$\23\2\u012b\u012c\5\60\31\2\u012c\u012d\5\"\22"+
		"\2\u012d\u0130\3\2\2\2\u012e\u0130\5$\23\2\u012f\u012a\3\2\2\2\u012f\u012e"+
		"\3\2\2\2\u0130#\3\2\2\2\u0131\u0136\5\30\r\2\u0132\u0136\7;\2\2\u0133"+
		"\u0134\7#\2\2\u0134\u0136\5\34\17\2\u0135\u0131\3\2\2\2\u0135\u0132\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0136%\3\2\2\2\u0137\u0138\t\5\2\2\u0138\'"+
		"\3\2\2\2\u0139\u013a\7\'\2\2\u013a\u013e\7\4\2\2\u013b\u013d\5\4\3\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\5\2\2\u0142"+
		")\3\2\2\2\u0143\u0144\7\'\2\2\u0144\u0145\7\20\2\2\u0145\u0146\7\b\2\2"+
		"\u0146\u0147\5\34\17\2\u0147\u0148\7\t\2\2\u0148\u0149\7\21\2\2\u0149"+
		"\u014d\7\4\2\2\u014a\u014c\5\4\3\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\7\5\2\2\u0151+\3\2\2\2\u0152\u0158\5\34\17"+
		"\2\u0153\u0154\5\34\17\2\u0154\u0155\7\34\2\2\u0155\u0156\5,\27\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0158-\3\2\2\2"+
		"\u0159\u015d\5\62\32\2\u015a\u015d\5\64\33\2\u015b\u015d\5\66\34\2\u015c"+
		"\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d/\3\2\2\2"+
		"\u015e\u015f\t\6\2\2\u015f\61\3\2\2\2\u0160\u0161\7.\2\2\u0161\u0162\7"+
		"\b\2\2\u0162\u0163\5\30\r\2\u0163\u0164\7\t\2\2\u0164\u017c\3\2\2\2\u0165"+
		"\u0166\7/\2\2\u0166\u0167\7\b\2\2\u0167\u0168\5\30\r\2\u0168\u0169\7\t"+
		"\2\2\u0169\u017c\3\2\2\2\u016a\u016b\7\60\2\2\u016b\u016c\7\b\2\2\u016c"+
		"\u016d\5\30\r\2\u016d\u016e\7\34\2\2\u016e\u016f\5\30\r\2\u016f\u0170"+
		"\7\t\2\2\u0170\u017c\3\2\2\2\u0171\u0172\7\61\2\2\u0172\u0173\7\b\2\2"+
		"\u0173\u0174\5\30\r\2\u0174\u0175\7\34\2\2\u0175\u0176\5\30\r\2\u0176"+
		"\u0177\7\t\2\2\u0177\u017c\3\2\2\2\u0178\u0179\7\62\2\2\u0179\u017a\7"+
		"\b\2\2\u017a\u017c\7\t\2\2\u017b\u0160\3\2\2\2\u017b\u0165\3\2\2\2\u017b"+
		"\u016a\3\2\2\2\u017b\u0171\3\2\2\2\u017b\u0178\3\2\2\2\u017c\63\3\2\2"+
		"\2\u017d\u017e\t\7\2\2\u017e\65\3\2\2\2\u017f\u0180\7\65\2\2\u0180\u0181"+
		"\7\b\2\2\u0181\u0182\5\34\17\2\u0182\u0183\7\t\2\2\u0183\u018d\3\2\2\2"+
		"\u0184\u0185\7\66\2\2\u0185\u0186\7\b\2\2\u0186\u0187\5\30\r\2\u0187\u0188"+
		"\7\t\2\2\u0188\u018d\3\2\2\2\u0189\u018a\7\67\2\2\u018a\u018b\7\b\2\2"+
		"\u018b\u018d\7\t\2\2\u018c\u017f\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u0189"+
		"\3\2\2\2\u018d\67\3\2\2\2\u018e\u018f\t\b\2\2\u018f9\3\2\2\2$=ELV]dqx"+
		"|\u008c\u009c\u00a3\u00a7\u00b2\u00c2\u00cf\u00d2\u00de\u00e4\u00f0\u00fd"+
		"\u0108\u0113\u011a\u0121\u0128\u012f\u0135\u013e\u014d\u0157\u015c\u017b"+
		"\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}