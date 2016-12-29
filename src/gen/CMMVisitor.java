package gen;// Generated from C:/Users/Administrator/IdeaProjects/CMM/src\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMMParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CMMParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Svar}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvar(CMMParser.SvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sbreak}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSbreak(CMMParser.SbreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sassign}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSassign(CMMParser.SassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sread}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSread(CMMParser.SreadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Swrite}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwrite(CMMParser.SwriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sif}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSif(CMMParser.SifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Swhile}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwhile(CMMParser.SwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sblock}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSblock(CMMParser.SblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CMMParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CMMParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CMMParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(CMMParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(CMMParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(CMMParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(CMMParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#stmtBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(CMMParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Before}
	 * labeled alternative in {@link CMMParser#selfOpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBefore(CMMParser.BeforeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code After}
	 * labeled alternative in {@link CMMParser#selfOpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfter(CMMParser.AfterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(CMMParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(CMMParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntArr}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArr(CMMParser.IntArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleArr}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleArr(CMMParser.DoubleArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasValue}
	 * labeled alternative in {@link CMMParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasValue(CMMParser.HasValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noValue}
	 * labeled alternative in {@link CMMParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoValue(CMMParser.NoValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aryId}
	 * labeled alternative in {@link CMMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAryId(CMMParser.AryIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CMMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CMMParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntCon}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCon(CMMParser.IntConContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleCon}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleCon(CMMParser.DoubleConContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(CMMParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(CMMParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(CMMParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(CMMParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CMMParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(CMMParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicNot(CMMParser.LogicNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CMMParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(CMMParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicComp}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicComp(CMMParser.LogicCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(CMMParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWords(CMMParser.WordsContext ctx);
}