// Generated from /Users/x/Code/AntlrNote/JsonToXml/src/main/java/Json.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            STRING = 10, NUMBER = 11, WS = 12;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "STRING", "NUMBER", "WS", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "INT",
                "EXP"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'true'", "'false'", "'null'", "'{'", "','", "'}'", "':'", "'['",
                "']'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, "STRING",
                "NUMBER", "WS"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public JsonLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Json.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0082\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3" +
                    "\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3" +
                    "\13\7\13G\n\13\f\13\16\13J\13\13\3\13\3\13\3\f\5\fO\n\f\3\f\3\f\3\f\6" +
                    "\fT\n\f\r\f\16\fU\5\fX\n\f\3\f\5\f[\n\f\3\r\6\r^\n\r\r\r\16\r_\3\r\3\r" +
                    "\3\16\3\16\3\16\5\16g\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21" +
                    "\3\21\3\22\3\22\3\22\7\22v\n\22\f\22\16\22y\13\22\5\22{\n\22\3\23\3\23" +
                    "\5\23\177\n\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23" +
                    "\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\3\2\n\3\2\62;\5\2\13\f\17" +
                    "\17\"\"\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\63;\4\2GGg" +
                    "g\4\2--//\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13" +
                    "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2" +
                    "\2\2\27\3\2\2\2\2\31\3\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7\62\3\2\2\2\t\67" +
                    "\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25" +
                    "C\3\2\2\2\27N\3\2\2\2\31]\3\2\2\2\33c\3\2\2\2\35h\3\2\2\2\37n\3\2\2\2" +
                    "!p\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'(\7v\2\2()\7t\2\2)*\7w\2\2*+\7g\2\2+\4" +
                    "\3\2\2\2,-\7h\2\2-.\7c\2\2./\7n\2\2/\60\7u\2\2\60\61\7g\2\2\61\6\3\2\2" +
                    "\2\62\63\7p\2\2\63\64\7w\2\2\64\65\7n\2\2\65\66\7n\2\2\66\b\3\2\2\2\67" +
                    "8\7}\2\28\n\3\2\2\29:\7.\2\2:\f\3\2\2\2;<\7\177\2\2<\16\3\2\2\2=>\7<\2" +
                    "\2>\20\3\2\2\2?@\7]\2\2@\22\3\2\2\2AB\7_\2\2B\24\3\2\2\2CH\7$\2\2DG\5" +
                    "\33\16\2EG\5!\21\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I" +
                    "K\3\2\2\2JH\3\2\2\2KL\7$\2\2L\26\3\2\2\2MO\7/\2\2NM\3\2\2\2NO\3\2\2\2" +
                    "OP\3\2\2\2PW\5#\22\2QS\7\60\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2" +
                    "\2UV\3\2\2\2VX\3\2\2\2WQ\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5%\23\2ZY\3\2\2" +
                    "\2Z[\3\2\2\2[\30\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3" +
                    "\2\2\2`a\3\2\2\2ab\b\r\2\2b\32\3\2\2\2cf\7^\2\2dg\t\4\2\2eg\5\35\17\2" +
                    "fd\3\2\2\2fe\3\2\2\2g\34\3\2\2\2hi\7w\2\2ij\5\37\20\2jk\5\37\20\2kl\5" +
                    "\37\20\2lm\5\37\20\2m\36\3\2\2\2no\t\5\2\2o \3\2\2\2pq\n\6\2\2q\"\3\2" +
                    "\2\2r{\7\62\2\2sw\t\7\2\2tv\t\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3" +
                    "\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2zs\3\2\2\2{$\3\2\2\2|~\t\b\2\2}\177" +
                    "\t\t\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\5#\22\2" +
                    "\u0081&\3\2\2\2\16\2FHNUWZ_fwz~\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}