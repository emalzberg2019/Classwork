/*
* The below methods print out different types of arrays. For example, 1D int/String arrays
* as well as 2D int/String arrays using overloaded methods.
* @author Ethan Malzberg
* 11/30/16
*/ 

public class TwoDArrayPractice
{
	/*
	* Controls all other methods, prints out in a nicely stylized and neat format.
	*/
	public static void main(String[] args)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Int array (prints 0's): ");
		int [][] arr = new int[3][4];
		printArray2D(arr);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("String array (prints null): ");
		String[][] arr1 = new String[3][3];
		printArray(arr1); //this would print out null null null (3 x 3) because thats 
		//the default for all values.
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("2D array, 4x4: ");
		int [][] arr2 = create2D();
		printArray2D(arr2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("2D array abstracted: ");
		int [][] arr3 = create2DAbstract(6);
		int [][] arr4 = create2DAbstract(3);
		printArray2D(arr3);
		printArray2D(arr4);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//int [][] arr5 = new int[6][6];
		int [][] arr5 = create2DAbstract(6);
		printArrayNice(arr5);
		System.out.println("~-~-~-~");
		int [][] arr6 = create2DAbstract(4);
		printArrayNice(arr6);
		System.out.println("~-~-~-~");
		int [][] arr7 = create2DAbstract(2);
		printArrayNice(arr7);
		System.out.println("~-~-~-~");
		int [][] arr8 = create2DAbstract(10);
		printArrayNice(arr8);
	}
	
	/*
	* This method uses a for loop to print each row and column of an int array correctly
	* @param int[][] a  array to be printed, made of ints
	*/
	public static void printArray2D(int[][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col ++)
				System.out.print(a[row][col] + " ");
			System.out.println();
		}
	}
	
	/*
	* This method uses a for loop to print each row and column of a string array correctly
	* @param String[][] a  array to be printed, made of Strings (initialized null
	* This is an overloaded method, which means that it is the same exact code as printArray
	* except it's parameter is a String.
	*/
	public static void printArray(String[][] a) //overloaded: same name as above with a different type
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col ++)
				System.out.print(a[row][col] + " ");
			System.out.println();
		}
	}
	
	/*
	* This method creates an array of four rows and four columns, filled with numbers 1-16.
	* It uses two while loops to initialize and fill each "row" and "column."
	* @return arr  the 4x4 array of 1-16
	*/
	public static int[][] create2D()
	{
		int[][] arr = new int [4][4];
		int row = 0;
		int column = 0;
		int counter = 1;
		
		while (row < 4)
		{
			column = 0;
			while (column < 4)
			{
				arr[row][column] = counter;
				column ++;
				counter++;
			}
			row ++;
		}
		
		return arr; //YOU MUST HAVE A RETURN IF THE METHOD HAS A RETURN ON THE AP EXAM!!! 
		//YOU WILL LOSE A LOT OF POINTS IF YOU FORGET A NECESSARY 'RETURN'!!
	}
	
	/*
	* This method creates an array with the inputted dimensions (i.e. an input of 3 would
	* create a 3x3 2D array) It does so using a nested while loop, which initializes each 
	* row and column with the desired numbers through incrementing a counter
	* @return arr  2d array
	*/
	public static int[][] create2DAbstract(int n)
	{
		int[][] arr = new int [n][n];
		int row = 0;
		int column = 0;
		int counter = 1;
		
		while (row < n)
		{
			column = 0;
			while (column < n)
			{
				arr[row][column] = counter; //index out of range
				column ++;
				counter++;
			}
			row ++;
		}
		
		return arr;
	}
	
	/*
	* This method takes in a 2d array and prints the contents of that 2D array in a nice,
	* board format with appropriate spaces and lines by using a nested "for loop" for the
	* spaces and to fill the 2d array, and a while loops to determine the number of "lines"
	* @param int[][] a  initialized 2d array to be filled and printed in a nice format
	*/
	public static void printArrayNice(int[][] a)
	{
		int maxDigit = numDigits(a[a.length-1][a.length-1]);
		int currentDigit = 3;
		String numLines = "-";
		while (numLines.length() < (maxDigit + 1) * a.length)
			numLines += "-";
		
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col ++)
			{
				currentDigit = numDigits(a[row][col]); //scope for  row in the for 
				for(int s = 0; s < maxDigit - currentDigit; s++)
				{
					System.out.print(" ");
				}
				System.out.print(a[row][col] + "|");
			}
			System.out.println();
			System.out.println(numLines);
		}
	}
	
	
	/*
	* This method takes in a number and uses recursion & int division to check how many 
	* digits are in that number.
	* @param int check  the integer that needs its digit number to be determined
	@ return int the number of digits in that number.
	*/
	public static int numDigits(int check)
	{
		if (check < 10)
			return 1;
		else
			return 1 + numDigits(check/10);
			
			
	}
	
	
	
}