/**
*
*
*/
public class Loops
{

	public static void main(String[] args)//no return value from this "main" method
	{
		//call to whileLoop
		whileLoop(); //semi colon at the end of every statement!
		
		System.out.println("------------------------------------");
		//call to forLoops
		forLoop();
		
		NestedWhileLoop(4);
		
		int var = 9;
		NestedForLoop(var);
	}
	
	public static void whileLoop() //you don't want a return (so main)
	{
		int counter = 1;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter++; //++ in java language adds 1. Same thing as saying counter += 1; ,
			//or even counter += 2; , etc.
		}
	}
	
	public static void forLoop()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}
	
	
	public static void NestedWhileLoop(int n)
	{
		int row = 0;
		while (row < n)
		{
			int col = 0;
			while (col < n)
			{
				System.out.print("*");
				col ++;
			}
			System.out.println();
			row ++;
		}
	}
		
	public static void NestedForLoop(int n)
	{
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j < n; j ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
		
	
}