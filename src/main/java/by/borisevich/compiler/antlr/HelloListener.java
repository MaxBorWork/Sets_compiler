package by.borisevich.compiler.antlr;// Generated from /home/maksim/IdeaProjects/sets_compiler/Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationElement(HelloParser.DeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationElement(HelloParser.DeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HelloParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HelloParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#printSet}.
	 * @param ctx the parse tree
	 */
	void enterPrintSet(HelloParser.PrintSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#printSet}.
	 * @param ctx the parse tree
	 */
	void exitPrintSet(HelloParser.PrintSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void enterInputSignature(HelloParser.InputSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void exitInputSignature(HelloParser.InputSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HelloParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HelloParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void enterSignatureFunction(HelloParser.SignatureFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void exitSignatureFunction(HelloParser.SignatureFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(HelloParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(HelloParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNonReturn(HelloParser.FunctionNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNonReturn(HelloParser.FunctionNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockReturn(HelloParser.BlockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockReturn(HelloParser.BlockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonReturn(HelloParser.BlockNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonReturn(HelloParser.BlockNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void enterEqualCompare(HelloParser.EqualCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void exitEqualCompare(HelloParser.EqualCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(HelloParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(HelloParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCompare(HelloParser.SimpleCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCompare(HelloParser.SimpleCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void enterNegationCompare(HelloParser.NegationCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void exitNegationCompare(HelloParser.NegationCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(HelloParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(HelloParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(HelloParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(HelloParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(HelloParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(HelloParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExpression(HelloParser.SizeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExpression(HelloParser.SizeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void enterGetExpression(HelloParser.GetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void exitGetExpression(HelloParser.GetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexOfExpression(HelloParser.IndexOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexOfExpression(HelloParser.IndexOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#initSetExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitSetExpression(HelloParser.InitSetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#initSetExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitSetExpression(HelloParser.InitSetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#addElement}.
	 * @param ctx the parse tree
	 */
	void enterAddElement(HelloParser.AddElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#addElement}.
	 * @param ctx the parse tree
	 */
	void exitAddElement(HelloParser.AddElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HelloParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HelloParser.ContentContext ctx);
}