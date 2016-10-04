import java.util.Scanner;

public class MontyHallGame
{
	public static void main(String[]args)
	{
		//welcome message
		welcome();
		
		game();
	}
	
	public static void welcome()
	{
		System.out.println("Monty Hall Game");
		System.out.print("Pick a door number first. ");
		System.out.print("You will have a chance to switch ");
		System.out.print("after a door has been revealed ");
		// print out 3 doors
	}
	
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int)(Math.random() * 3 + 1);
		
		//Testing
		//System.out.println("car = " + car);
		
		System.out.print("Please choose a door (1, 2, 3): ");
		int user_pick = keyboard.nextInt();
		// get rid of the new line from the bugger
		keyboard.nextLine();
				
		//testing
		System.out.println("You choose door #: " + user_pick);
		
		int reveal = doorToReveal1(car, user_pick);
		
		//testing
		System.out.println("Open door #: " + reveal);
		
		//System.out.print(reveal);
		
		//Ask the user if they want to switch
		System.out.print("Do you want to switch?: ");
		String answer = keyboard.nextLine();
		
		//testing
		System.out.println("The user wants to switch" + answer);
		
		if (answer.equals("yes"))
		{
			user_pick = doorToReveal1(user_pick, reveal);
		}
		
		if (car == user_pick)
			System.out.print("You win!!");
		else
			System.out.println("Sorry! You lose!!!");

	}
	
	/**
	* -1 is returned in the below function, because it is the requirement of the java
	* compiler: it assumes that 'i' not being less than 4 is (somehow) / could (somehow)
	* be possible. It could be any number besides - 1 too, all the function is checking
	* for is the return value of an integer.
	* This algorithm is looking for the door to reveal to the user that does NOT have a
	* car in it.
	*
	*/
	
	public static int doorToReveal(int c, int u) //'c' stands for the door that actually has  
	// the car, and 'u' stands for user pick.
	{
		for(int i = 1; i < 4; i ++)
		{
			if(i != c && i!= u)
				return i;
		}
		return -1;	
	//this whole block of code is to give the reveal of which door the car is NOT in.
	}
	
	/**
	* you create a general random number... if that number is equal to the user pick's
	* number ('u') or the car door number ('c') then it regenerates another random
	* number.
	* This algorithm is looking for the door to reveal to the user that does NOT have a
	* car in it.
	*
	*/
	public static int doorToReveal1(int c, int u) //'c' stands for the door that actually has  
	// the car, and 'u' stands for user pick.
	{
		int r = (int)(Math.random() * 3 + 1);
		while (r==c|| r==u)
		{
			r = (int)(Math.random() * 3 + 1);
		}
		return 4;
	}
	
	//int i = 1;
	//	while (i == c || i == u)
	//	{
	//		i += 1;
	//	}
	//	
	//	return i;
}