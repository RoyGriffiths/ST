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
		boolean match = RegExpMatcher.matches("Hi", "Hii|Hi");
		assertEquals(true, match);
	}
	
	@Test
	public void bug4() {
		boolean match = RegExpMatcher.matches("a1", "a1a");
		assertEquals(true, match);
	}
	
	@Test 
	public void bug5() {
		boolean match = RegExpMatcher.matches("4", "[a-5]");
		assertEquals(true, match);
	}
	
	@Test
	public void bug6() {
		boolean match = RegExpMatcher.matches("Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!Does anyone have any hint for bug 6? Task1. Thank you!", "(a-z)*(!.A-Z)+");
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
		boolean match = RegExpMatcher.matches("8", "<5 - 10>");
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
	
	@Test
	public void ztest() {
		boolean match = RegExpMatcher.matches("hi\\", "hi\\");
		assertEquals(true, match);
	}
	
	///////////////////////////////////////////////////////////////
	//Roy's added tests 
	///////////////////////////////////////////////////////////////
	
	@Test
	public void anyDigTest() {
		boolean match = RegExpMatcher.matches("@", "<0-9>");
		assertEquals(true, match);
	}
	
	@Test
	public void tripleDigTest() {
		boolean match = RegExpMatcher.matches("@", "<100-999>");
		assertEquals(true, match);
	}
	
	@Test
	public void quadDigTest() {
		boolean match = RegExpMatcher.matches("@", "<1000-9999>");
		assertEquals(true, match);
	}
	
	@Test
	public void fiveDigTest() {
		boolean match = RegExpMatcher.matches("@", "<10000-99999>");
		assertEquals(true, match);
	}
	
	@Test
	public void anyLowerLetterTest() {
		boolean match = RegExpMatcher.matches("@", "[a-z]");
		assertEquals(true, match);
	}
	
	@Test
	public void anyUpperTest() {
		boolean match = RegExpMatcher.matches("@", "[A-Z]");
		assertEquals(true, match);
	}
	
	@Test
	public void anyLetter() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void anyLetterStar() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z])*");
		assertEquals(true, match);
	}
	
	@Test
	public void anyLetterAllNum() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z]){0,99999999}");
		assertEquals(true, match);
	}
	
	@Test
	public void anyLetterMoreThan() {
		boolean match = RegExpMatcher.matches("@", "([a-z] | [A-Z]){0,}");
		assertEquals(true, match);
	}
	
	@Test
	public void anyButLetter() {
		boolean match = RegExpMatcher.matches("@", "~([a-z] | [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void anyButNum() {
		boolean match = RegExpMatcher.matches("@", "~(<0-9>*)*");
		assertEquals(true, match);
	}

	@Test
	public void noNumOrLetter() {
		boolean match = RegExpMatcher.matches("@", "~(([a-z] | [A-Z])&(<0-9>*))");
		assertEquals(true, match);
	}
	
	@Test
	public void noNumOrLetter2() {
		boolean match = RegExpMatcher.matches("@", "~([a-z] & [A-Z]&(<0-9>))");
		assertEquals(true, match);
	}
	
	@Test
	public void noLetter2() {
		boolean match = RegExpMatcher.matches("@", "~([a-z] & [A-Z])");
		assertEquals(true, match);
	}
	
	@Test
	public void noUpperLetter2() {
		boolean match = RegExpMatcher.matches("11", "~([a-z] & [A-Z])");
		assertEquals(true, match);
	}
}
