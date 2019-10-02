package examplesfortechtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcat() 
	{
		MyUnit myUnit = new MyUnit();
		
		String actual = myUnit.concat("one", "two");
		
		assertEquals("onetwo", actual);
	}
	
	@Test
	public void testConcat1() 
	{
		MyUnit myUnit = new MyUnit();
		
		String actual = myUnit.concat("high", "five");
		
		assertEquals("highfive", actual);
	}
	
	@Test
	public void testConcat2() 
	{
		MyUnit myUnit = new MyUnit();
		
		String actual = myUnit.concat("tenac", "iousd");
		
		assertEquals("tenaciousd", actual);
	}

}
