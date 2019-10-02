package examplesfortechtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {

	@Test
	public void testBalancedBrackets1(){
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		
		String actual = balancedBrackets.balancedBrackets("[()]");
		
		assertEquals("balanced", actual);
	}
	@Test
	public void testBalancedBrackets2(){
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		
		String actual = balancedBrackets.balancedBrackets("{[]}");
		
		assertEquals("balanced", actual);
	}
	@Test
	public void testBalancedBrackets3(){
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		
		String actual = balancedBrackets.balancedBrackets("[]{}()");
		
		assertEquals("not balanced", actual);
	}
	@Test
	public void testBalancedBrackets4(){
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		
		String actual = balancedBrackets.balancedBrackets("[)[)");
		
		assertEquals("not balanced", actual);
	}
	@Test
	public void testBalancedBrackets5(){
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		
		String actual = balancedBrackets.balancedBrackets("()]()");
		
		assertEquals("not balanced", actual);
	}


}
