package examplesfortechtest;

import java.util.Arrays;

/**
 * 
 * @author oli19171901
 *
 */
public class RachelQuestion {

	/**
	 * this is a method to turn any string into a CamelCaseWord
	 * @param args
	 */
	public static void main(String[] args) 
	{
		char[][] board = {
		        {'E','A','R','A'},
		        {'N','L','E','C'},
		        {'I','A','I','S'},
		        {'B','Y','O','R'}
		    };
		String word = "RSCAREIOYBAILNEA";
		
		  boolean isWord = false;
	      char[] wordArr = word.toCharArray();
	      
	      for(int letter = 0; letter < wordArr.length; letter++)
	        {
	    	  boolean isLetter = false;
	    	  System.out.println("letter: " + letter + "\t(" + wordArr[letter] + ")");
		          for(int row = 0; row < board.length; row++)
		          {
		        	  //System.out.println("row: " + row);
			            for(int column = 0; column < board[0].length; column++)
			            {
			            	//System.out.println("column: " + column);
				              if(wordArr[letter] == board[row][column])
				              {
				                board[row][column] = ' ';
				                isLetter = true;
				              }
				             
				              //System.out.println(Arrays.toString(board));
			            }
		          
		          }
		          
		      if (isLetter) 
		      {
				isWord = true;
		      }
	        }
	        System.out.println(isWord);
	}
	
	public static void Boggle(final char[][] board, final String word) 
    {
      boolean isWord = false;
      char[] wordArr = word.toCharArray();
      
      for(int letter = 0; letter < board.length; letter++)
        {
          for(int row = 0; row < board.length; row++)
          {
            for(int column = 0; column < board[0].length; column++)
            {
              if(wordArr[letter] == board[row][column])
              {
                board[row][column] = ' ';
                isWord = true;
              }
              else 
              {
                isWord = false;
              }
            }
          System.out.print("\n");
        }
        check(isWord);
        }
    }
    
    public static boolean check(boolean isIt) 
      {
        // Your code here too!
        return isIt;
    }
	

}
