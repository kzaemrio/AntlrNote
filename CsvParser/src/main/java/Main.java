import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvParser parser = Antlr.parserFile(
                "CsvParser/src/main/java/data.csv",
                CsvLexer::new,
                CsvParser::new
        );
        ParseTree tree = parser.file();
        List<Map<String, String>> list = new LinkedList<>();
        new ParseTreeWalker().walk(listener(list), tree);
        System.out.println(list);
    }

    private static ParseTreeListener listener(List<Map<String, String>> list) {
        return new CsvBaseListener() {

            List<String> header;
            List<String> cache;

            @Override
            public void exitHdr(CsvParser.HdrContext ctx) {
                super.exitHdr(ctx);
                header = cache;
            }

            @Override
            public void enterRow(CsvParser.RowContext ctx) {
                super.enterRow(ctx);
                cache = new LinkedList<>();
            }

            @Override
            public void exitRow(CsvParser.RowContext ctx) {
                super.exitRow(ctx);
                if (ctx.parent instanceof CsvParser.FileContext) {
                    Map<String, String> map = new LinkedHashMap<>();
                    for (int i = 0; i < cache.size(); i++) {
                        map.put(header.get(i), cache.get(i));
                    }
                    list.add(map);
                }
            }

            @Override
            public void exitText(CsvParser.TextContext ctx) {
                super.exitText(ctx);
                cache.add(ctx.TEXT().getText());
            }

            @Override
            public void exitString(CsvParser.StringContext ctx) {
                super.exitString(ctx);
                cache.add(ctx.STRING().getText());
            }

            @Override
            public void exitEmpty(CsvParser.EmptyContext ctx) {
                super.exitEmpty(ctx);
                cache.add("");
            }

        };
    }
}
