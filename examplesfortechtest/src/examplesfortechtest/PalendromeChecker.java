package examplesfortechtest;

import java.util.Scanner;
/**
 * 
 * @author oli19171901
 *
 */
public class PalendromeChecker 
{
	/**
	 * this needs to be remade from the beginning (it's bad), 
	 *
	 * 	string into two substrings
	 * 
	 * 	while substring1 != substring2
	 * 		return false
	 * 		else return true
	 * 	increment substring1
	 * 	decrement substring2
	 *
	 */
	public static void main(String[] args)
	{
		
	}
	
	public boolean check(String in)
	{
		Scanner Words = new Scanner(System.in);
		boolean IsItAPalendrom;
		do 
		{
			System.out.print("Type a Word:");
			
			String UserInput = in;
			
			speak("input acknowledged");
			
			int WordLength = GetWordLength(UserInput);
			speak("word length = " + WordLength);
			
			char[] ArrayUnflipped = StringToArray(UserInput);
			speak("Unflipped array = " + java.util.Arrays.toString(ArrayUnflipped));
			
			char[] ArrayFlipped = ReverseArray(ArrayUnflipped, WordLength);
			speak("Flipped array = " + java.util.Arrays.toString(ArrayFlipped));
			
			IsItAPalendrom = PalendromeYN(ArrayFlipped, ArrayUnflipped, WordLength);
			
			System.out.print(UserInput + " = " + stringBuild(ArrayFlipped));
			speak(" is " + Boolean.toString(IsItAPalendrom) + "\n\n");
		}
		while(IsItAPalendrom == false);
		
		System.out.println("It is a palendrome");
		Words.close();
		
		return IsItAPalendrom;
	}
	
	public static String stringBuild(char[] arrayToBuild)
	{
		String builtString;
		StringBuilder sb = new StringBuilder();
		
		for (char ch: arrayToBuild)
		{
			if(Character.isDigit(ch))
			{
				System.out.println("Don't enter numbers ffs...");
				return "ERROR";
			}
			
			sb.append(ch);
		}
		
		builtString = sb.toString();
		
		return builtString;
	}
	
	public static void speak(String WordsIn)
	{
		System.out.println(WordsIn);
	}
	
	public static char[] StringToArray(String StringToChange)
	{
		
		char[] ChangedString = StringToChange.toCharArray();
		
		return ChangedString;
		
	}
	
	public static int GetWordLength(String WordIn)
	{
		int WordLength = WordIn.length();
		
		return WordLength;
	}
	
	public static char[] ReverseArray(char[] ArrayToReverse, int WordLength)
	{
		int EndOfWord = WordLength - 1;
		
		char[] ReversedArray = new char[WordLength];
		
		for(int i=0; i<WordLength; i++)
		{
			if (EndOfWord >=0)
			{				
				speak(java.util.Arrays.toString(ReversedArray));
				ReversedArray[i] = ArrayToReverse[EndOfWord - i];
				speak(Integer.toString(i));
			}
			
			
		}
		
		return ReversedArray;
	}
	
	public static String ArrayToString(char[] ArrayToChange)
	{		
		String ChangedArray = java.util.Arrays.toString(ArrayToChange);
		
		return ChangedArray;		
	}
	
	public static boolean PalendromeYN(char[] FlippedWord, char[] UnflippedWord, int WordLength)
	{
		int Complete = 0;
		
		for(int i=0; i<WordLength; i++)
		{
			if(FlippedWord[i] == UnflippedWord[i])
			{
				Complete++;
			}
		}
		
		if(Complete == WordLength)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
