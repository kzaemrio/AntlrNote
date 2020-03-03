import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LibExprParser parser = Antlr.parserFile(
                "Expr/src/main/java/Input.expr",
                LibExprLexer::new,
                LibExprParser::new
        );
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}
