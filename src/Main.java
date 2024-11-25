import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input_file = new Scanner(System.in);
        String path = input_file.nextLine();
        InputStream inpStream = new FileInputStream(path);
        ANTLRInputStream input = new ANTLRInputStream(inpStream);
        custom_grammarLexer lexer = new custom_grammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        custom_grammarParser parser = new custom_grammarParser(tokens);
        ParseTree tree = parser.program();
        CodeGenerator gen = new CodeGenerator();
        gen.visit(tree);
        System.out.println(gen.getCode());
        //System.out.println(tree.toStringTree(parser));
    }
}