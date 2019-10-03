package examplesfortechtest;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * 
 * @author oli19171901
 *
 */
public class CodeWars 
{
	public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
	
	/**
	 * the main method
	 */
	public static void main(String[] args) 
	{
		//int[] dice = {2,1,5,1,5,4};
		//final int[] board = {0,0,3,0,0,0,0,-2,0,0,0} ;
		//System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")); 
		//System.out.println(newCamelCase(" this sentence is in camel casing"));	
		//System.out.println(spinWords("Hey fellow warriors and blahh blah blah"));
		//System.out.println(snakesAndLadders(board, dice));
		//int[] a = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		//System.out.println(findIt(a));
		//System.out.println("Most value-able: " + high("what time are we climbing up to the volcano"));
		
		String[] lines = {"HELLO "};
		int[][] rotors = {{15,49,50,48,43,13}};
		
		System.out.println(Arrays.toString(flapDisplay(lines, rotors)));
		
		//System.out.println(countYZmo("thiz iz a sentence with zz's and yy's"));
		
	}
	

	
	/**
	 * a method to complete the airport arrivals/departures kata
	 */
	public static String[] flapDisplay(final String[] lines, final int[][] rotors) 
	{
		
		String in = lines[0];
		
		char[] inArr = in.toCharArray();
		String[] inString = new String[inArr.length];
		for(int loop = 0; loop < inArr.length; loop++)
		{
			inString[loop] = Character.toString(inArr[loop]);
		}
		
	    // order: ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789
		// let initial word (lines) = C A T and rotor  = 1 13 27
		int[] lineIndex = new int[inString.length];
		System.out.println(Arrays.toString(inString));
		
		for (int count = 0; count < inString.length; count++)
		{
			//find where lines[lineChar] is the same char as in the alphabet
			lineIndex[count] = ALPHABET.indexOf(inString[count]);
		}
		
		System.out.println(Arrays.toString(lineIndex));
		int shift = 0;
		for(int rotorIndex = 0; rotorIndex < rotors[0].length; rotorIndex++)
		{
			System.out.println("rotor loop:" + rotorIndex);
			
			for(int elLine = shift; elLine < lineIndex.length; elLine++)
			{
				System.out.println("lineIndex[elLine] = " +lineIndex[elLine]);
				lineIndex[elLine] += rotors[0][rotorIndex];
				//System.out.println("rotors: " + rotors[0][rotorIndex]);
				System.out.println("elLine loop: " + elLine);
			}
			
			System.out.println(Arrays.toString(lineIndex));
			shift++;
		}
		int letterPosition = 0;
		String letterValue = "";
		String out = "";
		
		
		//covert to strings again
		for(int index = 0; index < lineIndex.length; index++)
		{
			letterPosition = lineIndex[index];
			
			while(letterPosition >= 54) 
			{
				letterPosition -= 54;
			}
			
			letterValue = Character.toString(ALPHABET.charAt(letterPosition));
			System.out.println("letterValue: " + letterValue + " ");
			out += letterValue;
		}
		System.out.println("\n");

		String[] outString = {out};
		outString[0] = out;
		
	    return outString;
	}
	
	
	public static int countYZmo(String str) 
	{
		String[] words = str.split(" ");
		int count = 0;
        for (int index = 0; index < words.length; index++) 
        {
        	if(words[index].indexOf("y") != -1)
        	{
        		count++;
        	}
        	else if (words[index].indexOf("z") != -1)
        	{
        		count++;
        	}
        }      

        return count;
	}
	/**
	 * check the ascii value of each word in s
	 * @param s
	 * @return highest value word
	 */
	public static String high(String s) 
	  {
		String[] words = s.split("\\s+");
		//ascii values for letters go from 97(a) to 122(Z)
		int previousHighestValue = 0;
		int indexHightValue = 0;
		for(int index = 0; index < words.length; index++)
		{
			char letter = 0;
			int wordValue = 0;
			
			for(int letterPosition = 0; letterPosition < words[index].length(); letterPosition++)
			{
				letter = words[index].charAt(letterPosition);
				int asciiValue = ((int) letter) - 97;
				wordValue += asciiValue;
			}
			System.out.println(wordValue);
			if(wordValue > previousHighestValue) 
			{
				previousHighestValue = wordValue;
				indexHightValue = index;
			}
		}
		
	    return words[indexHightValue];
	  }
	
