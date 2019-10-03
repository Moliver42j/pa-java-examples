package examplesfortechtest;

import java.util.Arrays;

public class Wednesday {

	public static void main(String[] args) 
	{
		System.out.println(stringE("hello"	));
		System.out.println(stringE("heelle"	));
		System.out.println(stringE("heelele"));		
		
		System.out.println(solution(200));
	}	
	
	public static boolean stringE(String in)
	{
		//covert to char array
	     char[] bracesArr = braces.toCharArray();   
	    for(int index = 0; index < bracesArr.length; index++)
	      {
	        System.out.println(bracesArr[index] + " ");
	      }
	     int numberOfPairs = 0;
	     char matching = ' ';
	    
	    // look for pairs of brackets (it can only be pairs if the length is even)
	    // according to test 'shouldReturnInvalid4' {[}()] is invalid
	    // so if between a pair, there is an open with no close >> invalid
	    if(bracesArr.length % 2 ==0)
	    {
	      for(int index = 0; index < bracesArr.length; index++)
	      {
	        System.out.println("Array at position " + index + " = " + bracesArr[index]);
	        
	        //find an open and assign it a matching close
	        if(bracesArr[index] == '(')
	        {
	          matching = ')';
	        }else
	          if(bracesArr[index] == '{')
	          {
	            matching = '}';
	          }else
	            if(bracesArr[index] == '[')
	            {
	              matching = ']';
	            }
	              else
	             {
	               //ignores the for loop for this iteration, this should account for spaces in addition tests
	               continue;
	             }
	        
	        //number of pairs++
	         for(int innerLoop = index + 1; innerLoop < bracesArr.length; innerLoop++)
	         {
	           char test = bracesArr[index];
	           System.out.println("matching: " + matching + "\n to : " + test);
	            if(bracesArr[innerLoop] == matching)
	            {
	              // treat the inside of each bracket pair as a new array
	              numberOfPairs++;
	              if( ((innerLoop-1) - index) % 2 != 0 && (innerLoop - index) != 1)
	              {
	                numberOfPairs = -1;
	                return numberOfPairs;
	              }
	              
	              System.out.println("number of pairs: " + numberOfPairs);
	              break;
	            }
	         }
	      }
	    }else //String length is odd
	     {
	        numberOfPairs = -1;
	        System.out.println("number of pairs: " + numberOfPairs);
	     }
	    
	    return numberOfPairs;
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public static int solution(int number) 
	  {
	    int sum = 0;
	    //iterate through all the numbers below the 'number int'
	    for(int index = 1; index <number; index++)
	    {
	      //check if they are a multiple of 3 OR 5 and add them to the sum
	      if(index % 3 == 0 || index % 5 == 0)
	      {
	        sum += index;
	      }
	    }
	    return sum;
	  }
}
