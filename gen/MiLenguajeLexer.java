// Generated from C:/Users/sebastian/Desktop/Estudio/universidad/2019-2/lenguajes/test2/grammar\MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TK_PERIOD=2, TK_INCR=3, TK_DECR=4, TK_HAT=5, TK_ASSIGN=6, TK_SEPARATOR=7, 
		TK_LBRACKET=8, TK_RBRACKET=9, TK_LBRACE=10, TK_RBRACE=11, TK_LPAREN=12, 
		TK_RPAREN=13, TK_COMMA=14, TK_ASTER=15, TK_COLON=16, TK_EQ=17, TK_ARROW=18, 
		TK_SQUARE=19, TK_EXPON=20, TK_DIV=21, TK_MOD=22, TK_REMDR=23, TK_PLUS=24, 
		TK_MINUS=25, TK_CONCAT=26, TK_NE=27, TK_GE=28, TK_LE=29, TK_GT=30, TK_LT=31, 
		TK_AND=32, TK_OR=33, TK_XOR=34, TK_RSHIFT=35, TK_LSHIFT=36, TK_SWAP=37, 
		TK_AUG_PLUS=38, TK_AUG_MINUS=39, TK_AUG_ASTER=40, TK_AUG_DIV=41, TK_AUG_REMDR=42, 
		TK_AUG_EXPON=43, TK_AUG_OR=44, TK_AUG_AND=45, TK_AUG_CONCAT=46, TK_AUG_RSHIFT=47, 
		TK_AUG_LSHIFT=48, TK_NOT=49, TK_ADDR=50, TK_QMARK=51, TK_LOW=52, TK_HIGH=53, 
		TK_NEW=54, TK_SEM=55, TK_OP=56, TK_BOGUS=57, TK_ILIT=58, TK_RLIT=59, TK_CLIT=60, 
		TK_SLIT=61, TK_NLIT=62, TK_BLIT=63, TK_FLIT=64, TK_ELSE=65, TK_IF=66, 
		TK_FI=67, TK_DO=68, TK_OD=69, TK_SKIP=70, TK_EXIT=71, TK_NEXT=72, TK_RETURN=73, 
		TK_REPLY=74, TK_FORWARD=75, TK_SEND=76, TK_CALL=77, TK_DESTROY=78, TK_BEGIN=79, 
		TK_END=80, TK_GLOBAL=81, TK_BODY=82, TK_PROC=83, TK_TYPE=84, TK_VAL=85, 
		TK_VAR=86, TK_RES=87, TK_REF=88, TK_SEPARATE=89, TK_BOOL=90, TK_INT=91, 
		TK_CHAR=92, TK_REAL=93, TK_FILE=94, TK_STRING=95, TK_EXTEND=96, TK_IMPORT=97, 
		TK_CONST=98, TK_ENUM=99, TK_RETURNS=100, TK_CREATE=101, TK_VM=102, TK_ON=103, 
		TK_STOP=104, TK_ID=105, CADENA=106, NUM=107, ESP=108, LINE_COMMENT=109;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TK_PERIOD", "TK_INCR", "TK_DECR", "TK_HAT", "TK_ASSIGN", "TK_SEPARATOR", 
			"TK_LBRACKET", "TK_RBRACKET", "TK_LBRACE", "TK_RBRACE", "TK_LPAREN", 
			"TK_RPAREN", "TK_COMMA", "TK_ASTER", "TK_COLON", "TK_EQ", "TK_ARROW", 
			"TK_SQUARE", "TK_EXPON", "TK_DIV", "TK_MOD", "TK_REMDR", "TK_PLUS", "TK_MINUS", 
			"TK_CONCAT", "TK_NE", "TK_GE", "TK_LE", "TK_GT", "TK_LT", "TK_AND", "TK_OR", 
			"TK_XOR", "TK_RSHIFT", "TK_LSHIFT", "TK_SWAP", "TK_AUG_PLUS", "TK_AUG_MINUS", 
			"TK_AUG_ASTER", "TK_AUG_DIV", "TK_AUG_REMDR", "TK_AUG_EXPON", "TK_AUG_OR", 
			"TK_AUG_AND", "TK_AUG_CONCAT", "TK_AUG_RSHIFT", "TK_AUG_LSHIFT", "TK_NOT", 
			"TK_ADDR", "TK_QMARK", "TK_LOW", "TK_HIGH", "TK_NEW", "TK_SEM", "TK_OP", 
			"TK_BOGUS", "TK_ILIT", "TK_RLIT", "TK_CLIT", "TK_SLIT", "TK_NLIT", "TK_BLIT", 
			"TK_FLIT", "TK_ELSE", "TK_IF", "TK_FI", "TK_DO", "TK_OD", "TK_SKIP", 
			"TK_EXIT", "TK_NEXT", "TK_RETURN", "TK_REPLY", "TK_FORWARD", "TK_SEND", 
			"TK_CALL", "TK_DESTROY", "TK_BEGIN", "TK_END", "TK_GLOBAL", "TK_BODY", 
			"TK_PROC", "TK_TYPE", "TK_VAL", "TK_VAR", "TK_RES", "TK_REF", "TK_SEPARATE", 
			"TK_BOOL", "TK_INT", "TK_CHAR", "TK_REAL", "TK_FILE", "TK_STRING", "TK_EXTEND", 
			"TK_IMPORT", "TK_CONST", "TK_ENUM", "TK_RETURNS", "TK_CREATE", "TK_VM", 
			"TK_ON", "TK_STOP", "TK_ID", "CADENA", "NUM", "ESP", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'falta implementar'", "'.'", "'++'", "'--'", "'^'", "':='", "';'", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'*'", "':'", "'='", 
			"'->'", "'[]'", "'**'", "'/'", "'mod'", "'%'", "'+'", "'-'", "'||'", 
			"'!='", "'>='", "'<='", "'>'", "'<'", "'&'", "'|'", "'xor'", "'>>'", 
			"'<<'", "':=:'", "'+:='", "'-:='", "'*:='", "'/:='", "'%:='", "'**:='", 
			"'|:='", "'&:='", "'||:='", "'>>:='", "'<<:='", "'~'", "'@'", "'?'", 
			"'low'", "'high'", "'new'", "'sem'", "'op'", "'bogus'", "'ilit'", "'rlit'", 
			"'Clit'", "'Slit'", "'nlit'", "'blit'", "'flit'", "'else'", "'if'", "'fi'", 
			"'do'", "'od'", "'skip'", "'exit'", "'next'", "'return'", "'reply'", 
			"'forward'", "'send'", "'call'", "'destroy'", "'begin'", "'end'", "'global'", 
			"'body'", "'proc'", "'type'", "'val'", "'var'", "'res'", "'ref'", "'separate'", 
			"'bool'", "'int'", "'char'", "'real'", "'file'", "'string'", "'extend'", 
			"'import'", "'const'", "'enum'", "'returns'", "'create'", "'vm'", "'on'", 
			"'stop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TK_PERIOD", "TK_INCR", "TK_DECR", "TK_HAT", "TK_ASSIGN", 
			"TK_SEPARATOR", "TK_LBRACKET", "TK_RBRACKET", "TK_LBRACE", "TK_RBRACE", 
			"TK_LPAREN", "TK_RPAREN", "TK_COMMA", "TK_ASTER", "TK_COLON", "TK_EQ", 
			"TK_ARROW", "TK_SQUARE", "TK_EXPON", "TK_DIV", "TK_MOD", "TK_REMDR", 
			"TK_PLUS", "TK_MINUS", "TK_CONCAT", "TK_NE", "TK_GE", "TK_LE", "TK_GT", 
			"TK_LT", "TK_AND", "TK_OR", "TK_XOR", "TK_RSHIFT", "TK_LSHIFT", "TK_SWAP", 
			"TK_AUG_PLUS", "TK_AUG_MINUS", "TK_AUG_ASTER", "TK_AUG_DIV", "TK_AUG_REMDR", 
			"TK_AUG_EXPON", "TK_AUG_OR", "TK_AUG_AND", "TK_AUG_CONCAT", "TK_AUG_RSHIFT", 
			"TK_AUG_LSHIFT", "TK_NOT", "TK_ADDR", "TK_QMARK", "TK_LOW", "TK_HIGH", 
			"TK_NEW", "TK_SEM", "TK_OP", "TK_BOGUS", "TK_ILIT", "TK_RLIT", "TK_CLIT", 
			"TK_SLIT", "TK_NLIT", "TK_BLIT", "TK_FLIT", "TK_ELSE", "TK_IF", "TK_FI", 
			"TK_DO", "TK_OD", "TK_SKIP", "TK_EXIT", "TK_NEXT", "TK_RETURN", "TK_REPLY", 
			"TK_FORWARD", "TK_SEND", "TK_CALL", "TK_DESTROY", "TK_BEGIN", "TK_END", 
			"TK_GLOBAL", "TK_BODY", "TK_PROC", "TK_TYPE", "TK_VAL", "TK_VAR", "TK_RES", 
			"TK_REF", "TK_SEPARATE", "TK_BOOL", "TK_INT", "TK_CHAR", "TK_REAL", "TK_FILE", 
			"TK_STRING", "TK_EXTEND", "TK_IMPORT", "TK_CONST", "TK_ENUM", "TK_RETURNS", 
			"TK_CREATE", "TK_VM", "TK_ON", "TK_STOP", "TK_ID", "CADENA", "NUM", "ESP", 
			"LINE_COMMENT"
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2o\u02af\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\3:"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C"+
		"\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I"+
		"\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P"+
		"\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T"+
		"\3U\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3"+
		"^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3"+
		"a\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3i\3i\3j\6"+
		"j\u0290\nj\rj\16j\u0291\3k\3k\6k\u0296\nk\rk\16k\u0297\3k\3k\3l\6l\u029d"+
		"\nl\rl\16l\u029e\3m\6m\u02a2\nm\rm\16m\u02a3\3m\3m\3n\3n\6n\u02aa\nn\r"+
		"n\16n\u02ab\3n\3n\2\2o\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9"+
		"n\u00dbo\3\2\7\4\2C\\c|\6\2\"\"\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\3"+
		"\2\f\f\2\u02b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\3\u00dd"+
		"\3\2\2\2\5\u00ef\3\2\2\2\7\u00f1\3\2\2\2\t\u00f4\3\2\2\2\13\u00f7\3\2"+
		"\2\2\r\u00f9\3\2\2\2\17\u00fc\3\2\2\2\21\u00fe\3\2\2\2\23\u0100\3\2\2"+
		"\2\25\u0102\3\2\2\2\27\u0104\3\2\2\2\31\u0106\3\2\2\2\33\u0108\3\2\2\2"+
		"\35\u010a\3\2\2\2\37\u010c\3\2\2\2!\u010e\3\2\2\2#\u0110\3\2\2\2%\u0112"+
		"\3\2\2\2\'\u0115\3\2\2\2)\u0118\3\2\2\2+\u011b\3\2\2\2-\u011d\3\2\2\2"+
		"/\u0121\3\2\2\2\61\u0123\3\2\2\2\63\u0125\3\2\2\2\65\u0127\3\2\2\2\67"+
		"\u012a\3\2\2\29\u012d\3\2\2\2;\u0130\3\2\2\2=\u0133\3\2\2\2?\u0135\3\2"+
		"\2\2A\u0137\3\2\2\2C\u0139\3\2\2\2E\u013b\3\2\2\2G\u013f\3\2\2\2I\u0142"+
		"\3\2\2\2K\u0145\3\2\2\2M\u0149\3\2\2\2O\u014d\3\2\2\2Q\u0151\3\2\2\2S"+
		"\u0155\3\2\2\2U\u0159\3\2\2\2W\u015d\3\2\2\2Y\u0162\3\2\2\2[\u0166\3\2"+
		"\2\2]\u016a\3\2\2\2_\u016f\3\2\2\2a\u0174\3\2\2\2c\u0179\3\2\2\2e\u017b"+
		"\3\2\2\2g\u017d\3\2\2\2i\u017f\3\2\2\2k\u0183\3\2\2\2m\u0188\3\2\2\2o"+
		"\u018c\3\2\2\2q\u0190\3\2\2\2s\u0193\3\2\2\2u\u0199\3\2\2\2w\u019e\3\2"+
		"\2\2y\u01a3\3\2\2\2{\u01a8\3\2\2\2}\u01ad\3\2\2\2\177\u01b2\3\2\2\2\u0081"+
		"\u01b7\3\2\2\2\u0083\u01bc\3\2\2\2\u0085\u01c1\3\2\2\2\u0087\u01c4\3\2"+
		"\2\2\u0089\u01c7\3\2\2\2\u008b\u01ca\3\2\2\2\u008d\u01cd\3\2\2\2\u008f"+
		"\u01d2\3\2\2\2\u0091\u01d7\3\2\2\2\u0093\u01dc\3\2\2\2\u0095\u01e3\3\2"+
		"\2\2\u0097\u01e9\3\2\2\2\u0099\u01f1\3\2\2\2\u009b\u01f6\3\2\2\2\u009d"+
		"\u01fb\3\2\2\2\u009f\u0203\3\2\2\2\u00a1\u0209\3\2\2\2\u00a3\u020d\3\2"+
		"\2\2\u00a5\u0214\3\2\2\2\u00a7\u0219\3\2\2\2\u00a9\u021e\3\2\2\2\u00ab"+
		"\u0223\3\2\2\2\u00ad\u0227\3\2\2\2\u00af\u022b\3\2\2\2\u00b1\u022f\3\2"+
		"\2\2\u00b3\u0233\3\2\2\2\u00b5\u023c\3\2\2\2\u00b7\u0241\3\2\2\2\u00b9"+
		"\u0245\3\2\2\2\u00bb\u024a\3\2\2\2\u00bd\u024f\3\2\2\2\u00bf\u0254\3\2"+
		"\2\2\u00c1\u025b\3\2\2\2\u00c3\u0262\3\2\2\2\u00c5\u0269\3\2\2\2\u00c7"+
		"\u026f\3\2\2\2\u00c9\u0274\3\2\2\2\u00cb\u027c\3\2\2\2\u00cd\u0283\3\2"+
		"\2\2\u00cf\u0286\3\2\2\2\u00d1\u0289\3\2\2\2\u00d3\u028f\3\2\2\2\u00d5"+
		"\u0293\3\2\2\2\u00d7\u029c\3\2\2\2\u00d9\u02a1\3\2\2\2\u00db\u02a7\3\2"+
		"\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7o\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7v\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7t\2\2\u00ee\4\3\2\2\2\u00ef\u00f0"+
		"\7\60\2\2\u00f0\6\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7-\2\2\u00f3"+
		"\b\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7/\2\2\u00f6\n\3\2\2\2\u00f7"+
		"\u00f8\7`\2\2\u00f8\f\3\2\2\2\u00f9\u00fa\7<\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"\16\3\2\2\2\u00fc\u00fd\7=\2\2\u00fd\20\3\2\2\2\u00fe\u00ff\7]\2\2\u00ff"+
		"\22\3\2\2\2\u0100\u0101\7_\2\2\u0101\24\3\2\2\2\u0102\u0103\7}\2\2\u0103"+
		"\26\3\2\2\2\u0104\u0105\7\177\2\2\u0105\30\3\2\2\2\u0106\u0107\7*\2\2"+
		"\u0107\32\3\2\2\2\u0108\u0109\7+\2\2\u0109\34\3\2\2\2\u010a\u010b\7.\2"+
		"\2\u010b\36\3\2\2\2\u010c\u010d\7,\2\2\u010d \3\2\2\2\u010e\u010f\7<\2"+
		"\2\u010f\"\3\2\2\2\u0110\u0111\7?\2\2\u0111$\3\2\2\2\u0112\u0113\7/\2"+
		"\2\u0113\u0114\7@\2\2\u0114&\3\2\2\2\u0115\u0116\7]\2\2\u0116\u0117\7"+
		"_\2\2\u0117(\3\2\2\2\u0118\u0119\7,\2\2\u0119\u011a\7,\2\2\u011a*\3\2"+
		"\2\2\u011b\u011c\7\61\2\2\u011c,\3\2\2\2\u011d\u011e\7o\2\2\u011e\u011f"+
		"\7q\2\2\u011f\u0120\7f\2\2\u0120.\3\2\2\2\u0121\u0122\7\'\2\2\u0122\60"+
		"\3\2\2\2\u0123\u0124\7-\2\2\u0124\62\3\2\2\2\u0125\u0126\7/\2\2\u0126"+
		"\64\3\2\2\2\u0127\u0128\7~\2\2\u0128\u0129\7~\2\2\u0129\66\3\2\2\2\u012a"+
		"\u012b\7#\2\2\u012b\u012c\7?\2\2\u012c8\3\2\2\2\u012d\u012e\7@\2\2\u012e"+
		"\u012f\7?\2\2\u012f:\3\2\2\2\u0130\u0131\7>\2\2\u0131\u0132\7?\2\2\u0132"+
		"<\3\2\2\2\u0133\u0134\7@\2\2\u0134>\3\2\2\2\u0135\u0136\7>\2\2\u0136@"+
		"\3\2\2\2\u0137\u0138\7(\2\2\u0138B\3\2\2\2\u0139\u013a\7~\2\2\u013aD\3"+
		"\2\2\2\u013b\u013c\7z\2\2\u013c\u013d\7q\2\2\u013d\u013e\7t\2\2\u013e"+
		"F\3\2\2\2\u013f\u0140\7@\2\2\u0140\u0141\7@\2\2\u0141H\3\2\2\2\u0142\u0143"+
		"\7>\2\2\u0143\u0144\7>\2\2\u0144J\3\2\2\2\u0145\u0146\7<\2\2\u0146\u0147"+
		"\7?\2\2\u0147\u0148\7<\2\2\u0148L\3\2\2\2\u0149\u014a\7-\2\2\u014a\u014b"+
		"\7<\2\2\u014b\u014c\7?\2\2\u014cN\3\2\2\2\u014d\u014e\7/\2\2\u014e\u014f"+
		"\7<\2\2\u014f\u0150\7?\2\2\u0150P\3\2\2\2\u0151\u0152\7,\2\2\u0152\u0153"+
		"\7<\2\2\u0153\u0154\7?\2\2\u0154R\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157"+
		"\7<\2\2\u0157\u0158\7?\2\2\u0158T\3\2\2\2\u0159\u015a\7\'\2\2\u015a\u015b"+
		"\7<\2\2\u015b\u015c\7?\2\2\u015cV\3\2\2\2\u015d\u015e\7,\2\2\u015e\u015f"+
		"\7,\2\2\u015f\u0160\7<\2\2\u0160\u0161\7?\2\2\u0161X\3\2\2\2\u0162\u0163"+
		"\7~\2\2\u0163\u0164\7<\2\2\u0164\u0165\7?\2\2\u0165Z\3\2\2\2\u0166\u0167"+
		"\7(\2\2\u0167\u0168\7<\2\2\u0168\u0169\7?\2\2\u0169\\\3\2\2\2\u016a\u016b"+
		"\7~\2\2\u016b\u016c\7~\2\2\u016c\u016d\7<\2\2\u016d\u016e\7?\2\2\u016e"+
		"^\3\2\2\2\u016f\u0170\7@\2\2\u0170\u0171\7@\2\2\u0171\u0172\7<\2\2\u0172"+
		"\u0173\7?\2\2\u0173`\3\2\2\2\u0174\u0175\7>\2\2\u0175\u0176\7>\2\2\u0176"+
		"\u0177\7<\2\2\u0177\u0178\7?\2\2\u0178b\3\2\2\2\u0179\u017a\7\u0080\2"+
		"\2\u017ad\3\2\2\2\u017b\u017c\7B\2\2\u017cf\3\2\2\2\u017d\u017e\7A\2\2"+
		"\u017eh\3\2\2\2\u017f\u0180\7n\2\2\u0180\u0181\7q\2\2\u0181\u0182\7y\2"+
		"\2\u0182j\3\2\2\2\u0183\u0184\7j\2\2\u0184\u0185\7k\2\2\u0185\u0186\7"+
		"i\2\2\u0186\u0187\7j\2\2\u0187l\3\2\2\2\u0188\u0189\7p\2\2\u0189\u018a"+
		"\7g\2\2\u018a\u018b\7y\2\2\u018bn\3\2\2\2\u018c\u018d\7u\2\2\u018d\u018e"+
		"\7g\2\2\u018e\u018f\7o\2\2\u018fp\3\2\2\2\u0190\u0191\7q\2\2\u0191\u0192"+
		"\7r\2\2\u0192r\3\2\2\2\u0193\u0194\7d\2\2\u0194\u0195\7q\2\2\u0195\u0196"+
		"\7i\2\2\u0196\u0197\7w\2\2\u0197\u0198\7u\2\2\u0198t\3\2\2\2\u0199\u019a"+
		"\7k\2\2\u019a\u019b\7n\2\2\u019b\u019c\7k\2\2\u019c\u019d\7v\2\2\u019d"+
		"v\3\2\2\2\u019e\u019f\7t\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7k\2\2\u01a1"+
		"\u01a2\7v\2\2\u01a2x\3\2\2\2\u01a3\u01a4\7E\2\2\u01a4\u01a5\7n\2\2\u01a5"+
		"\u01a6\7k\2\2\u01a6\u01a7\7v\2\2\u01a7z\3\2\2\2\u01a8\u01a9\7U\2\2\u01a9"+
		"\u01aa\7n\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7v\2\2\u01ac|\3\2\2\2\u01ad"+
		"\u01ae\7p\2\2\u01ae\u01af\7n\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7v\2\2"+
		"\u01b1~\3\2\2\2\u01b2\u01b3\7d\2\2\u01b3\u01b4\7n\2\2\u01b4\u01b5\7k\2"+
		"\2\u01b5\u01b6\7v\2\2\u01b6\u0080\3\2\2\2\u01b7\u01b8\7h\2\2\u01b8\u01b9"+
		"\7n\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7v\2\2\u01bb\u0082\3\2\2\2\u01bc"+
		"\u01bd\7g\2\2\u01bd\u01be\7n\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0\7g\2\2"+
		"\u01c0\u0084\3\2\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7h\2\2\u01c3\u0086"+
		"\3\2\2\2\u01c4\u01c5\7h\2\2\u01c5\u01c6\7k\2\2\u01c6\u0088\3\2\2\2\u01c7"+
		"\u01c8\7f\2\2\u01c8\u01c9\7q\2\2\u01c9\u008a\3\2\2\2\u01ca\u01cb\7q\2"+
		"\2\u01cb\u01cc\7f\2\2\u01cc\u008c\3\2\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf"+
		"\7m\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7r\2\2\u01d1\u008e\3\2\2\2\u01d2"+
		"\u01d3\7g\2\2\u01d3\u01d4\7z\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7v\2\2"+
		"\u01d6\u0090\3\2\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7g\2\2\u01d9\u01da"+
		"\7z\2\2\u01da\u01db\7v\2\2\u01db\u0092\3\2\2\2\u01dc\u01dd\7t\2\2\u01dd"+
		"\u01de\7g\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7w\2\2\u01e0\u01e1\7t\2\2"+
		"\u01e1\u01e2\7p\2\2\u01e2\u0094\3\2\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5"+
		"\7g\2\2\u01e5\u01e6\7r\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7{\2\2\u01e8"+
		"\u0096\3\2\2\2\u01e9\u01ea\7h\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7t\2"+
		"\2\u01ec\u01ed\7y\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7t\2\2\u01ef\u01f0"+
		"\7f\2\2\u01f0\u0098\3\2\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3\7g\2\2\u01f3"+
		"\u01f4\7p\2\2\u01f4\u01f5\7f\2\2\u01f5\u009a\3\2\2\2\u01f6\u01f7\7e\2"+
		"\2\u01f7\u01f8\7c\2\2\u01f8\u01f9\7n\2\2\u01f9\u01fa\7n\2\2\u01fa\u009c"+
		"\3\2\2\2\u01fb\u01fc\7f\2\2\u01fc\u01fd\7g\2\2\u01fd\u01fe\7u\2\2\u01fe"+
		"\u01ff\7v\2\2\u01ff\u0200\7t\2\2\u0200\u0201\7q\2\2\u0201\u0202\7{\2\2"+
		"\u0202\u009e\3\2\2\2\u0203\u0204\7d\2\2\u0204\u0205\7g\2\2\u0205\u0206"+
		"\7i\2\2\u0206\u0207\7k\2\2\u0207\u0208\7p\2\2\u0208\u00a0\3\2\2\2\u0209"+
		"\u020a\7g\2\2\u020a\u020b\7p\2\2\u020b\u020c\7f\2\2\u020c\u00a2\3\2\2"+
		"\2\u020d\u020e\7i\2\2\u020e\u020f\7n\2\2\u020f\u0210\7q\2\2\u0210\u0211"+
		"\7d\2\2\u0211\u0212\7c\2\2\u0212\u0213\7n\2\2\u0213\u00a4\3\2\2\2\u0214"+
		"\u0215\7d\2\2\u0215\u0216\7q\2\2\u0216\u0217\7f\2\2\u0217\u0218\7{\2\2"+
		"\u0218\u00a6\3\2\2\2\u0219\u021a\7r\2\2\u021a\u021b\7t\2\2\u021b\u021c"+
		"\7q\2\2\u021c\u021d\7e\2\2\u021d\u00a8\3\2\2\2\u021e\u021f\7v\2\2\u021f"+
		"\u0220\7{\2\2\u0220\u0221\7r\2\2\u0221\u0222\7g\2\2\u0222\u00aa\3\2\2"+
		"\2\u0223\u0224\7x\2\2\u0224\u0225\7c\2\2\u0225\u0226\7n\2\2\u0226\u00ac"+
		"\3\2\2\2\u0227\u0228\7x\2\2\u0228\u0229\7c\2\2\u0229\u022a\7t\2\2\u022a"+
		"\u00ae\3\2\2\2\u022b\u022c\7t\2\2\u022c\u022d\7g\2\2\u022d\u022e\7u\2"+
		"\2\u022e\u00b0\3\2\2\2\u022f\u0230\7t\2\2\u0230\u0231\7g\2\2\u0231\u0232"+
		"\7h\2\2\u0232\u00b2\3\2\2\2\u0233\u0234\7u\2\2\u0234\u0235\7g\2\2\u0235"+
		"\u0236\7r\2\2\u0236\u0237\7c\2\2\u0237\u0238\7t\2\2\u0238\u0239\7c\2\2"+
		"\u0239\u023a\7v\2\2\u023a\u023b\7g\2\2\u023b\u00b4\3\2\2\2\u023c\u023d"+
		"\7d\2\2\u023d\u023e\7q\2\2\u023e\u023f\7q\2\2\u023f\u0240\7n\2\2\u0240"+
		"\u00b6\3\2\2\2\u0241\u0242\7k\2\2\u0242\u0243\7p\2\2\u0243\u0244\7v\2"+
		"\2\u0244\u00b8\3\2\2\2\u0245\u0246\7e\2\2\u0246\u0247\7j\2\2\u0247\u0248"+
		"\7c\2\2\u0248\u0249\7t\2\2\u0249\u00ba\3\2\2\2\u024a\u024b\7t\2\2\u024b"+
		"\u024c\7g\2\2\u024c\u024d\7c\2\2\u024d\u024e\7n\2\2\u024e\u00bc\3\2\2"+
		"\2\u024f\u0250\7h\2\2\u0250\u0251\7k\2\2\u0251\u0252\7n\2\2\u0252\u0253"+
		"\7g\2\2\u0253\u00be\3\2\2\2\u0254\u0255\7u\2\2\u0255\u0256\7v\2\2\u0256"+
		"\u0257\7t\2\2\u0257\u0258\7k\2\2\u0258\u0259\7p\2\2\u0259\u025a\7i\2\2"+
		"\u025a\u00c0\3\2\2\2\u025b\u025c\7g\2\2\u025c\u025d\7z\2\2\u025d\u025e"+
		"\7v\2\2\u025e\u025f\7g\2\2\u025f\u0260\7p\2\2\u0260\u0261\7f\2\2\u0261"+
		"\u00c2\3\2\2\2\u0262\u0263\7k\2\2\u0263\u0264\7o\2\2\u0264\u0265\7r\2"+
		"\2\u0265\u0266\7q\2\2\u0266\u0267\7t\2\2\u0267\u0268\7v\2\2\u0268\u00c4"+
		"\3\2\2\2\u0269\u026a\7e\2\2\u026a\u026b\7q\2\2\u026b\u026c\7p\2\2\u026c"+
		"\u026d\7u\2\2\u026d\u026e\7v\2\2\u026e\u00c6\3\2\2\2\u026f\u0270\7g\2"+
		"\2\u0270\u0271\7p\2\2\u0271\u0272\7w\2\2\u0272\u0273\7o\2\2\u0273\u00c8"+
		"\3\2\2\2\u0274\u0275\7t\2\2\u0275\u0276\7g\2\2\u0276\u0277\7v\2\2\u0277"+
		"\u0278\7w\2\2\u0278\u0279\7t\2\2\u0279\u027a\7p\2\2\u027a\u027b\7u\2\2"+
		"\u027b\u00ca\3\2\2\2\u027c\u027d\7e\2\2\u027d\u027e\7t\2\2\u027e\u027f"+
		"\7g\2\2\u027f\u0280\7c\2\2\u0280\u0281\7v\2\2\u0281\u0282\7g\2\2\u0282"+
		"\u00cc\3\2\2\2\u0283\u0284\7x\2\2\u0284\u0285\7o\2\2\u0285\u00ce\3\2\2"+
		"\2\u0286\u0287\7q\2\2\u0287\u0288\7p\2\2\u0288\u00d0\3\2\2\2\u0289\u028a"+
		"\7u\2\2\u028a\u028b\7v\2\2\u028b\u028c\7q\2\2\u028c\u028d\7r\2\2\u028d"+
		"\u00d2\3\2\2\2\u028e\u0290\t\2\2\2\u028f\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u00d4\3\2\2\2\u0293"+
		"\u0295\7$\2\2\u0294\u0296\t\3\2\2\u0295\u0294\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\7$\2\2\u029a\u00d6\3\2\2\2\u029b\u029d\t\4\2\2\u029c\u029b\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u00d8\3\2\2\2\u02a0\u02a2\t\5\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\bm\2\2\u02a6\u00da\3\2\2\2\u02a7\u02a9\7%\2\2\u02a8\u02aa\n\6\2"+
		"\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\bn\2\2\u02ae\u00dc\3\2\2\2\b"+
		"\2\u0291\u0297\u029e\u02a3\u02ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}