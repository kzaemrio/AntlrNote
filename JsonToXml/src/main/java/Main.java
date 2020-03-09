import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonParser parser = Antlr.parserFile(
                "JsonToXml/src/main/java/t.json",
                JsonLexer::new,
                JsonParser::new
        );
        ParseTree tree = parser.json();
        Wrapper wrapper = Wrapper.create();
        ParseTreeWalker.DEFAULT.walk(listener(wrapper), tree);
        System.out.println(wrapper.getXml(tree));
    }

    private static ParseTreeListener listener(Wrapper wrapper) {

        return new JsonBaseListener() {
            @Override
            public void exitAtom(JsonParser.AtomContext ctx) {
                super.exitAtom(ctx);
                wrapper.setXml(ctx, ctx.getText());
            }

            @Override
            public void exitString(JsonParser.StringContext ctx) {
                super.exitString(ctx);
                wrapper.setXml(ctx, stripQuotes(ctx.getText()));
            }

            @Override
            public void exitObjectValue(JsonParser.ObjectValueContext ctx) {
                super.exitObjectValue(ctx);
                wrapper.setXml(ctx, wrapper.getXml(ctx.obj()));
            }

            @Override
            public void exitPair(JsonParser.PairContext ctx) {
                super.exitPair(ctx);
                String tag = stripQuotes(ctx.STRING().getText());
                JsonParser.ValueContext valueContext = ctx.value();
                String text = String.format("<%s>%s</%s>", tag, wrapper.getXml(valueContext), tag);
                wrapper.setXml(ctx, text);
            }

            @Override
            public void exitAnObject(JsonParser.AnObjectContext ctx) {
                super.exitAnObject(ctx);
                StringBuilder builder = new StringBuilder();
                builder.append("\n");
                for (JsonParser.PairContext context : ctx.pair()) {
                    builder.append(wrapper.getXml(context));
                }
                wrapper.setXml(ctx, builder.toString());
            }

            @Override
            public void exitEmptyObject(JsonParser.EmptyObjectContext ctx) {
                super.exitEmptyObject(ctx);
                wrapper.setXml(ctx, "");
            }

            @Override
            public void exitArrayValue(JsonParser.ArrayValueContext ctx) {
                super.exitArrayValue(ctx);
                StringBuilder builder = new StringBuilder();
                for (ParseTree child : ctx.children) {
                    builder.append(wrapper.getXml(child));
                    builder.append("\n");
                }
                wrapper.setXml(ctx, builder.toString());
            }

            @Override
            public void exitArrayOfValues(JsonParser.ArrayOfValuesContext ctx) {
                super.exitArrayOfValues(ctx);
                StringBuilder builder = new StringBuilder();
                builder.append("\n");
                for (JsonParser.ValueContext context : ctx.value()) {
                    builder.append("<element>");
                    builder.append(wrapper.getXml(context));
                    builder.append("</element>");
                    builder.append("\n");
                }
                wrapper.setXml(ctx, builder.toString());
            }

            @Override
            public void exitEmptyArray(JsonParser.EmptyArrayContext ctx) {
                super.exitEmptyArray(ctx);
                wrapper.setXml(ctx, "");
            }

            @Override
            public void exitJson(JsonParser.JsonContext ctx) {
                super.exitJson(ctx);
                wrapper.setXml(ctx, wrapper.getXml(ctx.getChild(0)));
            }

            private String stripQuotes(String text) {
                return text.replace("\"", "");
            }
        };
    }

    private interface Wrapper {
        static Wrapper create() {
            return new Wrapper() {

                ParseTreeProperty<String> xml = new ParseTreeProperty<>();

                @Override
                public String getXml(ParseTree tree) {
                    return xml.get(tree);
                }

                @Override
                public void setXml(ParseTree ctx, String text) {
                    xml.put(ctx, text);
                }
            };
        }

        String getXml(ParseTree ctx);

        void setXml(ParseTree ctx, String text);
    }
}
