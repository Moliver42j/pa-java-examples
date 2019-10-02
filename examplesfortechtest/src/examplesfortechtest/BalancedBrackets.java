package examplesfortechtest;
/**
 * 
 * @author oli19171901
 *
 */
public class BalancedBrackets 
{
	/**
	 * checks if a given string of bracket is symmetrical eg "(({}))"
	 * @param brackets
	 * @return
	 */
	public String balancedBrackets(String brackets)
	{
		String out = ""; 
		boolean balanced = false;
		char[] bracketsArr = brackets.toCharArray();
		
		if(bracketsArr.length % 2 == 0)
		{
			for(int index = 0; index < (bracketsArr.length)-1; index++)
			{
				if(bracketsArr[index] == '(')
				{
					if(bracketsArr[(bracketsArr.length - 1) - index] == ')')
					{
						balanced = true;		
						continue;
					}
					else
					{
						balanced = false;
						continue;
					}
				}
				
				if(bracketsArr[index] == '[')
				{
					if(bracketsArr[(bracketsArr.length - 1) - index] == ']')
					{
						balanced = true;	
						continue;
					}
					else
					{
						balanced = false;
						continue;
					}
				}
				
				if(bracketsArr[index] == '{')
				{
					if(bracketsArr[(bracketsArr.length - 1) - index] == '}')
					{
						balanced = true;		
						continue;
					}
					else
					{
						balanced = false;
						continue;
					}
				}
			}
		}
		else
		{
			balanced = false;
		}
		
		
		if(balanced)
		{
			out = "balanced";
		}
			else
			{
				out = "not balanced";
			}
		return out;
	}
}
