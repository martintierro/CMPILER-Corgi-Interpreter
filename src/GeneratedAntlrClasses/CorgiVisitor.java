// Generated from D:/Projects/CMPILER Projects/InterpreterMP/grammar\Corgi.g4 by ANTLR 4.9.1
package GeneratedAntlrClasses;
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
	 * Visit a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(CorgiParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(CorgiParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(CorgiParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(CorgiParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(CorgiParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(CorgiParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(CorgiParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(CorgiParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(CorgiParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(CorgiParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CorgiParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CorgiParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CorgiParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(CorgiParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CorgiParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(CorgiParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(CorgiParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CorgiParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(CorgiParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(CorgiParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CorgiParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(CorgiParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(CorgiParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(CorgiParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(CorgiParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(CorgiParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(CorgiParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CorgiParser.VariableDeclaratorsContext ctx);
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
	 * Visit a parse tree produced by {@link CorgiParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CorgiParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(CorgiParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(CorgiParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(CorgiParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(CorgiParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(CorgiParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(CorgiParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CorgiParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(CorgiParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CorgiParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(CorgiParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CorgiParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(CorgiParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(CorgiParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CorgiParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(CorgiParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(CorgiParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(CorgiParser.ElementValuePairsContext ctx);
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
	 * Visit a parse tree produced by {@link CorgiParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(CorgiParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(CorgiParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(CorgiParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(CorgiParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(CorgiParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(CorgiParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(CorgiParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(CorgiParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CorgiParser.BlockContext ctx);
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
	 * Visit a parse tree produced by {@link CorgiParser#scanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(CorgiParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(CorgiParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(CorgiParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(CorgiParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(CorgiParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(CorgiParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(CorgiParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(CorgiParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(CorgiParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CorgiParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CorgiParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(CorgiParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CorgiParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CorgiParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CorgiParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(CorgiParser.StatementExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link CorgiParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CorgiParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(CorgiParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(CorgiParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(CorgiParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(CorgiParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(CorgiParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(CorgiParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(CorgiParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(CorgiParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CorgiParser.ArgumentsContext ctx);
}