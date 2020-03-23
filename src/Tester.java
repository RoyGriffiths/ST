import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Tester {
	
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
	public void bug11() {
		boolean match = RegExpMatcher.matches("", "hello?");
		assertEquals(true, match);
	}
	
	@Test
	public void bug13() {
		boolean match = RegExpMatcher.matches("", "()");
		assertEquals(true, match); 
	}
	
	@Test
	public void bug15() {
		boolean match = RegExpMatcher.matches("abccc", "abc*");
		assertEquals(true, match);
	}
	
	@Test 
	public void test() {
		boolean match = RegExpMatcher.matches("6", "<10 - 5>");
		assertEquals(true, match);
	}
	
	

}
