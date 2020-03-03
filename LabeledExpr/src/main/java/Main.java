import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        LabeledExprParser parser = Antlr.parserFile(
                "Expr/src/main/java/Input.expr",
                LabeledExprLexer::new,
                LabeledExprParser::new
        );
        ParseTree tree = parser.prog();
        visitor().visit(tree);
    }

    private static ParseTreeVisitor<Integer> visitor() {
        return new LabeledExprBaseVisitor<Integer>() {

            Map<String, Integer> memory = new HashMap<>();

            @Override
            public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
                String id = ctx.ID().getText();
                Integer value = visit(ctx.expr());
                memory.put(id, value);
                return value;
            }

            @Override
            public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
                System.out.println(visit(ctx.expr()));
                return 0;
            }

            @Override
            public Integer visitInt(LabeledExprParser.IntContext ctx) {
                return Integer.valueOf(ctx.INT().getText());
            }

            @Override
            public Integer visitId(LabeledExprParser.IdContext ctx) {
                return memory.getOrDefault(ctx.ID().getText(), 0);
            }

            @Override
            public Integer visitMul(LabeledExprParser.MulContext ctx) {
                Integer left = visit(ctx.expr(0));
                Integer right = visit(ctx.expr(1));
                return left * right;
            }

            @Override
            public Integer visitDiv(LabeledExprParser.DivContext ctx) {
                Integer left = visit(ctx.expr(0));
                Integer right = visit(ctx.expr(1));
                return left / right;
            }

            @Override
            public Integer visitAdd(LabeledExprParser.AddContext ctx) {
                Integer left = visit(ctx.expr(0));
                Integer right = visit(ctx.expr(1));
                return left + right;
            }

            @Override
            public Integer visitSub(LabeledExprParser.SubContext ctx) {
                Integer left = visit(ctx.expr(0));
                Integer right = visit(ctx.expr(1));
                return left - right;
            }

            @Override
            public Integer visitParens(LabeledExprParser.ParensContext ctx) {
                return visit(ctx.expr());
            }
        };
    }
}
