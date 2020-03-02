import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.function.Function;

public class Antlr {
    public static <SubLexer extends Lexer, SubParser extends Parser> SubParser parserString(String input,
                                                                                            Function<CharStream, SubLexer> lexerFactory,
                                                                                            Function<TokenStream, SubParser> parserFactory) {

        return parser(lexerFactory, parserFactory, CharStreams.fromString(input));
    }

    public static <SubLexer extends Lexer, SubParser extends Parser> SubParser parserFile(String fileName,
                                                                                          Function<CharStream, SubLexer> lexerFactory,
                                                                                          Function<TokenStream, SubParser> parserFactory) throws IOException {

        return parser(lexerFactory, parserFactory, CharStreams.fromFileName(fileName));
    }

    private static <SubLexer extends Lexer, SubParser extends Parser> SubParser parser(
            Function<CharStream, SubLexer> lexerFactory,
            Function<TokenStream, SubParser> parserFactory,
            CharStream charStream) {

        SubLexer lexer = lexerFactory.apply(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        return parserFactory.apply(tokenStream);
    }
}
