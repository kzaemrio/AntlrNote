import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JavaParser parser = Antlr.parserFile(
                "ExtractInterface/src/main/java/Demo.java",
                JavaLexer::new,
                JavaParser::new
        );

        ParseTree tree = parser.compilationUnit();
        new ParseTreeWalker().walk(listener(parser), tree);
    }

    private static ParseTreeListener listener(JavaParser parser) {
        return new JavaParserBaseListener() {
            @Override
            public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
                super.enterClassDeclaration(ctx);
                System.out.println(String.format("interface I%s {", ctx.IDENTIFIER()));
            }

            @Override
            public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
                super.exitClassDeclaration(ctx);
                System.out.println("}");
            }

            @Override
            public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
                super.enterMethodDeclaration(ctx);
                TokenStream tokenStream = parser.getTokenStream();
                String type = tokenStream.getText(ctx.typeTypeOrVoid());
                String args = tokenStream.getText(ctx.formalParameters());
                System.out.println(String.format("\t%s %s%s;", type, ctx.IDENTIFIER(), args));
            }
        };
    }
}