	/**
	 * checks an array of ints for the number that occurs an odd number of times
	 * @param a
	 * @return the int that has an odd number
	 */
	public static int findIt(int[] a) 
	{
		int odd = 0;
		for(int index = 0; index < a.length; index++)
		{
			int numOfTimesIntAppears = 0;
			
			//System.out.println(a[index]);
			for(int index1 = 0; index1 < a.length; index1++)
			{
				if(a[index] == a[index1])
				{
					numOfTimesIntAppears++;
				}
			}
			
			if((numOfTimesIntAppears % 2) != 0)
			{
				odd = a[index];
				break;
			}
		}

		return odd;
	}
	
	
	/**
	 * very basic snakes and ladders game
	 * @param board
	 * @param dice
	 * @return position in board array
	 */
	public static int snakesAndLadders(final int[] board, final int[] dice) 
	{
		//dice = [2,1,5,1,5,4]
	    //board= [0,0,3,0,0,0,0,-2,0,0,0]
		int numOfThrows;
		int valueOfDice;
		int valueOfBoardPosition;
		int boardPosition = 0;
		
		for(numOfThrows = 0; numOfThrows < dice.length; numOfThrows++)
		{
			//System.out.println("number of throws = " + (numOfThrows + 1));
			if (boardPosition != board.length)
			{
				valueOfDice = dice[numOfThrows];
				//System.out.print(" " + valueOfDice);
				if((valueOfDice + boardPosition) < board.length) 
				{
					valueOfBoardPosition = board[(valueOfDice + boardPosition)];
					//System.out.print(" " + valueOfBoardPosition);
					boardPosition += valueOfDice + valueOfBoardPosition; 
					//System.out.print(" " + boardPosition + "\n\n");
				}	
			}
			else
			{
				return boardPosition;
			}
		}
		//System.out.println("\n\n >>>");
		return boardPosition;
	}
	
	
	
	
	/**
	 * flips the order of letters in any word over 5 characters
	 * @param sentence
	 * @return
	 */
	public static String spinWords(String sentence) 
	{
		String out = "";
		String[] words = sentence.split("\\s+");
		
		for(int index = 0; index < words.length; index ++)
		{
			String indiWord = "";
			//separated into individual word
			if(words[index].length() >= 5)
			{ 
				//only words that are over the threshold				
				StringBuilder sb = new StringBuilder();
				
				for(int letterPosition = 1; letterPosition <= words[index].length(); letterPosition++)
				{
					//appending each character to the string in reverse order					
					sb.append(words[index].charAt(words[index].length() - letterPosition));
					System.out.println(sb);					
				}
				
				indiWord = sb.toString() + " ";
			}
			else
			{
				indiWord = words[index] + " ";
			}
			
			System.out.println(out);
			out = out + indiWord;
		}		
		
		return out.trim();
	}
	
	
	/**
	 * This method turns a given string into CamelCase (second draft)
	 * @param str
	 * @return
	 */
	public static String newCamelCase(String str) 
	{
		String out = null;
		StringBuilder sb = new StringBuilder();		
		String[] splitString = str.split("\\s+");
		
		for(int index = 0; index < splitString.length; index ++)
		{
			boolean firstLetter = false;			
			System.out.println(splitString[index]);
			for(int index1 = 0; index1 < splitString[index].length(); index1++)
			{
				if (firstLetter == false)		
				{
					sb.append(Character.toUpperCase(splitString[index].charAt(index1)));
					firstLetter = true;
				}
				else
				{
					sb.append(Character.toLowerCase(splitString[index].charAt(index1)));
				}
			}
		}
		out = sb.toString();
		return out;
	}
	
	
	/**
	 * for the code wars printError
	 * @param s
	 * @return
	 */
	public static String printerError(String s) 
    {
		String out = null;
		int wrong  = 0;
		
		char[] sToArray = s.toCharArray();
		
		for(int index = 0; index < sToArray.length; index++)
		{	
			switch (sToArray[index]) 
			{
			case 'n':
				wrong++;
				break;
			case 'o':
				wrong++;
				break;
			case 'p':
				wrong++;
				break;
			case 'q':
				wrong++;
				break;
			case 'r':
				wrong++;
				break;
			case 's':
				wrong++;
				break;
			case 't':
				wrong++;
				break;
			case 'u':
				wrong++;
				break;
			case 'v':
				wrong++;
				break;
			case 'w':
				wrong++;
				break;
			case 'x':
				wrong++;
				break;
			case 'y':
				wrong++;
				break;
			case 'z':
				wrong++;
				break;
			}
		}
		
		System.out.println(sToArray.length);
		System.out.println(wrong);
		out = wrong + "/" + sToArray.length;
		return out; 
    }
	
	
	/**
	 * checks if the string input is 4 or 6 digits and has no letters
	 * @param pin
	 * @return
	 */
	public static boolean validatePin(String pin) 
		  {
			
			char[] arr = pin.toCharArray();
			  
		    if (arr.length == 4 || arr.length ==6)
		    {
		      for (int index = 0; index<arr.length; index++)
		      {
		    	if(Character.isDigit(arr[index]))
		    	{
		    		//all good
		    	}
		    	else
		    	{
		    		return false;
		    	}
		      }
		    }
		    
		    
		    return true;
		  }

}

