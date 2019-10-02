package examplesfortechtest;
/**
 * 
 * @author oli19171901
 *
 */
public class ExampleOne 
{
	
	private static int a = 4;
	private static int b = 5;
	
	public static void main(String[] args) 
	{
		//printConditions();
		//forLoopDownCount();
		//WhilesyWhile();
		//statementStrings();
		//containsString();
		splitString();
		System.out.println(sleepIn("Saturday", false));
		
	}
	
	/**
	 * sleep in task
	 * @param day
	 * @param vaykay
	 * @return
	 */
	public static Boolean sleepIn(String day, boolean vaykay)
	{
		boolean sleepy= false;
		boolean weekDay = false;
		switch (day) 
		{
		case "Monday":
			weekDay = true;
			break;
			
		case "Teusday":
			weekDay = true;		
			break;
					
		case "Wednesday":
			weekDay = true;
			break;
			
		case "Thursday":
			weekDay = true;
			break;
			
		case "Friday":
			weekDay = true;
			break;
			
		case "Saturday":
			weekDay = false;;
			break;
		case "Sunday":
			weekDay = false;
			break;

		default:
			System.out.println("ERROR");
		}
		
		if((weekDay == false || vaykay == true ))
		{
			sleepy = true;
		}	
		
		return sleepy;
	}
	
	/**
	 * splits a string 
	 */
	public static void splitString()
	{
		String sentence = "matthew is class";
		String[] Strings = sentence.split(" ");
		System.out.println("Length of " + Strings.length);
		
		System.out.println(Strings[2]);
		
		for(int index = 0; index < Strings.length; index++)
		{
			System.out.println(Strings[index]);
		}
	}
	
	/**
	 * gets the index of a given String
	 */
	public static void indexString()
	{
		String name = "matthew";
		int index = name.indexOf('t');
		System.out.println(index);
	}
	
	public void containsString()
	{
		String name = "Matthew";
		
		if(name.contains("tt"))
		{
			System.out.println("noice");
		}
	}
	
	/*
	 * Calendar
	 */
	public void statementStrings()
	{
		String day = "Wednesday";
		
		switch (day) 
		{
		case "Monday":
			System.out.println("Monday");
			break;
			
		case "Teusday":
			System.out.println("Teusday");		
			break;
					
		case "Wednesday":
			System.out.println("Wednesday");
			break;
			
		case "Thursday":
			System.out.println("Thursday");
			break;
			
		case "Friday":
			System.out.println("Friday");
			break;
			
		case "Saturday":
			System.out.println("Saturday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;

		default:
			System.out.println("ERROR");
		}
	}
	
	public void switchCalander(int day)
	{
		switch (day) 
		{
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("weekday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("ERROR");
		}
	}
	
	
	public void doWhile()
	{
		int i=0;
		
		do 
		{
			System.out.println(i);
			i++;
		} while (i<5);
	}
	
	/**
	 * while loop test
	 */
	public void whilesyWhile()
	{
		int i=0;
		while (i<170) 
		{
			System.out.println(i);
			++i;
		}
	}
	
	/**
	 * a loop that counts to 0
	 */
	public void forLoopDownCount()
	{
		a = 1000;
		for(int index = a; index >= 0; index--)
		{
			System.out.println(index);
		}
	}
	
	/**
	 * if else test
	 */
	public void printConditions()
	{
		if (a==b) {
			System.out.println("A = B");
		}
		else
		{
			System.out.println("A != B");
		}
		
		if (a<=b) {
			System.out.println("A <= B");
		}
		else
		{
			System.out.println("A !<= B");
		}
		
		if (a<b) {
			System.out.println("A < B");
		}
		else
		{
			System.out.println("A !< B");
		}
		
		if (a>b) {
			System.out.println("A > B");
		}
		else
		{
			System.out.println("A !> B");
		}
		
		if (a>=b) {
			System.out.println("A >= B");
		}
		else
		{
			System.out.println("A !>= B");
		}
		
		if (a!=b) {
			System.out.println("A != B");
		}
		else
		{
			System.out.println("A = B");
		}
		
		if (a>b || a<b) {
			System.out.println("A < B || A > B");
		}
		else
		{
			System.out.println("A = B");
		}
		
		if (3<a && a<6) {
			System.out.println("3 < A < 6");
		}
		else
		{
			System.out.println("A is not between 3 and 6");
		}
		
	}
}
