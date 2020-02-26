import org.antlr.v4.runtime.*;

import java.util.function.Function;

public class Antlr {
    public static <SubLexer extends Lexer, SubParser extends Parser> SubParser parser(String input,
                                                                                      Function<CharStream, SubLexer> lexerFactory,
                                                                                      Function<TokenStream, SubParser> parserFactory) {

        CodePointCharStream charStream = CharStreams.fromString(input);
        SubLexer lexer = lexerFactory.apply(charStream);
        BufferedTokenStream tokenStream = new BufferedTokenStream(lexer);
        return parserFactory.apply(tokenStream);
    }
}
