package by.borisevich.compiler;

import antlr.HelloBaseListener;
import antlr.HelloParser;
import by.borisevich.compiler.model.Variables;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWalker extends HelloBaseListener {

    List<String> errors = new ArrayList<>();
    Variables variables = new Variables();
    Map<String, String> functions = new HashMap<>();
    Map<String, HelloParser.SignatureFunctionContext> functionSignatures = new HashMap<>();

    String program = "import java.util.ArrayList;\n" +
            "import java.util.Collections;\n" +
            "import java.util.List;\n" +
            "public class Program {\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            new Program().start();\n" +
            "        } catch (Exception e) {\n" +
            "            System.err.println(e.getMessage());\n" +
            "        }\n" +
            "    }\n" +
            "    private void start() throws Exception\n";

    @Override public void enterSetExpression(HelloParser.SetExpressionContext ctx) {

    }

    @Override public void exitSetExpression(HelloParser.SetExpressionContext ctx) {

    }

    @Override public void enterProgram(HelloParser.ProgramContext ctx) {

    }

    @Override public void exitProgram(HelloParser.ProgramContext ctx) {

    }

    @Override public void enterBlock(HelloParser.BlockContext ctx) {

    }

    @Override public void exitBlock(HelloParser.BlockContext ctx) {

    }

    @Override public void enterDeclaration(HelloParser.DeclarationContext ctx) {

    }

    @Override public void exitDeclaration(HelloParser.DeclarationContext ctx) {

    }

    @Override public void enterDeclarationElement(HelloParser.DeclarationElementContext ctx) { }

    @Override public void exitDeclarationElement(HelloParser.DeclarationElementContext ctx) { }

    @Override public void enterPrint(HelloParser.PrintContext ctx) {
        System.out.println(ctx.LINE().getText());
    }


    @Override public void enterPrintSet(HelloParser.PrintSetContext ctx) {

    }

    @Override public void enterInputSignature(HelloParser.InputSignatureContext ctx) { }

    @Override public void exitInputSignature(HelloParser.InputSignatureContext ctx) { }

    @Override public void enterFunctionCall(HelloParser.FunctionCallContext ctx) { }

    @Override public void exitFunctionCall(HelloParser.FunctionCallContext ctx) { }

    @Override public void enterType(HelloParser.TypeContext ctx) { }

    @Override public void exitType(HelloParser.TypeContext ctx) { }

    @Override public void enterSignatureFunction(HelloParser.SignatureFunctionContext ctx) { }

    @Override public void exitSignatureFunction(HelloParser.SignatureFunctionContext ctx) { }

    @Override public void enterFunctionReturn(HelloParser.FunctionReturnContext ctx) { }

    @Override public void exitFunctionReturn(HelloParser.FunctionReturnContext ctx) { }

    @Override public void enterFunctionNonReturn(HelloParser.FunctionNonReturnContext ctx) { }

    @Override public void exitFunctionNonReturn(HelloParser.FunctionNonReturnContext ctx) { }

    @Override public void enterBlockReturn(HelloParser.BlockReturnContext ctx) { }

    @Override public void exitBlockReturn(HelloParser.BlockReturnContext ctx) { }

    @Override public void enterBlockNonReturn(HelloParser.BlockNonReturnContext ctx) { }

    @Override public void exitBlockNonReturn(HelloParser.BlockNonReturnContext ctx) { }

    @Override public void enterEqualCompare(HelloParser.EqualCompareContext ctx) { }

    @Override public void exitEqualCompare(HelloParser.EqualCompareContext ctx) { }

    @Override public void enterCompare(HelloParser.CompareContext ctx) { }

    @Override public void exitCompare(HelloParser.CompareContext ctx) { }

    @Override public void enterSimpleCompare(HelloParser.SimpleCompareContext ctx) { }

    @Override public void exitSimpleCompare(HelloParser.SimpleCompareContext ctx) { }

    @Override public void enterNegationCompare(HelloParser.NegationCompareContext ctx) { }

    @Override public void exitNegationCompare(HelloParser.NegationCompareContext ctx) { }

    @Override public void enterIfBlock(HelloParser.IfBlockContext ctx) { }

    @Override public void exitIfBlock(HelloParser.IfBlockContext ctx) { }

    @Override public void enterElseBlock(HelloParser.ElseBlockContext ctx) { }

    @Override public void exitElseBlock(HelloParser.ElseBlockContext ctx) { }

    @Override public void enterWhileBlock(HelloParser.WhileBlockContext ctx) { }

    @Override public void exitWhileBlock(HelloParser.WhileBlockContext ctx) { }

    @Override public void enterSizeExpression(HelloParser.SizeExpressionContext ctx) { }

    @Override public void exitSizeExpression(HelloParser.SizeExpressionContext ctx) { }

    @Override public void enterGetExpression(HelloParser.GetExpressionContext ctx) { }

    @Override public void exitGetExpression(HelloParser.GetExpressionContext ctx) { }

    @Override public void enterIndexOfExpression(HelloParser.IndexOfExpressionContext ctx) { }

    @Override public void exitIndexOfExpression(HelloParser.IndexOfExpressionContext ctx) { }

    @Override public void enterExpression(HelloParser.ExpressionContext ctx) { }

    @Override public void exitExpression(HelloParser.ExpressionContext ctx) { }

    @Override public void enterContent(HelloParser.ContentContext ctx) { }

    @Override public void exitContent(HelloParser.ContentContext ctx) { }


    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}
