package examplesfortechtest;

import java.util.Arrays;

//java doc for class

public class ArrivalsDeparturesAgain {

	public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
	
	public static void main(String[] args) 
	{
		String[] lines = {"HELLO "};
		int[][] rotors = {{15,49,50,48,43,13}};
		
		System.out.println(Arrays.toString(flapDisplay(lines, rotors)));

	}
	
	/**
	 * takes a String array: {"cat"} and an int array {1,13,19}
	 * 
	 * | C A T | + 1
	 * | D B U | + 13
	 * | D O ( | + 19
	 * | D O G |
	 * 
	 * Takes in an array of Strings and shifts the letters by the array 'rotors'
	 * @param lines
	 * @param rotors
	 * @return outString
	 */
	public static String[] flapDisplay(final String[] lines, final int[][] rotors) 
	{
		String[] outString = new String[lines.length];
		
		//iterates through each line of the board from top to bottom
		for(int rotorDepth = 0; rotorDepth < rotors.length; rotorDepth++)
		{
			int letterPosition = 0;
			String letterValue = "";
			String out = "";
			
			String in = lines[rotorDepth];
			
			char[] inArr = in.toCharArray();
			String[] inString = new String[inArr.length];
			for(int loop = 0; loop < inArr.length; loop++)
			{
				inString[loop] = Character.toString(inArr[loop]);
			}
			
			int[] lineIndex = new int[inString.length];
			//System.out.println(Arrays.toString(inString));
			
			for (int count = 0; count < inString.length; count++)
			{
				//find where lines[lineChar] is the same char as in the alphabet
				lineIndex[count] = ALPHABET.indexOf(inString[count]);
			}
			
			
			//System.out.println(Arrays.toString(lineIndex));
			int shift = 0;
			
			//iterates through each line from left to right
			for(int rotorIndex = 0; rotorIndex < rotors[0].length; rotorIndex++)
			{
				System.out.println("rotor loop:" + rotorIndex);
				
				for(int elLine = shift; elLine < lineIndex.length; elLine++)
				{					
					System.out.println("lineIndex[elLine] = " +lineIndex[elLine]);
					lineIndex[elLine] += rotors[rotorDepth][rotorIndex];
					//System.out.println("rotors: " + rotors[0][rotorIndex]);
					System.out.println("elLine loop: " + elLine);
				}
				
				//System.out.println(Arrays.toString(lineIndex));
				shift++;
			}
			
			//convert the array of ints to an array of strings
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
			
			
			outString[rotorDepth] = out;
		}

		return outString;
	}

}
