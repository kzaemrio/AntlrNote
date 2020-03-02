public class Main {
    public static void main(String[] args) {
        HelloParser parser = Antlr.parserString("hello x", HelloLexer::new, HelloParser::new);
        HelloParser.RContext tree = parser.r();
        System.out.println(tree.toStringTree(parser));
    }
}
