import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        LabeledExprParser parser = Antlr.parserFile(
                "LabeledExpr/src/main/java/Input.expr",
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
                return visit(ctx.term()) * visit(ctx.factor());
            }

            @Override
            public Integer visitDiv(LabeledExprParser.DivContext ctx) {
                return visit(ctx.term()) / visit(ctx.factor());
            }

            @Override
            public Integer visitAdd(LabeledExprParser.AddContext ctx) {
                return visit(ctx.expr()) + visit(ctx.term());
            }

            @Override
            public Integer visitSub(LabeledExprParser.SubContext ctx) {
                return visit(ctx.expr()) - visit(ctx.term());
            }

            @Override
            public Integer visitPar(LabeledExprParser.ParContext ctx) {
                return visit(ctx.expr());
            }
        };
    }
}
