// Generated from /Users/x/Code/AntlrNote/JsonToXml/src/main/java/Json.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            STRING = 10, NUMBER = 11, WS = 12;
    public static final int
            RULE_json = 0, RULE_value = 1, RULE_obj = 2, RULE_pair = 3, RULE_array = 4;

    private static String[] makeRuleNames() {
        return new String[]{
                "json", "value", "obj", "pair", "array"
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
    public ATN getATN() {
        return _ATN;
    }

    public JsonParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class JsonContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public JsonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_json;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterJson(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitJson(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitJson(this);
            else return visitor.visitChildren(this);
        }
    }

    public final JsonContext json() throws RecognitionException {
        JsonContext _localctx = new JsonContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_json);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(10);
                value();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ValueContext extends ParserRuleContext {
        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        public ValueContext() {
        }

        public void copyFrom(ValueContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ObjectValueContext extends ValueContext {
        public ObjContext obj() {
            return getRuleContext(ObjContext.class, 0);
        }

        public ObjectValueContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterObjectValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitObjectValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitObjectValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringContext extends ValueContext {
        public TerminalNode STRING() {
            return getToken(JsonParser.STRING, 0);
        }

        public StringContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitString(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArrayValueContext extends ValueContext {
        public ArrayContext array() {
            return getRuleContext(ArrayContext.class, 0);
        }

        public ArrayValueContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterArrayValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitArrayValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitArrayValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AtomContext extends ValueContext {
        public TerminalNode NUMBER() {
            return getToken(JsonParser.NUMBER, 0);
        }

        public AtomContext(ValueContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_value);
        try {
            setState(19);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case STRING:
                    _localctx = new StringContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(12);
                    match(STRING);
                }
                break;
                case NUMBER:
                    _localctx = new AtomContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(13);
                    match(NUMBER);
                }
                break;
                case T__3:
                    _localctx = new ObjectValueContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(14);
                    obj();
                }
                break;
                case T__7:
                    _localctx = new ArrayValueContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(15);
                    array();
                }
                break;
                case T__0:
                    _localctx = new AtomContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(16);
                    match(T__0);
                }
                break;
                case T__1:
                    _localctx = new AtomContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(17);
                    match(T__1);
                }
                break;
                case T__2:
                    _localctx = new AtomContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(18);
                    match(T__2);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ObjContext extends ParserRuleContext {
        public ObjContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_obj;
        }

        public ObjContext() {
        }

        public void copyFrom(ObjContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AnObjectContext extends ObjContext {
        public List<PairContext> pair() {
            return getRuleContexts(PairContext.class);
        }

        public PairContext pair(int i) {
            return getRuleContext(PairContext.class, i);
        }

        public AnObjectContext(ObjContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterAnObject(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitAnObject(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitAnObject(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EmptyObjectContext extends ObjContext {
        public EmptyObjectContext(ObjContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterEmptyObject(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitEmptyObject(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitEmptyObject(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ObjContext obj() throws RecognitionException {
        ObjContext _localctx = new ObjContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_obj);
        int _la;
        try {
            setState(34);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    _localctx = new AnObjectContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(21);
                    match(T__3);
                    setState(22);
                    pair();
                    setState(27);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__4) {
                        {
                            {
                                setState(23);
                                match(T__4);
                                setState(24);
                                pair();
                            }
                        }
                        setState(29);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(30);
                    match(T__5);
                }
                break;
                case 2:
                    _localctx = new EmptyObjectContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(32);
                    match(T__3);
                    setState(33);
                    match(T__5);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PairContext extends ParserRuleContext {
        public TerminalNode STRING() {
            return getToken(JsonParser.STRING, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public PairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pair;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterPair(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitPair(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitPair(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PairContext pair() throws RecognitionException {
        PairContext _localctx = new PairContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_pair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                match(STRING);
                setState(37);
                match(T__6);
                setState(38);
                value();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayContext extends ParserRuleContext {
        public ArrayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array;
        }

        public ArrayContext() {
        }

        public void copyFrom(ArrayContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ArrayOfValuesContext extends ArrayContext {
        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        public ArrayOfValuesContext(ArrayContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterArrayOfValues(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitArrayOfValues(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitArrayOfValues(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EmptyArrayContext extends ArrayContext {
        public EmptyArrayContext(ArrayContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).enterEmptyArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JsonListener) ((JsonListener) listener).exitEmptyArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JsonVisitor) return ((JsonVisitor<? extends T>) visitor).visitEmptyArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayContext array() throws RecognitionException {
        ArrayContext _localctx = new ArrayContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_array);
        int _la;
        try {
            setState(53);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    _localctx = new ArrayOfValuesContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(40);
                    match(T__7);
                    setState(41);
                    value();
                    setState(46);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__4) {
                        {
                            {
                                setState(42);
                                match(T__4);
                                setState(43);
                                value();
                            }
                        }
                        setState(48);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(49);
                    match(T__8);
                }
                break;
                case 2:
                    _localctx = new EmptyArrayContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(51);
                    match(T__7);
                    setState(52);
                    match(T__8);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16:\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\26" +
                    "\n\3\3\4\3\4\3\4\3\4\7\4\34\n\4\f\4\16\4\37\13\4\3\4\3\4\3\4\3\4\5\4%" +
                    "\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\6\3\6" +
                    "\3\6\3\6\5\68\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2>\2\f\3\2\2\2\4\25\3\2\2\2" +
                    "\6$\3\2\2\2\b&\3\2\2\2\n\67\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\26\7\f" +
                    "\2\2\17\26\7\r\2\2\20\26\5\6\4\2\21\26\5\n\6\2\22\26\7\3\2\2\23\26\7\4" +
                    "\2\2\24\26\7\5\2\2\25\16\3\2\2\2\25\17\3\2\2\2\25\20\3\2\2\2\25\21\3\2" +
                    "\2\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\5\3\2\2\2\27\30\7\6" +
                    "\2\2\30\35\5\b\5\2\31\32\7\7\2\2\32\34\5\b\5\2\33\31\3\2\2\2\34\37\3\2" +
                    "\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\b\2\2!" +
                    "%\3\2\2\2\"#\7\6\2\2#%\7\b\2\2$\27\3\2\2\2$\"\3\2\2\2%\7\3\2\2\2&\'\7" +
                    "\f\2\2\'(\7\t\2\2()\5\4\3\2)\t\3\2\2\2*+\7\n\2\2+\60\5\4\3\2,-\7\7\2\2" +
                    "-/\5\4\3\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2" +
                    "\2\62\60\3\2\2\2\63\64\7\13\2\2\648\3\2\2\2\65\66\7\n\2\2\668\7\13\2\2" +
                    "\67*\3\2\2\2\67\65\3\2\2\28\13\3\2\2\2\7\25\35$\60\67";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}