// Generated from C:/Users/Nikolaj/Documents/P4/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.6
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, COMMENT=49, LINE_COMMENT=50, Num=51, Bool=52, 
		Identifier=53, WS=54;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_methods = 2, RULE_dcl = 3, RULE_stmt = 4, 
		RULE_call = 5, RULE_type = 6, RULE_fprmt = 7, RULE_returnval = 8, RULE_val = 9, 
		RULE_expr = 10, RULE_term = 11, RULE_b = 12, RULE_t = 13, RULE_f = 14, 
		RULE_h = 15, RULE_i = 16, RULE_instancedcl = 17, RULE_elsel = 18, RULE_elseif = 19, 
		RULE_prmt = 20, RULE_statid = 21, RULE_boolvalop = 22, RULE_statmotorid = 23, 
		RULE_statsensorid = 24, RULE_statlistid = 25, RULE_boolop = 26;
	public static final String[] ruleNames = {
		"program", "body", "methods", "dcl", "stmt", "call", "type", "fprmt", 
		"returnval", "val", "expr", "term", "b", "t", "f", "h", "i", "instancedcl", 
		"elsel", "elseif", "prmt", "statid", "boolvalop", "statmotorid", "statsensorid", 
		"statlistid", "boolop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'Method'", "'('", "')'", "'return'", 
		"'void'", "'='", "'['", "']'", "'List'", "'number'", "'boolean'", "'if'", 
		"'then'", "'while'", "'do'", "'for'", "'to'", "'Sleep'", "'synchronize'", 
		"'.'", "'bool'", "','", "'-'", "'+'", "'*'", "'/'", "'and'", "'or'", "'not'", 
		"'Motor'", "'Sensor'", "'else'", "'lessThan'", "'greaterThan'", "'equal'", 
		"'greaterThanOrEqual'", "'lessThanOrEqual'", "'notEqual'", "'Forward'", 
		"'Backwards'", "'IsPressed()'", "'Distance()'", "'Add'", "'Remove'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMMENT", "LINE_COMMENT", "Num", "Bool", "Identifier", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
				{
				{
				setState(56);
				body();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__2);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__24))) != 0)) {
				{
				{
				setState(63);
				methods();
				}
				}
				setState(68);
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
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				dcl();
				setState(70);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				call();
				setState(74);
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
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methods);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				type();
				setState(79);
				match(T__4);
				setState(80);
				match(Identifier);
				setState(81);
				match(T__5);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__24) {
					{
					setState(82);
					fprmt();
					}
				}

				setState(85);
				match(T__6);
				setState(86);
				match(T__1);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					{
					setState(87);
					body();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__7);
				setState(94);
				returnval();
				setState(95);
				match(T__3);
				setState(96);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__8);
				setState(99);
				match(T__4);
				setState(100);
				match(Identifier);
				setState(101);
				match(T__5);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__24) {
					{
					setState(102);
					fprmt();
					}
				}

				setState(105);
				match(T__6);
				setState(106);
				match(T__1);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					{
					setState(107);
					body();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
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
		public List<TerminalNode> Identifier() { return getTokens(FinalGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FinalGrammarParser.Identifier, i);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public InstancedclContext instancedcl() {
			return getRuleContext(InstancedclContext.class,0);
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
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				type();
				setState(117);
				match(Identifier);
				setState(118);
				match(T__9);
				setState(119);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				type();
				setState(122);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				instancedcl();
				setState(125);
				match(T__10);
				setState(126);
				match(Identifier);
				setState(127);
				match(T__11);
				setState(128);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(T__12);
				setState(131);
				match(T__10);
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				match(T__11);
				setState(134);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(Identifier);
				setState(138);
				match(T__9);
				setState(139);
				b();
				setState(140);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__15);
				setState(143);
				match(T__5);
				setState(144);
				b();
				setState(145);
				match(T__6);
				setState(146);
				match(T__16);
				setState(147);
				match(T__1);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					{
					setState(148);
					body();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__2);
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						elseif();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(161);
					elsel();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__17);
				setState(165);
				match(T__5);
				setState(166);
				b();
				setState(167);
				match(T__6);
				setState(168);
				match(T__18);
				setState(169);
				match(T__1);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					{
					setState(170);
					body();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(T__19);
				setState(179);
				match(T__5);
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==Num || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				match(T__20);
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==Num || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				match(T__6);
				setState(184);
				match(T__18);
				setState(185);
				match(T__1);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
					{
					{
					setState(186);
					body();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(T__21);
				{
				setState(194);
				match(Num);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				match(Identifier);
				setState(196);
				match(T__22);
				setState(197);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public PrmtContext prmt() {
			return getRuleContext(PrmtContext.class,0);
		}
		public StatidContext statid() {
			return getRuleContext(StatidContext.class,0);
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
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(Identifier);
				setState(201);
				match(T__5);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__26) | (1L << T__32) | (1L << Num) | (1L << Bool) | (1L << Identifier))) != 0)) {
					{
					setState(202);
					prmt();
					}
				}

				setState(205);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(Identifier);
				setState(207);
				match(T__23);
				setState(208);
				statid();
				setState(209);
				match(T__5);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__26) | (1L << T__32) | (1L << Num) | (1L << Bool) | (1L << Identifier))) != 0)) {
					{
					setState(210);
					prmt();
					}
				}

				setState(213);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__24) ) {
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
	}

	public final FprmtContext fprmt() throws RecognitionException {
		FprmtContext _localctx = new FprmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fprmt);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				type();
				setState(220);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				type();
				setState(223);
				match(Identifier);
				setState(224);
				match(T__25);
				setState(225);
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
	}

	public final ReturnvalContext returnval() throws RecognitionException {
		ReturnvalContext _localctx = new ReturnvalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_val);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(T__26);
				setState(235);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__5);
				setState(237);
				b();
				setState(238);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				term();
				setState(243);
				match(T__27);
				setState(244);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				term();
				setState(247);
				match(T__26);
				setState(248);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				val();
				setState(254);
				match(T__28);
				setState(255);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				val();
				setState(258);
				match(T__29);
				setState(259);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
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
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_b);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				t();
				setState(265);
				match(T__30);
				setState(266);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_t);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				f();
				setState(272);
				match(T__31);
				setState(273);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
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
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_f);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				h();
				setState(279);
				boolop();
				setState(280);
				f();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
	}

	public final HContext h() throws RecognitionException {
		HContext _localctx = new HContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_h);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				i();
				setState(286);
				boolvalop();
				setState(287);
				h();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
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
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_i);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__26:
			case Num:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				expr();
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(Bool);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(T__32);
				setState(295);
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
	}

	public final InstancedclContext instancedcl() throws RecognitionException {
		InstancedclContext _localctx = new InstancedclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instancedcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
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
	}

	public final ElselContext elsel() throws RecognitionException {
		ElselContext _localctx = new ElselContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__35);
			setState(301);
			match(T__1);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
				{
				{
				setState(302);
				body();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
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
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__35);
			setState(311);
			match(T__15);
			setState(312);
			match(T__5);
			setState(313);
			b();
			setState(314);
			match(T__6);
			setState(315);
			match(T__16);
			setState(316);
			match(T__1);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << Identifier))) != 0)) {
				{
				{
				setState(317);
				body();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
	}

	public final PrmtContext prmt() throws RecognitionException {
		PrmtContext _localctx = new PrmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_prmt);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				b();
				setState(327);
				match(T__25);
				setState(328);
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

	public static class StatidContext extends ParserRuleContext {
		public StatmotoridContext statmotorid() {
			return getRuleContext(StatmotoridContext.class,0);
		}
		public StatsensoridContext statsensorid() {
			return getRuleContext(StatsensoridContext.class,0);
		}
		public StatlistidContext statlistid() {
			return getRuleContext(StatlistidContext.class,0);
		}
		public StatidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterStatid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitStatid(this);
		}
	}

	public final StatidContext statid() throws RecognitionException {
		StatidContext _localctx = new StatidContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statid);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				statmotorid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				statsensorid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				statlistid();
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
	}

	public final BoolvalopContext boolvalop() throws RecognitionException {
		BoolvalopContext _localctx = new BoolvalopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolvalop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public static class StatmotoridContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(FinalGrammarParser.Num, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatmotoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statmotorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterStatmotorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitStatmotorid(this);
		}
	}

	public final StatmotoridContext statmotorid() throws RecognitionException {
		StatmotoridContext _localctx = new StatmotoridContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statmotorid);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(T__42);
				setState(340);
				match(T__5);
				setState(341);
				match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				expr();
				setState(343);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__43);
				setState(346);
				match(T__5);
				setState(347);
				match(Num);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				expr();
				setState(349);
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

	public static class StatsensoridContext extends ParserRuleContext {
		public StatsensoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsensorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterStatsensorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitStatsensorid(this);
		}
	}

	public final StatsensoridContext statsensorid() throws RecognitionException {
		StatsensoridContext _localctx = new StatsensoridContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statsensorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
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

	public static class StatlistidContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode Num() { return getToken(FinalGrammarParser.Num, 0); }
		public StatlistidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlistid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterStatlistid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitStatlistid(this);
		}
	}

	public final StatlistidContext statlistid() throws RecognitionException {
		StatlistidContext _localctx = new StatlistidContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statlistid);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__46);
				setState(356);
				match(T__5);
				setState(357);
				call();
				}
				break;
			case T__5:
			case T__26:
			case T__32:
			case Num:
			case Bool:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				b();
				setState(359);
				match(T__6);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(T__47);
				setState(362);
				match(T__5);
				setState(363);
				match(Num);
				setState(364);
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
	}

	public final BoolopContext boolop() throws RecognitionException {
		BoolopContext _localctx = new BoolopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__41) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0174\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\7\4o\n\4\f\4\16"+
		"\4r\13\4\3\4\5\4u\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\3\6\7\6\u009f"+
		"\n\6\f\6\16\6\u00a2\13\6\3\6\5\6\u00a5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00be\n\6\f\6\16\6\u00c1\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00c9\n\6\3\7\3\7\3\7\5\7\u00ce\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d6"+
		"\n\7\3\7\3\7\5\7\u00da\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00e6\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f3"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0109\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0110"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0117\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u011e\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0125\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u012b\n\22\3\23\3\23\3\24\3\24\3\24\7\24\u0132\n\24\f\24"+
		"\16\24\u0135\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7"+
		"\25\u0141\n\25\f\25\16\25\u0144\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u014d\n\26\3\27\3\27\3\27\5\27\u0152\n\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0162\n\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0170\n\33"+
		"\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\66\2\t\3\2\20\21\4\2\65\65\67\67\4\2\20\20\33\33\3\2$%\3\2"+
		"\',\3\2/\60\4\2)),,\u018a\28\3\2\2\2\4N\3\2\2\2\6t\3\2\2\2\b\u0089\3\2"+
		"\2\2\n\u00c8\3\2\2\2\f\u00d9\3\2\2\2\16\u00db\3\2\2\2\20\u00e5\3\2\2\2"+
		"\22\u00e7\3\2\2\2\24\u00f2\3\2\2\2\26\u00fd\3\2\2\2\30\u0108\3\2\2\2\32"+
		"\u010f\3\2\2\2\34\u0116\3\2\2\2\36\u011d\3\2\2\2 \u0124\3\2\2\2\"\u012a"+
		"\3\2\2\2$\u012c\3\2\2\2&\u012e\3\2\2\2(\u0138\3\2\2\2*\u014c\3\2\2\2,"+
		"\u0151\3\2\2\2.\u0153\3\2\2\2\60\u0161\3\2\2\2\62\u0163\3\2\2\2\64\u016f"+
		"\3\2\2\2\66\u0171\3\2\2\289\7\3\2\29=\7\4\2\2:<\5\4\3\2;:\3\2\2\2<?\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\7\5\2\2AC\5\6\4\2BA\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FD\3\2\2\2GH\5\b\5\2HI"+
		"\7\6\2\2IO\3\2\2\2JO\5\n\6\2KL\5\f\7\2LM\7\6\2\2MO\3\2\2\2NG\3\2\2\2N"+
		"J\3\2\2\2NK\3\2\2\2O\5\3\2\2\2PQ\5\16\b\2QR\7\7\2\2RS\7\67\2\2SU\7\b\2"+
		"\2TV\5\20\t\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\t\2\2X\\\7\4\2\2Y[\5\4"+
		"\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`"+
		"\7\n\2\2`a\5\22\n\2ab\7\6\2\2bc\7\5\2\2cu\3\2\2\2de\7\13\2\2ef\7\7\2\2"+
		"fg\7\67\2\2gi\7\b\2\2hj\5\20\t\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\t\2"+
		"\2lp\7\4\2\2mo\5\4\3\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2"+
		"\2rp\3\2\2\2su\7\5\2\2tP\3\2\2\2td\3\2\2\2u\7\3\2\2\2vw\5\16\b\2wx\7\67"+
		"\2\2xy\7\f\2\2yz\5\32\16\2z\u008a\3\2\2\2{|\5\16\b\2|}\7\67\2\2}\u008a"+
		"\3\2\2\2~\177\5$\23\2\177\u0080\7\r\2\2\u0080\u0081\7\67\2\2\u0081\u0082"+
		"\7\16\2\2\u0082\u0083\7\67\2\2\u0083\u008a\3\2\2\2\u0084\u0085\7\17\2"+
		"\2\u0085\u0086\7\r\2\2\u0086\u0087\t\2\2\2\u0087\u0088\7\16\2\2\u0088"+
		"\u008a\7\67\2\2\u0089v\3\2\2\2\u0089{\3\2\2\2\u0089~\3\2\2\2\u0089\u0084"+
		"\3\2\2\2\u008a\t\3\2\2\2\u008b\u008c\7\67\2\2\u008c\u008d\7\f\2\2\u008d"+
		"\u008e\5\32\16\2\u008e\u008f\7\6\2\2\u008f\u00c9\3\2\2\2\u0090\u0091\7"+
		"\22\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5\32\16\2\u0093\u0094\7\t\2\2"+
		"\u0094\u0095\7\23\2\2\u0095\u0099\7\4\2\2\u0096\u0098\5\4\3\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\7\5\2\2\u009d\u009f\5("+
		"\25\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5&"+
		"\24\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00c9\3\2\2\2\u00a6"+
		"\u00a7\7\24\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa"+
		"\7\t\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00af\7\4\2\2\u00ac\u00ae\5\4\3\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\5\2\2\u00b3"+
		"\u00c9\3\2\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\t"+
		"\3\2\2\u00b7\u00b8\7\27\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba\7\t\2\2\u00ba"+
		"\u00bb\7\25\2\2\u00bb\u00bf\7\4\2\2\u00bc\u00be\5\4\3\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c9\7\5\2\2\u00c3\u00c4\7\30"+
		"\2\2\u00c4\u00c9\7\65\2\2\u00c5\u00c6\7\67\2\2\u00c6\u00c7\7\31\2\2\u00c7"+
		"\u00c9\7\67\2\2\u00c8\u008b\3\2\2\2\u00c8\u0090\3\2\2\2\u00c8\u00a6\3"+
		"\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\13\3\2\2\2\u00ca\u00cb\7\67\2\2\u00cb\u00cd\7\b\2\2\u00cc\u00ce\5*\26"+
		"\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00da"+
		"\7\t\2\2\u00d0\u00d1\7\67\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00d3\5,\27\2"+
		"\u00d3\u00d5\7\b\2\2\u00d4\u00d6\5*\26\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00ca\3\2\2\2\u00d9\u00d0\3\2\2\2\u00da\r\3\2\2\2\u00db\u00dc\t\4\2\2"+
		"\u00dc\17\3\2\2\2\u00dd\u00de\5\16\b\2\u00de\u00df\7\67\2\2\u00df\u00e6"+
		"\3\2\2\2\u00e0\u00e1\5\16\b\2\u00e1\u00e2\7\67\2\2\u00e2\u00e3\7\34\2"+
		"\2\u00e3\u00e4\5\20\t\2\u00e4\u00e6\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5"+
		"\u00e0\3\2\2\2\u00e6\21\3\2\2\2\u00e7\u00e8\5\32\16\2\u00e8\23\3\2\2\2"+
		"\u00e9\u00f3\7\65\2\2\u00ea\u00f3\7\67\2\2\u00eb\u00f3\5\f\7\2\u00ec\u00ed"+
		"\7\35\2\2\u00ed\u00f3\5\26\f\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\5\32\16"+
		"\2\u00f0\u00f1\7\t\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00ea"+
		"\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3"+
		"\25\3\2\2\2\u00f4\u00f5\5\30\r\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\5\26"+
		"\f\2\u00f7\u00fe\3\2\2\2\u00f8\u00f9\5\30\r\2\u00f9\u00fa\7\35\2\2\u00fa"+
		"\u00fb\5\26\f\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\30\r\2\u00fd\u00f4\3"+
		"\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\27\3\2\2\2\u00ff"+
		"\u0100\5\24\13\2\u0100\u0101\7\37\2\2\u0101\u0102\5\30\r\2\u0102\u0109"+
		"\3\2\2\2\u0103\u0104\5\24\13\2\u0104\u0105\7 \2\2\u0105\u0106\5\30\r\2"+
		"\u0106\u0109\3\2\2\2\u0107\u0109\5\24\13\2\u0108\u00ff\3\2\2\2\u0108\u0103"+
		"\3\2\2\2\u0108\u0107\3\2\2\2\u0109\31\3\2\2\2\u010a\u010b\5\34\17\2\u010b"+
		"\u010c\7!\2\2\u010c\u010d\5\32\16\2\u010d\u0110\3\2\2\2\u010e\u0110\5"+
		"\34\17\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110\33\3\2\2\2\u0111"+
		"\u0112\5\36\20\2\u0112\u0113\7\"\2\2\u0113\u0114\5\34\17\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0117\5\36\20\2\u0116\u0111\3\2\2\2\u0116\u0115\3\2\2\2"+
		"\u0117\35\3\2\2\2\u0118\u0119\5 \21\2\u0119\u011a\5\66\34\2\u011a\u011b"+
		"\5\36\20\2\u011b\u011e\3\2\2\2\u011c\u011e\5 \21\2\u011d\u0118\3\2\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\37\3\2\2\2\u011f\u0120\5\"\22\2\u0120\u0121"+
		"\5.\30\2\u0121\u0122\5 \21\2\u0122\u0125\3\2\2\2\u0123\u0125\5\"\22\2"+
		"\u0124\u011f\3\2\2\2\u0124\u0123\3\2\2\2\u0125!\3\2\2\2\u0126\u012b\5"+
		"\26\f\2\u0127\u012b\7\66\2\2\u0128\u0129\7#\2\2\u0129\u012b\5\32\16\2"+
		"\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012b#\3"+
		"\2\2\2\u012c\u012d\t\5\2\2\u012d%\3\2\2\2\u012e\u012f\7&\2\2\u012f\u0133"+
		"\7\4\2\2\u0130\u0132\5\4\3\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\7\5\2\2\u0137\'\3\2\2\2\u0138\u0139\7&\2\2\u0139\u013a"+
		"\7\22\2\2\u013a\u013b\7\b\2\2\u013b\u013c\5\32\16\2\u013c\u013d\7\t\2"+
		"\2\u013d\u013e\7\23\2\2\u013e\u0142\7\4\2\2\u013f\u0141\5\4\3\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\5\2\2\u0146"+
		")\3\2\2\2\u0147\u014d\5\32\16\2\u0148\u0149\5\32\16\2\u0149\u014a\7\34"+
		"\2\2\u014a\u014b\5*\26\2\u014b\u014d\3\2\2\2\u014c\u0147\3\2\2\2\u014c"+
		"\u0148\3\2\2\2\u014d+\3\2\2\2\u014e\u0152\5\60\31\2\u014f\u0152\5\62\32"+
		"\2\u0150\u0152\5\64\33\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152-\3\2\2\2\u0153\u0154\t\6\2\2\u0154/\3\2\2\2\u0155"+
		"\u0156\7-\2\2\u0156\u0157\7\b\2\2\u0157\u0162\7\65\2\2\u0158\u0159\5\26"+
		"\f\2\u0159\u015a\7\t\2\2\u015a\u0162\3\2\2\2\u015b\u015c\7.\2\2\u015c"+
		"\u015d\7\b\2\2\u015d\u0162\7\65\2\2\u015e\u015f\5\26\f\2\u015f\u0160\7"+
		"\t\2\2\u0160\u0162\3\2\2\2\u0161\u0155\3\2\2\2\u0161\u0158\3\2\2\2\u0161"+
		"\u015b\3\2\2\2\u0161\u015e\3\2\2\2\u0162\61\3\2\2\2\u0163\u0164\t\7\2"+
		"\2\u0164\63\3\2\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7\b\2\2\u0167\u0170"+
		"\5\f\7\2\u0168\u0169\5\32\16\2\u0169\u016a\7\t\2\2\u016a\u0170\3\2\2\2"+
		"\u016b\u016c\7\62\2\2\u016c\u016d\7\b\2\2\u016d\u016e\7\65\2\2\u016e\u0170"+
		"\7\t\2\2\u016f\u0165\3\2\2\2\u016f\u0168\3\2\2\2\u016f\u016b\3\2\2\2\u0170"+
		"\65\3\2\2\2\u0171\u0172\t\b\2\2\u0172\67\3\2\2\2#=DNU\\ipt\u0089\u0099"+
		"\u00a0\u00a4\u00af\u00bf\u00c8\u00cd\u00d5\u00d9\u00e5\u00f2\u00fd\u0108"+
		"\u010f\u0116\u011d\u0124\u012a\u0133\u0142\u014c\u0151\u0161\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}