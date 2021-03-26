// Generated from C:/Users/dbest/university/research-project/deliverables/code/parser\Elune.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link EluneParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(EluneParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EluneParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(EluneParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#importdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportdef(EluneParser.ImportdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#libname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibname(EluneParser.LibnameContext ctx);
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
	 * Visit a parse tree produced by {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(EluneParser.ExpContext ctx);
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
	 * Visit a parse tree produced by {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(EluneParser.VarOrExpContext ctx);
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
	 * Visit a parse tree produced by {@link EluneParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(EluneParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(EluneParser.FunctiondefContext ctx);
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
	 * Visit a parse tree produced by {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(EluneParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(EluneParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(EluneParser.FieldContext ctx);
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
	 * Visit a parse tree produced by {@link EluneParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(EluneParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link EluneParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(EluneParser.StringContext ctx);
}