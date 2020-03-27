package hello;
import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class tester {
	
	public static boolean debug = false;
	
	@Test 
	public void bug1() {
		boolean match = RegExpMatcher.matches("", "");
		assertEquals(true, match);
	}
	
	@Test 
	public void bug2() {
		boolean match = RegExpMatcher.matches(" ", "");
		assertEquals(true, match);
	}

	@Test
	public void bug3() {
		boolean match = RegExpMatcher.matches("[a-z]*", "[a-z][a-z]|[a-z]*");
		assertEquals(true, match);
	}
	
	@Test
	public void bug4() {
		boolean match = RegExpMatcher.matches("a1", "a1a");
		assertEquals(true, match);
	}
	
	@Test 
	public void bug5() {
		boolean match = RegExpMatcher.matches("<0-9>", "[a-9]");
		assertEquals(true, match);
	}
	
	@Test
	public void bug6() {
		boolean match = RegExpMatcher.matches("Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!", "(a-z)*(!.A-Z)+");
		assertEquals(true, match);
	}
	
	@Test 
	public void bug7() {
		boolean match = RegExpMatcher.matches("()", "( {}     )");
		assertEquals(true, match);
	}
	
	@Test
	public void bug8() {
		boolean match = RegExpMatcher.matches("5", "**+*+{5}{20}");
		assertEquals(true, match);
	}
	
	@Test
	public void bug9() {
		boolean match = RegExpMatcher.matches("@", "<0 - 99>");
		assertEquals(true, match);
	}
	
	@Test 
	public void bug10() {
		boolean match = RegExpMatcher.matches("42", "<0-99>");
		assertEquals(true, match);
	}
	
	@Test
	public void bug11() {
		boolean match = RegExpMatcher.matches("", "hello?");
		assertEquals(true, match);
	}
	
	@Test
	public void bug12() {
		boolean match = RegExpMatcher.matches("()ajsfhaksjfa", "[(()a-z)]*");
		assertEquals(true, match);
	}
	
	@Test
	public void bug13() {
		boolean match = RegExpMatcher.matches("", "()");
		assertEquals(true, match); 
	}
	
	@Test
	public void bug14() {
		boolean match = RegExpMatcher.matches("][", "[]");
		assertEquals(true, match);
	}
	
	@Test
	public void bug15() {
		boolean match = RegExpMatcher.matches("abccc", "abc*");
		assertEquals(true, match);
	}

	
	///////////////////////////////////////////////////////////////
	//Roy's added tests 
	///////////////////////////////////////////////////////////////
	
	
	
	@Test
	public void manTest01() {
		boolean match = RegExpMatcher.matches("11", "~([^a-z]&[0-9])*");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest02() {
		boolean match = RegExpMatcher.matches("11", "[^a-z]");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest03() {
		boolean match = RegExpMatcher.matches("11", "^!");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest04() {
		boolean match = RegExpMatcher.matches("11", "^(//+){0,}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest05() {
		boolean match = RegExpMatcher.matches("[a-z]", "^([0-9]*)");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest06() {
		boolean match = RegExpMatcher.matches("11", "[^a-z]{0,}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest07() {
		boolean match = RegExpMatcher.matches("1", "[^a-z]{1}");
		assertEquals(true, match);
	}
	@Test
	public void manTest08() {
		boolean match = RegExpMatcher.matches("11", "[^a-z]{,-1}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest09() {
		boolean match = RegExpMatcher.matches("b", "(<^0-9>*)");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest10() {
		boolean match = RegExpMatcher.matches("1", "^(#*)");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest11() {
		boolean match = RegExpMatcher.matches("1", "^(@*)");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest12() {
		boolean match = RegExpMatcher.matches("1", "(@){0,99}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest13() {
		boolean match = RegExpMatcher.matches("1", "^(@){0,}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest14() {
		boolean match = RegExpMatcher.matches("1", "^(#){0,99}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest15() {
		boolean match = RegExpMatcher.matches("az", "([a-z]*[A-Z]*[0-9]*)*");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest16() {
		boolean match = RegExpMatcher.matches("az", "~([a-z]*[A-Z]*[0-9]*.*)+");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest17() {
		boolean match = RegExpMatcher.matches("az", "(.*[^a-z]*[^A-Z]*[^0-9]*.*){0,99}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest18() {
		boolean match = RegExpMatcher.matches("@", "<0-9>*");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest19() {
		boolean match = RegExpMatcher.matches("@", "<0-9>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest20() {
		boolean match = RegExpMatcher.matches("@", "<10-99>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest21() {
		boolean match = RegExpMatcher.matches("@", "<100-999>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest22() {
		boolean match = RegExpMatcher.matches("@", "<1000-9999>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest23() {
		boolean match = RegExpMatcher.matches("@", "<10000-99999>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest24() {
		boolean match = RegExpMatcher.matches("@", "[a-z]");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest25() {
		boolean match = RegExpMatcher.matches("@", "[A-Z]");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest26() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest27() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z])*");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest28() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z]){0,99}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest29() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z]){0,}");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest30() {
		boolean match = RegExpMatcher.matches("@", "~([a-z] | [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest31() {
		boolean match = RegExpMatcher.matches("@", "~(<0-9>*)*");
		assertEquals(true, match);
	}

	@Test
	public void manTest32() {
		boolean match = RegExpMatcher.matches("@", "~(([a-z] | [A-Z])&(<0-9>*))");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest33() {
		boolean match = RegExpMatcher.matches("@", "~([a-z] & [A-Z]&(<0-9>))");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest34() {
		boolean match = RegExpMatcher.matches("@", "~([a-z] & [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest35() {
		boolean match = RegExpMatcher.matches("11", "~([a-z] & [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest36() {
		boolean match = RegExpMatcher.matches("\\", "\\");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest37() {
		boolean match = RegExpMatcher.matches("\\+", "(\\+)!");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest38() {
		boolean match = RegExpMatcher.matches("+a", "(+a)!");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest39() {
		boolean match = RegExpMatcher.matches("*a", "*a)");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest40() {
		boolean match = RegExpMatcher.matches("*a", "<");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest41() {
		boolean match = RegExpMatcher.matches("*a", "<>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest42() {
		boolean match = RegExpMatcher.matches("*a", "&&&");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest43() {
		boolean match = RegExpMatcher.matches("*a", "()<>");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest44() {
		boolean match = RegExpMatcher.matches("*a", "<->");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest45() {
		boolean match = RegExpMatcher.matches("*a", "??++*");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest46() {
		boolean match = RegExpMatcher.matches("*a", "><");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest47() {
		boolean match = RegExpMatcher.matches("*a", "-&0");
		assertEquals(true, match);
	}
	
	@Test
	public void manTest48() {
		String s = "Hi";
		boolean match = RegExpMatcher.matches(s + "Hello", "(s + c)" + s );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest49() {
		String s = "1";
		boolean match = RegExpMatcher.matches(s + "Hello", "(s + c)"+s + "{0}" );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest50() {
		String s = "*!?|$$£&";
		boolean match = RegExpMatcher.matches(s + "Hello", "(s + c)"+s + "{1,99}" );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest51() {
		String s = "*!?|$$£&||";
		boolean match = RegExpMatcher.matches(s + "Hello", "(s + c)"+s + "{1,99}" );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest52() {
		String s = "*!?|$$£&||";
		boolean match = RegExpMatcher.matches(s + "Hello", "[s&-]" );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest53() {
		String s = "*!?|$$£&||";
		boolean match = RegExpMatcher.matches("", "{{0," );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest54() {
		String s = "";
		boolean match = RegExpMatcher.matches("(", "((," );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest55() {
		String s = "";
		boolean match = RegExpMatcher.matches("aa", "[a-a]" );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest56() {
		String s = "a";
		String b = "b";
		boolean match = RegExpMatcher.matches("", s+b+"{5,0}" );
		assertEquals(true, match);
	}
	
	@Test
	public void manTest57() {
		String s = "a";
		String b = "b";
		boolean match = RegExpMatcher.matches("", s+"&"+b+"{5,0}" );
		assertEquals(true, match);
	}
}
