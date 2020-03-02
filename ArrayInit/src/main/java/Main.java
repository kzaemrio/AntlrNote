import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        ArrayInitParser parser = Antlr.parser("{1, {2, 3}, 4}", ArrayInitLexer::new, ArrayInitParser::new);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));
    }
}
