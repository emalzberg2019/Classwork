/**
* @author Ethan Malzberg
* @version 1.0
* This method prints the integers from n to 0 both inclusive, on separate
* lines using recursion. The main method calls the print num function,
* which recursively calls the helper function. The num function only
* increments / decrements the variable which is passed through the
* helper function, and the helper function is what actually prints the
* number each time. //this is slightly different from what the homework asked for.
* @param n the largest integer printed on screen.

public class RecursionPractice
{
	public static void main(String [] args)
	{
	originalFunction(5);
	}
	
	
	
	
	public static void printNum(int n)
	{
	if (n >= 0)
		{
		helperFunction(n);
		}
	else
		{
		System.out.println("-------------");
		}
	}
	
	
	
	
	public static void helperFunction(int x)
	{
		System.out.println(x);
		x--;
		printNum(x);
	}
}


* This method prints the integers from 0 to n both inclusive, on separate
* lines using recursion. The main method calls the print num function,
* which recursively calls the helper function. The num function only
* increments / decrements the variable which is passed through the
* helper function, and the helper function is what actually prints the
* number each time.
* @param n the largest integer printed on screen.


public class RecursionPractice
{
	public static void main(String [] args)
	{
	printNum(5);
	}
	
	
	public static void printNum(int n)
	{
	if (n > 0)
		{
		helperFunction(n);
		}
	else if (n == 0)
		System.out.println(n);
	else
		{
		System.out.println("-------------");
		}
	}
	
	
	public static void helperFunction(int x)
	{
		printNum(x - 1);
		System.out.println(x);
	}
}
*/

public class RecursionPractice
{
	public static void main (String [] args)
	{
	printNum(5);
	System.out.println("Done");
	}
	
	public static void printNum(int n)
	{
		if (n == 0)
			System.out.println(n);
		else
		{
			printNum(n - 1);
			System.out.println(n);
		}
	}
}
