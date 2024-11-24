// Generated from custom_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link custom_grammarParser}.
 */
public interface custom_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(custom_grammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(custom_grammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(custom_grammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(custom_grammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(custom_grammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(custom_grammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(custom_grammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(custom_grammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#if_state}.
	 * @param ctx the parse tree
	 */
	void enterIf_state(custom_grammarParser.If_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#if_state}.
	 * @param ctx the parse tree
	 */
	void exitIf_state(custom_grammarParser.If_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(custom_grammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(custom_grammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(custom_grammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(custom_grammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#f_block}.
	 * @param ctx the parse tree
	 */
	void enterF_block(custom_grammarParser.F_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#f_block}.
	 * @param ctx the parse tree
	 */
	void exitF_block(custom_grammarParser.F_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#printer}.
	 * @param ctx the parse tree
	 */
	void enterPrinter(custom_grammarParser.PrinterContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#printer}.
	 * @param ctx the parse tree
	 */
	void exitPrinter(custom_grammarParser.PrinterContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#printer_argument}.
	 * @param ctx the parse tree
	 */
	void enterPrinter_argument(custom_grammarParser.Printer_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#printer_argument}.
	 * @param ctx the parse tree
	 */
	void exitPrinter_argument(custom_grammarParser.Printer_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link custom_grammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(custom_grammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link custom_grammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(custom_grammarParser.ExpressionContext ctx);
}