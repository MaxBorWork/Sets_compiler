package by.borisevich.compiler;

import antlr.HelloBaseVisitor;
import antlr.HelloParser;
import by.borisevich.compiler.model.Variables;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetVisitor extends HelloBaseVisitor {

    private List<String> errors = new ArrayList<>();
    private Variables variables = new Variables();
    private Map<String, String> functions = new HashMap<>();
    private Map<String, HelloParser.SignatureFunctionContext> functionSignatures = new HashMap<>();

    private final String myImport = "import java.util.ArrayList;\n" +
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
            "\n" +
            "public class Set {\n" +
            "\n" +
            "    List<Element> set = new ArrayList<>();\n" +
            "\n" +
            "    public Set(Element[] elements) {\n" +
            "        Collections.addAll(set, elements);\n" +
            "    }\n" +
            "\n" +
            "    public Set(List<Element> set) {\n" +
            "        this.set = set;\n" +
            "    }\n" +
            "\n" +
            "    public Set() {\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    public void add(Element element) {\n" +
            "        if (set.indexOf(element) == -1)\n" +
            "            set.add(element);\n" +
            "    }\n" +
            "\n" +
            "    public void remove(Element element) {\n" +
            "        if (set.indexOf(element) != -1)\n" +
            "            set.remove(element);\n" +
            "    }\n" +
            "\n" +
            "    public List<Element> getSet() {\n" +
            "        return set;\n" +
            "    }\n" +
            "\n" +
            "    public boolean indexOf(Element element) {\n" +
            "        return set.indexOf(element) != -1;\n" +
            "    }\n" +
            "\n" +
            "    public void add(Set set) {\n" +
            "        this.set.addAll(set.getSet());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        String buffer = \"\";\n" +
            "        for(Element element: getSet())\n" +
            "            buffer+=element.toString() + \" \";\n" +
            "        return buffer;\n" +
            "    }\n" +
            "\n" +
            "    public int size() {\n" +
            "        return set.size();\n" +
            "    }\n" +
            "\n" +
            "    public Element get(int i) {\n" +
            "        return set.get(i);\n" +
            "    }\n" +
            "    public Set union(Set a, Set b) {\n" +
            "        Set out = new Set();\n" +
            "        out.set.addAll(a.set);\n" +
            "        out.set.addAll(b.set);\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "    public static Set intersection(Set a, Set b) {\n" +
            "        Set out = new Set();\n" +
            "        for (Element el : a.set) {\n" +
            "            if (b.set.contains(el)) {\n" +
            "                out.add(el);\n" +
            "            }\n" +
            "        }\n" +
            "        for (Element el : b.set) {\n" +
            "            if (a.set.contains(el)) {\n" +
            "                out.add(el);\n" +
            "            }\n" +
            "        }\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "    public static Set diff(Set a, Set b) {\n" +
            "        Set out = new Set();\n" +
            "        out.set.addAll(a.set);\n" +
            "        for (Element el : b.set) {\n" +
            "            if (a.set.contains(el)) {\n" +
            "                out.remove(el);\n" +
            "            }\n" +
            "        }\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "    private boolean equal(Set a, Set b) {\n" +
            "        for (Element element : a.getSet())\n" +
            "            if (!b.indexOf(element))\n" +
            "                return false;\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "    private boolean nonEqual(Set a, Set b) {\n" +
            "        for (Element element : a.getSet())\n" +
            "            if (b.indexOf(element))\n" +
            "                return false;\n" +
            "        return true;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "public class Element {\n" +
            "    String element;\n" +
            "\n" +
            "    public Element(String element) {\n" +
            "        this.element = element;\n" +
            "    }\n" +
            "\n" +
            "    public String getElement() {\n" +
            "        return element;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return element;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "    private void start() throws Exception ";

    @Override
    public String visitSetExpression(HelloParser.SetExpressionContext ctx) {
        for (int i = 0; i < ctx.NAME().size(); i++) {
            if (variables.get(ctx.NAME(i).getText()) == null)
                errors.add("Initialize error: Variable " + ctx.NAME(i).getText() + " not initialize");
            else if (!variables.get(ctx.NAME(i).getText()).equalsIgnoreCase("element"))
                errors.add("Cast error:  variable " + ctx.NAME(i).getText() + " is not element");
        }
        return ctx.getText();
    }

    @Override
    public String visitProgram(HelloParser.ProgramContext ctx) {
        String buffer = myImport;
        StringBuilder buffer1 = new StringBuilder();
        for (HelloParser.FunctionReturnContext context : ctx.functionReturn())
            buffer1.append(visitFunctionReturn(context));
        for (HelloParser.FunctionNonReturnContext context : ctx.functionNonReturn())
            buffer1.append(visitFunctionNonReturn(context));
        buffer += visitBlock(ctx.block());
        buffer += buffer1 + "\n}";
        StringBuilder error = new StringBuilder();
        if (errors.size() > 0) {
            for (String string : errors)
                error.append(string).append("\n");
            JOptionPane.showMessageDialog(null, error.toString());
        }
        return buffer;
    }

    @Override
    public String visitBlock(HelloParser.BlockContext ctx) {
        variables.increase();
        StringBuilder buffer = new StringBuilder("{\n");
        for (HelloParser.ContentContext context : ctx.content())
            buffer.append(visitContent(context)).append("\n");
        buffer.append("}\n");
        variables.decrease();
        return buffer.toString();
    }

    @Override
    public String visitDeclaration(HelloParser.DeclarationContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.SET() != null) {
                errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("set")) {
                errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not set");
            }
        } else {
            variables.put(ctx.NAME().getText(), "set");
            buffer += "Set ";
        }
        if (ctx.expression().functionCall() != null) {
            if (functions.get(ctx.expression().functionCall().NAME().getText()) != null)
                if (!functions.get(ctx.expression().functionCall().NAME().getText()).equalsIgnoreCase("set"))
                    errors.add("Cast error: function " + ctx.expression().functionCall().NAME().getText() + " return not set");
        }
        buffer += "" + ctx.NAME().getText() + " = " + visitExpression(ctx.expression()) + ";";
        return buffer;
    }

    @Override
    public String visitDeclarationElement(HelloParser.DeclarationElementContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.ELEMENT() != null) {
                errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("element")) {
                errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not element");
            }
        } else {
            variables.put(ctx.NAME().getText(), "element");
            buffer += "Element ";
        }
        if (ctx.LINE() != null)
            buffer += "" + ctx.NAME().getText() + " = new Element(" + ctx.LINE().getText() + ");";
        if (ctx.functionCall() != null) {
            if (functions.get(ctx.functionCall().NAME().getText()) != null)
                if (!functions.get(ctx.functionCall().NAME().getText()).equalsIgnoreCase("element"))
                    errors.add("Cast error: function " + ctx.functionCall().NAME().getText() + " return not element");
            buffer += "" + ctx.NAME().getText() + " = " + visitFunctionCall(ctx.functionCall()) + ";";
        }
        if (ctx.getExpression() != null)
            buffer += "" + ctx.NAME().getText() + " = " + visitGetExpression(ctx.getExpression()) + ";";
        return buffer;
    }

    @Override
    public String visitPrint(HelloParser.PrintContext ctx) {
        return "\tSystem.out.println(" + ctx.LINE().getText() + ");";
    }

    @Override
    public String visitPrintSet(HelloParser.PrintSetContext ctx) {
        if (variables.get(ctx.NAME().getText()) == null) {
            errors.add("Can't find symbol " + ctx.NAME().getText());
        }
        return "\tSystem.out.println(" + ctx.NAME().getText() + ".toString());";
    }

    @Override
    public String visitInputSignature(HelloParser.InputSignatureContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFunctionCall(HelloParser.FunctionCallContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null) {
            errors.add("Initialize error: cant find function " + ctx.NAME().getText());
        } else if (!checkSignatures(ctx.inputSignature(), functionSignatures.get(ctx.NAME().getText()))) {
            errors.add("Error: cant find such arguments in function " + ctx.NAME().getText());
        }
        if (ctx.inputSignature() != null)
            buffer += ctx.NAME().getText() + visitInputSignature(ctx.inputSignature());
        else buffer+=ctx.NAME().getText()+"()";
        return buffer;
    }

    @Override
    public String visitType(HelloParser.TypeContext ctx) {
        if (ctx.SET() != null)
            return "Set";
        if (ctx.ELEMENT() != null)
            return "Element";
        errors.add("Error: invalid type " + ctx.getText());
        return "";
    }

    @Override
    public String visitSignatureFunction(HelloParser.SignatureFunctionContext ctx) {
        StringBuilder buffer = new StringBuilder("(");
        for (int i = 0; i<ctx.NAME().size();i++) {
            buffer.append(visitType(ctx.type(i))).append(" ").append(ctx.NAME(i).getText());
            if(i!=ctx.NAME().size()-1)
                buffer.append(", ");
        }
        buffer.append(")");
        return buffer.toString();
    }

    @Override
    public String visitFunctionReturn(HelloParser.FunctionReturnContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null)
            functions.put(ctx.NAME().getText(), visitType(ctx.type()));
        else
            errors.add("Function name " + ctx.NAME().getText() + " already used");
        buffer += "\nprivate " + visitType(ctx.type()) + " " + ctx.NAME().getText();
        if (ctx.signatureFunction() != null) {
            buffer += visitSignatureFunction(ctx.signatureFunction()) + "throws Exception";
            functionSignatures.put(ctx.NAME().getText(), ctx.signatureFunction());
        }
        else buffer += "() throws Exception";
        variables.increase();
        if (ctx.signatureFunction() != null)
            for (int i = 0; i < ctx.signatureFunction().type().size(); i++)
                variables.put(ctx.signatureFunction().NAME(i).getText(), ctx.signatureFunction().type(i).getText());
        buffer += visitBlockReturn(ctx.blockReturn());
        return buffer;
    }

    @Override
    public String visitFunctionNonReturn(HelloParser.FunctionNonReturnContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null)
            functions.put(ctx.NAME().getText(), "void");
        else
            errors.add("Function name " + ctx.NAME().getText() + " already used");
        buffer += "private void " + ctx.NAME().getText();
        if (ctx.signatureFunction() != null) {
            buffer += visitSignatureFunction(ctx.signatureFunction()) + "throws Exception";
            functionSignatures.put(ctx.NAME().getText(), ctx.signatureFunction());
        }
        else buffer += "() throws Exception";
        variables.increase();
        for (int i = 0; i < ctx.signatureFunction().type().size(); i++)
            variables.put(ctx.signatureFunction().NAME(i).getText(), ctx.signatureFunction().type(i).getText());
        buffer += visitBlockNonReturn(ctx.blockNonReturn());
        return buffer;
    }

    @Override
    public String visitBlockReturn(HelloParser.BlockReturnContext ctx) {
        StringBuilder buffer = new StringBuilder("{\n");
        for (HelloParser.ContentContext context : ctx.content())
            buffer.append(visitContent(context)).append("\n");
        buffer.append("return ").append(ctx.NAME().getText()).append(";").append("\n}\n");
        if (variables.get(ctx.NAME().getText()) == null)
            errors.add("Error: cant find variable " + ctx.NAME().getText() + " at return");
        variables.decrease();
        return buffer.toString();
    }

    @Override
    public String visitBlockNonReturn(HelloParser.BlockNonReturnContext ctx) {
        StringBuilder buffer = new StringBuilder("{\n");
        for (HelloParser.ContentContext context : ctx.content())
            buffer.append(visitContent(context)).append("\n");
        buffer.append("return;\n}\n");
        variables.decrease();
        return buffer.toString();
    }

    @Override
    public String visitEqualCompare(HelloParser.EqualCompareContext ctx) {
        String buffer = "";
        if (ctx.EQUAL() != null)
            buffer += "equal(" + visitExpression(ctx.expression(0)) + "," + visitExpression(ctx.expression(1)) + ")";
        if (ctx.NON_EQUAL() != null)
            buffer += "nonEqual(" + visitExpression(ctx.expression(0)) + "," + visitExpression(ctx.expression(1)) + ")";
        return buffer;
    }

    @Override
    public String visitCompare(HelloParser.CompareContext ctx) {
        String buffer = "";
        buffer += visitSizeExpression(ctx.sizeExpression(0)) + ctx.getChild(1).getText() + visitSizeExpression(ctx.sizeExpression(1));
        return buffer;
    }

    @Override
    public String visitSimpleCompare(HelloParser.SimpleCompareContext ctx) {
        String buffer = "";
        if (ctx.equalCompare() != null)
            buffer += visitEqualCompare(ctx.equalCompare());
        if (ctx.compare() != null)
            buffer += visitCompare(ctx.compare());
        if (ctx.indexOfExpression() != null)
            buffer += visitIndexOfExpression(ctx.indexOfExpression());
        return buffer;
    }

    @Override
    public String visitNegationCompare(HelloParser.NegationCompareContext ctx) {
        return "!(" + visitSimpleCompare(ctx.simpleCompare()) + ")";
    }

    @Override
    public String visitIfBlock(HelloParser.IfBlockContext ctx) {
        String buffer = "";
        if (ctx.simpleCompare() != null)
            buffer += "if(" + visitSimpleCompare(ctx.simpleCompare()) + ")";
        if (ctx.negationCompare() != null)
            buffer += "if(" + visitNegationCompare(ctx.negationCompare()) + ")";
        buffer += visitBlock(ctx.block());
        if (ctx.elseBlock() != null)
            buffer += visitElseBlock(ctx.elseBlock());
        return buffer;
    }

    @Override
    public String visitElseBlock(HelloParser.ElseBlockContext ctx) {
        String buffer = "";
        buffer += "else" + visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitWhileBlock(HelloParser.WhileBlockContext ctx) {
        String buffer = "";
        if (ctx.simpleCompare() != null)
            buffer += "while(" + visitSimpleCompare(ctx.simpleCompare()) + ")";
        if (ctx.negationCompare() != null)
            buffer += "while(" + visitNegationCompare(ctx.negationCompare()) + ")";
        buffer += visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitSizeExpression(HelloParser.SizeExpressionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitGetExpression(HelloParser.GetExpressionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIndexOfExpression(HelloParser.IndexOfExpressionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpression(HelloParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            if (variables.get(ctx.NAME(0).getText()) == null
                    || variables.get(ctx.NAME(1).getText()) == null) {
                errors.add("Error: cant find variable " + ctx.NAME(0).getText()
                        + "|" + ctx.NAME(1).getText());
            } else if ((variables.get(ctx.NAME(0).getText()).equalsIgnoreCase("element") &&
                    variables.get(ctx.NAME(1).getText()).equalsIgnoreCase("set")))
                errors.add("Calculate error: variable " + ctx.NAME(0).getText() + " is element " +
                        " and " + variables.get(ctx.NAME(1).getText()) + " is set");
        }
        if (ctx.setExpression() != null)
            return "new Set(new Element[]" + visitSetExpression(ctx.setExpression()) + ")";
        if (ctx.PLUS() != null) {
            if (variables.get(ctx.getChild(0).getText()).equalsIgnoreCase("set") && variables.get(ctx.getChild(2).getText()).equalsIgnoreCase("set"))
                return "union(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        }
        if (ctx.MINUS() != null) {
            if (variables.get(ctx.getChild(0).getText()).equalsIgnoreCase("set") && variables.get(ctx.getChild(2).getText()).equalsIgnoreCase("set"))
                return "diff(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        }
        if (ctx.MULTIPLY() != null) {
            if (variables.get(ctx.getChild(0).getText()).equalsIgnoreCase("set") && variables.get(ctx.getChild(2).getText()).equalsIgnoreCase("set"))
                return "intersection(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() + ")";
        }
        if (ctx.functionCall() != null)
            return visitFunctionCall(ctx.functionCall());
        if (ctx.getExpression() != null)
            return visitGetExpression(ctx.getExpression());
        if (ctx.getChildCount() == 1) {
            if (variables.get(ctx.getChild(0).getText()) == null)
                errors.add("Error: cant find variable " + ctx.getChild(0).getText());
            return ctx.getChild(0).getText();
        }
        return "";
    }

    @Override
    public String visitContent(HelloParser.ContentContext ctx) {
        if (ctx.print() != null)
            return visitPrint(ctx.print());
        else if (ctx.declaration() != null)
            return visitDeclaration(ctx.declaration());
        else if (ctx.printSet() != null)
            return visitPrintSet(ctx.printSet());
        else if (ctx.functionCall() != null)
            return visitFunctionCall(ctx.functionCall()) + ";";
        else if (ctx.whileBlock() != null)
            return visitWhileBlock(ctx.whileBlock());
        else if (ctx.ifBlock() != null)
            return visitIfBlock(ctx.ifBlock());
        else if (ctx.declarationElement() != null)
            return visitDeclarationElement(ctx.declarationElement());
        else return "";
    }

//    @Override
//    public String visit(ParseTree parseTree) {
//        return null;
//    }
//
//    @Override
//    public String visitChildren(RuleNode ruleNode) {
//        return null;
//    }
//
//    @Override
//    public String visitTerminal(TerminalNode terminalNode) {
//        return null;
//    }
//
//    @Override
//    public String visitErrorNode(ErrorNode errorNode) {
//        return null;
//    }

    private boolean checkSignatures(HelloParser.InputSignatureContext in, HelloParser.SignatureFunctionContext sig) {
        boolean check = true;
        if (sig == null && in == null)
            return true;
        if (sig == null || in == null)
            return false;
        if (in.NAME().size() == sig.NAME().size()) {
            for (int i = 0; i < sig.type().size(); i++) {
                if (variables.get(in.NAME(i).getText()) == null
                        || !variables.get(in.NAME(i).getText()).equalsIgnoreCase(visitType(sig.type(i))))
                    check = false;
            }
        } else check = false;
        return check;
    }
}
