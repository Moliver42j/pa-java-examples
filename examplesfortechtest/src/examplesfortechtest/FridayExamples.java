package examplesfortechtest;

import java.util.ArrayList;

public class FridayExamples {

	public static void main(String[] args) 
	{
		FridayExamples fridayExamples = new FridayExamples();
		System.out.println(" the answer to life the universe and everything is " + returnInt());

	}
	
	
	
	public static int returnInt()
	{
		int out = 42;
		
		return out;
	}
	
	public int multiply(int num1, int num2)
	{
		int out = num1 * num2;
		return out;
	}

	public ArrayList<String> arrayListReturn()
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hello");
		arr.add("World");
		
		return arr;
	}
}
