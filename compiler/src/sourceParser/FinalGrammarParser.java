// Generated from C:/Users/Nikolaj/Documents/P4/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.7
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
		T__45=46, T__46=47, COMMENT=48, LINE_COMMENT=49, Num=50, Bool=51, Identifier=52, 
		WS=53;
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
		"'void'", "'='", "'['", "']'", "'List'", "'if'", "'then'", "'while'", 
		"'do'", "'for'", "'to'", "'Sleep'", "'synchronize'", "'.'", "'number'", 
		"'bool'", "','", "'-'", "'+'", "'*'", "'/'", "'and'", "'or'", "'not'", 
		"'Motor'", "'Sensor'", "'else'", "'lessThan'", "'greaterThan'", "'equal'", 
		"'greaterThanOrEqual'", "'lessThanOrEqual'", "'notEqual'", "'Forward'", 
		"'Backwards'", "'IsPressed()'", "'Distance()'", "'Add'", "'Remove'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"COMMENT", "LINE_COMMENT", "Num", "Bool", "Identifier", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__22) | (1L << T__23))) != 0)) {
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
			case T__22:
			case T__23:
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
				if (_la==T__22 || _la==T__23) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
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
				if (_la==T__22 || _la==T__23) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
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
		try {
			setState(136);
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
				type();
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(Identifier);
				setState(139);
				match(T__9);
				setState(140);
				b();
				setState(141);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__13);
				setState(144);
				match(T__5);
				setState(145);
				b();
				setState(146);
				match(T__6);
				setState(147);
				match(T__14);
				setState(148);
				match(T__1);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
					{
					{
					setState(149);
					body();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__2);
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(156);
						elseif();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(162);
					elsel();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(T__15);
				setState(166);
				match(T__5);
				setState(167);
				b();
				setState(168);
				match(T__6);
				setState(169);
				match(T__16);
				setState(170);
				match(T__1);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
					{
					{
					setState(171);
					body();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(T__17);
				setState(180);
				match(T__5);
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==Num || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(T__18);
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
				match(T__6);
				setState(185);
				match(T__16);
				setState(186);
				match(T__1);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
					{
					{
					setState(187);
					body();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(T__19);
				{
				setState(195);
				match(Num);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(Identifier);
				setState(197);
				match(T__20);
				setState(198);
				match(Identifier);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Num) {
					{
					setState(199);
					match(Num);
					}
				}

				setState(202);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(Identifier);
				setState(206);
				match(T__5);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__25) | (1L << T__31) | (1L << Num) | (1L << Bool) | (1L << Identifier))) != 0)) {
					{
					setState(207);
					prmt();
					}
				}

				setState(210);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(Identifier);
				setState(212);
				match(T__21);
				setState(213);
				statid();
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
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				type();
				setState(219);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				type();
				setState(222);
				match(Identifier);
				setState(223);
				match(T__24);
				setState(224);
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
			setState(228);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__25);
				setState(234);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(T__5);
				setState(236);
				b();
				setState(237);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				term();
				setState(242);
				match(T__26);
				setState(243);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				term();
				setState(246);
				match(T__25);
				setState(247);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				val();
				setState(253);
				match(T__27);
				setState(254);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				val();
				setState(257);
				match(T__28);
				setState(258);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				t();
				setState(264);
				match(T__29);
				setState(265);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				f();
				setState(271);
				match(T__30);
				setState(272);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				h();
				setState(278);
				boolop();
				setState(279);
				f();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				i();
				setState(285);
				boolvalop();
				setState(286);
				h();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__25:
			case Num:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				expr();
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(Bool);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(T__31);
				setState(294);
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
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
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
			setState(299);
			match(T__34);
			setState(300);
			match(T__1);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
				{
				{
				setState(301);
				body();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
			setState(309);
			match(T__34);
			setState(310);
			match(T__13);
			setState(311);
			match(T__5);
			setState(312);
			b();
			setState(313);
			match(T__6);
			setState(314);
			match(T__14);
			setState(315);
			match(T__1);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__32) | (1L << T__33) | (1L << Identifier))) != 0)) {
				{
				{
				setState(316);
				body();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				b();
				setState(326);
				match(T__24);
				setState(327);
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
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				statmotorid();
				}
				break;
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				statsensorid();
				}
				break;
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				statlistid();
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
	}

	public final BoolvalopContext boolvalop() throws RecognitionException {
		BoolvalopContext _localctx = new BoolvalopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolvalop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(T__41);
				setState(339);
				match(T__5);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(340);
					match(Num);
					}
					break;
				case 2:
					{
					setState(341);
					expr();
					}
					break;
				}
				setState(344);
				match(T__6);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(T__42);
				setState(346);
				match(T__5);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(347);
					match(Num);
					}
					break;
				case 2:
					{
					setState(348);
					expr();
					}
					break;
				}
				setState(351);
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
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__45);
				setState(357);
				match(T__5);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(358);
					call();
					}
					break;
				case 2:
					{
					setState(359);
					b();
					}
					break;
				}
				setState(362);
				match(T__6);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(T__46);
				setState(365);
				match(T__5);
				setState(366);
				match(Num);
				setState(367);
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
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__40) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0177\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\7\4o\n\4\f\4\16"+
		"\4r\13\4\3\4\5\4u\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6\7\6"+
		"\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\5\6\u00a6\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u00af\n\6\f\6\16\6\u00b2\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00cb\n\6\3\6\5\6\u00ce\n\6\3\7\3\7\3\7\5\7\u00d3\n\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00d9\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e5"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f2\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fd\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0108\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u010f"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0116\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u011d\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0124\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u012a\n\22\3\23\3\23\3\24\3\24\3\24\7\24\u0131\n\24\f\24"+
		"\16\24\u0134\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7"+
		"\25\u0140\n\25\f\25\16\25\u0143\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u014c\n\26\3\27\3\27\3\27\5\27\u0151\n\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0159\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0160\n\31\3"+
		"\31\5\31\u0163\n\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u016b\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0173\n\33\3\34\3\34\3\34\2\2\35\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\4\2\64\64\66"+
		"\66\3\2\31\32\3\2#$\3\2&+\3\2./\4\2((++\2\u018d\28\3\2\2\2\4N\3\2\2\2"+
		"\6t\3\2\2\2\b\u008a\3\2\2\2\n\u00cd\3\2\2\2\f\u00d8\3\2\2\2\16\u00da\3"+
		"\2\2\2\20\u00e4\3\2\2\2\22\u00e6\3\2\2\2\24\u00f1\3\2\2\2\26\u00fc\3\2"+
		"\2\2\30\u0107\3\2\2\2\32\u010e\3\2\2\2\34\u0115\3\2\2\2\36\u011c\3\2\2"+
		"\2 \u0123\3\2\2\2\"\u0129\3\2\2\2$\u012b\3\2\2\2&\u012d\3\2\2\2(\u0137"+
		"\3\2\2\2*\u014b\3\2\2\2,\u0150\3\2\2\2.\u0152\3\2\2\2\60\u0162\3\2\2\2"+
		"\62\u0164\3\2\2\2\64\u0172\3\2\2\2\66\u0174\3\2\2\289\7\3\2\29=\7\4\2"+
		"\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2"+
		"\2@D\7\5\2\2AC\5\6\4\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2"+
		"\2\2FD\3\2\2\2GH\5\b\5\2HI\7\6\2\2IO\3\2\2\2JO\5\n\6\2KL\5\f\7\2LM\7\6"+
		"\2\2MO\3\2\2\2NG\3\2\2\2NJ\3\2\2\2NK\3\2\2\2O\5\3\2\2\2PQ\5\16\b\2QR\7"+
		"\7\2\2RS\7\66\2\2SU\7\b\2\2TV\5\20\t\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W"+
		"X\7\t\2\2X\\\7\4\2\2Y[\5\4\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]_\3\2\2\2^\\\3\2\2\2_`\7\n\2\2`a\5\22\n\2ab\7\6\2\2bc\7\5\2\2cu\3\2"+
		"\2\2de\7\13\2\2ef\7\7\2\2fg\7\66\2\2gi\7\b\2\2hj\5\20\t\2ih\3\2\2\2ij"+
		"\3\2\2\2jk\3\2\2\2kl\7\t\2\2lp\7\4\2\2mo\5\4\3\2nm\3\2\2\2or\3\2\2\2p"+
		"n\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7\5\2\2tP\3\2\2\2td\3\2\2\2"+
		"u\7\3\2\2\2vw\5\16\b\2wx\7\66\2\2xy\7\f\2\2yz\5\32\16\2z\u008b\3\2\2\2"+
		"{|\5\16\b\2|}\7\66\2\2}\u008b\3\2\2\2~\177\5$\23\2\177\u0080\7\r\2\2\u0080"+
		"\u0081\7\66\2\2\u0081\u0082\7\16\2\2\u0082\u0083\7\66\2\2\u0083\u008b"+
		"\3\2\2\2\u0084\u0085\7\17\2\2\u0085\u0086\7\r\2\2\u0086\u0087\5\16\b\2"+
		"\u0087\u0088\7\16\2\2\u0088\u0089\7\66\2\2\u0089\u008b\3\2\2\2\u008av"+
		"\3\2\2\2\u008a{\3\2\2\2\u008a~\3\2\2\2\u008a\u0084\3\2\2\2\u008b\t\3\2"+
		"\2\2\u008c\u008d\7\66\2\2\u008d\u008e\7\f\2\2\u008e\u008f\5\32\16\2\u008f"+
		"\u0090\7\6\2\2\u0090\u00ce\3\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\7"+
		"\b\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\t\2\2\u0095\u0096\7\21\2\2"+
		"\u0096\u009a\7\4\2\2\u0097\u0099\5\4\3\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a1\7\5\2\2\u009e\u00a0\5(\25\2\u009f\u009e\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5&\24\2\u00a5\u00a4\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ce\3\2\2\2\u00a7\u00a8\7\22\2\2\u00a8"+
		"\u00a9\7\b\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\7"+
		"\23\2\2\u00ac\u00b0\7\4\2\2\u00ad\u00af\5\4\3\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00ce\3\2\2\2\u00b5"+
		"\u00b6\7\24\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00b9\7"+
		"\25\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\7\23\2\2\u00bc"+
		"\u00c0\7\4\2\2\u00bd\u00bf\5\4\3\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00ce\7\5\2\2\u00c4\u00c5\7\26\2\2\u00c5\u00ce\7"+
		"\64\2\2\u00c6\u00c7\7\66\2\2\u00c7\u00c8\7\27\2\2\u00c8\u00ca\7\66\2\2"+
		"\u00c9\u00cb\7\64\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\7\6\2\2\u00cd\u008c\3\2\2\2\u00cd\u0091\3\2\2\2\u00cd"+
		"\u00a7\3\2\2\2\u00cd\u00b5\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c6\3\2"+
		"\2\2\u00ce\13\3\2\2\2\u00cf\u00d0\7\66\2\2\u00d0\u00d2\7\b\2\2\u00d1\u00d3"+
		"\5*\26\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d9\7\t\2\2\u00d5\u00d6\7\66\2\2\u00d6\u00d7\7\30\2\2\u00d7\u00d9\5"+
		",\27\2\u00d8\u00cf\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\r\3\2\2\2\u00da\u00db"+
		"\t\3\2\2\u00db\17\3\2\2\2\u00dc\u00dd\5\16\b\2\u00dd\u00de\7\66\2\2\u00de"+
		"\u00e5\3\2\2\2\u00df\u00e0\5\16\b\2\u00e0\u00e1\7\66\2\2\u00e1\u00e2\7"+
		"\33\2\2\u00e2\u00e3\5\20\t\2\u00e3\u00e5\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e5\21\3\2\2\2\u00e6\u00e7\5\32\16\2\u00e7\23\3\2\2\2"+
		"\u00e8\u00f2\7\64\2\2\u00e9\u00f2\7\66\2\2\u00ea\u00f2\5\f\7\2\u00eb\u00ec"+
		"\7\34\2\2\u00ec\u00f2\5\26\f\2\u00ed\u00ee\7\b\2\2\u00ee\u00ef\5\32\16"+
		"\2\u00ef\u00f0\7\t\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00e9"+
		"\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2"+
		"\25\3\2\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\7\35\2\2\u00f5\u00f6\5\26"+
		"\f\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\5\30\r\2\u00f8\u00f9\7\34\2\2\u00f9"+
		"\u00fa\5\26\f\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\5\30\r\2\u00fc\u00f3\3"+
		"\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\27\3\2\2\2\u00fe"+
		"\u00ff\5\24\13\2\u00ff\u0100\7\36\2\2\u0100\u0101\5\30\r\2\u0101\u0108"+
		"\3\2\2\2\u0102\u0103\5\24\13\2\u0103\u0104\7\37\2\2\u0104\u0105\5\30\r"+
		"\2\u0105\u0108\3\2\2\2\u0106\u0108\5\24\13\2\u0107\u00fe\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0107\u0106\3\2\2\2\u0108\31\3\2\2\2\u0109\u010a\5\34\17"+
		"\2\u010a\u010b\7 \2\2\u010b\u010c\5\32\16\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010f\5\34\17\2\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f\33\3\2"+
		"\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7!\2\2\u0112\u0113\5\34\17\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0116\5\36\20\2\u0115\u0110\3\2\2\2\u0115\u0114\3"+
		"\2\2\2\u0116\35\3\2\2\2\u0117\u0118\5 \21\2\u0118\u0119\5\66\34\2\u0119"+
		"\u011a\5\36\20\2\u011a\u011d\3\2\2\2\u011b\u011d\5 \21\2\u011c\u0117\3"+
		"\2\2\2\u011c\u011b\3\2\2\2\u011d\37\3\2\2\2\u011e\u011f\5\"\22\2\u011f"+
		"\u0120\5.\30\2\u0120\u0121\5 \21\2\u0121\u0124\3\2\2\2\u0122\u0124\5\""+
		"\22\2\u0123\u011e\3\2\2\2\u0123\u0122\3\2\2\2\u0124!\3\2\2\2\u0125\u012a"+
		"\5\26\f\2\u0126\u012a\7\65\2\2\u0127\u0128\7\"\2\2\u0128\u012a\5\32\16"+
		"\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u012a#"+
		"\3\2\2\2\u012b\u012c\t\4\2\2\u012c%\3\2\2\2\u012d\u012e\7%\2\2\u012e\u0132"+
		"\7\4\2\2\u012f\u0131\5\4\3\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0136\7\5\2\2\u0136\'\3\2\2\2\u0137\u0138\7%\2\2\u0138\u0139"+
		"\7\20\2\2\u0139\u013a\7\b\2\2\u013a\u013b\5\32\16\2\u013b\u013c\7\t\2"+
		"\2\u013c\u013d\7\21\2\2\u013d\u0141\7\4\2\2\u013e\u0140\5\4\3\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\5\2\2\u0145"+
		")\3\2\2\2\u0146\u014c\5\32\16\2\u0147\u0148\5\32\16\2\u0148\u0149\7\33"+
		"\2\2\u0149\u014a\5*\26\2\u014a\u014c\3\2\2\2\u014b\u0146\3\2\2\2\u014b"+
		"\u0147\3\2\2\2\u014c+\3\2\2\2\u014d\u0151\5\60\31\2\u014e\u0151\5\62\32"+
		"\2\u014f\u0151\5\64\33\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151-\3\2\2\2\u0152\u0153\t\5\2\2\u0153/\3\2\2\2\u0154"+
		"\u0155\7,\2\2\u0155\u0158\7\b\2\2\u0156\u0159\7\64\2\2\u0157\u0159\5\26"+
		"\f\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u0163\7\t\2\2\u015b\u015c\7-\2\2\u015c\u015f\7\b\2\2\u015d\u0160\7\64"+
		"\2\2\u015e\u0160\5\26\f\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\7\t\2\2\u0162\u0154\3\2\2\2\u0162\u015b\3\2"+
		"\2\2\u0163\61\3\2\2\2\u0164\u0165\t\6\2\2\u0165\63\3\2\2\2\u0166\u0167"+
		"\7\60\2\2\u0167\u016a\7\b\2\2\u0168\u016b\5\f\7\2\u0169\u016b\5\32\16"+
		"\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\7\t\2\2\u016d\u0173\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\b\2\2"+
		"\u0170\u0171\7\64\2\2\u0171\u0173\7\t\2\2\u0172\u0166\3\2\2\2\u0172\u016e"+
		"\3\2\2\2\u0173\65\3\2\2\2\u0174\u0175\t\7\2\2\u0175\67\3\2\2\2&=DNU\\"+
		"ipt\u008a\u009a\u00a1\u00a5\u00b0\u00c0\u00ca\u00cd\u00d2\u00d8\u00e4"+
		"\u00f1\u00fc\u0107\u010e\u0115\u011c\u0123\u0129\u0132\u0141\u014b\u0150"+
		"\u0158\u015f\u0162\u016a\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}