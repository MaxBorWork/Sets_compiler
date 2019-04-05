// Generated from /home/maksim/IdeaProjects/sets_compiler/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, OPEN_BRACKET=2, CLOSE_BRACKET=3, OPEN_CURLY_BRACKET=4, CLOSE_CURLY_BRACKET=5, 
		OPEN_SQUARE_BRACKET=6, CLOSE_SQUARE_BRACKET=7, ELEMENT=8, SET=9, PRINT=10, 
		IF=11, ELSE=12, FOR=13, WHILE=14, RETURN=15, FUNCTION=16, SIZE=17, GET=18, 
		INDEX_OF=19, EQUALS=20, DOT=21, COMMA=22, PLUS=23, MINUS=24, MULTIPLY=25, 
		DIVIDE=26, NEGATION=27, EQUAL=28, NON_EQUAL=29, LESS=30, GREATER=31, SPACE=32, 
		NAME=33, NUMBER=34, LINE=35;
	public static final int
		RULE_setExpression = 0, RULE_program = 1, RULE_block = 2, RULE_declaration = 3, 
		RULE_declarationElement = 4, RULE_print = 5, RULE_printSet = 6, RULE_inputSignature = 7, 
		RULE_functionCall = 8, RULE_type = 9, RULE_signatureFunction = 10, RULE_functionReturn = 11, 
		RULE_functionNonReturn = 12, RULE_blockReturn = 13, RULE_blockNonReturn = 14, 
		RULE_equalCompare = 15, RULE_compare = 16, RULE_simpleCompare = 17, RULE_negationCompare = 18, 
		RULE_ifBlock = 19, RULE_elseBlock = 20, RULE_whileBlock = 21, RULE_sizeExpression = 22, 
		RULE_getExpression = 23, RULE_indexOfExpression = 24, RULE_expression = 25, 
		RULE_content = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"setExpression", "program", "block", "declaration", "declarationElement", 
			"print", "printSet", "inputSignature", "functionCall", "type", "signatureFunction", 
			"functionReturn", "functionNonReturn", "blockReturn", "blockNonReturn", 
			"equalCompare", "compare", "simpleCompare", "negationCompare", "ifBlock", 
			"elseBlock", "whileBlock", "sizeExpression", "getExpression", "indexOfExpression", 
			"expression", "content"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'element'", 
			"'set'", "'print'", "'if'", "'else'", "'for'", "'while'", "'return'", 
			"'func'", "'size'", "'get'", "'indexOf'", "'='", "'.'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'!'", "'=='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", 
			"CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
			"ELEMENT", "SET", "PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", 
			"SIZE", "GET", "INDEX_OF", "EQUALS", "DOT", "COMMA", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "GREATER", 
			"SPACE", "NAME", "NUMBER", "LINE"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SetExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(HelloParser.OPEN_CURLY_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(HelloParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HelloParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HelloParser.COMMA, i);
		}
		public SetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExpressionContext setExpression() throws RecognitionException {
		SetExpressionContext _localctx = new SetExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_setExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OPEN_CURLY_BRACKET);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					match(NAME);
					setState(56);
					match(COMMA);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			match(NAME);
			setState(63);
			match(CLOSE_CURLY_BRACKET);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(HelloParser.FUNCTION, 0); }
		public TerminalNode MAIN() { return getToken(HelloParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FunctionReturnContext> functionReturn() {
			return getRuleContexts(FunctionReturnContext.class);
		}
		public FunctionReturnContext functionReturn(int i) {
			return getRuleContext(FunctionReturnContext.class,i);
		}
		public List<FunctionNonReturnContext> functionNonReturn() {
			return getRuleContexts(FunctionNonReturnContext.class);
		}
		public FunctionNonReturnContext functionNonReturn(int i) {
			return getRuleContext(FunctionNonReturnContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FUNCTION);
			setState(66);
			match(MAIN);
			setState(67);
			block();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(68);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(69);
					functionNonReturn();
					}
					break;
				}
				}
				setState(74);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(HelloParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(HelloParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(OPEN_CURLY_BRACKET);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(76);
				content();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(CLOSE_CURLY_BRACKET);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(HelloParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SET() { return getToken(HelloParser.SET, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(84);
				match(SET);
				}
			}

			setState(87);
			match(NAME);
			setState(88);
			match(EQUALS);
			setState(89);
			expression();
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

	public static class DeclarationElementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(HelloParser.EQUALS, 0); }
		public TerminalNode LINE() { return getToken(HelloParser.LINE, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GetExpressionContext getExpression() {
			return getRuleContext(GetExpressionContext.class,0);
		}
		public TerminalNode ELEMENT() { return getToken(HelloParser.ELEMENT, 0); }
		public DeclarationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclarationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclarationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclarationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationElementContext declarationElement() throws RecognitionException {
		DeclarationElementContext _localctx = new DeclarationElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(91);
				match(ELEMENT);
				}
			}

			setState(94);
			match(NAME);
			setState(95);
			match(EQUALS);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(96);
				match(LINE);
				}
				break;
			case 2:
				{
				setState(97);
				functionCall();
				}
				break;
			case 3:
				{
				setState(98);
				getExpression();
				}
				break;
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode LINE() { return getToken(HelloParser.LINE, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PRINT);
			setState(102);
			match(OPEN_BRACKET);
			setState(103);
			match(LINE);
			setState(104);
			match(CLOSE_BRACKET);
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

	public static class PrintSetContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public PrintSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrintSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrintSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrintSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSetContext printSet() throws RecognitionException {
		PrintSetContext _localctx = new PrintSetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(PRINT);
			setState(107);
			match(OPEN_BRACKET);
			setState(108);
			match(NAME);
			setState(109);
			match(CLOSE_BRACKET);
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

	public static class InputSignatureContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HelloParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HelloParser.COMMA, i);
		}
		public InputSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInputSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInputSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInputSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputSignatureContext inputSignature() throws RecognitionException {
		InputSignatureContext _localctx = new InputSignatureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inputSignature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(OPEN_BRACKET);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(NAME);
					setState(113);
					match(COMMA);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(119);
			match(NAME);
			setState(120);
			match(CLOSE_BRACKET);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public InputSignatureContext inputSignature() {
			return getRuleContext(InputSignatureContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(122);
			match(NAME);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				inputSignature();
				}
				break;
			case 2:
				{
				{
				setState(124);
				match(OPEN_BRACKET);
				setState(125);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(HelloParser.SET, 0); }
		public TerminalNode ELEMENT() { return getToken(HelloParser.ELEMENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==ELEMENT || _la==SET) ) {
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

	public static class SignatureFunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HelloParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HelloParser.COMMA, i);
		}
		public SignatureFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSignatureFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSignatureFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSignatureFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureFunctionContext signatureFunction() throws RecognitionException {
		SignatureFunctionContext _localctx = new SignatureFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signatureFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(OPEN_BRACKET);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					type();
					setState(132);
					match(NAME);
					setState(133);
					match(COMMA);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			{
			setState(140);
			type();
			setState(141);
			match(NAME);
			}
			setState(143);
			match(CLOSE_BRACKET);
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

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(HelloParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public BlockReturnContext blockReturn() {
			return getRuleContext(BlockReturnContext.class,0);
		}
		public SignatureFunctionContext signatureFunction() {
			return getRuleContext(SignatureFunctionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(FUNCTION);
			setState(146);
			type();
			setState(147);
			match(NAME);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(149);
				match(OPEN_BRACKET);
				setState(150);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
			setState(153);
			blockReturn();
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

	public static class FunctionNonReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(HelloParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public BlockNonReturnContext blockNonReturn() {
			return getRuleContext(BlockNonReturnContext.class,0);
		}
		public SignatureFunctionContext signatureFunction() {
			return getRuleContext(SignatureFunctionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public FunctionNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunctionNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunctionNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFunctionNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNonReturnContext functionNonReturn() throws RecognitionException {
		FunctionNonReturnContext _localctx = new FunctionNonReturnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionNonReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(FUNCTION);
			setState(156);
			match(NAME);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(157);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(158);
				match(OPEN_BRACKET);
				setState(159);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
			setState(162);
			blockNonReturn();
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

	public static class BlockReturnContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(HelloParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(HelloParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(HelloParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlockReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlockReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlockReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockReturnContext blockReturn() throws RecognitionException {
		BlockReturnContext _localctx = new BlockReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OPEN_CURLY_BRACKET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(165);
				content();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RETURN);
			setState(172);
			match(NAME);
			setState(173);
			match(CLOSE_CURLY_BRACKET);
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

	public static class BlockNonReturnContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(HelloParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(HelloParser.RETURN, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(HelloParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlockNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlockNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlockNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNonReturnContext blockNonReturn() throws RecognitionException {
		BlockNonReturnContext _localctx = new BlockNonReturnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(OPEN_CURLY_BRACKET);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(176);
				content();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RETURN);
			setState(183);
			match(CLOSE_CURLY_BRACKET);
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

	public static class EqualCompareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(HelloParser.NON_EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEqualCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEqualCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitEqualCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualCompareContext equalCompare() throws RecognitionException {
		EqualCompareContext _localctx = new EqualCompareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			expression();
			}
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NON_EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(187);
			expression();
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(HelloParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(HelloParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(HelloParser.GREATER, 0); }
		public List<SizeExpressionContext> sizeExpression() {
			return getRuleContexts(SizeExpressionContext.class);
		}
		public SizeExpressionContext sizeExpression(int i) {
			return getRuleContext(SizeExpressionContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			sizeExpression();
			}
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(191);
			sizeExpression();
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

	public static class SimpleCompareContext extends ParserRuleContext {
		public EqualCompareContext equalCompare() {
			return getRuleContext(EqualCompareContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public IndexOfExpressionContext indexOfExpression() {
			return getRuleContext(IndexOfExpressionContext.class,0);
		}
		public SimpleCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSimpleCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSimpleCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSimpleCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCompareContext simpleCompare() throws RecognitionException {
		SimpleCompareContext _localctx = new SimpleCompareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleCompare);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				equalCompare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				compare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				indexOfExpression();
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

	public static class NegationCompareContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(HelloParser.NEGATION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public SimpleCompareContext simpleCompare() {
			return getRuleContext(SimpleCompareContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public NegationCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNegationCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNegationCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNegationCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationCompareContext negationCompare() throws RecognitionException {
		NegationCompareContext _localctx = new NegationCompareContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_negationCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(NEGATION);
			setState(199);
			match(OPEN_BRACKET);
			setState(200);
			simpleCompare();
			setState(201);
			match(CLOSE_BRACKET);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleCompareContext simpleCompare() {
			return getRuleContext(SimpleCompareContext.class,0);
		}
		public NegationCompareContext negationCompare() {
			return getRuleContext(NegationCompareContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IF);
			setState(204);
			match(OPEN_BRACKET);
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
			case NAME:
				{
				setState(205);
				simpleCompare();
				}
				break;
			case NEGATION:
				{
				setState(206);
				negationCompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			match(CLOSE_BRACKET);
			setState(210);
			block();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(211);
				elseBlock();
				}
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ELSE);
			setState(215);
			block();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleCompareContext simpleCompare() {
			return getRuleContext(SimpleCompareContext.class,0);
		}
		public NegationCompareContext negationCompare() {
			return getRuleContext(NegationCompareContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WHILE);
			setState(218);
			match(OPEN_BRACKET);
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
			case NAME:
				{
				setState(219);
				simpleCompare();
				}
				break;
			case NEGATION:
				{
				setState(220);
				negationCompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(223);
			match(CLOSE_BRACKET);
			setState(224);
			block();
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

	public static class SizeExpressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(HelloParser.DOT, 0); }
		public TerminalNode SIZE() { return getToken(HelloParser.SIZE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public SizeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSizeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSizeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSizeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeExpressionContext sizeExpression() throws RecognitionException {
		SizeExpressionContext _localctx = new SizeExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sizeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(NAME);
			setState(227);
			match(DOT);
			setState(228);
			match(SIZE);
			setState(229);
			match(OPEN_BRACKET);
			setState(230);
			match(CLOSE_BRACKET);
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

	public static class GetExpressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(HelloParser.DOT, 0); }
		public TerminalNode GET() { return getToken(HelloParser.GET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public GetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterGetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitGetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitGetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetExpressionContext getExpression() throws RecognitionException {
		GetExpressionContext _localctx = new GetExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_getExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NAME);
			setState(233);
			match(DOT);
			setState(234);
			match(GET);
			setState(235);
			match(OPEN_BRACKET);
			setState(236);
			match(NUMBER);
			setState(237);
			match(CLOSE_BRACKET);
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

	public static class IndexOfExpressionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(HelloParser.DOT, 0); }
		public TerminalNode INDEX_OF() { return getToken(HelloParser.INDEX_OF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public IndexOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIndexOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIndexOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIndexOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOfExpressionContext indexOfExpression() throws RecognitionException {
		IndexOfExpressionContext _localctx = new IndexOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_indexOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(NAME);
			setState(240);
			match(DOT);
			setState(241);
			match(INDEX_OF);
			setState(242);
			match(OPEN_BRACKET);
			setState(243);
			match(NAME);
			setState(244);
			match(CLOSE_BRACKET);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SetExpressionContext setExpression() {
			return getRuleContext(SetExpressionContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(HelloParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(HelloParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(HelloParser.DIVIDE, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GetExpressionContext getExpression() {
			return getRuleContext(GetExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				setExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(NAME);
				setState(248);
				match(PLUS);
				setState(249);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(NAME);
				setState(251);
				match(MINUS);
				setState(252);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(NAME);
				setState(254);
				match(MULTIPLY);
				setState(255);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(NAME);
				setState(257);
				match(DIVIDE);
				setState(258);
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				getExpression();
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

	public static class ContentContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationElementContext declarationElement() {
			return getRuleContext(DeclarationElementContext.class,0);
		}
		public PrintSetContext printSet() {
			return getRuleContext(PrintSetContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_content);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				declarationElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				printSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				whileBlock();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\7\4P\n\4"+
		"\f\4\16\4S\13\4\3\4\3\4\3\5\5\5X\n\5\3\5\3\5\3\5\3\5\3\6\5\6_\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\7\tu\n\t\f\t\16\tx\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0081"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\3\17\3\17\7\17\u00a9\n"+
		"\17\f\17\16\17\u00ac\13\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u00b4\n"+
		"\20\f\20\16\20\u00b7\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\5\25\u00d2\n\25\3\25\3\25\3\25\5\25\u00d7\n\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\5\27\u00e0\n\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0109\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0112\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\5\3\2\n\13\3\2\36\37\3\2\36!\2\u0119\28"+
		"\3\2\2\2\4C\3\2\2\2\6M\3\2\2\2\bW\3\2\2\2\n^\3\2\2\2\fg\3\2\2\2\16l\3"+
		"\2\2\2\20q\3\2\2\2\22|\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0093"+
		"\3\2\2\2\32\u009d\3\2\2\2\34\u00a6\3\2\2\2\36\u00b1\3\2\2\2 \u00bb\3\2"+
		"\2\2\"\u00bf\3\2\2\2$\u00c6\3\2\2\2&\u00c8\3\2\2\2(\u00cd\3\2\2\2*\u00d8"+
		"\3\2\2\2,\u00db\3\2\2\2.\u00e4\3\2\2\2\60\u00ea\3\2\2\2\62\u00f1\3\2\2"+
		"\2\64\u0108\3\2\2\2\66\u0111\3\2\2\28=\7\6\2\29:\7#\2\2:<\7\30\2\2;9\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7#\2\2AB\7"+
		"\7\2\2B\3\3\2\2\2CD\7\22\2\2DE\7\3\2\2EJ\5\6\4\2FI\5\30\r\2GI\5\32\16"+
		"\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LJ\3\2"+
		"\2\2MQ\7\6\2\2NP\5\66\34\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SQ\3\2\2\2TU\7\7\2\2U\7\3\2\2\2VX\7\13\2\2WV\3\2\2\2WX\3\2\2\2X"+
		"Y\3\2\2\2YZ\7#\2\2Z[\7\26\2\2[\\\5\64\33\2\\\t\3\2\2\2]_\7\n\2\2^]\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`a\7#\2\2ae\7\26\2\2bf\7%\2\2cf\5\22\n\2df\5\60"+
		"\31\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\f\2\2hi\7\4\2\2ij"+
		"\7%\2\2jk\7\5\2\2k\r\3\2\2\2lm\7\f\2\2mn\7\4\2\2no\7#\2\2op\7\5\2\2p\17"+
		"\3\2\2\2qv\7\4\2\2rs\7#\2\2su\7\30\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7#\2\2z{\7\5\2\2{\21\3\2\2\2|\u0080\7"+
		"#\2\2}\u0081\5\20\t\2~\177\7\4\2\2\177\u0081\7\5\2\2\u0080}\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\t\2\2\2\u0083\25\3\2\2\2\u0084"+
		"\u008b\7\4\2\2\u0085\u0086\5\24\13\2\u0086\u0087\7#\2\2\u0087\u0088\7"+
		"\30\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\5\24\13\2\u008f\u0090\7#\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\5\2\2\u0092\27\3\2\2\2\u0093\u0094\7\22\2\2\u0094\u0095\5\24"+
		"\13\2\u0095\u0099\7#\2\2\u0096\u009a\5\26\f\2\u0097\u0098\7\4\2\2\u0098"+
		"\u009a\7\5\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\5\34\17\2\u009c\31\3\2\2\2\u009d\u009e\7\22\2\2\u009e"+
		"\u00a2\7#\2\2\u009f\u00a3\5\26\f\2\u00a0\u00a1\7\4\2\2\u00a1\u00a3\7\5"+
		"\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\5\36\20\2\u00a5\33\3\2\2\2\u00a6\u00aa\7\6\2\2\u00a7\u00a9\5\66"+
		"\34\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\21"+
		"\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\7\2\2\u00b0\35\3\2\2\2\u00b1\u00b5"+
		"\7\6\2\2\u00b2\u00b4\5\66\34\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba\7\7\2\2\u00ba\37\3\2\2\2\u00bb"+
		"\u00bc\5\64\33\2\u00bc\u00bd\t\3\2\2\u00bd\u00be\5\64\33\2\u00be!\3\2"+
		"\2\2\u00bf\u00c0\5.\30\2\u00c0\u00c1\t\4\2\2\u00c1\u00c2\5.\30\2\u00c2"+
		"#\3\2\2\2\u00c3\u00c7\5 \21\2\u00c4\u00c7\5\"\22\2\u00c5\u00c7\5\62\32"+
		"\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7%"+
		"\3\2\2\2\u00c8\u00c9\7\35\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5$\23\2"+
		"\u00cb\u00cc\7\5\2\2\u00cc\'\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00d1\7"+
		"\4\2\2\u00cf\u00d2\5$\23\2\u00d0\u00d2\5&\24\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\5\2\2\u00d4\u00d6\5\6"+
		"\4\2\u00d5\u00d7\5*\26\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		")\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\5\6\4\2\u00da+\3\2\2\2\u00db"+
		"\u00dc\7\20\2\2\u00dc\u00df\7\4\2\2\u00dd\u00e0\5$\23\2\u00de\u00e0\5"+
		"&\24\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\7\5\2\2\u00e2\u00e3\5\6\4\2\u00e3-\3\2\2\2\u00e4\u00e5\7#\2\2\u00e5"+
		"\u00e6\7\27\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\7"+
		"\5\2\2\u00e9/\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ed"+
		"\7\24\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f0\7\5\2\2\u00f0"+
		"\61\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3\7\27\2\2\u00f3\u00f4\7\25\2"+
		"\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7\5\2\2\u00f7\63"+
		"\3\2\2\2\u00f8\u0109\5\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7\31\2\2\u00fb"+
		"\u0109\7#\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\7\32\2\2\u00fe\u0109\7#\2"+
		"\2\u00ff\u0100\7#\2\2\u0100\u0101\7\33\2\2\u0101\u0109\7#\2\2\u0102\u0103"+
		"\7#\2\2\u0103\u0104\7\34\2\2\u0104\u0109\7#\2\2\u0105\u0109\7#\2\2\u0106"+
		"\u0109\5\22\n\2\u0107\u0109\5\60\31\2\u0108\u00f8\3\2\2\2\u0108\u00f9"+
		"\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\65\3\2\2"+
		"\2\u010a\u0112\5\f\7\2\u010b\u0112\5\b\5\2\u010c\u0112\5\n\6\2\u010d\u0112"+
		"\5\16\b\2\u010e\u0112\5\22\n\2\u010f\u0112\5(\25\2\u0110\u0112\5,\27\2"+
		"\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d"+
		"\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\67\3\2\2\2\26=HJQW^ev\u0080\u008b\u0099\u00a2\u00aa\u00b5\u00c6\u00d1"+
		"\u00d6\u00df\u0108\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}