// Generated from C:/Users/Administrator/IdeaProjects/CMM/src\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CMMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CMMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Svar}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSvar(CMMParser.SvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Svar}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSvar(CMMParser.SvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sbreak}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSbreak(CMMParser.SbreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sbreak}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSbreak(CMMParser.SbreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sassign}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSassign(CMMParser.SassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sassign}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSassign(CMMParser.SassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sread}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSread(CMMParser.SreadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sread}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSread(CMMParser.SreadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Swrite}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwrite(CMMParser.SwriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Swrite}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwrite(CMMParser.SwriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sif}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSif(CMMParser.SifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sif}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSif(CMMParser.SifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Swhile}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwhile(CMMParser.SwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Swhile}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwhile(CMMParser.SwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sblock}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSblock(CMMParser.SblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sblock}
	 * labeled alternative in {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSblock(CMMParser.SblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CMMParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CMMParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CMMParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CMMParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CMMParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CMMParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(CMMParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(CMMParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(CMMParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(CMMParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(CMMParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(CMMParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(CMMParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(CMMParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(CMMParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(CMMParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Before}
	 * labeled alternative in {@link CMMParser#selfOpStmt}.
	 * @param ctx the parse tree
	 */
	void enterBefore(CMMParser.BeforeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Before}
	 * labeled alternative in {@link CMMParser#selfOpStmt}.
	 * @param ctx the parse tree
	 */
	void exitBefore(CMMParser.BeforeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code After}
	 * labeled alternative in {@link CMMParser#selfOpStmt}.
	 * @param ctx the parse tree
	 */
	void enterAfter(CMMParser.AfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code After}
	 * labeled alternative in {@link CMMParser#selfOpStmt}.
	 * @param ctx the parse tree
	 */
	void exitAfter(CMMParser.AfterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(CMMParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(CMMParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(CMMParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(CMMParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntArr}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntArr(CMMParser.IntArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntArr}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntArr(CMMParser.IntArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleArr}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleArr(CMMParser.DoubleArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleArr}
	 * labeled alternative in {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleArr(CMMParser.DoubleArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasValue}
	 * labeled alternative in {@link CMMParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterHasValue(CMMParser.HasValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasValue}
	 * labeled alternative in {@link CMMParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitHasValue(CMMParser.HasValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noValue}
	 * labeled alternative in {@link CMMParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterNoValue(CMMParser.NoValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noValue}
	 * labeled alternative in {@link CMMParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitNoValue(CMMParser.NoValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aryId}
	 * labeled alternative in {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAryId(CMMParser.AryIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aryId}
	 * labeled alternative in {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAryId(CMMParser.AryIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterId(CMMParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitId(CMMParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntCon}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntCon(CMMParser.IntConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntCon}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntCon(CMMParser.IntConContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleCon}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterDoubleCon(CMMParser.DoubleConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleCon}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitDoubleCon(CMMParser.DoubleConContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTrue(CMMParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTrue(CMMParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterFalse(CMMParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitFalse(CMMParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Val}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVal(CMMParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVal(CMMParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(CMMParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(CMMParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CMMParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CMMParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(CMMParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(CMMParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicNot(CMMParser.LogicNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicNot(CMMParser.LogicNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CMMParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CMMParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(CMMParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(CMMParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicComp}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicComp(CMMParser.LogicCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicComp}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicComp(CMMParser.LogicCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComp(CMMParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComp(CMMParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(CMMParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(CMMParser.WordsContext ctx);
}