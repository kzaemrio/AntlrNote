// Generated from /Users/x/Code/AntlrNote/LibExpr/src/main/java/LibExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LibExprParser}.
 */
public interface LibExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LibExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LibExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LibExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LibExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LibExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LibExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LibExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LibExprParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LibExprParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LibExprParser.FactorContext ctx);
}