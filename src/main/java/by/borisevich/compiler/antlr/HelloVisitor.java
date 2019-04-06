package by.borisevich.compiler.antlr;// Generated from /home/maksim/IdeaProjects/sets_compiler/Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HelloParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declarationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationElement(HelloParser.DeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HelloParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#printSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSet(HelloParser.PrintSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#inputSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSignature(HelloParser.InputSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HelloParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HelloParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#signatureFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureFunction(HelloParser.SignatureFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(HelloParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#functionNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNonReturn(HelloParser.FunctionNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#blockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockReturn(HelloParser.BlockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#blockNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonReturn(HelloParser.BlockNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#equalCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCompare(HelloParser.EqualCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(HelloParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#simpleCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCompare(HelloParser.SimpleCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#negationCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationCompare(HelloParser.NegationCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(HelloParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(HelloParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(HelloParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sizeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExpression(HelloParser.SizeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#getExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpression(HelloParser.GetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#indexOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOfExpression(HelloParser.IndexOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#initSetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitSetExpression(HelloParser.InitSetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#addElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddElement(HelloParser.AddElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HelloParser.ContentContext ctx);
}