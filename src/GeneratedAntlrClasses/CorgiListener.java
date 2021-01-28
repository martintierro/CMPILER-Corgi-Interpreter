package GeneratedAntlrClasses;
// Generated from D:/Projects/CMPILER Projects/InterpreterMP/grammar\Corgi.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CorgiParser}.
 */
public interface CorgiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(CorgiParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(CorgiParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CorgiParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CorgiParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(CorgiParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(CorgiParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(CorgiParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(CorgiParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(CorgiParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(CorgiParser.ClassOrInterfaceModifierContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CorgiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CorgiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(CorgiParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(CorgiParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(CorgiParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(CorgiParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(CorgiParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(CorgiParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(CorgiParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(CorgiParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(CorgiParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(CorgiParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(CorgiParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(CorgiParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(CorgiParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(CorgiParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(CorgiParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(CorgiParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CorgiParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CorgiParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CorgiParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CorgiParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(CorgiParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(CorgiParser.InterfaceBodyContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(CorgiParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(CorgiParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(CorgiParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(CorgiParser.MainDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(CorgiParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(CorgiParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(CorgiParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(CorgiParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(CorgiParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(CorgiParser.GenericConstructorDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(CorgiParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(CorgiParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(CorgiParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(CorgiParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(CorgiParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(CorgiParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(CorgiParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(CorgiParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(CorgiParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(CorgiParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(CorgiParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(CorgiParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CorgiParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CorgiParser.VariableDeclaratorsContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(CorgiParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(CorgiParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(CorgiParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(CorgiParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(CorgiParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(CorgiParser.ClassOrInterfaceTypeContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(CorgiParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(CorgiParser.QualifiedNameListContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(CorgiParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(CorgiParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(CorgiParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(CorgiParser.QualifiedNameContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CorgiParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CorgiParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(CorgiParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(CorgiParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(CorgiParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(CorgiParser.ElementValuePairsContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(CorgiParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(CorgiParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(CorgiParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(CorgiParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(CorgiParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(CorgiParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(CorgiParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(CorgiParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(CorgiParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(CorgiParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(CorgiParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(CorgiParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(CorgiParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(CorgiParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(CorgiParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(CorgiParser.DefaultValueContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(CorgiParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(CorgiParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(CorgiParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(CorgiParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(CorgiParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(CorgiParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(CorgiParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(CorgiParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(CorgiParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(CorgiParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(CorgiParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(CorgiParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(CorgiParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(CorgiParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(CorgiParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(CorgiParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CorgiParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CorgiParser.ForControlContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(CorgiParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(CorgiParser.EnhancedForControlContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(CorgiParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(CorgiParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CorgiParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CorgiParser.ExpressionListContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(CorgiParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(CorgiParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(CorgiParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(CorgiParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(CorgiParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(CorgiParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(CorgiParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(CorgiParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(CorgiParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(CorgiParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(CorgiParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(CorgiParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(CorgiParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(CorgiParser.NonWildcardTypeArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link CorgiParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(CorgiParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(CorgiParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(CorgiParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(CorgiParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(CorgiParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(CorgiParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CorgiParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CorgiParser.ArgumentsContext ctx);
}