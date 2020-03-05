// Generated from /Users/x/Code/AntlrNote/CsvParser/src/main/java/Csv.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CsvParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CsvParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(CsvParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(CsvParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CsvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CsvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterText(CsvParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitText(CsvParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterString(CsvParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitString(CsvParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(CsvParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(CsvParser.EmptyContext ctx);
}