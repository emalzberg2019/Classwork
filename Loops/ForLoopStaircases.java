/**
* This is a project for learning how to use for / while loops
* Using one literal ("*") a downward and upward facing staircase are made.
* @author Ethan Malzberg
* @version 1.0
*/

public class ForLoopStaircases
{
	public static void main(String[] args)
	{
		ForLoopStaircaseDown(4);
		
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		
		ForLoopStaircaseUp(4);
	}
	
	public static void ForLoopStaircaseDown(int n)
	{
		int row = 0;
		while (row < n)
		{
			int col = 0;
			while (col < (n - row))
			{
				System.out.print('*'); //single quotes make it a char
				col ++;
			}
			System.out.println();
			row ++;
		}
	}
		
	public static void ForLoopStaircaseUp(int n)
	{
		for(int i = 0; i < n; i ++) //row = i, col = j
		{
			for(int j = 0; j <= i; j ++) //change from just printing an array of 
			// 4 x 4 stars was: j <= i
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}