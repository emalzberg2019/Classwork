/**
* This is a game in which the user tries to get all of the animals / plants alive across
* the river to bank 2. Global scope boolean values are used to do so, and nextLine is used
* to get the user input.
* @author Ethan Malzberg
* @version 1.0
*/

import java.util.Scanner;

public class FarmerGame
{
	// global scope -- false to begin with (boolean default value is false)
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	
	public static void main(String[] args)
	{
		welcome();
	
		displayGameStatus();
				
		while (checkWinner() == 4)
		{
			game();
			displayGameStatus();
		}
		
	}

	/**
	* This method displays the instructions for the game.
	* It prompts the user on what to enter for their choice each time, etc.
	*/
	public static void welcome()
	{
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		System.out.println("FARMERS'S GAME");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to the Farmer's game");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("In this game there are four animals / plants:");
		System.out.println("A Human, a sheep, a wolf, and a cabbage");
		System.out.println("All of these animals start on bank 1 at the");
		System.out.println("beginning of the game. However, your objective");
		System.out.println("is to get them all to bank 2 ALIVE by the end of the");
		System.out.println("game, which is on the other side of the river.");
		System.out.println("To get there alive, the Wolf can never be alone");
		System.out.println("with the the Sheep, and the Sheep can never be");
		System.out.println("alone with the Cabbage. They all must go with");
		System.out.println("the human across the river!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter the first letter(s) of the animal / food that");
		System.out.println("you want to bring to the other bank in order to");
		System.out.println("get them across the river.");
	}
	
	/**
	* This method shows the user their choice - for example, if they move the cabbage
	* to bank to (with the human of course) then that will show on the screen.
	* Initiates the two banks.
	*/
	public static void displayGameStatus()
	{
		String bank0 = "   ";
		String bank1 = "   ";
		
		if (!cabb)
			bank0 += "C    ";
		else
			bank1 += "C    "; 
		if (!sheep)
			bank0 += "S    ";
		else
			bank1 += "S    ";
		if (!wolf)
			bank0 += "W    ";
		else
			bank1 += "W    ";
		if (!human)
			bank0 += "H    ";
		else
			bank1 += "H    ";
			
		System.out.println(bank0);
		System.out.println("----------------------");
		System.out.println("\n \n \n");
		System.out.println("----------------------");
		System.out.println(bank1);

	}
	
	/**
	* This method is the user interface, and prompts the user for their choice and
	* depending on their choice, switches the boolean value (i.e. true to false)
	* Also, it tells the user if they accidentally tried to move an animal / plant
	* across without the human. 
	*/
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Which animal / food would you like to bring across? ");
		String input = keyboard.nextLine();
		
		if (input.equals("C") && cabb == human)
		{
			cabb = !cabb;
			human = !human;
		}
		else if (input.equals("S") && sheep == human)
		{
			sheep = !sheep;
			human = !human;
		}
		else if (input.equals("W") && wolf == human)
		{
			wolf = !wolf;
			human = !human;
		}
		else if (input.equals("H"))
		{
		 	human = !human;
		}
		else
		{
			//next step: make a loop in main to go back to beginning and so it can get another input
			//make a method to do check winner, to check if they won, to end the game. or do they lose because the sheep eats the cabbage etc.?
			//return an integer for 1st type of loss e.g. sheep eats cabbage, another integer for wolf eats
			//sheep, and other two types as well (winning and to continue if invalid)	
			System.out.print("Your choice must be on the same side as the human to ");
			System.out.println("move across!");	 
		}  
	}
	
	/**
	* This method checks whether 1. the user has won 2. if the user lost because the
	* sheep was alone with the cabbage 3. if the user lost because the wolf was alone with
	* the sheep or 4. if the user is still playing and has not won / lost yet.
	* @return int 1-win, 2-lost, 3-lost, 4-continue
	*/
	public static int checkWinner()
	{
		if (wolf && cabb && sheep)
		{
			System.out.println("Congratulations, you've successfully ");
			System.out.println("got all of the animals across! ");
			return 1;
		}
		else if ((cabb == sheep) && (cabb != wolf) && (cabb != human))
		{
			System.out.println("Oh no, the sheep ate the cabbage!");
			System.out.println("Try again.");
			return 2;
		}
		else if ((wolf == sheep) && (wolf != cabb) && (wolf != human))
		{
			System.out.println("Oh no, the wolf ate the sheep!");
			System.out.println("Please try again.");
			return 3;
		}
		else //still playing the game
			return 4;
	}


}