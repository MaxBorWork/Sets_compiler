package by.borisevich.compiler;

import by.borisevich.compiler.antlr.HelloLexer;
import by.borisevich.compiler.antlr.HelloParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {

    public static void main( String[] args) throws Exception
    {
        if (args.length != 1) {
            return;
        }
        String text = getString(args[0]);
        if (text != null) {
            HelloLexer lexer = new HelloLexer(CharStreams.fromString(text));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HelloParser parser = new HelloParser(tokens);
            ParseTree tree = parser.program();
            SetVisitor visitor = new SetVisitor();
            String out = (String) visitor.visit(tree);
            FileWriter fileWriter = new FileWriter("Program.java");
            fileWriter.write(out);
            fileWriter.close();
        }
    }

    private static String getString(String filename) {
        InputStream is = null;
        try {
            is = new FileInputStream(filename);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();
            while(line != null){
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
