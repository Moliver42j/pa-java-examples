package examplesfortechtest;

import java.util.Arrays;

/**
 * 
 * @author oli19171901
 *
 */
public class BalancedBracketsAgain 
{
	/**
	 * Checks for balanced brackets
	 * @param brackets
	 * @return
	 */
	public String balancedBrackets(String brackets)
	{
		char[] bracketsArr = new char[brackets.length()];
		char matching = ' ';

		//make Char array
		for (int loop = 0; loop < bracketsArr.length; loop++)
		{
			bracketsArr[loop] = brackets.charAt(loop);
			System.out.print(" blah" + bracketsArr[loop] + " .");
		}
		
		for (int index = 0; index < bracketsArr.length; index++)
		{
			
			System.out.println("String array = " + Arrays.toString(bracketsArr));
			
			if(bracketsArr[index] ==  '(')
			{
				matching = ')';
			}else
			if(bracketsArr[index] ==  '{')
			{
				matching = '}';
			}else if(bracketsArr[index] ==  '[')
			{
				matching = ']';
			}	
			
			
			//compare
			for(int innerLoop = index; innerLoop < bracketsArr.length; innerLoop++)
			{
				System.out.println("matching = " + matching);
				
				//removes brackets that have a pair
				if(bracketsArr[innerLoop] == matching)
				{
					bracketsArr[index] = ' ';
					bracketsArr[innerLoop] = ' ';
					break;
				}
				
			}
		}
		System.out.println("String array at finish = " + Arrays.toString(bracketsArr));
		
		boolean empty = true;
		
		//if all the brackets have pairs then the array should be empty
		for(int lastCheck = 0; lastCheck < bracketsArr.length; lastCheck++)
		{
			if(bracketsArr[lastCheck] != ' ')
			{
				empty = false;
			}
		}
			
		if(empty == false)
		{
			System.out.println("not balanced");
			return "not balanced";
			
		}	
		
		else
		{
			System.out.println("balanced");
			return "balanced";
		}
	}
}
