// Generated from custom_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link custom_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface custom_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(custom_grammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(custom_grammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(custom_grammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(custom_grammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#if_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_state(custom_grammarParser.If_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(custom_grammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(custom_grammarParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#f_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_block(custom_grammarParser.F_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#printer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinter(custom_grammarParser.PrinterContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#printer_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinter_argument(custom_grammarParser.Printer_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link custom_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(custom_grammarParser.ExpressionContext ctx);
}