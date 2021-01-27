// Generated from D:/Projects/CMPILER Projects/ParserMP/Parser/grammar\Corgi.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CorgiParser}.
 */
public interface CorgiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CorgiParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CorgiParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CorgiParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(CorgiParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(CorgiParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(CorgiParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(CorgiParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(CorgiParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(CorgiParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(CorgiParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(CorgiParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(CorgiParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(CorgiParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CorgiParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CorgiParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(CorgiParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(CorgiParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(CorgiParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(CorgiParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(CorgiParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(CorgiParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(CorgiParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(CorgiParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CorgiParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CorgiParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(CorgiParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(CorgiParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(CorgiParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(CorgiParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(CorgiParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(CorgiParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(CorgiParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(CorgiParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CorgiParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CorgiParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(CorgiParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(CorgiParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(CorgiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(CorgiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CorgiParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CorgiParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(CorgiParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(CorgiParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CorgiParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CorgiParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(CorgiParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(CorgiParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CorgiParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CorgiParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(CorgiParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(CorgiParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(CorgiParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(CorgiParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(CorgiParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(CorgiParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(CorgiParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(CorgiParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(CorgiParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(CorgiParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CorgiParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CorgiParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(CorgiParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(CorgiParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(CorgiParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(CorgiParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(CorgiParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(CorgiParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(CorgiParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(CorgiParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CorgiParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CorgiParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CorgiParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CorgiParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(CorgiParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(CorgiParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(CorgiParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(CorgiParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(CorgiParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(CorgiParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CorgiParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CorgiParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(CorgiParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(CorgiParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(CorgiParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(CorgiParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(CorgiParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(CorgiParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(CorgiParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(CorgiParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(CorgiParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(CorgiParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(CorgiParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(CorgiParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(CorgiParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(CorgiParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(CorgiParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(CorgiParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(CorgiParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(CorgiParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(CorgiParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(CorgiParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CorgiParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CorgiParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(CorgiParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(CorgiParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CorgiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CorgiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(CorgiParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(CorgiParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CorgiParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CorgiParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(CorgiParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(CorgiParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(CorgiParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(CorgiParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CorgiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CorgiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(CorgiParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(CorgiParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(CorgiParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(CorgiParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(CorgiParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(CorgiParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(CorgiParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(CorgiParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CorgiParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CorgiParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(CorgiParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(CorgiParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CorgiParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CorgiParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(CorgiParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(CorgiParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(CorgiParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(CorgiParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(CorgiParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(CorgiParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(CorgiParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(CorgiParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CorgiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CorgiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(CorgiParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(CorgiParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(CorgiParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(CorgiParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CorgiParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CorgiParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(CorgiParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(CorgiParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(CorgiParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(CorgiParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(CorgiParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(CorgiParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CorgiParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CorgiParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(CorgiParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(CorgiParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(CorgiParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(CorgiParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CorgiParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CorgiParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CorgiParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CorgiParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(CorgiParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(CorgiParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(CorgiParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(CorgiParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(CorgiParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(CorgiParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(CorgiParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(CorgiParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(CorgiParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(CorgiParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(CorgiParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(CorgiParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(CorgiParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(CorgiParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(CorgiParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(CorgiParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(CorgiParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(CorgiParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(CorgiParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(CorgiParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(CorgiParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(CorgiParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(CorgiParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(CorgiParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(CorgiParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(CorgiParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(CorgiParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(CorgiParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CorgiParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CorgiParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(CorgiParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(CorgiParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(CorgiParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(CorgiParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(CorgiParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(CorgiParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(CorgiParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(CorgiParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(CorgiParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(CorgiParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CorgiParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CorgiParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CorgiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CorgiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(CorgiParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(CorgiParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CorgiParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CorgiParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CorgiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CorgiParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(CorgiParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(CorgiParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CorgiParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CorgiParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CorgiParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CorgiParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(CorgiParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(CorgiParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(CorgiParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(CorgiParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CorgiParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CorgiParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CorgiParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CorgiParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CorgiParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CorgiParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CorgiParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CorgiParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CorgiParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CorgiParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CorgiParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CorgiParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CorgiParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CorgiParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CorgiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CorgiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CorgiParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CorgiParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(CorgiParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(CorgiParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(CorgiParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(CorgiParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(CorgiParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(CorgiParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CorgiParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CorgiParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(CorgiParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(CorgiParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(CorgiParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(CorgiParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(CorgiParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(CorgiParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(CorgiParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(CorgiParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CorgiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CorgiParser.IdentifierContext ctx);
}