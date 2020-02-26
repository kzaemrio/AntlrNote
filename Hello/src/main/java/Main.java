public class Main {
    public static void main(String[] args) {
        HelloParser parser = Antlr.parser("hello x", HelloLexer::new, HelloParser::new);
        HelloParser.RContext tree = parser.r();
        System.out.println(tree.toStringTree(parser));
    }
}
