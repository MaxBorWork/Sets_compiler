package by.borisevich.compiler.antlr;// Generated from /home/maksim/IdeaProjects/sets_compiler/Hello.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		INDEX_OF=19, ADD=20, EQUALS=21, DOT=22, COMMA=23, PLUS=24, MINUS=25, MULTIPLY=26, 
		DIVIDE=27, NEGATION=28, EQUAL=29, NON_EQUAL=30, LESS=31, GREATER=32, SPACE=33, 
		NAME=34, NUMBER=35, LINE=36;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_declarationElement = 3, 
		RULE_print = 4, RULE_printSet = 5, RULE_inputSignature = 6, RULE_functionCall = 7, 
		RULE_type = 8, RULE_signatureFunction = 9, RULE_functionReturn = 10, RULE_functionNonReturn = 11, 
		RULE_blockReturn = 12, RULE_blockNonReturn = 13, RULE_equalCompare = 14, 
		RULE_compare = 15, RULE_simpleCompare = 16, RULE_negationCompare = 17, 
		RULE_ifBlock = 18, RULE_elseBlock = 19, RULE_whileBlock = 20, RULE_sizeExpression = 21, 
		RULE_getExpression = 22, RULE_indexOfExpression = 23, RULE_expression = 24, 
		RULE_initSetExpression = 25, RULE_addElement = 26, RULE_content = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "declaration", "declarationElement", "print", "printSet", 
			"inputSignature", "functionCall", "type", "signatureFunction", "functionReturn", 
			"functionNonReturn", "blockReturn", "blockNonReturn", "equalCompare", 
			"compare", "simpleCompare", "negationCompare", "ifBlock", "elseBlock", 
			"whileBlock", "sizeExpression", "getExpression", "indexOfExpression", 
			"expression", "initSetExpression", "addElement", "content"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'element'", 
			"'set'", "'print'", "'if'", "'else'", "'for'", "'while'", "'return'", 
			"'func'", "'size'", "'get'", "'indexOf'", "'add'", "'='", "'.'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", 
			"CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
			"ELEMENT", "SET", "PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", 
			"SIZE", "GET", "INDEX_OF", "ADD", "EQUALS", "DOT", "COMMA", "PLUS", "MINUS", 
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(56);
			match(FUNCTION);
			setState(57);
			match(MAIN);
			setState(58);
			block();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(59);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(60);
					functionNonReturn();
					}
					break;
				}
				}
				setState(65);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OPEN_CURLY_BRACKET);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(67);
				content();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(75);
				match(SET);
				}
			}

			setState(78);
			match(NAME);
			setState(79);
			match(EQUALS);
			setState(80);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterDeclarationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitDeclarationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitDeclarationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationElementContext declarationElement() throws RecognitionException {
		DeclarationElementContext _localctx = new DeclarationElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(82);
				match(ELEMENT);
				}
			}

			setState(85);
			match(NAME);
			setState(86);
			match(EQUALS);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				match(LINE);
				}
				break;
			case 2:
				{
				setState(88);
				functionCall();
				}
				break;
			case 3:
				{
				setState(89);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PRINT);
			setState(93);
			match(OPEN_BRACKET);
			setState(94);
			match(LINE);
			setState(95);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterPrintSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitPrintSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitPrintSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSetContext printSet() throws RecognitionException {
		PrintSetContext _localctx = new PrintSetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(PRINT);
			setState(98);
			match(OPEN_BRACKET);
			setState(99);
			match(NAME);
			setState(100);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterInputSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitInputSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitInputSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputSignatureContext inputSignature() throws RecognitionException {
		InputSignatureContext _localctx = new InputSignatureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inputSignature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(OPEN_BRACKET);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(NAME);
					setState(104);
					match(COMMA);
					}
					}
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(110);
			match(NAME);
			setState(111);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			match(NAME);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				inputSignature();
				}
				break;
			case 2:
				{
				{
				setState(115);
				match(OPEN_BRACKET);
				setState(116);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterSignatureFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitSignatureFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitSignatureFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureFunctionContext signatureFunction() throws RecognitionException {
		SignatureFunctionContext _localctx = new SignatureFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signatureFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(OPEN_BRACKET);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					type();
					setState(123);
					match(NAME);
					setState(124);
					match(COMMA);
					}
					}
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			{
			setState(131);
			type();
			setState(132);
			match(NAME);
			}
			setState(134);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(FUNCTION);
			setState(137);
			type();
			setState(138);
			match(NAME);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(139);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(140);
				match(OPEN_BRACKET);
				setState(141);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
			setState(144);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterFunctionNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitFunctionNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitFunctionNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNonReturnContext functionNonReturn() throws RecognitionException {
		FunctionNonReturnContext _localctx = new FunctionNonReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionNonReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(FUNCTION);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterBlockReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitBlockReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitBlockReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockReturnContext blockReturn() throws RecognitionException {
		BlockReturnContext _localctx = new BlockReturnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(OPEN_CURLY_BRACKET);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(156);
				content();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(RETURN);
			setState(163);
			match(NAME);
			setState(164);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterBlockNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitBlockNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitBlockNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNonReturnContext blockNonReturn() throws RecognitionException {
		BlockNonReturnContext _localctx = new BlockNonReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OPEN_CURLY_BRACKET);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(167);
				content();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RETURN);
			setState(174);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterEqualCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitEqualCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitEqualCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualCompareContext equalCompare() throws RecognitionException {
		EqualCompareContext _localctx = new EqualCompareContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			expression();
			}
			setState(177);
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
			setState(178);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			sizeExpression();
			}
			setState(181);
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
			setState(182);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterSimpleCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitSimpleCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitSimpleCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCompareContext simpleCompare() throws RecognitionException {
		SimpleCompareContext _localctx = new SimpleCompareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleCompare);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				equalCompare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				compare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterNegationCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitNegationCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitNegationCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationCompareContext negationCompare() throws RecognitionException {
		NegationCompareContext _localctx = new NegationCompareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_negationCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NEGATION);
			setState(190);
			match(OPEN_BRACKET);
			setState(191);
			simpleCompare();
			setState(192);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			match(OPEN_BRACKET);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
			case NAME:
				{
				setState(196);
				simpleCompare();
				}
				break;
			case NEGATION:
				{
				setState(197);
				negationCompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			match(CLOSE_BRACKET);
			setState(201);
			block();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(202);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ELSE);
			setState(206);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(WHILE);
			setState(209);
			match(OPEN_BRACKET);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
			case NAME:
				{
				setState(210);
				simpleCompare();
				}
				break;
			case NEGATION:
				{
				setState(211);
				negationCompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
			match(CLOSE_BRACKET);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterSizeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitSizeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitSizeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeExpressionContext sizeExpression() throws RecognitionException {
		SizeExpressionContext _localctx = new SizeExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sizeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NAME);
			setState(218);
			match(DOT);
			setState(219);
			match(SIZE);
			setState(220);
			match(OPEN_BRACKET);
			setState(221);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterGetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitGetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitGetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetExpressionContext getExpression() throws RecognitionException {
		GetExpressionContext _localctx = new GetExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_getExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(NAME);
			setState(224);
			match(DOT);
			setState(225);
			match(GET);
			setState(226);
			match(OPEN_BRACKET);
			setState(227);
			match(NUMBER);
			setState(228);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterIndexOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitIndexOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitIndexOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOfExpressionContext indexOfExpression() throws RecognitionException {
		IndexOfExpressionContext _localctx = new IndexOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(NAME);
			setState(231);
			match(DOT);
			setState(232);
			match(INDEX_OF);
			setState(233);
			match(OPEN_BRACKET);
			setState(234);
			match(NAME);
			setState(235);
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
		public InitSetExpressionContext initSetExpression() {
			return getRuleContext(InitSetExpressionContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(HelloParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(HelloParser.MULTIPLY, 0); }
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				initSetExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(NAME);
				setState(239);
				match(PLUS);
				setState(240);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(NAME);
				setState(242);
				match(MINUS);
				setState(243);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(NAME);
				setState(245);
				match(MULTIPLY);
				setState(246);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
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

	public static class InitSetExpressionContext extends ParserRuleContext {
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
		public InitSetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initSetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterInitSetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitInitSetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitInitSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitSetExpressionContext initSetExpression() throws RecognitionException {
		InitSetExpressionContext _localctx = new InitSetExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initSetExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(OPEN_CURLY_BRACKET);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(NAME);
					setState(254);
					match(COMMA);
					}
					}
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(260);
			match(NAME);
			setState(261);
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

	public static class AddElementContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(HelloParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HelloParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(HelloParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(HelloParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(HelloParser.CLOSE_BRACKET, 0); }
		public AddElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterAddElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitAddElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitAddElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddElementContext addElement() throws RecognitionException {
		AddElementContext _localctx = new AddElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(NAME);
			setState(264);
			match(DOT);
			setState(265);
			match(ADD);
			setState(266);
			match(OPEN_BRACKET);
			setState(267);
			match(NAME);
			setState(268);
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
		public AddElementContext addElement() {
			return getRuleContext(AddElementContext.class,0);
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
			if ( listener instanceof HelloListener) ((HelloListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener) ((HelloListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor) return ((HelloVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_content);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				declarationElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				printSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				addElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				ifBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\4\5\4O\n\4\3"+
		"\4\3\4\3\4\3\4\3\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0081"+
		"\n\13\f\13\16\13\u0084\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0091\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\r\3"+
		"\r\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\7\17\u00ab\n\17\f\17\16\17\u00ae\13\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00be\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00c9\n\24\3\24\3\24\3\24"+
		"\5\24\u00ce\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00d7\n\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00fd\n\32\3\33\3\33\3\33"+
		"\7\33\u0102\n\33\f\33\16\33\u0105\13\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0119"+
		"\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\5\3\2\n\13\3\2\37 \3\2\37\"\2\u011f\2:\3\2\2\2\4D\3\2\2\2\6"+
		"N\3\2\2\2\bU\3\2\2\2\n^\3\2\2\2\fc\3\2\2\2\16h\3\2\2\2\20s\3\2\2\2\22"+
		"y\3\2\2\2\24{\3\2\2\2\26\u008a\3\2\2\2\30\u0094\3\2\2\2\32\u009d\3\2\2"+
		"\2\34\u00a8\3\2\2\2\36\u00b2\3\2\2\2 \u00b6\3\2\2\2\"\u00bd\3\2\2\2$\u00bf"+
		"\3\2\2\2&\u00c4\3\2\2\2(\u00cf\3\2\2\2*\u00d2\3\2\2\2,\u00db\3\2\2\2."+
		"\u00e1\3\2\2\2\60\u00e8\3\2\2\2\62\u00fc\3\2\2\2\64\u00fe\3\2\2\2\66\u0109"+
		"\3\2\2\28\u0118\3\2\2\2:;\7\22\2\2;<\7\3\2\2<A\5\4\3\2=@\5\26\f\2>@\5"+
		"\30\r\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2C"+
		"A\3\2\2\2DH\7\6\2\2EG\58\35\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"IK\3\2\2\2JH\3\2\2\2KL\7\7\2\2L\5\3\2\2\2MO\7\13\2\2NM\3\2\2\2NO\3\2\2"+
		"\2OP\3\2\2\2PQ\7$\2\2QR\7\27\2\2RS\5\62\32\2S\7\3\2\2\2TV\7\n\2\2UT\3"+
		"\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7$\2\2X\\\7\27\2\2Y]\7&\2\2Z]\5\20\t\2[]"+
		"\5.\30\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\7\f\2\2_`\7\4\2"+
		"\2`a\7&\2\2ab\7\5\2\2b\13\3\2\2\2cd\7\f\2\2de\7\4\2\2ef\7$\2\2fg\7\5\2"+
		"\2g\r\3\2\2\2hm\7\4\2\2ij\7$\2\2jl\7\31\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$\2\2qr\7\5\2\2r\17\3\2\2\2sw\7"+
		"$\2\2tx\5\16\b\2uv\7\4\2\2vx\7\5\2\2wt\3\2\2\2wu\3\2\2\2x\21\3\2\2\2y"+
		"z\t\2\2\2z\23\3\2\2\2{\u0082\7\4\2\2|}\5\22\n\2}~\7$\2\2~\177\7\31\2\2"+
		"\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\22\n\2\u0086\u0087\7$\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\5"+
		"\2\2\u0089\25\3\2\2\2\u008a\u008b\7\22\2\2\u008b\u008c\5\22\n\2\u008c"+
		"\u0090\7$\2\2\u008d\u0091\5\24\13\2\u008e\u008f\7\4\2\2\u008f\u0091\7"+
		"\5\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\5\32\16\2\u0093\27\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0099\7$"+
		"\2\2\u0096\u009a\5\24\13\2\u0097\u0098\7\4\2\2\u0098\u009a\7\5\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5\34"+
		"\17\2\u009c\31\3\2\2\2\u009d\u00a1\7\6\2\2\u009e\u00a0\58\35\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\7"+
		"$\2\2\u00a6\u00a7\7\7\2\2\u00a7\33\3\2\2\2\u00a8\u00ac\7\6\2\2\u00a9\u00ab"+
		"\58\35\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\21"+
		"\2\2\u00b0\u00b1\7\7\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\5\62\32\2\u00b3"+
		"\u00b4\t\3\2\2\u00b4\u00b5\5\62\32\2\u00b5\37\3\2\2\2\u00b6\u00b7\5,\27"+
		"\2\u00b7\u00b8\t\4\2\2\u00b8\u00b9\5,\27\2\u00b9!\3\2\2\2\u00ba\u00be"+
		"\5\36\20\2\u00bb\u00be\5 \21\2\u00bc\u00be\5\60\31\2\u00bd\u00ba\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0"+
		"\7\36\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\7\5\2\2"+
		"\u00c3%\3\2\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c8\7\4\2\2\u00c6\u00c9\5"+
		"\"\22\2\u00c7\u00c9\5$\23\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cd\5\4\3\2\u00cc\u00ce\5("+
		"\25\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\'\3\2\2\2\u00cf\u00d0"+
		"\7\16\2\2\u00d0\u00d1\5\4\3\2\u00d1)\3\2\2\2\u00d2\u00d3\7\20\2\2\u00d3"+
		"\u00d6\7\4\2\2\u00d4\u00d7\5\"\22\2\u00d5\u00d7\5$\23\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\5\2\2\u00d9"+
		"\u00da\5\4\3\2\u00da+\3\2\2\2\u00db\u00dc\7$\2\2\u00dc\u00dd\7\30\2\2"+
		"\u00dd\u00de\7\23\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\7\5\2\2\u00e0-\3"+
		"\2\2\2\u00e1\u00e2\7$\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\7\24\2\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5\u00e6\7%\2\2\u00e6\u00e7\7\5\2\2\u00e7/\3\2\2\2\u00e8"+
		"\u00e9\7$\2\2\u00e9\u00ea\7\30\2\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec\7"+
		"\4\2\2\u00ec\u00ed\7$\2\2\u00ed\u00ee\7\5\2\2\u00ee\61\3\2\2\2\u00ef\u00fd"+
		"\5\64\33\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\7\32\2\2\u00f2\u00fd\7$\2\2"+
		"\u00f3\u00f4\7$\2\2\u00f4\u00f5\7\33\2\2\u00f5\u00fd\7$\2\2\u00f6\u00f7"+
		"\7$\2\2\u00f7\u00f8\7\34\2\2\u00f8\u00fd\7$\2\2\u00f9\u00fd\7$\2\2\u00fa"+
		"\u00fd\5\20\t\2\u00fb\u00fd\5.\30\2\u00fc\u00ef\3\2\2\2\u00fc\u00f0\3"+
		"\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\63\3\2\2\2\u00fe\u0103\7\6\2"+
		"\2\u00ff\u0100\7$\2\2\u0100\u0102\7\31\2\2\u0101\u00ff\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\7$\2\2\u0107\u0108\7\7\2\2\u0108\65\3\2\2\2"+
		"\u0109\u010a\7$\2\2\u010a\u010b\7\30\2\2\u010b\u010c\7\26\2\2\u010c\u010d"+
		"\7\4\2\2\u010d\u010e\7$\2\2\u010e\u010f\7\5\2\2\u010f\67\3\2\2\2\u0110"+
		"\u0119\5\n\6\2\u0111\u0119\5\6\4\2\u0112\u0119\5\b\5\2\u0113\u0119\5\f"+
		"\7\2\u0114\u0119\5\66\34\2\u0115\u0119\5\20\t\2\u0116\u0119\5&\24\2\u0117"+
		"\u0119\5*\26\2\u0118\u0110\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2"+
		"\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u01199\3\2\2\2\26?AHNU\\mw\u0082\u0090"+
		"\u0099\u00a1\u00ac\u00bd\u00c8\u00cd\u00d6\u00fc\u0103\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}