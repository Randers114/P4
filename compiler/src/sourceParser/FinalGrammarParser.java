// Generated from C:/Users/Stefan/Desktop/4. Semester/Git/compiler/src/sourceParser\FinalGrammar.g4 by ANTLR 4.6
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, Num=44, Identifier=45, 
		Bool=46, WS=47;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_methods = 2, RULE_dcl = 3, RULE_stmt = 4, 
		RULE_call = 5, RULE_type = 6, RULE_fprmt = 7, RULE_returnval = 8, RULE_val = 9, 
		RULE_expr = 10, RULE_term = 11, RULE_r_boolean = 12, RULE_instancedcl = 13, 
		RULE_elsel = 14, RULE_elseif = 15, RULE_prmt = 16, RULE_statid = 17, RULE_boolexpr = 18, 
		RULE_boolvalop = 19, RULE_statmotorid = 20, RULE_statsensorid = 21, RULE_statlistid = 22, 
		RULE_boolop = 23;
	public static final String[] ruleNames = {
		"program", "body", "methods", "dcl", "stmt", "call", "type", "fprmt", 
		"returnval", "val", "expr", "term", "r_boolean", "instancedcl", "elsel", 
		"elseif", "prmt", "statid", "boolexpr", "boolvalop", "statmotorid", "statsensorid", 
		"statlistid", "boolop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'Method'", "'('", "')'", "'return'", 
		"'void'", "'='", "'new'", "'['", "']'", "'if'", "'then'", "'while'", "'do'", 
		"'for'", "'to'", "'.'", "'number'", "'bool'", "','", "'-'", "'+'", "'*'", 
		"'/'", "'not'", "'Motor'", "'Sensor'", "'List'", "'else'", "'smallerThan'", 
		"'greaterThan'", "'equal'", "'greaterThanOrEqual'", "'smallerThanOrEqual'", 
		"'notEqual'", "'motormethod'", "'sensormethod'", "'listmethod'", "'and'", 
		"'or'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "Num", "Identifier", "Bool", 
		"WS"
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
			setState(48);
			match(T__0);
			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(50);
				body();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__2);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				{
				setState(57);
				methods();
				}
				}
				setState(62);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				dcl();
				setState(64);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				call();
				setState(68);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				type();
				setState(73);
				match(T__4);
				setState(74);
				match(Identifier);
				setState(75);
				match(T__5);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20 || _la==T__21) {
					{
					setState(76);
					fprmt();
					}
				}

				setState(79);
				match(T__6);
				setState(80);
				match(T__1);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(81);
					body();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(T__7);
				setState(88);
				returnval();
				setState(89);
				match(T__3);
				setState(90);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__8);
				setState(93);
				match(T__4);
				setState(94);
				match(Identifier);
				setState(95);
				match(T__5);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20 || _la==T__21) {
					{
					setState(96);
					fprmt();
					}
				}

				setState(99);
				match(T__6);
				setState(100);
				match(T__1);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(101);
					body();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				type();
				setState(111);
				match(Identifier);
				setState(112);
				match(T__9);
				setState(113);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				type();
				setState(116);
				match(Identifier);
				setState(117);
				match(T__9);
				setState(118);
				r_boolean();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				type();
				setState(121);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__10);
				setState(124);
				instancedcl();
				setState(125);
				match(T__11);
				setState(126);
				match(Identifier);
				setState(127);
				match(T__12);
				setState(128);
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
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
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
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Identifier);
				setState(133);
				match(T__9);
				setState(134);
				expr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__13);
				setState(136);
				match(T__5);
				setState(137);
				r_boolean();
				setState(138);
				match(T__6);
				setState(139);
				match(T__14);
				setState(140);
				match(T__1);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(141);
					body();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__2);
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						elseif();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(154);
					elsel();
					}
				}

				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__15);
				setState(158);
				match(T__5);
				setState(159);
				r_boolean();
				setState(160);
				match(T__6);
				setState(161);
				match(T__16);
				setState(162);
				match(T__1);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(163);
					body();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__2);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(T__17);
				setState(172);
				match(T__5);
				setState(173);
				match(Num);
				setState(174);
				match(T__18);
				setState(175);
				match(Num);
				setState(176);
				match(T__6);
				setState(177);
				match(T__16);
				setState(178);
				match(T__1);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(179);
					body();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(Identifier);
				setState(189);
				match(T__5);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << Num) | (1L << Identifier))) != 0)) {
					{
					setState(190);
					prmt();
					}
				}

				setState(193);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(Identifier);
				setState(195);
				match(T__19);
				setState(196);
				statid();
				setState(197);
				match(T__5);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << Num) | (1L << Identifier))) != 0)) {
					{
					setState(198);
					prmt();
					}
				}

				setState(201);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
		enterRule(_localctx, 14, RULE_fprmt);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				type();
				setState(208);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				type();
				setState(211);
				match(Identifier);
				setState(212);
				match(T__22);
				setState(213);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
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
		enterRule(_localctx, 16, RULE_returnval);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				boolexpr();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(FinalGrammarParser.Num, 0); }
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 18, RULE_val);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(T__5);
				setState(225);
				expr();
				setState(226);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(T__23);
				setState(229);
				expr();
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
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				term();
				setState(233);
				match(T__24);
				setState(234);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				term();
				setState(237);
				match(T__23);
				setState(238);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
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
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				val();
				setState(244);
				match(T__25);
				setState(245);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				val();
				setState(248);
				match(T__26);
				setState(249);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
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

	public static class R_booleanContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolvalopContext boolvalop() {
			return getRuleContext(BoolvalopContext.class,0);
		}
		public R_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterR_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitR_boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitR_boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_booleanContext r_boolean() throws RecognitionException {
		R_booleanContext _localctx = new R_booleanContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_r_boolean);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(255);
					match(T__27);
					}
				}

				setState(258);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				boolexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				expr();
				setState(261);
				boolvalop();
				setState(262);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(Identifier);
				setState(265);
				boolvalop();
				setState(266);
				expr();
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
		enterRule(_localctx, 26, RULE_instancedcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_elsel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__31);
			setState(273);
			match(T__1);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(274);
				body();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
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
		enterRule(_localctx, 30, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__31);
			setState(283);
			match(T__13);
			setState(284);
			match(T__5);
			setState(285);
			r_boolean();
			setState(286);
			match(T__6);
			setState(287);
			match(T__14);
			setState(288);
			match(T__1);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(289);
				body();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
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
		enterRule(_localctx, 32, RULE_prmt);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				val();
				setState(299);
				match(T__22);
				setState(300);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitStatid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatidContext statid() throws RecognitionException {
		StatidContext _localctx = new StatidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statid);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				statmotorid();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				statsensorid();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
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

	public static class BoolexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolvalopContext boolvalop() {
			return getRuleContext(BoolvalopContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode Bool() { return getToken(FinalGrammarParser.Bool, 0); }
		public BoolopContext boolop() {
			return getRuleContext(BoolopContext.class,0);
		}
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FinalGrammarParser.Identifier, 0); }
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FinalGrammarListener ) ((FinalGrammarListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolexpr);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				expr();
				setState(310);
				boolvalop();
				setState(311);
				boolexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(Bool);
				setState(314);
				boolop();
				setState(315);
				r_boolean();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				call();
				setState(318);
				boolop();
				setState(319);
				r_boolean();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(Identifier);
				setState(322);
				boolop();
				setState(323);
				r_boolean();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(T__27);
				setState(326);
				match(Bool);
				setState(327);
				boolop();
				setState(328);
				r_boolean();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				match(T__27);
				setState(331);
				call();
				setState(332);
				boolop();
				setState(333);
				r_boolean();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
				match(T__27);
				setState(336);
				match(Identifier);
				setState(337);
				boolop();
				setState(338);
				r_boolean();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitBoolvalop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolvalopContext boolvalop() throws RecognitionException {
		BoolvalopContext _localctx = new BoolvalopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolvalop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitStatmotorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmotoridContext statmotorid() throws RecognitionException {
		StatmotoridContext _localctx = new StatmotoridContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statmotorid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__38);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitStatsensorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsensoridContext statsensorid() throws RecognitionException {
		StatsensoridContext _localctx = new StatsensoridContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statsensorid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__39);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FinalGrammarVisitor ) return ((FinalGrammarVisitor<? extends T>)visitor).visitStatlistid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatlistidContext statlistid() throws RecognitionException {
		StatlistidContext _localctx = new StatlistidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statlistid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__40);
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
		enterRule(_localctx, 46, RULE_boolop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__37) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0163\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4"+
		"\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4d\n\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\5\4o\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0085\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f"+
		"\6\16\6\u0094\13\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\5\6\u009e"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b7\n\6\f\6\16\6\u00ba"+
		"\13\6\3\6\5\6\u00bd\n\6\3\7\3\7\3\7\5\7\u00c2\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00ca\n\7\3\7\3\7\5\7\u00ce\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00da\n\t\3\n\3\n\5\n\u00de\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00e9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00f4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ff\n\r\3\16"+
		"\3\16\5\16\u0103\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u010f\n\16\3\17\3\17\3\20\3\20\3\20\7\20\u0116\n\20\f\20\16\20\u0119"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0125\n"+
		"\21\f\21\16\21\u0128\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0131"+
		"\n\22\3\23\3\23\3\23\5\23\u0136\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0157\n\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\27\30\3\2\37!\3\2#(\5"+
		"\2%%((,-\u017b\2\62\3\2\2\2\4H\3\2\2\2\6n\3\2\2\2\b\u0084\3\2\2\2\n\u00bc"+
		"\3\2\2\2\f\u00cd\3\2\2\2\16\u00cf\3\2\2\2\20\u00d9\3\2\2\2\22\u00dd\3"+
		"\2\2\2\24\u00e8\3\2\2\2\26\u00f3\3\2\2\2\30\u00fe\3\2\2\2\32\u010e\3\2"+
		"\2\2\34\u0110\3\2\2\2\36\u0112\3\2\2\2 \u011c\3\2\2\2\"\u0130\3\2\2\2"+
		"$\u0135\3\2\2\2&\u0156\3\2\2\2(\u0158\3\2\2\2*\u015a\3\2\2\2,\u015c\3"+
		"\2\2\2.\u015e\3\2\2\2\60\u0160\3\2\2\2\62\63\7\3\2\2\63\67\7\4\2\2\64"+
		"\66\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2"+
		"\2\29\67\3\2\2\2:>\7\5\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?\3\3\2\2\2@>\3\2\2\2AB\5\b\5\2BC\7\6\2\2CI\3\2\2\2DI\5\n\6\2EF"+
		"\5\f\7\2FG\7\6\2\2GI\3\2\2\2HA\3\2\2\2HD\3\2\2\2HE\3\2\2\2I\5\3\2\2\2"+
		"JK\5\16\b\2KL\7\7\2\2LM\7/\2\2MO\7\b\2\2NP\5\20\t\2ON\3\2\2\2OP\3\2\2"+
		"\2PQ\3\2\2\2QR\7\t\2\2RV\7\4\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\n\2\2Z[\5\22\n\2[\\\7\6\2\2\\]\7"+
		"\5\2\2]o\3\2\2\2^_\7\13\2\2_`\7\7\2\2`a\7/\2\2ac\7\b\2\2bd\5\20\t\2cb"+
		"\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\t\2\2fj\7\4\2\2gi\5\4\3\2hg\3\2\2\2i"+
		"l\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mo\7\5\2\2nJ\3\2\2\2"+
		"n^\3\2\2\2o\7\3\2\2\2pq\5\16\b\2qr\7/\2\2rs\7\f\2\2st\5\26\f\2t\u0085"+
		"\3\2\2\2uv\5\16\b\2vw\7/\2\2wx\7\f\2\2xy\5\32\16\2y\u0085\3\2\2\2z{\5"+
		"\16\b\2{|\7/\2\2|\u0085\3\2\2\2}~\7\r\2\2~\177\5\34\17\2\177\u0080\7\16"+
		"\2\2\u0080\u0081\7/\2\2\u0081\u0082\7\17\2\2\u0082\u0083\7/\2\2\u0083"+
		"\u0085\3\2\2\2\u0084p\3\2\2\2\u0084u\3\2\2\2\u0084z\3\2\2\2\u0084}\3\2"+
		"\2\2\u0085\t\3\2\2\2\u0086\u0087\7/\2\2\u0087\u0088\7\f\2\2\u0088\u00bd"+
		"\5\26\f\2\u0089\u008a\7\20\2\2\u008a\u008b\7\b\2\2\u008b\u008c\5\32\16"+
		"\2\u008c\u008d\7\t\2\2\u008d\u008e\7\21\2\2\u008e\u0092\7\4\2\2\u008f"+
		"\u0091\5\4\3\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0099\7\5\2\2\u0096\u0098\5 \21\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u00bd\3\2\2\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\7\b\2\2\u00a1"+
		"\u00a2\5\32\16\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a8"+
		"\7\4\2\2\u00a5\u00a7\5\4\3\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00bd\3\2\2\2\u00ad\u00ae\7\24\2\2\u00ae"+
		"\u00af\7\b\2\2\u00af\u00b0\7.\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\7."+
		"\2\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b8\7\4\2\2\u00b5"+
		"\u00b7\5\4\3\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\7\5\2\2\u00bc\u0086\3\2\2\2\u00bc\u0089\3\2\2\2\u00bc\u009f\3\2"+
		"\2\2\u00bc\u00ad\3\2\2\2\u00bd\13\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c1"+
		"\7\b\2\2\u00c0\u00c2\5\"\22\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3\u00ce\7\t\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6"+
		"\7\26\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c9\7\b\2\2\u00c8\u00ca\5\"\22\2"+
		"\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\7\t\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00be\3\2\2\2\u00cd\u00c4\3\2\2\2\u00ce"+
		"\r\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0\17\3\2\2\2\u00d1\u00d2\5\16\b\2\u00d2"+
		"\u00d3\7/\2\2\u00d3\u00da\3\2\2\2\u00d4\u00d5\5\16\b\2\u00d5\u00d6\7/"+
		"\2\2\u00d6\u00d7\7\31\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d1\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\21\3\2\2\2\u00db\u00de\5\26\f"+
		"\2\u00dc\u00de\5&\24\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\23"+
		"\3\2\2\2\u00df\u00e9\7.\2\2\u00e0\u00e9\7/\2\2\u00e1\u00e9\5\f\7\2\u00e2"+
		"\u00e3\7\b\2\2\u00e3\u00e4\5\26\f\2\u00e4\u00e5\7\t\2\2\u00e5\u00e9\3"+
		"\2\2\2\u00e6\u00e7\7\32\2\2\u00e7\u00e9\5\26\f\2\u00e8\u00df\3\2\2\2\u00e8"+
		"\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\25\3\2\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\7\33\2\2\u00ec"+
		"\u00ed\5\26\f\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\7"+
		"\32\2\2\u00f0\u00f1\5\26\f\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\5\30\r\2"+
		"\u00f3\u00ea\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\27"+
		"\3\2\2\2\u00f5\u00f6\5\24\13\2\u00f6\u00f7\7\34\2\2\u00f7\u00f8\5\30\r"+
		"\2\u00f8\u00ff\3\2\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00fb\7\35\2\2\u00fb"+
		"\u00fc\5\30\r\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\5\24\13\2\u00fe\u00f5"+
		"\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\31\3\2\2\2\u0100"+
		"\u010f\5\f\7\2\u0101\u0103\7\36\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u010f\7/\2\2\u0105\u010f\5&\24\2\u0106"+
		"\u0107\5\26\f\2\u0107\u0108\5(\25\2\u0108\u0109\7/\2\2\u0109\u010f\3\2"+
		"\2\2\u010a\u010b\7/\2\2\u010b\u010c\5(\25\2\u010c\u010d\5\26\f\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0100\3\2\2\2\u010e\u0102\3\2\2\2\u010e\u0105\3\2"+
		"\2\2\u010e\u0106\3\2\2\2\u010e\u010a\3\2\2\2\u010f\33\3\2\2\2\u0110\u0111"+
		"\t\3\2\2\u0111\35\3\2\2\2\u0112\u0113\7\"\2\2\u0113\u0117\7\4\2\2\u0114"+
		"\u0116\5\4\3\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7\5\2\2\u011b\37\3\2\2\2\u011c\u011d\7\"\2\2\u011d\u011e\7\20\2"+
		"\2\u011e\u011f\7\b\2\2\u011f\u0120\5\32\16\2\u0120\u0121\7\t\2\2\u0121"+
		"\u0122\7\21\2\2\u0122\u0126\7\4\2\2\u0123\u0125\5\4\3\2\u0124\u0123\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\5\2\2\u012a!\3\2\2\2"+
		"\u012b\u0131\5\24\13\2\u012c\u012d\5\24\13\2\u012d\u012e\7\31\2\2\u012e"+
		"\u012f\5\"\22\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3"+
		"\2\2\2\u0131#\3\2\2\2\u0132\u0136\5*\26\2\u0133\u0136\5,\27\2\u0134\u0136"+
		"\5.\30\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"%\3\2\2\2\u0137\u0138\5\26\f\2\u0138\u0139\5(\25\2\u0139\u013a\5&\24\2"+
		"\u013a\u0157\3\2\2\2\u013b\u013c\7\60\2\2\u013c\u013d\5\60\31\2\u013d"+
		"\u013e\5\32\16\2\u013e\u0157\3\2\2\2\u013f\u0140\5\f\7\2\u0140\u0141\5"+
		"\60\31\2\u0141\u0142\5\32\16\2\u0142\u0157\3\2\2\2\u0143\u0144\7/\2\2"+
		"\u0144\u0145\5\60\31\2\u0145\u0146\5\32\16\2\u0146\u0157\3\2\2\2\u0147"+
		"\u0148\7\36\2\2\u0148\u0149\7\60\2\2\u0149\u014a\5\60\31\2\u014a\u014b"+
		"\5\32\16\2\u014b\u0157\3\2\2\2\u014c\u014d\7\36\2\2\u014d\u014e\5\f\7"+
		"\2\u014e\u014f\5\60\31\2\u014f\u0150\5\32\16\2\u0150\u0157\3\2\2\2\u0151"+
		"\u0152\7\36\2\2\u0152\u0153\7/\2\2\u0153\u0154\5\60\31\2\u0154\u0155\5"+
		"\32\16\2\u0155\u0157\3\2\2\2\u0156\u0137\3\2\2\2\u0156\u013b\3\2\2\2\u0156"+
		"\u013f\3\2\2\2\u0156\u0143\3\2\2\2\u0156\u0147\3\2\2\2\u0156\u014c\3\2"+
		"\2\2\u0156\u0151\3\2\2\2\u0157\'\3\2\2\2\u0158\u0159\t\4\2\2\u0159)\3"+
		"\2\2\2\u015a\u015b\7)\2\2\u015b+\3\2\2\2\u015c\u015d\7*\2\2\u015d-\3\2"+
		"\2\2\u015e\u015f\7+\2\2\u015f/\3\2\2\2\u0160\u0161\t\5\2\2\u0161\61\3"+
		"\2\2\2 \67>HOVcjn\u0084\u0092\u0099\u009d\u00a8\u00b8\u00bc\u00c1\u00c9"+
		"\u00cd\u00d9\u00dd\u00e8\u00f3\u00fe\u0102\u010e\u0117\u0126\u0130\u0135"+
		"\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}