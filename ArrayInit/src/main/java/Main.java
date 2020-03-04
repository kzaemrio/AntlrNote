import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Main {
    public static void main(String[] args) {
        ArrayInitParser parser = Antlr.parserString("{1, 2, 3, 4}", ArrayInitLexer::new, ArrayInitParser::new);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));
        new ParseTreeWalker().walk(listener(), tree);
    }

    private static ParseTreeListener listener() {
        return new ArrayInitBaseListener() {
            @Override
            public void enterInit(ArrayInitParser.InitContext ctx) {
                super.enterInit(ctx);
                System.out.print('"');
            }

            @Override
            public void exitInit(ArrayInitParser.InitContext ctx) {
                super.exitInit(ctx);
                System.out.print('"');
            }

            @Override
            public void enterValue(ArrayInitParser.ValueContext ctx) {
                super.enterValue(ctx);
                TerminalNode node = ctx.INT();
                if (node != null) {
                    int value = Integer.parseInt(node.getText());
                    System.out.printf("\\u%04x", value);
                }
            }
        };
    }
}
