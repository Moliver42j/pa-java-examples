package examplesfortechtest;

/**
 * 
 * @author oli19171901
 *
 */
public class TechTestQuestion 
{
	/**
	  *checks a string of braces for a matching pair. A pair adds one to the numberOfPairs, an odd bracekts makes numberOfPairs = -1
	  *
	  *@param braces
	  *@return numberOfPairs
	  */
	  public static Integer numberOfBracePairs( String braces ) 
	  {
	    //covert to char array
	     char[] bracesArr = braces.toCharArray();   
	     System.out.println("input  = " + braces);
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
	              //if number of elements between a pair is odd, it can't contain only pairs
	              if( ((innerLoop-1) - index) % 2 != 0)
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
}
