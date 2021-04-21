// Generated from C:/Users/Dan/university-git/Year 3/COMP3200 - Individual Research Project/research-project/deliverables/code/parser\Elune.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EluneParser}.
 */
public interface EluneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EluneParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(EluneParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(EluneParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EluneParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EluneParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sep}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSep(EluneParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sep}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSep(EluneParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalVar}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVar(EluneParser.GlobalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalVar}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVar(EluneParser.GlobalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVar(EluneParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVar(EluneParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncall_}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall_(EluneParser.Functioncall_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncall_}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall_(EluneParser.Functioncall_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code statLabel}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatLabel(EluneParser.StatLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statLabel}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatLabel(EluneParser.StatLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(EluneParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(EluneParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue(EluneParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue(EluneParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goto}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGoto(EluneParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goto}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGoto(EluneParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDo(EluneParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDo(EluneParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(EluneParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(EluneParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(EluneParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(EluneParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(EluneParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(EluneParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(EluneParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(EluneParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForeach(EluneParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForeach(EluneParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalFunc}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunc(EluneParser.GlobalFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalFunc}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunc(EluneParser.GlobalFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunc(EluneParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunc(EluneParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objFunc}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterObjFunc(EluneParser.ObjFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objFunc}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitObjFunc(EluneParser.ObjFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code att}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAtt(EluneParser.AttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code att}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAtt(EluneParser.AttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(EluneParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(EluneParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatch}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(EluneParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatch}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(EluneParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exception}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterException(EluneParser.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exception}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitException(EluneParser.ExceptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(EluneParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(EluneParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printBrackets}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintBrackets(EluneParser.PrintBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printBrackets}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintBrackets(EluneParser.PrintBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EluneParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EluneParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importModule}
	 * labeled alternative in {@link EluneParser#importdef}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(EluneParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importModule}
	 * labeled alternative in {@link EluneParser#importdef}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(EluneParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#assignexp}.
	 * @param ctx the parse tree
	 */
	void enterAssignexp(EluneParser.AssignexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#assignexp}.
	 * @param ctx the parse tree
	 */
	void exitAssignexp(EluneParser.AssignexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#compoundassign}.
	 * @param ctx the parse tree
	 */
	void enterCompoundassign(EluneParser.CompoundassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#compoundassign}.
	 * @param ctx the parse tree
	 */
	void exitCompoundassign(EluneParser.CompoundassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#attnamelist}.
	 * @param ctx the parse tree
	 */
	void enterAttnamelist(EluneParser.AttnamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#attnamelist}.
	 * @param ctx the parse tree
	 */
	void exitAttnamelist(EluneParser.AttnamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(EluneParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(EluneParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#retstat}.
	 * @param ctx the parse tree
	 */
	void enterRetstat(EluneParser.RetstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#retstat}.
	 * @param ctx the parse tree
	 */
	void exitRetstat(EluneParser.RetstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(EluneParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(EluneParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(EluneParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(EluneParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(EluneParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(EluneParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(EluneParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(EluneParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(EluneParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(EluneParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EluneParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EluneParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#elseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStmt(EluneParser.ElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#elseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStmt(EluneParser.ElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(EluneParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(EluneParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(EluneParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(EluneParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#catchStmt}.
	 * @param ctx the parse tree
	 */
	void enterCatchStmt(EluneParser.CatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#catchStmt}.
	 * @param ctx the parse tree
	 */
	void exitCatchStmt(EluneParser.CatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#finallyStmt}.
	 * @param ctx the parse tree
	 */
	void enterFinallyStmt(EluneParser.FinallyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#finallyStmt}.
	 * @param ctx the parse tree
	 */
	void exitFinallyStmt(EluneParser.FinallyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anondef_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnondef_(EluneParser.Anondef_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code anondef_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnondef_(EluneParser.Anondef_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(EluneParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(EluneParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCompare(EluneParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCompare(EluneParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr(EluneParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr(EluneParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allArgs}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAllArgs(EluneParser.AllArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allArgs}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAllArgs(EluneParser.AllArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(EluneParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(EluneParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code length}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLength(EluneParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code length}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLength(EluneParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(EluneParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(EluneParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnary(EluneParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnary(EluneParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConcat(EluneParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConcat(EluneParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixexp_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp_(EluneParser.Prefixexp_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixexp_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp_(EluneParser.Prefixexp_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNull(EluneParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNull(EluneParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumber_(EluneParser.Number_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code number_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumber_(EluneParser.Number_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableconstructor_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor_(EluneParser.Tableconstructor_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tableconstructor_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor_(EluneParser.Tableconstructor_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(EluneParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(EluneParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(EluneParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(EluneParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString_(EluneParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code string_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString_(EluneParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwise}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(EluneParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwise}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(EluneParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignexp_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAssignexp_(EluneParser.Assignexp_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assignexp_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAssignexp_(EluneParser.Assignexp_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPower(EluneParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPower(EluneParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthBrackets}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLengthBrackets(EluneParser.LengthBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthBrackets}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLengthBrackets(EluneParser.LengthBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(EluneParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(EluneParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(EluneParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(EluneParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var__}
	 * labeled alternative in {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVar__(EluneParser.Var__Context ctx);
	/**
	 * Exit a parse tree produced by the {@code var__}
	 * labeled alternative in {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVar__(EluneParser.Var__Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsExp}
	 * labeled alternative in {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterBracketsExp(EluneParser.BracketsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsExp}
	 * labeled alternative in {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitBracketsExp(EluneParser.BracketsExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#var_}.
	 * @param ctx the parse tree
	 */
	void enterVar_(EluneParser.Var_Context ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#var_}.
	 * @param ctx the parse tree
	 */
	void exitVar_(EluneParser.Var_Context ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(EluneParser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(EluneParser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void enterNameAndArgs(EluneParser.NameAndArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void exitNameAndArgs(EluneParser.NameAndArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArgs}
	 * labeled alternative in {@link EluneParser#args}.
	 * @param ctx the parse tree
	 */
	void enterExprArgs(EluneParser.ExprArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArgs}
	 * labeled alternative in {@link EluneParser#args}.
	 * @param ctx the parse tree
	 */
	void exitExprArgs(EluneParser.ExprArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringArgs}
	 * labeled alternative in {@link EluneParser#args}.
	 * @param ctx the parse tree
	 */
	void enterStringArgs(EluneParser.StringArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringArgs}
	 * labeled alternative in {@link EluneParser#args}.
	 * @param ctx the parse tree
	 */
	void exitStringArgs(EluneParser.StringArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#anondef}.
	 * @param ctx the parse tree
	 */
	void enterAnondef(EluneParser.AnondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#anondef}.
	 * @param ctx the parse tree
	 */
	void exitAnondef(EluneParser.AnondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#anonlist}.
	 * @param ctx the parse tree
	 */
	void enterAnonlist(EluneParser.AnonlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#anonlist}.
	 * @param ctx the parse tree
	 */
	void exitAnonlist(EluneParser.AnonlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link EluneParser#anonOrName}.
	 * @param ctx the parse tree
	 */
	void enterName(EluneParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link EluneParser#anonOrName}.
	 * @param ctx the parse tree
	 */
	void exitName(EluneParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anondef__}
	 * labeled alternative in {@link EluneParser#anonOrName}.
	 * @param ctx the parse tree
	 */
	void enterAnondef__(EluneParser.Anondef__Context ctx);
	/**
	 * Exit a parse tree produced by the {@code anondef__}
	 * labeled alternative in {@link EluneParser#anonOrName}.
	 * @param ctx the parse tree
	 */
	void exitAnondef__(EluneParser.Anondef__Context ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(EluneParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(EluneParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(EluneParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(EluneParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterArray(EluneParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitArray(EluneParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictionary}
	 * labeled alternative in {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(EluneParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictionary}
	 * labeled alternative in {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(EluneParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(EluneParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(EluneParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void enterExprField(EluneParser.ExprFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void exitExprField(EluneParser.ExprFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void enterVarField(EluneParser.VarFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void exitVarField(EluneParser.VarFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexedField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void enterIndexedField(EluneParser.IndexedFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexedField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void exitIndexedField(EluneParser.IndexedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(EluneParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(EluneParser.FieldsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOr(EluneParser.OperatorOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOr(EluneParser.OperatorOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAnd(EluneParser.OperatorAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAnd(EluneParser.OperatorAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void enterOperatorComparison(EluneParser.OperatorComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void exitOperatorComparison(EluneParser.OperatorComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorStrcat}.
	 * @param ctx the parse tree
	 */
	void enterOperatorStrcat(EluneParser.OperatorStrcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorStrcat}.
	 * @param ctx the parse tree
	 */
	void exitOperatorStrcat(EluneParser.OperatorStrcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorAddSub}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAddSub(EluneParser.OperatorAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorAddSub}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAddSub(EluneParser.OperatorAddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMulDivMod(EluneParser.OperatorMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMulDivMod(EluneParser.OperatorMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void enterOperatorBitwise(EluneParser.OperatorBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void exitOperatorBitwise(EluneParser.OperatorBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void enterOperatorUnary(EluneParser.OperatorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void exitOperatorUnary(EluneParser.OperatorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#operatorPower}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPower(EluneParser.OperatorPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#operatorPower}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPower(EluneParser.OperatorPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterInt(EluneParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitInt(EluneParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterHex(EluneParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitHex(EluneParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloat(EluneParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloat(EluneParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexFloat}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterHexFloat(EluneParser.HexFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexFloat}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitHexFloat(EluneParser.HexFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(EluneParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(EluneParser.StringContext ctx);
}