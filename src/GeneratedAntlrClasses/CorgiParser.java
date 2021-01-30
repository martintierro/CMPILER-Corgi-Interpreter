// Generated from D:/Projects/CMPILER Projects/InterpreterMP/grammar\Corgi.g4 by ANTLR 4.9.1
package GeneratedAntlrClasses;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CorgiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ARRAY=2, ASSERT=3, BOOL=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DECIMAL=13, DEFAULT=14, DO=15, 
		DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, MAIN=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, 
		PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, STRING=42, SUPER=43, 
		SWITCH=44, SYNCHRONIZED=45, THIS=46, THROW=47, THROWS=48, TRANSIENT=49, 
		TRY=50, VOID=51, VOLATILE=52, WHILE=53, SCAN=54, PRINT=55, END=56, ARRAY_BOUNDS_EXCEPTION=57, 
		NEGATIVE_ARRSIZE_EXCEPTION=58, ARITHMETIC_EXCEPTION=59, IntegerLiteral=60, 
		FloatingPointLiteral=61, BooleanLiteral=62, CharacterLiteral=63, StringLiteral=64, 
		NullLiteral=65, LPAREN=66, RPAREN=67, LBRACE=68, RBRACE=69, LBRACK=70, 
		RBRACK=71, SEMI=72, COMMA=73, DOT=74, ASSIGN=75, GT=76, LT=77, BANG=78, 
		TILDE=79, QUESTION=80, COLON=81, EQUAL=82, LE=83, GE=84, NOTEQUAL=85, 
		AND=86, OR=87, INC=88, DEC=89, ADD=90, SUB=91, MUL=92, DIV=93, BITAND=94, 
		BITOR=95, CARET=96, MOD=97, ADD_ASSIGN=98, SUB_ASSIGN=99, MUL_ASSIGN=100, 
		DIV_ASSIGN=101, AND_ASSIGN=102, OR_ASSIGN=103, XOR_ASSIGN=104, MOD_ASSIGN=105, 
		LSHIFT_ASSIGN=106, RSHIFT_ASSIGN=107, URSHIFT_ASSIGN=108, Identifier=109, 
		AT=110, ELLIPSIS=111, WS=112, COMMENT=113, LINE_COMMENT=114;
	public static final int
		RULE_compilationUnit = 0, RULE_typeDeclaration = 1, RULE_variableModifier = 2, 
		RULE_typeParameters = 3, RULE_typeParameter = 4, RULE_typeBound = 5, RULE_enumDeclaration = 6, 
		RULE_enumConstants = 7, RULE_enumConstant = 8, RULE_enumBodyDeclarations = 9, 
		RULE_interfaceDeclaration = 10, RULE_typeList = 11, RULE_classBody = 12, 
		RULE_interfaceBody = 13, RULE_classBodyDeclaration = 14, RULE_start = 15, 
		RULE_memberDeclaration = 16, RULE_mainDeclaration = 17, RULE_methodDeclaration = 18, 
		RULE_genericMethodDeclaration = 19, RULE_constructorDeclaration = 20, 
		RULE_fieldDeclaration = 21, RULE_interfaceBodyDeclaration = 22, RULE_interfaceMemberDeclaration = 23, 
		RULE_constDeclaration = 24, RULE_constantDeclarator = 25, RULE_interfaceMethodDeclaration = 26, 
		RULE_genericInterfaceMethodDeclaration = 27, RULE_variableDeclarators = 28, 
		RULE_variableDeclarator = 29, RULE_variableDeclaratorId = 30, RULE_variableInitializer = 31, 
		RULE_arrayInitializer = 32, RULE_enumConstantName = 33, RULE_typeType = 34, 
		RULE_classOrInterfaceType = 35, RULE_primitiveType = 36, RULE_typeArguments = 37, 
		RULE_typeArgument = 38, RULE_qualifiedNameList = 39, RULE_formalParameters = 40, 
		RULE_formalParameterList = 41, RULE_formalParameter = 42, RULE_lastFormalParameter = 43, 
		RULE_methodBody = 44, RULE_constructorBody = 45, RULE_qualifiedName = 46, 
		RULE_literal = 47, RULE_annotation = 48, RULE_annotationName = 49, RULE_elementValuePairs = 50, 
		RULE_elementValuePair = 51, RULE_elementValue = 52, RULE_elementValueArrayInitializer = 53, 
		RULE_annotationTypeDeclaration = 54, RULE_annotationTypeBody = 55, RULE_annotationTypeElementDeclaration = 56, 
		RULE_annotationTypeElementRest = 57, RULE_annotationMethodOrConstantRest = 58, 
		RULE_annotationMethodRest = 59, RULE_annotationConstantRest = 60, RULE_defaultValue = 61, 
		RULE_block = 62, RULE_blockStatement = 63, RULE_localVariableDeclarationStatement = 64, 
		RULE_localVariableDeclaration = 65, RULE_statement = 66, RULE_scanStatement = 67, 
		RULE_printStatement = 68, RULE_catchClause = 69, RULE_catchType = 70, 
		RULE_finallyBlock = 71, RULE_resourceSpecification = 72, RULE_resources = 73, 
		RULE_resource = 74, RULE_switchBlockStatementGroup = 75, RULE_switchLabel = 76, 
		RULE_forControl = 77, RULE_forInit = 78, RULE_enhancedForControl = 79, 
		RULE_forUpdate = 80, RULE_parExpression = 81, RULE_expressionList = 82, 
		RULE_statementExpression = 83, RULE_constantExpression = 84, RULE_expression = 85, 
		RULE_primary = 86, RULE_creator = 87, RULE_createdName = 88, RULE_arrayCreatorRest = 89, 
		RULE_classCreatorRest = 90, RULE_nonWildcardTypeArguments = 91, RULE_typeArgumentsOrDiamond = 92, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 93, RULE_explicitGenericInvocationSuffix = 94, 
		RULE_arguments = 95;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "typeDeclaration", "variableModifier", "typeParameters", 
			"typeParameter", "typeBound", "enumDeclaration", "enumConstants", "enumConstant", 
			"enumBodyDeclarations", "interfaceDeclaration", "typeList", "classBody", 
			"interfaceBody", "classBodyDeclaration", "start", "memberDeclaration", 
			"mainDeclaration", "methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
			"fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "enumConstantName", 
			"typeType", "classOrInterfaceType", "primitiveType", "typeArguments", 
			"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "methodBody", "constructorBody", 
			"qualifiedName", "literal", "annotation", "annotationName", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "statement", "scanStatement", "printStatement", 
			"catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "forInit", "enhancedForControl", "forUpdate", "parExpression", 
			"expressionList", "statementExpression", "constantExpression", "expression", 
			"primary", "creator", "createdName", "arrayCreatorRest", "classCreatorRest", 
			"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'array'", "'assert'", "'bool'", "'break'", "'byte'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'decimal'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
			"'finally'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'main'", "'native'", "'new'", "'package'", 
			"'private'", "'protected'", "'public'", "'return'", "'short'", "'static'", 
			"'strictfp'", "'string'", "'super'", "'switch'", "'synchronized'", "'this'", 
			"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", "'listen'", "'woof'", "'end'", "'ARRAY_BOUNDS_EXCEPTION'", 
			"'NEGATIVE_ARRSIZE_EXCEPTION'", "'ARITHMETIC_EXCEPTION'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
			"'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ARRAY", "ASSERT", "BOOL", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DECIMAL", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FOR", 
			"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"LONG", "MAIN", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
			"RETURN", "SHORT", "STATIC", "STRICTFP", "STRING", "SUPER", "SWITCH", 
			"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
			"VOLATILE", "WHILE", "SCAN", "PRINT", "END", "ARRAY_BOUNDS_EXCEPTION", 
			"NEGATIVE_ARRSIZE_EXCEPTION", "ARITHMETIC_EXCEPTION", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Corgi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CorgiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CorgiParser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==AT) {
				{
				{
				setState(192);
				typeDeclaration();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				annotationTypeDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(CorgiParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableModifier);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CorgiParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(CorgiParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LT);
			setState(209);
			typeParameter();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(210);
				match(COMMA);
				setState(211);
				typeParameter();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(CorgiParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Identifier);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(220);
				match(EXTENDS);
				setState(221);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(CorgiParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(CorgiParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			typeType();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(225);
				match(BITAND);
				setState(226);
				typeType();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CorgiParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(CorgiParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorgiParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ENUM);
			setState(233);
			match(Identifier);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(234);
				match(IMPLEMENTS);
				setState(235);
				typeList();
				}
			}

			setState(238);
			match(LBRACE);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(239);
				enumConstants();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(242);
				match(COMMA);
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(245);
				enumBodyDeclarations();
				}
			}

			setState(248);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			enumConstant();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					match(COMMA);
					setState(252);
					enumConstant();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(258);
				annotation();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(Identifier);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(265);
				arguments();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(268);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(SEMI);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << ENUM) | (1L << INT) | (1L << INTERFACE) | (1L << STRING) | (1L << VOID))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(272);
				classBodyDeclaration();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CorgiParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(CorgiParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(INTERFACE);
			setState(279);
			match(Identifier);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(280);
				typeParameters();
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(283);
				match(EXTENDS);
				setState(284);
				typeList();
				}
			}

			setState(287);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			typeType();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				setState(291);
				typeType();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LBRACE);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << ENUM) | (1L << INT) | (1L << INTERFACE) | (1L << STRING) | (1L << VOID))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(298);
				classBodyDeclaration();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(LBRACE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << INT) | (1L << STRING))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(307);
				interfaceBodyDeclaration();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBodyDeclaration);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				block();
				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case ENUM:
			case INT:
			case INTERFACE:
			case STRING:
			case VOID:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				block();
				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case ENUM:
			case INT:
			case INTERFACE:
			case STRING:
			case VOID:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_memberDeclaration);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				annotationTypeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(332);
				mainDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CorgiParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(CorgiParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(VOID);
			setState(336);
			match(MAIN);
			setState(337);
			match(LPAREN);
			setState(338);
			match(RPAREN);
			setState(339);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CorgiParser.VOID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(CorgiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CorgiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CorgiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CorgiParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(CorgiParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				{
				setState(341);
				typeType();
				}
				break;
			case VOID:
				{
				setState(342);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
			match(Identifier);
			setState(346);
			formalParameters();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(347);
				match(LBRACK);
				setState(348);
				match(RBRACK);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(354);
				match(THROWS);
				setState(355);
				qualifiedNameList();
				}
			}

			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(358);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(359);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			typeParameters();
			setState(363);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(CorgiParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(Identifier);
			setState(366);
			formalParameters();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(367);
				match(THROWS);
				setState(368);
				qualifiedNameList();
				}
			}

			setState(371);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			typeType();
			setState(374);
			variableDeclarators();
			setState(375);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceBodyDeclaration);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfaceMemberDeclaration);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				constDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			typeType();
			setState(386);
			constantDeclarator();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				constantDeclarator();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(CorgiParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CorgiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CorgiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CorgiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CorgiParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(Identifier);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(397);
				match(LBRACK);
				setState(398);
				match(RBRACK);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(ASSIGN);
			setState(405);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CorgiParser.VOID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(CorgiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CorgiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CorgiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CorgiParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(CorgiParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				{
				setState(407);
				typeType();
				}
				break;
			case VOID:
				{
				setState(408);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(411);
			match(Identifier);
			setState(412);
			formalParameters();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(413);
				match(LBRACK);
				setState(414);
				match(RBRACK);
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(420);
				match(THROWS);
				setState(421);
				qualifiedNameList();
				}
			}

			setState(424);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			typeParameters();
			setState(427);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			variableDeclarator();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(430);
				match(COMMA);
				setState(431);
				variableDeclarator();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorgiParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			variableDeclaratorId();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(438);
				match(ASSIGN);
				setState(439);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(CorgiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CorgiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CorgiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CorgiParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(Identifier);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(443);
				match(LBRACK);
				setState(444);
				match(RBRACK);
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableInitializer);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				arrayInitializer();
				}
				break;
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LBRACE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(455);
				variableInitializer();
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						match(COMMA);
						setState(457);
						variableInitializer();
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(463);
					match(COMMA);
					}
				}

				}
			}

			setState(468);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CorgiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CorgiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CorgiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CorgiParser.RBRACK, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeType);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				classOrInterfaceType();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(473);
					match(LBRACK);
					setState(474);
					match(RBRACK);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				primitiveType();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(481);
					match(LBRACK);
					setState(482);
					match(RBRACK);
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(Identifier);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(491);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CorgiParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(CorgiParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(CorgiParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(CorgiParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(CorgiParser.STRING, 0); }
		public TerminalNode ARRAY() { return getToken(CorgiParser.ARRAY, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CorgiParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(CorgiParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(LT);
			setState(497);
			typeArgument();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(498);
				match(COMMA);
				setState(499);
				typeArgument();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(CorgiParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(CorgiParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(CorgiParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeArgument);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(QUESTION);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(509);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(510);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			qualifiedName();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(516);
				match(COMMA);
				setState(517);
				qualifiedName();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(LPAREN);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << FINAL) | (1L << INT) | (1L << STRING))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(524);
				formalParameterList();
				}
			}

			setState(527);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				formalParameter();
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(530);
						match(COMMA);
						setState(531);
						formalParameter();
						}
						} 
					}
					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(537);
					match(COMMA);
					setState(538);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(544);
				variableModifier();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			typeType();
			setState(551);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(CorgiParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(553);
				variableModifier();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			typeType();
			setState(560);
			match(ELLIPSIS);
			setState(561);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(CorgiParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(CorgiParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(CorgiParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(CorgiParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(CorgiParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(CorgiParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (IntegerLiteral - 60)) | (1L << (FloatingPointLiteral - 60)) | (1L << (BooleanLiteral - 60)) | (1L << (CharacterLiteral - 60)) | (1L << (StringLiteral - 60)) | (1L << (NullLiteral - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CorgiParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(AT);
			setState(572);
			annotationName();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(573);
				match(LPAREN);
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(574);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(575);
					elementValue();
					}
					break;
				}
				setState(578);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			elementValuePair();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				elementValuePair();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(CorgiParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(Identifier);
			setState(592);
			match(ASSIGN);
			setState(593);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementValue);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(LBRACE);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(601);
				elementValue();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						match(COMMA);
						setState(603);
						elementValue();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(611);
				match(COMMA);
				}
			}

			setState(614);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CorgiParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(CorgiParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(AT);
			setState(617);
			match(INTERFACE);
			setState(618);
			match(Identifier);
			setState(619);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(LBRACE);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << INT) | (1L << STRING))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				{
				setState(622);
				annotationTypeElementDeclaration();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationTypeElementDeclaration);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationTypeElementRest);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				typeType();
				setState(635);
				annotationMethodOrConstantRest();
				setState(636);
				match(SEMI);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				annotationTypeDeclaration();
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(639);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationMethodOrConstantRest);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(Identifier);
			setState(649);
			match(LPAREN);
			setState(650);
			match(RPAREN);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(651);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(CorgiParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(DEFAULT);
			setState(657);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(LBRACE);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << BREAK) | (1L << CHAR) | (1L << DECIMAL) | (1L << DO) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << RETURN) | (1L << STRING) | (1L << SWITCH) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << SCAN) | (1L << PRINT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(660);
				blockStatement();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockStatement);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			localVariableDeclaration();
			setState(674);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(676);
				variableModifier();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			typeType();
			setState(683);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(CorgiParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CorgiParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(CorgiParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(CorgiParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CorgiParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public TerminalNode TRY() { return getToken(CorgiParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(CorgiParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(CorgiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CorgiParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(CorgiParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THROW() { return getToken(CorgiParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(CorgiParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ScanStatementContext scanStatement() {
			return getRuleContext(ScanStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(IF);
				setState(687);
				parExpression();
				setState(688);
				statement();
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(689);
					match(ELSE);
					setState(690);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				match(FOR);
				setState(694);
				match(LPAREN);
				setState(695);
				forControl();
				setState(696);
				match(RPAREN);
				setState(697);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				match(WHILE);
				setState(700);
				parExpression();
				setState(701);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(703);
				match(DO);
				setState(704);
				statement();
				setState(705);
				match(WHILE);
				setState(706);
				parExpression();
				setState(707);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(709);
				match(TRY);
				setState(710);
				block();
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(712); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(711);
						catchClause();
						}
						}
						setState(714); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(716);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(719);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(722);
				match(TRY);
				setState(723);
				resourceSpecification();
				setState(724);
				block();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(725);
					catchClause();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(731);
					finallyBlock();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(734);
				match(SWITCH);
				setState(735);
				parExpression();
				setState(736);
				match(LBRACE);
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(737);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(742);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(743);
					switchLabel();
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
				match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(751);
				match(RETURN);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(752);
					expression(0);
					}
				}

				setState(755);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(756);
				match(THROW);
				setState(757);
				expression(0);
				setState(758);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(760);
				match(BREAK);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(761);
					match(Identifier);
					}
				}

				setState(764);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(765);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(766);
				statementExpression();
				setState(767);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(769);
				printStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(770);
				scanStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(CorgiParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorgiParser.COMMA, 0); }
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public ScanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitScanStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitScanStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanStatementContext scanStatement() throws RecognitionException {
		ScanStatementContext _localctx = new ScanStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_scanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(SCAN);
			setState(774);
			match(LPAREN);
			setState(775);
			expression(0);
			setState(776);
			match(COMMA);
			setState(777);
			match(Identifier);
			setState(778);
			match(RPAREN);
			setState(779);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CorgiParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(PRINT);
			setState(782);
			match(LPAREN);
			setState(783);
			expression(0);
			setState(784);
			match(RPAREN);
			setState(785);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CorgiParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(CATCH);
			setState(788);
			match(LPAREN);
			setState(789);
			catchType();
			setState(790);
			match(RPAREN);
			setState(791);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY_BOUNDS_EXCEPTION() { return getToken(CorgiParser.ARRAY_BOUNDS_EXCEPTION, 0); }
		public TerminalNode ARITHMETIC_EXCEPTION() { return getToken(CorgiParser.ARITHMETIC_EXCEPTION, 0); }
		public TerminalNode NEGATIVE_ARRSIZE_EXCEPTION() { return getToken(CorgiParser.NEGATIVE_ARRSIZE_EXCEPTION, 0); }
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_BOUNDS_EXCEPTION) | (1L << NEGATIVE_ARRSIZE_EXCEPTION) | (1L << ARITHMETIC_EXCEPTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CorgiParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(FINALLY);
			setState(796);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(LPAREN);
			setState(799);
			resources();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(800);
				match(SEMI);
				}
			}

			setState(803);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CorgiParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CorgiParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			resource();
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(806);
					match(SEMI);
					setState(807);
					resource();
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorgiParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(813);
				variableModifier();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			classOrInterfaceType();
			setState(820);
			variableDeclaratorId();
			setState(821);
			match(ASSIGN);
			setState(822);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(824);
				switchLabel();
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(829);
				blockStatement();
				}
				}
				setState(832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << BREAK) | (1L << CHAR) | (1L << DECIMAL) | (1L << DO) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << RETURN) | (1L << STRING) | (1L << SWITCH) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << SCAN) | (1L << PRINT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CorgiParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CorgiParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CorgiParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchLabel);
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				match(CASE);
				setState(835);
				constantExpression();
				setState(836);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				match(CASE);
				setState(839);
				enumConstantName();
				setState(840);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(DEFAULT);
				setState(843);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CorgiParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CorgiParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forControl);
		int _la;
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOL) | (1L << CHAR) | (1L << DECIMAL) | (1L << FINAL) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(847);
					forInit();
					}
				}

				setState(850);
				match(SEMI);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(851);
					expression(0);
					}
				}

				setState(854);
				match(SEMI);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(855);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forInit);
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CorgiParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(864);
				variableModifier();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			typeType();
			setState(871);
			variableDeclaratorId();
			setState(872);
			match(COLON);
			setState(873);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(LPAREN);
			setState(878);
			expression(0);
			setState(879);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorgiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorgiParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			expression(0);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(882);
				match(COMMA);
				setState(883);
				expression(0);
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CorgiParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CorgiParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CorgiParser.SUB, 0); }
		public TerminalNode INC() { return getToken(CorgiParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CorgiParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(CorgiParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(CorgiParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(CorgiParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorgiParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorgiParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(CorgiParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CorgiParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CorgiParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CorgiParser.GT, i);
		}
		public TerminalNode LE() { return getToken(CorgiParser.LE, 0); }
		public TerminalNode GE() { return getToken(CorgiParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(CorgiParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CorgiParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(CorgiParser.AND, 0); }
		public TerminalNode OR() { return getToken(CorgiParser.OR, 0); }
		public TerminalNode ASSIGN() { return getToken(CorgiParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(CorgiParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(CorgiParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorgiParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorgiParser.DIV_ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CorgiParser.SEMI, 0); }
		public TerminalNode LBRACK() { return getToken(CorgiParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CorgiParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case Identifier:
				{
				setState(894);
				primary();
				}
				break;
			case NEW:
				{
				setState(895);
				match(NEW);
				setState(896);
				creator();
				}
				break;
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(897);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (INC - 88)) | (1L << (DEC - 88)) | (1L << (ADD - 88)) | (1L << (SUB - 88)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(898);
				expression(10);
				}
				break;
			case BANG:
			case TILDE:
				{
				setState(899);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(900);
				expression(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(904);
						_la = _input.LA(1);
						if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (MUL - 92)) | (1L << (DIV - 92)) | (1L << (MOD - 92)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(905);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(906);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(907);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(908);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(917);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
						case 1:
							{
							setState(910);
							match(LT);
							setState(911);
							match(LT);
							}
							break;
						case 2:
							{
							setState(912);
							match(GT);
							setState(913);
							match(GT);
							setState(914);
							match(GT);
							}
							break;
						case 3:
							{
							setState(915);
							match(GT);
							setState(916);
							match(GT);
							}
							break;
						}
						setState(919);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(920);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(921);
						_la = _input.LA(1);
						if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (GT - 76)) | (1L << (LT - 76)) | (1L << (LE - 76)) | (1L << (GE - 76)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(922);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(923);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(924);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(925);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(926);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(927);
						match(AND);
						setState(928);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(929);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(930);
						match(OR);
						setState(931);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(932);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(933);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ASSIGN - 75)) | (1L << (ADD_ASSIGN - 75)) | (1L << (SUB_ASSIGN - 75)) | (1L << (MUL_ASSIGN - 75)) | (1L << (DIV_ASSIGN - 75)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(934);
						expression(1);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(935);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(936);
						match(LPAREN);
						setState(937);
						arguments();
						setState(938);
						match(RPAREN);
						setState(939);
						match(SEMI);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(941);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(942);
						match(LBRACK);
						setState(943);
						expression(0);
						setState(944);
						match(RBRACK);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(946);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(947);
						match(LPAREN);
						setState(949);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(948);
							expressionList();
							}
						}

						setState(951);
						match(RPAREN);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(952);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(953);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_primary);
		try {
			setState(965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				match(LPAREN);
				setState(960);
				expression(0);
				setState(961);
				match(RPAREN);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_creator);
		try {
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				nonWildcardTypeArguments();
				setState(968);
				createdName();
				setState(969);
				classCreatorRest();
				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				createdName();
				setState(974);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(972);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(973);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_createdName);
		int _la;
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				match(Identifier);
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(979);
					typeArgumentsOrDiamond();
					}
				}

				}
				break;
			case ARRAY:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(CorgiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CorgiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CorgiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CorgiParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(LBRACK);
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(986);
				match(RBRACK);
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(987);
					match(LBRACK);
					setState(988);
					match(RBRACK);
					}
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(994);
				arrayInitializer();
				}
				break;
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(995);
				expression(0);
				setState(996);
				match(RBRACK);
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(997);
						match(LBRACK);
						setState(998);
						expression(0);
						setState(999);
						match(RBRACK);
						}
						} 
					}
					setState(1005);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1006);
						match(LBRACK);
						setState(1007);
						match(RBRACK);
						}
						} 
					}
					setState(1012);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			arguments();
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1016);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CorgiParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(CorgiParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(LT);
			setState(1020);
			typeList();
			setState(1021);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CorgiParser.LT, 0); }
		public TerminalNode GT() { return getToken(CorgiParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_typeArgumentsOrDiamond);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				match(LT);
				setState(1024);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CorgiParser.LT, 0); }
		public TerminalNode GT() { return getToken(CorgiParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				match(LT);
				setState(1029);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CorgiParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_explicitGenericInvocationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(Identifier);
			setState(1034);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CorgiParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CorgiParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorgiListener ) ((CorgiListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorgiVisitor ) return ((CorgiVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(LPAREN);
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1037);
				expressionList();
				}
			}

			setState(1040);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 85:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u0415\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\7\2\u00c4\n\2\f\2\16\2\u00c7\13\2\3\2\3\2\3\3\3\3\5\3\u00cd"+
		"\n\3\3\4\3\4\5\4\u00d1\n\4\3\5\3\5\3\5\3\5\7\5\u00d7\n\5\f\5\16\5\u00da"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\5\6\u00e1\n\6\3\7\3\7\3\7\7\7\u00e6\n\7\f\7"+
		"\16\7\u00e9\13\7\3\b\3\b\3\b\3\b\5\b\u00ef\n\b\3\b\3\b\5\b\u00f3\n\b\3"+
		"\b\5\b\u00f6\n\b\3\b\5\b\u00f9\n\b\3\b\3\b\3\t\3\t\3\t\7\t\u0100\n\t\f"+
		"\t\16\t\u0103\13\t\3\n\7\n\u0106\n\n\f\n\16\n\u0109\13\n\3\n\3\n\5\n\u010d"+
		"\n\n\3\n\5\n\u0110\n\n\3\13\3\13\7\13\u0114\n\13\f\13\16\13\u0117\13\13"+
		"\3\f\3\f\3\f\5\f\u011c\n\f\3\f\3\f\5\f\u0120\n\f\3\f\3\f\3\r\3\r\3\r\7"+
		"\r\u0127\n\r\f\r\16\r\u012a\13\r\3\16\3\16\7\16\u012e\n\16\f\16\16\16"+
		"\u0131\13\16\3\16\3\16\3\17\3\17\7\17\u0137\n\17\f\17\16\17\u013a\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\5\20\u0141\n\20\3\21\3\21\3\21\5\21\u0146\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0150\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u015a\n\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0160\n\24\f\24\16\24\u0163\13\24\3\24\3\24\5\24\u0167\n\24\3\24\3\24"+
		"\5\24\u016b\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0174\n\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u017e\n\30\3\31\3\31\5\31"+
		"\u0182\n\31\3\32\3\32\3\32\3\32\7\32\u0188\n\32\f\32\16\32\u018b\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\7\33\u0192\n\33\f\33\16\33\u0195\13\33\3\33"+
		"\3\33\3\33\3\34\3\34\5\34\u019c\n\34\3\34\3\34\3\34\3\34\7\34\u01a2\n"+
		"\34\f\34\16\34\u01a5\13\34\3\34\3\34\5\34\u01a9\n\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\7\36\u01b3\n\36\f\36\16\36\u01b6\13\36\3\37\3"+
		"\37\3\37\5\37\u01bb\n\37\3 \3 \3 \7 \u01c0\n \f \16 \u01c3\13 \3!\3!\5"+
		"!\u01c7\n!\3\"\3\"\3\"\3\"\7\"\u01cd\n\"\f\"\16\"\u01d0\13\"\3\"\5\"\u01d3"+
		"\n\"\5\"\u01d5\n\"\3\"\3\"\3#\3#\3$\3$\3$\7$\u01de\n$\f$\16$\u01e1\13"+
		"$\3$\3$\3$\7$\u01e6\n$\f$\16$\u01e9\13$\5$\u01eb\n$\3%\3%\5%\u01ef\n%"+
		"\3&\3&\3\'\3\'\3\'\3\'\7\'\u01f7\n\'\f\'\16\'\u01fa\13\'\3\'\3\'\3(\3"+
		"(\3(\3(\5(\u0202\n(\5(\u0204\n(\3)\3)\3)\7)\u0209\n)\f)\16)\u020c\13)"+
		"\3*\3*\5*\u0210\n*\3*\3*\3+\3+\3+\7+\u0217\n+\f+\16+\u021a\13+\3+\3+\5"+
		"+\u021e\n+\3+\5+\u0221\n+\3,\7,\u0224\n,\f,\16,\u0227\13,\3,\3,\3,\3-"+
		"\7-\u022d\n-\f-\16-\u0230\13-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\5\62\u0243\n\62\3\62\5\62\u0246\n\62\3\63"+
		"\3\63\3\64\3\64\3\64\7\64\u024d\n\64\f\64\16\64\u0250\13\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\5\66\u0259\n\66\3\67\3\67\3\67\3\67\7\67\u025f"+
		"\n\67\f\67\16\67\u0262\13\67\5\67\u0264\n\67\3\67\5\67\u0267\n\67\3\67"+
		"\3\67\38\38\38\38\38\39\39\79\u0272\n9\f9\169\u0275\139\39\39\3:\3:\5"+
		":\u027b\n:\3;\3;\3;\3;\3;\3;\5;\u0283\n;\5;\u0285\n;\3<\3<\5<\u0289\n"+
		"<\3=\3=\3=\3=\5=\u028f\n=\3>\3>\3?\3?\3?\3@\3@\7@\u0298\n@\f@\16@\u029b"+
		"\13@\3@\3@\3A\3A\3A\5A\u02a2\nA\3B\3B\3B\3C\7C\u02a8\nC\fC\16C\u02ab\13"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3D\5D\u02b6\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\6D\u02cb\nD\rD\16D\u02cc\3D\5D\u02d0\nD\3"+
		"D\5D\u02d3\nD\3D\3D\3D\3D\7D\u02d9\nD\fD\16D\u02dc\13D\3D\5D\u02df\nD"+
		"\3D\3D\3D\3D\7D\u02e5\nD\fD\16D\u02e8\13D\3D\7D\u02eb\nD\fD\16D\u02ee"+
		"\13D\3D\3D\3D\3D\5D\u02f4\nD\3D\3D\3D\3D\3D\3D\3D\5D\u02fd\nD\3D\3D\3"+
		"D\3D\3D\3D\3D\5D\u0306\nD\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3"+
		"G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\5J\u0324\nJ\3J\3J\3K\3K\3K\7"+
		"K\u032b\nK\fK\16K\u032e\13K\3L\7L\u0331\nL\fL\16L\u0334\13L\3L\3L\3L\3"+
		"L\3L\3M\6M\u033c\nM\rM\16M\u033d\3M\6M\u0341\nM\rM\16M\u0342\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\5N\u034f\nN\3O\3O\5O\u0353\nO\3O\3O\5O\u0357\nO"+
		"\3O\3O\5O\u035b\nO\5O\u035d\nO\3P\3P\5P\u0361\nP\3Q\7Q\u0364\nQ\fQ\16"+
		"Q\u0367\13Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3T\7T\u0377\nT\fT\16"+
		"T\u037a\13T\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0388\nW\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0398\nW\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u03b8"+
		"\nW\3W\3W\3W\7W\u03bd\nW\fW\16W\u03c0\13W\3X\3X\3X\3X\3X\3X\5X\u03c8\n"+
		"X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u03d1\nY\5Y\u03d3\nY\3Z\3Z\5Z\u03d7\nZ\3Z\5"+
		"Z\u03da\nZ\3[\3[\3[\3[\7[\u03e0\n[\f[\16[\u03e3\13[\3[\3[\3[\3[\3[\3["+
		"\3[\7[\u03ec\n[\f[\16[\u03ef\13[\3[\3[\7[\u03f3\n[\f[\16[\u03f6\13[\5"+
		"[\u03f8\n[\3\\\3\\\5\\\u03fc\n\\\3]\3]\3]\3]\3^\3^\3^\5^\u0405\n^\3_\3"+
		"_\3_\5_\u040a\n_\3`\3`\3`\3a\3a\5a\u0411\na\3a\3a\3a\2\3\u00acb\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\2\16\b\2\4\4\6\6\13\13\17\17\36\36,,\4\2\25\25--\3\2>C\3\2;=\3"+
		"\2Z]\3\2PQ\4\2^_cc\3\2\\]\4\2NOUV\4\2TTWW\4\2MMdg\3\2Z[\2\u044d\2\u00c5"+
		"\3\2\2\2\4\u00cc\3\2\2\2\6\u00d0\3\2\2\2\b\u00d2\3\2\2\2\n\u00dd\3\2\2"+
		"\2\f\u00e2\3\2\2\2\16\u00ea\3\2\2\2\20\u00fc\3\2\2\2\22\u0107\3\2\2\2"+
		"\24\u0111\3\2\2\2\26\u0118\3\2\2\2\30\u0123\3\2\2\2\32\u012b\3\2\2\2\34"+
		"\u0134\3\2\2\2\36\u0140\3\2\2\2 \u0145\3\2\2\2\"\u014f\3\2\2\2$\u0151"+
		"\3\2\2\2&\u0159\3\2\2\2(\u016c\3\2\2\2*\u016f\3\2\2\2,\u0177\3\2\2\2."+
		"\u017d\3\2\2\2\60\u0181\3\2\2\2\62\u0183\3\2\2\2\64\u018e\3\2\2\2\66\u019b"+
		"\3\2\2\28\u01ac\3\2\2\2:\u01af\3\2\2\2<\u01b7\3\2\2\2>\u01bc\3\2\2\2@"+
		"\u01c6\3\2\2\2B\u01c8\3\2\2\2D\u01d8\3\2\2\2F\u01ea\3\2\2\2H\u01ec\3\2"+
		"\2\2J\u01f0\3\2\2\2L\u01f2\3\2\2\2N\u0203\3\2\2\2P\u0205\3\2\2\2R\u020d"+
		"\3\2\2\2T\u0220\3\2\2\2V\u0225\3\2\2\2X\u022e\3\2\2\2Z\u0235\3\2\2\2\\"+
		"\u0237\3\2\2\2^\u0239\3\2\2\2`\u023b\3\2\2\2b\u023d\3\2\2\2d\u0247\3\2"+
		"\2\2f\u0249\3\2\2\2h\u0251\3\2\2\2j\u0258\3\2\2\2l\u025a\3\2\2\2n\u026a"+
		"\3\2\2\2p\u026f\3\2\2\2r\u027a\3\2\2\2t\u0284\3\2\2\2v\u0288\3\2\2\2x"+
		"\u028a\3\2\2\2z\u0290\3\2\2\2|\u0292\3\2\2\2~\u0295\3\2\2\2\u0080\u02a1"+
		"\3\2\2\2\u0082\u02a3\3\2\2\2\u0084\u02a9\3\2\2\2\u0086\u0305\3\2\2\2\u0088"+
		"\u0307\3\2\2\2\u008a\u030f\3\2\2\2\u008c\u0315\3\2\2\2\u008e\u031b\3\2"+
		"\2\2\u0090\u031d\3\2\2\2\u0092\u0320\3\2\2\2\u0094\u0327\3\2\2\2\u0096"+
		"\u0332\3\2\2\2\u0098\u033b\3\2\2\2\u009a\u034e\3\2\2\2\u009c\u035c\3\2"+
		"\2\2\u009e\u0360\3\2\2\2\u00a0\u0365\3\2\2\2\u00a2\u036d\3\2\2\2\u00a4"+
		"\u036f\3\2\2\2\u00a6\u0373\3\2\2\2\u00a8\u037b\3\2\2\2\u00aa\u037d\3\2"+
		"\2\2\u00ac\u0387\3\2\2\2\u00ae\u03c7\3\2\2\2\u00b0\u03d2\3\2\2\2\u00b2"+
		"\u03d9\3\2\2\2\u00b4\u03db\3\2\2\2\u00b6\u03f9\3\2\2\2\u00b8\u03fd\3\2"+
		"\2\2\u00ba\u0404\3\2\2\2\u00bc\u0409\3\2\2\2\u00be\u040b\3\2\2\2\u00c0"+
		"\u040e\3\2\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\2\2\3\u00c9\3\3\2\2\2\u00ca\u00cd\5n8\2\u00cb"+
		"\u00cd\7J\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\5\3\2\2\2"+
		"\u00ce\u00d1\7\26\2\2\u00cf\u00d1\5b\62\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\7\3\2\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d8\5\n\6\2\u00d4"+
		"\u00d5\7K\2\2\u00d5\u00d7\5\n\6\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7N\2\2\u00dc\t\3\2\2\2\u00dd\u00e0\7o\2\2\u00de"+
		"\u00df\7\25\2\2\u00df\u00e1\5\f\7\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\13\3\2\2\2\u00e2\u00e7\5F$\2\u00e3\u00e4\7`\2\2\u00e4\u00e6"+
		"\5F$\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\r\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\24\2"+
		"\2\u00eb\u00ee\7o\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ef\5\30\r\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7F"+
		"\2\2\u00f1\u00f3\5\20\t\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f6\7K\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5\24\13\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7G\2\2\u00fb\17\3\2\2\2"+
		"\u00fc\u0101\5\22\n\2\u00fd\u00fe\7K\2\2\u00fe\u0100\5\22\n\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\21\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5b\62\2\u0105\u0104\3\2\2"+
		"\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7o\2\2\u010b\u010d\5\u00c0a\2"+
		"\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110"+
		"\5\32\16\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\23\3\2\2\2\u0111"+
		"\u0115\7J\2\2\u0112\u0114\5\36\20\2\u0113\u0112\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\25\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\7\37\2\2\u0119\u011b\7o\2\2\u011a\u011c\5\b"+
		"\5\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011e\7\25\2\2\u011e\u0120\5\30\r\2\u011f\u011d\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5\34\17\2\u0122\27\3\2\2\2\u0123"+
		"\u0128\5F$\2\u0124\u0125\7K\2\2\u0125\u0127\5F$\2\u0126\u0124\3\2\2\2"+
		"\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\31"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012f\7F\2\2\u012c\u012e\5\36\20\2"+
		"\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7G\2\2\u0133"+
		"\33\3\2\2\2\u0134\u0138\7F\2\2\u0135\u0137\5.\30\2\u0136\u0135\3\2\2\2"+
		"\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7G\2\2\u013c\35\3\2\2\2\u013d"+
		"\u0141\7J\2\2\u013e\u0141\5~@\2\u013f\u0141\5\"\22\2\u0140\u013d\3\2\2"+
		"\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\37\3\2\2\2\u0142\u0146"+
		"\7J\2\2\u0143\u0146\5~@\2\u0144\u0146\5\"\22\2\u0145\u0142\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146!\3\2\2\2\u0147\u0150\5&\24\2"+
		"\u0148\u0150\5(\25\2\u0149\u0150\5,\27\2\u014a\u0150\5*\26\2\u014b\u0150"+
		"\5\26\f\2\u014c\u0150\5n8\2\u014d\u0150\5\16\b\2\u014e\u0150\5$\23\2\u014f"+
		"\u0147\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2"+
		"\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150#\3\2\2\2\u0151\u0152\7\65\2\2\u0152\u0153\7!\2\2"+
		"\u0153\u0154\7D\2\2\u0154\u0155\7E\2\2\u0155\u0156\5Z.\2\u0156%\3\2\2"+
		"\2\u0157\u015a\5F$\2\u0158\u015a\7\65\2\2\u0159\u0157\3\2\2\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7o\2\2\u015c\u0161\5R*\2\u015d"+
		"\u015e\7H\2\2\u015e\u0160\7I\2\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2"+
		"\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7\62\2\2\u0165\u0167\5P)\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u016b\5Z.\2\u0169\u016b\7J\2"+
		"\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\'\3\2\2\2\u016c\u016d"+
		"\5\b\5\2\u016d\u016e\5&\24\2\u016e)\3\2\2\2\u016f\u0170\7o\2\2\u0170\u0173"+
		"\5R*\2\u0171\u0172\7\62\2\2\u0172\u0174\5P)\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\5\\/\2\u0176+\3\2\2\2\u0177"+
		"\u0178\5F$\2\u0178\u0179\5:\36\2\u0179\u017a\7J\2\2\u017a-\3\2\2\2\u017b"+
		"\u017e\5\60\31\2\u017c\u017e\7J\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3"+
		"\2\2\2\u017e/\3\2\2\2\u017f\u0182\5\62\32\2\u0180\u0182\5n8\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0180\3\2\2\2\u0182\61\3\2\2\2\u0183\u0184\5F$\2\u0184"+
		"\u0189\5\64\33\2\u0185\u0186\7K\2\2\u0186\u0188\5\64\33\2\u0187\u0185"+
		"\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7J\2\2\u018d\63\3\2\2\2"+
		"\u018e\u0193\7o\2\2\u018f\u0190\7H\2\2\u0190\u0192\7I\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7M\2\2\u0197\u0198\5@!"+
		"\2\u0198\65\3\2\2\2\u0199\u019c\5F$\2\u019a\u019c\7\65\2\2\u019b\u0199"+
		"\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7o\2\2\u019e"+
		"\u01a3\5R*\2\u019f\u01a0\7H\2\2\u01a0\u01a2\7I\2\2\u01a1\u019f\3\2\2\2"+
		"\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a9\5P)\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7J"+
		"\2\2\u01ab\67\3\2\2\2\u01ac\u01ad\5\b\5\2\u01ad\u01ae\5\66\34\2\u01ae"+
		"9\3\2\2\2\u01af\u01b4\5<\37\2\u01b0\u01b1\7K\2\2\u01b1\u01b3\5<\37\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5;\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\5> \2\u01b8\u01b9"+
		"\7M\2\2\u01b9\u01bb\5@!\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"=\3\2\2\2\u01bc\u01c1\7o\2\2\u01bd\u01be\7H\2\2\u01be\u01c0\7I\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2?\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\5B\"\2\u01c5\u01c7"+
		"\5\u00acW\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7A\3\2\2\2\u01c8"+
		"\u01d4\7F\2\2\u01c9\u01ce\5@!\2\u01ca\u01cb\7K\2\2\u01cb\u01cd\5@!\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\7K\2\2\u01d2"+
		"\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01c9\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7G\2\2\u01d7"+
		"C\3\2\2\2\u01d8\u01d9\7o\2\2\u01d9E\3\2\2\2\u01da\u01df\5H%\2\u01db\u01dc"+
		"\7H\2\2\u01dc\u01de\7I\2\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01eb\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e7\5J&\2\u01e3\u01e4\7H\2\2\u01e4\u01e6\7I\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01da\3\2\2\2\u01ea\u01e2\3\2"+
		"\2\2\u01ebG\3\2\2\2\u01ec\u01ee\7o\2\2\u01ed\u01ef\5L\'\2\u01ee\u01ed"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efI\3\2\2\2\u01f0\u01f1\t\2\2\2\u01f1"+
		"K\3\2\2\2\u01f2\u01f3\7O\2\2\u01f3\u01f8\5N(\2\u01f4\u01f5\7K\2\2\u01f5"+
		"\u01f7\5N(\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2"+
		"\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc"+
		"\7N\2\2\u01fcM\3\2\2\2\u01fd\u0204\5F$\2\u01fe\u0201\7R\2\2\u01ff\u0200"+
		"\t\3\2\2\u0200\u0202\5F$\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0204\3\2\2\2\u0203\u01fd\3\2\2\2\u0203\u01fe\3\2\2\2\u0204O\3\2\2\2"+
		"\u0205\u020a\5^\60\2\u0206\u0207\7K\2\2\u0207\u0209\5^\60\2\u0208\u0206"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"Q\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\7D\2\2\u020e\u0210\5T+\2\u020f"+
		"\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7E"+
		"\2\2\u0212S\3\2\2\2\u0213\u0218\5V,\2\u0214\u0215\7K\2\2\u0215\u0217\5"+
		"V,\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021d\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7K"+
		"\2\2\u021c\u021e\5X-\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0221"+
		"\3\2\2\2\u021f\u0221\5X-\2\u0220\u0213\3\2\2\2\u0220\u021f\3\2\2\2\u0221"+
		"U\3\2\2\2\u0222\u0224\5\6\4\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2"+
		"\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0228\u0229\5F$\2\u0229\u022a\5> \2\u022aW\3\2\2\2\u022b\u022d"+
		"\5\6\4\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\5F"+
		"$\2\u0232\u0233\7q\2\2\u0233\u0234\5> \2\u0234Y\3\2\2\2\u0235\u0236\5"+
		"~@\2\u0236[\3\2\2\2\u0237\u0238\5~@\2\u0238]\3\2\2\2\u0239\u023a\7o\2"+
		"\2\u023a_\3\2\2\2\u023b\u023c\t\4\2\2\u023ca\3\2\2\2\u023d\u023e\7p\2"+
		"\2\u023e\u0245\5d\63\2\u023f\u0242\7D\2\2\u0240\u0243\5f\64\2\u0241\u0243"+
		"\5j\66\2\u0242\u0240\3\2\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0246\7E\2\2\u0245\u023f\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246c\3\2\2\2\u0247\u0248\5^\60\2\u0248e\3\2\2\2\u0249\u024e\5h"+
		"\65\2\u024a\u024b\7K\2\2\u024b\u024d\5h\65\2\u024c\u024a\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fg\3\2\2\2"+
		"\u0250\u024e\3\2\2\2\u0251\u0252\7o\2\2\u0252\u0253\7M\2\2\u0253\u0254"+
		"\5j\66\2\u0254i\3\2\2\2\u0255\u0259\5\u00acW\2\u0256\u0259\5b\62\2\u0257"+
		"\u0259\5l\67\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2"+
		"\2\2\u0259k\3\2\2\2\u025a\u0263\7F\2\2\u025b\u0260\5j\66\2\u025c\u025d"+
		"\7K\2\2\u025d\u025f\5j\66\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0263\u025b\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265"+
		"\u0267\7K\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\7G\2\2\u0269m\3\2\2\2\u026a\u026b\7p\2\2\u026b\u026c"+
		"\7\37\2\2\u026c\u026d\7o\2\2\u026d\u026e\5p9\2\u026eo\3\2\2\2\u026f\u0273"+
		"\7F\2\2\u0270\u0272\5r:\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0276\u0277\7G\2\2\u0277q\3\2\2\2\u0278\u027b\5t;\2\u0279\u027b\7"+
		"J\2\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027bs\3\2\2\2\u027c\u027d"+
		"\5F$\2\u027d\u027e\5v<\2\u027e\u027f\7J\2\2\u027f\u0285\3\2\2\2\u0280"+
		"\u0282\5n8\2\u0281\u0283\7J\2\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2"+
		"\2\u0283\u0285\3\2\2\2\u0284\u027c\3\2\2\2\u0284\u0280\3\2\2\2\u0285u"+
		"\3\2\2\2\u0286\u0289\5x=\2\u0287\u0289\5z>\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0287\3\2\2\2\u0289w\3\2\2\2\u028a\u028b\7o\2\2\u028b\u028c\7D\2\2\u028c"+
		"\u028e\7E\2\2\u028d\u028f\5|?\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2"+
		"\2\u028fy\3\2\2\2\u0290\u0291\5:\36\2\u0291{\3\2\2\2\u0292\u0293\7\20"+
		"\2\2\u0293\u0294\5j\66\2\u0294}\3\2\2\2\u0295\u0299\7F\2\2\u0296\u0298"+
		"\5\u0080A\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2"+
		"\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d"+
		"\7G\2\2\u029d\177\3\2\2\2\u029e\u02a2\5\u0082B\2\u029f\u02a2\5\u0086D"+
		"\2\u02a0\u02a2\5\4\3\2\u02a1\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u0081\3\2\2\2\u02a3\u02a4\5\u0084C\2\u02a4\u02a5\7J\2\2"+
		"\u02a5\u0083\3\2\2\2\u02a6\u02a8\5\6\4\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02ad\5F$\2\u02ad\u02ae\5:\36\2\u02ae\u0085\3\2\2"+
		"\2\u02af\u0306\5~@\2\u02b0\u02b1\7\31\2\2\u02b1\u02b2\5\u00a4S\2\u02b2"+
		"\u02b5\5\u0086D\2\u02b3\u02b4\7\23\2\2\u02b4\u02b6\5\u0086D\2\u02b5\u02b3"+
		"\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u0306\3\2\2\2\u02b7\u02b8\7\30\2\2"+
		"\u02b8\u02b9\7D\2\2\u02b9\u02ba\5\u009cO\2\u02ba\u02bb\7E\2\2\u02bb\u02bc"+
		"\5\u0086D\2\u02bc\u0306\3\2\2\2\u02bd\u02be\7\67\2\2\u02be\u02bf\5\u00a4"+
		"S\2\u02bf\u02c0\5\u0086D\2\u02c0\u0306\3\2\2\2\u02c1\u02c2\7\21\2\2\u02c2"+
		"\u02c3\5\u0086D\2\u02c3\u02c4\7\67\2\2\u02c4\u02c5\5\u00a4S\2\u02c5\u02c6"+
		"\7J\2\2\u02c6\u0306\3\2\2\2\u02c7\u02c8\7\64\2\2\u02c8\u02d2\5~@\2\u02c9"+
		"\u02cb\5\u008cG\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ca"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02d0\5\u0090I"+
		"\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02d3"+
		"\5\u0090I\2\u02d2\u02ca\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u0306\3\2\2"+
		"\2\u02d4\u02d5\7\64\2\2\u02d5\u02d6\5\u0092J\2\u02d6\u02da\5~@\2\u02d7"+
		"\u02d9\5\u008cG\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"\u02df\5\u0090I\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u0306"+
		"\3\2\2\2\u02e0\u02e1\7.\2\2\u02e1\u02e2\5\u00a4S\2\u02e2\u02e6\7F\2\2"+
		"\u02e3\u02e5\5\u0098M\2\u02e4\u02e3\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ec\3\2\2\2\u02e8\u02e6\3\2"+
		"\2\2\u02e9\u02eb\5\u009aN\2\u02ea\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ef\u02f0\7G\2\2\u02f0\u0306\3\2\2\2\u02f1\u02f3\7(\2\2\u02f2\u02f4"+
		"\5\u00acW\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2"+
		"\2\u02f5\u0306\7J\2\2\u02f6\u02f7\7\61\2\2\u02f7\u02f8\5\u00acW\2\u02f8"+
		"\u02f9\7J\2\2\u02f9\u0306\3\2\2\2\u02fa\u02fc\7\7\2\2\u02fb\u02fd\7o\2"+
		"\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0306"+
		"\7J\2\2\u02ff\u0306\7J\2\2\u0300\u0301\5\u00a8U\2\u0301\u0302\7J\2\2\u0302"+
		"\u0306\3\2\2\2\u0303\u0306\5\u008aF\2\u0304\u0306\5\u0088E\2\u0305\u02af"+
		"\3\2\2\2\u0305\u02b0\3\2\2\2\u0305\u02b7\3\2\2\2\u0305\u02bd\3\2\2\2\u0305"+
		"\u02c1\3\2\2\2\u0305\u02c7\3\2\2\2\u0305\u02d4\3\2\2\2\u0305\u02e0\3\2"+
		"\2\2\u0305\u02f1\3\2\2\2\u0305\u02f6\3\2\2\2\u0305\u02fa\3\2\2\2\u0305"+
		"\u02ff\3\2\2\2\u0305\u0300\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2"+
		"\2\2\u0306\u0087\3\2\2\2\u0307\u0308\78\2\2\u0308\u0309\7D\2\2\u0309\u030a"+
		"\5\u00acW\2\u030a\u030b\7K\2\2\u030b\u030c\7o\2\2\u030c\u030d\7E\2\2\u030d"+
		"\u030e\7J\2\2\u030e\u0089\3\2\2\2\u030f\u0310\79\2\2\u0310\u0311\7D\2"+
		"\2\u0311\u0312\5\u00acW\2\u0312\u0313\7E\2\2\u0313\u0314\7J\2\2\u0314"+
		"\u008b\3\2\2\2\u0315\u0316\7\n\2\2\u0316\u0317\7D\2\2\u0317\u0318\5\u008e"+
		"H\2\u0318\u0319\7E\2\2\u0319\u031a\5~@\2\u031a\u008d\3\2\2\2\u031b\u031c"+
		"\t\5\2\2\u031c\u008f\3\2\2\2\u031d\u031e\7\27\2\2\u031e\u031f\5~@\2\u031f"+
		"\u0091\3\2\2\2\u0320\u0321\7D\2\2\u0321\u0323\5\u0094K\2\u0322\u0324\7"+
		"J\2\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0326\7E\2\2\u0326\u0093\3\2\2\2\u0327\u032c\5\u0096L\2\u0328\u0329\7"+
		"J\2\2\u0329\u032b\5\u0096L\2\u032a\u0328\3\2\2\2\u032b\u032e\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0095\3\2\2\2\u032e\u032c\3\2"+
		"\2\2\u032f\u0331\5\6\4\2\u0330\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332"+
		"\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0335\u0336\5H%\2\u0336\u0337\5> \2\u0337\u0338\7M\2\2\u0338\u0339"+
		"\5\u00acW\2\u0339\u0097\3\2\2\2\u033a\u033c\5\u009aN\2\u033b\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u0340\3\2\2\2\u033f\u0341\5\u0080A\2\u0340\u033f\3\2\2\2\u0341\u0342"+
		"\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0099\3\2\2\2\u0344"+
		"\u0345\7\t\2\2\u0345\u0346\5\u00aaV\2\u0346\u0347\7S\2\2\u0347\u034f\3"+
		"\2\2\2\u0348\u0349\7\t\2\2\u0349\u034a\5D#\2\u034a\u034b\7S\2\2\u034b"+
		"\u034f\3\2\2\2\u034c\u034d\7\20\2\2\u034d\u034f\7S\2\2\u034e\u0344\3\2"+
		"\2\2\u034e\u0348\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u009b\3\2\2\2\u0350"+
		"\u035d\5\u00a0Q\2\u0351\u0353\5\u009eP\2\u0352\u0351\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\7J\2\2\u0355\u0357\5\u00acW\2"+
		"\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a"+
		"\7J\2\2\u0359\u035b\5\u00a2R\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2"+
		"\u035b\u035d\3\2\2\2\u035c\u0350\3\2\2\2\u035c\u0352\3\2\2\2\u035d\u009d"+
		"\3\2\2\2\u035e\u0361\5\u0084C\2\u035f\u0361\5\u00a6T\2\u0360\u035e\3\2"+
		"\2\2\u0360\u035f\3\2\2\2\u0361\u009f\3\2\2\2\u0362\u0364\5\6\4\2\u0363"+
		"\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2"+
		"\2\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\5F$\2\u0369\u036a"+
		"\5> \2\u036a\u036b\7S\2\2\u036b\u036c\5\u00acW\2\u036c\u00a1\3\2\2\2\u036d"+
		"\u036e\5\u00a6T\2\u036e\u00a3\3\2\2\2\u036f\u0370\7D\2\2\u0370\u0371\5"+
		"\u00acW\2\u0371\u0372\7E\2\2\u0372\u00a5\3\2\2\2\u0373\u0378\5\u00acW"+
		"\2\u0374\u0375\7K\2\2\u0375\u0377\5\u00acW\2\u0376\u0374\3\2\2\2\u0377"+
		"\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u00a7\3\2"+
		"\2\2\u037a\u0378\3\2\2\2\u037b\u037c\5\u00acW\2\u037c\u00a9\3\2\2\2\u037d"+
		"\u037e\5\u00acW\2\u037e\u00ab\3\2\2\2\u037f\u0380\bW\1\2\u0380\u0388\5"+
		"\u00aeX\2\u0381\u0382\7#\2\2\u0382\u0388\5\u00b0Y\2\u0383\u0384\t\6\2"+
		"\2\u0384\u0388\5\u00acW\f\u0385\u0386\t\7\2\2\u0386\u0388\5\u00acW\13"+
		"\u0387\u037f\3\2\2\2\u0387\u0381\3\2\2\2\u0387\u0383\3\2\2\2\u0387\u0385"+
		"\3\2\2\2\u0388\u03be\3\2\2\2\u0389\u038a\f\n\2\2\u038a\u038b\t\b\2\2\u038b"+
		"\u03bd\5\u00acW\13\u038c\u038d\f\t\2\2\u038d\u038e\t\t\2\2\u038e\u03bd"+
		"\5\u00acW\n\u038f\u0397\f\b\2\2\u0390\u0391\7O\2\2\u0391\u0398\7O\2\2"+
		"\u0392\u0393\7N\2\2\u0393\u0394\7N\2\2\u0394\u0398\7N\2\2\u0395\u0396"+
		"\7N\2\2\u0396\u0398\7N\2\2\u0397\u0390\3\2\2\2\u0397\u0392\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u03bd\5\u00acW\t\u039a\u039b"+
		"\f\7\2\2\u039b\u039c\t\n\2\2\u039c\u03bd\5\u00acW\b\u039d\u039e\f\6\2"+
		"\2\u039e\u039f\t\13\2\2\u039f\u03bd\5\u00acW\7\u03a0\u03a1\f\5\2\2\u03a1"+
		"\u03a2\7X\2\2\u03a2\u03bd\5\u00acW\6\u03a3\u03a4\f\4\2\2\u03a4\u03a5\7"+
		"Y\2\2\u03a5\u03bd\5\u00acW\5\u03a6\u03a7\f\3\2\2\u03a7\u03a8\t\f\2\2\u03a8"+
		"\u03bd\5\u00acW\3\u03a9\u03aa\f\21\2\2\u03aa\u03ab\7D\2\2\u03ab\u03ac"+
		"\5\u00c0a\2\u03ac\u03ad\7E\2\2\u03ad\u03ae\7J\2\2\u03ae\u03bd\3\2\2\2"+
		"\u03af\u03b0\f\20\2\2\u03b0\u03b1\7H\2\2\u03b1\u03b2\5\u00acW\2\u03b2"+
		"\u03b3\7I\2\2\u03b3\u03bd\3\2\2\2\u03b4\u03b5\f\17\2\2\u03b5\u03b7\7D"+
		"\2\2\u03b6\u03b8\5\u00a6T\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03bd\7E\2\2\u03ba\u03bb\f\r\2\2\u03bb\u03bd\t\r"+
		"\2\2\u03bc\u0389\3\2\2\2\u03bc\u038c\3\2\2\2\u03bc\u038f\3\2\2\2\u03bc"+
		"\u039a\3\2\2\2\u03bc\u039d\3\2\2\2\u03bc\u03a0\3\2\2\2\u03bc\u03a3\3\2"+
		"\2\2\u03bc\u03a6\3\2\2\2\u03bc\u03a9\3\2\2\2\u03bc\u03af\3\2\2\2\u03bc"+
		"\u03b4\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u00ad\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1"+
		"\u03c2\7D\2\2\u03c2\u03c3\5\u00acW\2\u03c3\u03c4\7E\2\2\u03c4\u03c8\3"+
		"\2\2\2\u03c5\u03c8\5`\61\2\u03c6\u03c8\7o\2\2\u03c7\u03c1\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u00af\3\2\2\2\u03c9\u03ca\5\u00b8"+
		"]\2\u03ca\u03cb\5\u00b2Z\2\u03cb\u03cc\5\u00b6\\\2\u03cc\u03d3\3\2\2\2"+
		"\u03cd\u03d0\5\u00b2Z\2\u03ce\u03d1\5\u00b4[\2\u03cf\u03d1\5\u00b6\\\2"+
		"\u03d0\u03ce\3\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03c9"+
		"\3\2\2\2\u03d2\u03cd\3\2\2\2\u03d3\u00b1\3\2\2\2\u03d4\u03d6\7o\2\2\u03d5"+
		"\u03d7\5\u00ba^\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03da"+
		"\3\2\2\2\u03d8\u03da\5J&\2\u03d9\u03d4\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da"+
		"\u00b3\3\2\2\2\u03db\u03f7\7H\2\2\u03dc\u03e1\7I\2\2\u03dd\u03de\7H\2"+
		"\2\u03de\u03e0\7I\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03f8\5B\"\2\u03e5\u03e6\5\u00acW\2\u03e6\u03ed\7I\2\2\u03e7\u03e8\7"+
		"H\2\2\u03e8\u03e9\5\u00acW\2\u03e9\u03ea\7I\2\2\u03ea\u03ec\3\2\2\2\u03eb"+
		"\u03e7\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2"+
		"\2\2\u03ee\u03f4\3\2\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f1\7H\2\2\u03f1"+
		"\u03f3\7I\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7"+
		"\u03dc\3\2\2\2\u03f7\u03e5\3\2\2\2\u03f8\u00b5\3\2\2\2\u03f9\u03fb\5\u00c0"+
		"a\2\u03fa\u03fc\5\32\16\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u00b7\3\2\2\2\u03fd\u03fe\7O\2\2\u03fe\u03ff\5\30\r\2\u03ff\u0400\7N"+
		"\2\2\u0400\u00b9\3\2\2\2\u0401\u0402\7O\2\2\u0402\u0405\7N\2\2\u0403\u0405"+
		"\5L\'\2\u0404\u0401\3\2\2\2\u0404\u0403\3\2\2\2\u0405\u00bb\3\2\2\2\u0406"+
		"\u0407\7O\2\2\u0407\u040a\7N\2\2\u0408\u040a\5\u00b8]\2\u0409\u0406\3"+
		"\2\2\2\u0409\u0408\3\2\2\2\u040a\u00bd\3\2\2\2\u040b\u040c\7o\2\2\u040c"+
		"\u040d\5\u00c0a\2\u040d\u00bf\3\2\2\2\u040e\u0410\7D\2\2\u040f\u0411\5"+
		"\u00a6T\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2"+
		"\u0412\u0413\7E\2\2\u0413\u00c1\3\2\2\2t\u00c5\u00cc\u00d0\u00d8\u00e0"+
		"\u00e7\u00ee\u00f2\u00f5\u00f8\u0101\u0107\u010c\u010f\u0115\u011b\u011f"+
		"\u0128\u012f\u0138\u0140\u0145\u014f\u0159\u0161\u0166\u016a\u0173\u017d"+
		"\u0181\u0189\u0193\u019b\u01a3\u01a8\u01b4\u01ba\u01c1\u01c6\u01ce\u01d2"+
		"\u01d4\u01df\u01e7\u01ea\u01ee\u01f8\u0201\u0203\u020a\u020f\u0218\u021d"+
		"\u0220\u0225\u022e\u0242\u0245\u024e\u0258\u0260\u0263\u0266\u0273\u027a"+
		"\u0282\u0284\u0288\u028e\u0299\u02a1\u02a9\u02b5\u02cc\u02cf\u02d2\u02da"+
		"\u02de\u02e6\u02ec\u02f3\u02fc\u0305\u0323\u032c\u0332\u033d\u0342\u034e"+
		"\u0352\u0356\u035a\u035c\u0360\u0365\u0378\u0387\u0397\u03b7\u03bc\u03be"+
		"\u03c7\u03d0\u03d2\u03d6\u03d9\u03e1\u03ed\u03f4\u03f7\u03fb\u0404\u0409"+
		"\u0410";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}