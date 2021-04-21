// Generated from C:/Users/Dan/university-git/Year 3/COMP3200 - Individual Research Project/research-project/deliverables/code/parser\Elune.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EluneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EluneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EluneParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(EluneParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EluneParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sep}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(EluneParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalVar}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVar(EluneParser.GlobalVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(EluneParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall_}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall_(EluneParser.Functioncall_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statLabel}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLabel(EluneParser.StatLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(EluneParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(EluneParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goto}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(EluneParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code do}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(EluneParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(EluneParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(EluneParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(EluneParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(EluneParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(EluneParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalFunc}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFunc(EluneParser.GlobalFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(EluneParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objFunc}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFunc(EluneParser.ObjFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code att}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtt(EluneParser.AttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(EluneParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryCatch}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(EluneParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exception}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(EluneParser.ExceptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(EluneParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printBrackets}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBrackets(EluneParser.PrintBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(EluneParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importModule}
	 * labeled alternative in {@link EluneParser#importdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(EluneParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#assignexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignexp(EluneParser.AssignexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#compoundassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundassign(EluneParser.CompoundassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#attnamelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttnamelist(EluneParser.AttnamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(EluneParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(EluneParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(EluneParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(EluneParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(EluneParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(EluneParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(EluneParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(EluneParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#elseIfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmt(EluneParser.ElseIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(EluneParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStmt(EluneParser.TryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#catchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStmt(EluneParser.CatchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#finallyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStmt(EluneParser.FinallyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anondef_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnondef_(EluneParser.Anondef_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(EluneParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(EluneParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(EluneParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allArgs}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllArgs(EluneParser.AllArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(EluneParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code length}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(EluneParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(EluneParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(EluneParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(EluneParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixexp_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp_(EluneParser.Prefixexp_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(EluneParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_(EluneParser.Number_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableconstructor_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor_(EluneParser.Tableconstructor_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(EluneParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(EluneParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(EluneParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwise}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(EluneParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignexp_}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignexp_(EluneParser.Assignexp_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(EluneParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lengthBrackets}
	 * labeled alternative in {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthBrackets(EluneParser.LengthBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(EluneParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(EluneParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var__}
	 * labeled alternative in {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar__(EluneParser.Var__Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsExp}
	 * labeled alternative in {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsExp(EluneParser.BracketsExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_(EluneParser.Var_Context ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(EluneParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(EluneParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArgs}
	 * labeled alternative in {@link EluneParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArgs(EluneParser.ExprArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringArgs}
	 * labeled alternative in {@link EluneParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArgs(EluneParser.StringArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#anondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnondef(EluneParser.AnondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#anonlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonlist(EluneParser.AnonlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link EluneParser#anonOrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(EluneParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anondef__}
	 * labeled alternative in {@link EluneParser#anonOrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnondef__(EluneParser.Anondef__Context ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(EluneParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(EluneParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(EluneParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictionary}
	 * labeled alternative in {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(EluneParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(EluneParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprField(EluneParser.ExprFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarField(EluneParser.VarFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexedField}
	 * labeled alternative in {@link EluneParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedField(EluneParser.IndexedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(EluneParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(EluneParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(EluneParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(EluneParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorStrcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorStrcat(EluneParser.OperatorStrcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAddSub(EluneParser.OperatorAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMulDivMod(EluneParser.OperatorMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBitwise(EluneParser.OperatorBitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(EluneParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#operatorPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPower(EluneParser.OperatorPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(EluneParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(EluneParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(EluneParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexFloat}
	 * labeled alternative in {@link EluneParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexFloat(EluneParser.HexFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(EluneParser.StringContext ctx);
}