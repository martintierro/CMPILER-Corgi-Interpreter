// Generated from D:/Projects/CMPILER Projects/ParserMP/Parser/grammar\Corgi.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CorgiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CorgiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CorgiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CorgiParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(CorgiParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(CorgiParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(CorgiParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(CorgiParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(CorgiParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(CorgiParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(CorgiParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(CorgiParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(CorgiParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(CorgiParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CorgiParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(CorgiParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(CorgiParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(CorgiParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(CorgiParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CorgiParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CorgiParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(CorgiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CorgiParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(CorgiParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CorgiParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(CorgiParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CorgiParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(CorgiParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(CorgiParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(CorgiParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(CorgiParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(CorgiParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CorgiParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(CorgiParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(CorgiParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(CorgiParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(CorgiParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CorgiParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CorgiParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(CorgiParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(CorgiParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(CorgiParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CorgiParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(CorgiParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(CorgiParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(CorgiParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(CorgiParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(CorgiParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(CorgiParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(CorgiParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(CorgiParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(CorgiParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(CorgiParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CorgiParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(CorgiParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CorgiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(CorgiParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CorgiParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(CorgiParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(CorgiParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CorgiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#scanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(CorgiParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(CorgiParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(CorgiParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(CorgiParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CorgiParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(CorgiParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CorgiParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(CorgiParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(CorgiParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(CorgiParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(CorgiParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CorgiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(CorgiParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(CorgiParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CorgiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(CorgiParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(CorgiParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(CorgiParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CorgiParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CorgiParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(CorgiParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CorgiParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CorgiParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(CorgiParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(CorgiParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(CorgiParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(CorgiParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(CorgiParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(CorgiParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(CorgiParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(CorgiParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(CorgiParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(CorgiParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(CorgiParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(CorgiParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(CorgiParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(CorgiParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(CorgiParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CorgiParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(CorgiParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(CorgiParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(CorgiParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(CorgiParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(CorgiParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CorgiParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CorgiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(CorgiParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CorgiParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CorgiParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(CorgiParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CorgiParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CorgiParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(CorgiParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(CorgiParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CorgiParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CorgiParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CorgiParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CorgiParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CorgiParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CorgiParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CorgiParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CorgiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CorgiParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(CorgiParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(CorgiParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(CorgiParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CorgiParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(CorgiParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(CorgiParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(CorgiParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(CorgiParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CorgiParser.IdentifierContext ctx);
}