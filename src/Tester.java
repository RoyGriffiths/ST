import static org.junit.Assert.*;
import org.junit.Test;
import st1920.automaton.RegExpMatcher;

public class Tester {
	
	public static boolean debug = false;
	
	@Test 
	public void bug1() {
		RegExpMatcher test = new RegExpMatcher();
		boolean match = test.matches("", "");
		assertEquals(true, match);
	}
	
	@Test 
	public void bug2() {
		RegExpMatcher test = new RegExpMatcher();
		boolean match = test.matches(" ", "");
		assertEquals(true, match);
	}

	@Test
	public void bug3() {
		RegExpMatcher test = new RegExpMatcher();
		boolean match = test.matches("Hi", "Hii|Hi");
		assertEquals(true, match);
	}
	
	@Test
	public void bug11() {
		RegExpMatcher test = new RegExpMatcher();
		boolean match = test.matches("", "hello?");
		assertEquals(true, match);
	}
	
	@Test 
	public void test() {
		RegExpMatcher test = new RegExpMatcher();
		boolean match = test.matches("ab", "([a-z]){2}");
		assertEquals(true, match);
	}

}
