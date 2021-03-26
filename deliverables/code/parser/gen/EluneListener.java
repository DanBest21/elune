// Generated from C:/Users/dbest/university/research-project/deliverables/code/parser\Elune.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EluneParser}.
 */
public interface EluneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EluneParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(EluneParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(EluneParser.ChunkContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(EluneParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(EluneParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#importdef}.
	 * @param ctx the parse tree
	 */
	void enterImportdef(EluneParser.ImportdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#importdef}.
	 * @param ctx the parse tree
	 */
	void exitImportdef(EluneParser.ImportdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#libname}.
	 * @param ctx the parse tree
	 */
	void enterLibname(EluneParser.LibnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#libname}.
	 * @param ctx the parse tree
	 */
	void exitLibname(EluneParser.LibnameContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(EluneParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(EluneParser.ExpContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVarOrExp(EluneParser.VarOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVarOrExp(EluneParser.VarOrExpContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(EluneParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(EluneParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EluneParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(EluneParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(EluneParser.FunctiondefContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(EluneParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(EluneParser.TableconstructorContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(EluneParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(EluneParser.FieldContext ctx);
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
	 * Enter a parse tree produced by {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(EluneParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EluneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(EluneParser.NumberContext ctx);
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