/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/*
{
    "description" : "An imaginary server config file",
    "logs" : {"level":"verbose", "dir":"/var/log"},
    "host" : "antlr.org",
    "admin": ["parrt", "tombu"]
    "aliases": []
}

to

<description>An imaginary server config file</description>
<logs>
    <level>verbose</level>
    <dir>/var/log</dir>
</logs>
<host>antlr.org</host>
<admin>
    <element>parrt</element> <!-- inexact -->
    <element>tombu</element>
</admin>
<aliases></aliases>
 */

public class Json2XML {
    public static class XMLEmitter extends JsonBaseListener {
        ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

        String getXML(ParseTree ctx) {
            return xml.get(ctx);
        }

        void setXML(ParseTree ctx, String s) {
            xml.put(ctx, s);
        }

        @Override
        public void exitJson(JsonParser.JsonContext ctx) {
            setXML(ctx, getXML(ctx.getChild(0)));
        }

        @Override
        public void exitAnObject(JsonParser.AnObjectContext ctx) {
            StringBuilder buf = new StringBuilder();
            buf.append("\n");
            for (JsonParser.PairContext pctx : ctx.pair()) {
                buf.append(getXML(pctx));
            }
            setXML(ctx, buf.toString());
        }

        @Override
        public void exitEmptyObject(JsonParser.EmptyObjectContext ctx) {
            setXML(ctx, "");
        }

        @Override
        public void exitArrayOfValues(JsonParser.ArrayOfValuesContext ctx) {
            StringBuilder buf = new StringBuilder();
            buf.append("\n");
            for (JsonParser.ValueContext vctx : ctx.value()) {
                buf.append("<element>"); // conjure up element for valid XML
                buf.append(getXML(vctx));
                buf.append("</element>");
                buf.append("\n");
            }
            setXML(ctx, buf.toString());
        }

        @Override
        public void exitEmptyArray(JsonParser.EmptyArrayContext ctx) {
            setXML(ctx, "");
        }

        @Override
        public void exitPair(JsonParser.PairContext ctx) {
            String tag = stripQuotes(ctx.STRING().getText());
            JsonParser.ValueContext vctx = ctx.value();
            String x = String.format("<%s>%s</%s>\n", tag, getXML(vctx), tag);
            setXML(ctx, x);
        }

        @Override
        public void exitObjectValue(JsonParser.ObjectValueContext ctx) {
            // analogous to String value() {return object();}
            setXML(ctx, getXML(ctx.obj()));
        }

        @Override
        public void exitArrayValue(JsonParser.ArrayValueContext ctx) {
            setXML(ctx, getXML(ctx.array())); // String value() {return array();}
        }

        @Override
        public void exitAtom(JsonParser.AtomContext ctx) {
            setXML(ctx, ctx.getText());
        }

        @Override
        public void exitString(JsonParser.StringContext ctx) {
            setXML(ctx, stripQuotes(ctx.getText()));
        }

        public static String stripQuotes(String s) {
            if (s == null || s.charAt(0) != '"') return s;
            return s.substring(1, s.length() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        JsonParser parser = Antlr.parserFile(
                "JsonToXml/src/main/java/t.json",
                JsonLexer::new,
                JsonParser::new
        );
        ParseTree tree = parser.json();
        ParseTreeWalker walker = new ParseTreeWalker();
        XMLEmitter converter = new XMLEmitter();
        walker.walk(converter, tree);
        System.out.println(converter.getXML(tree));
    }
}
