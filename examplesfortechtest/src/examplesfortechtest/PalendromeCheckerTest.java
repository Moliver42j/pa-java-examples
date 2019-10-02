package examplesfortechtest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * WHATS UP java DOC
 * for class and test cases
 * 
 *
 */
public class PalendromeCheckerTest {

	@Test
	public void test() {
		PalendromeChecker palendromeChecker = new PalendromeChecker();
		
		boolean actual = palendromeChecker.check("hannah");
		
		assertEquals(true, actual);
	}
	
	@Test
	public void test1() {
		PalendromeChecker palendromeChecker = new PalendromeChecker();
		
		boolean actual = palendromeChecker.check("false");
		
		assertEquals(true, actual);
	}
	
}
