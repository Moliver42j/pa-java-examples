package examplesfortechtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {

	@Test
	public void testBalancedBrackets1(){
		BalancedBracketsAgain balancedBrackets = new BalancedBracketsAgain();
		
		String actual = balancedBrackets.balancedBrackets("(()){}");
		
		assertEquals("balanced", actual);
	}
	@Test
	public void testBalancedBrackets2(){
		BalancedBracketsAgain balancedBrackets = new BalancedBracketsAgain();
		
		String actual = balancedBrackets.balancedBrackets("{[]}");
		
		assertEquals("balanced", actual);
	}
	@Test
	public void testBalancedBrackets3(){
		BalancedBracketsAgain balancedBrackets = new BalancedBracketsAgain();
		
		String actual = balancedBrackets.balancedBrackets("[]{}()");
		
		assertEquals("balanced", actual);
	}
	@Test
	public void testBalancedBrackets4(){
		BalancedBracketsAgain balancedBrackets = new BalancedBracketsAgain();
		
		String actual = balancedBrackets.balancedBrackets("[)[)");
		
		assertEquals("not balanced", actual);
	}
	@Test
	public void testBalancedBrackets5(){
		BalancedBracketsAgain balancedBrackets = new BalancedBracketsAgain();
		
		String actual = balancedBrackets.balancedBrackets("()]()");
		
		assertEquals("not balanced", actual);
	}


}
