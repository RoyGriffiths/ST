

/**
 * Utility class to provide a simple interface to the package.
 */
public class RegExpMatcher {
	/**
	 * Tells whether the string <code>m</code> matches the regular expression <code>re</code>.
	 * @param m string to be matched
	 * @param re regular expression
	 */
	public static boolean matches(String m, String re) {
		RegExp regExp = new RegExp(re);
		Automaton a = regExp.toAutomaton();
		return a.run(m);
	}
	
	
	/////////////////////////////////////////////////////////
	//Letters
	/////////////////////////////////////////////////////////
	
	public static String geta() {
		return "a";
	}
	public static String getb() {
		return "b";
	}
	public static String getc() {
		return "c";
	}
	public static String getd() {
		return "d";
	}
	public static String gete() {
		return "e";
	}
	public static String getf() {
		return "f";
	}
	public static String getg() {
		return "g";
	}
	public static String geth() {
		return "h";
	}
	public static String geti() {
		return "i";
	}
	public static String getj() {
		return "j";
	}
	public static String getk() {
		return "k";
	}
	public static String getl() {
		return "l";
	}
	public static String getm() {
		return "m";
	}
	public static String getn() {
		return "n";
	}
	public static String geto() {
		return "o";
	}
	public static String getp() {
		return "p";
	}
	public static String getq() {
		return "q";
	}
	public static String getr() {
		return "r";
	}
	public static String gets() {
		return "s";
	}
	public static String gett() {
		return "t";
	}
	public static String getu() {
		return "u";
	}
	public static String getv() {
		return "v";
	}
	public static String getw() {
		return "w";
	}
	public static String getx() {
		return "x";
	}
	public static String gety() {
		return "y";
	}
	public static String getz() {
		return "z";
	}
	
	public static String anyUndercase() {
		return "[a-z]";
	}
	
	public static String anyUppercase() {
		return "[A-Z]";
	}
	
	public static String anyLetter() {
		return "[a-z]|[A-Z]";
	}
	
	/////////////////////////////////////////////////////////
	//Numbers
	/////////////////////////////////////////////////////////
	

	public static String make0() {
		return "0";
	}
	public static String make1() {
		return "1";
	}
	public static String make2() {
		return "2";
	}
	public static String make3() {
		return "3";
	}
	public static String make4() {
		return "4";
	}
	public static String make5() {
		return "5";
	}
	public static String make6() {
		return "6";
	}
	public static String make7() {
		return "7";
	}
	public static String make8() {
		return "8";
	}
	public static String make9() {
		return "9";
	}
	
	public static String anySingleInt() {
		return "<0-9>";
	}
	
	public static String anyDoubleInt() {
		return "<10-99>";
	}
	
	public static String anyToDouble() {
		return "<0-99>";
	}
	
	public static String anyTripleInt() {
		return "<100-999>";
	}
	
	public static String anyToTriple() {
		return "<0-999>";
	}
	
	public static String anyQuadInt() {
		return "<1000-9999>";
	}
	
	public static String anyToQuad() {
		return "<0-9999>";
	}

	/////////////////////////////////////////////////////////
	//Other symbols (bit unsure if these are legit)
	/////////////////////////////////////////////////////////
	
	public static String makePlus() {
		return "\\+";
	}
	
	public static String oneOrMore() {
		return "+";
	}
	
	public static String makeMin() {
		return "-";
	}
	
	public static String makeMul() {
		return "\\*";
	}
	
	public static String zeroOrMore() {
		return "*";
	}
	
	public static String makeQ() {
		return "\\?";
	}
	
	public static String noneOrMore() {
		return "?";
	}
	
	public static String makeE() {
		return "!";
	}
	
	public static String atSymbol() {
		return "\\@";
	}
	
	public static String matchAny() {
		return "@";
	}
	
	public static String makeDot() {
		return "\\.";
	}
	
	public static String matchSingleChar() {
		return ".";
	}
	
	public static String makeHashtag() {
		return "\\#";
	}
	
	public static String noMatch() {
		return "#";
	}
	
	public static String makeLine() {
		return "\\|";
	}
	
	public static String matchesEither() {
		return "|";
	}
	
	public static String makeAnd() {
		return "\\&";
	}
	
	public static String macthesBoth() {
		return "&";
	}
	
	public static String matchBetween(int n, int m) {
		return "<" + n + "-" + m + ">";
	}
	
	public static String surroundBrackets(String s) {
		return "(" + s + ")";
	}
	
	public static String nTimes(int n) {
		return "{" + n + "}";
	}
	
	public static String BetweenNAndMTimes(int n, int m) {
		return "{" + n + "," + m + "}";
	}
	
	public static String moreThanNTimes(int n) {
		return "{" + n + ","+ "}";
	}	
	
	public static String makeConcatenation(String l, String r) {
		return l + r;
	}
	
	
}
