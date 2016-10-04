import java.util.Scanner; //importing the scanner class that someone else wrote... making
//it available for you so you can make it available in your program.

/**
* This is a project for learning how to use if / while loops, scanner, and .next line
* The user can chat with the computer using the program until they say "bye"
* @author Ethan Malzberg
* @version 1.0
*/

public class ChatBotMalzberg
{
	/**
	* This is the main method that the java interpreter 
	* @param args This is a command line argument
	*/
	public static void main(String[] args)
	{
		// create / construct a new Scanner object
		Scanner jack = new Scanner(System.in); //System.in means input from the keyboard.
		String input2 = "";
		boolean flag = false;
		while (!input2.equals("bye") && !input2.equals("Bye"))
		{
			if (!flag)
			{
				System.out.print("Hello, what do you want to talk about today? ");
            	flag = true;
			}
			else
			{
				System.out.println("So you want to talk about " + input2 );
				System.out.println("Great, what else do you want to talk about?" );
			}
			input2 = jack.nextLine();
			//System.out.println("okay, bye then!!");
			System.out.print("Please enter your name: ");
			String name = jack.nextLine(); //method called nextline - returns a string (until?)
			// the new line character from the buffer
			//System.out.println("Hi " + name + "! How are you doing today?");
			System.out.print("Hi " + name + "! How are you doing today?");
			String input = jack.nextLine();
			System.out.println("Your answer is " + input);
			System.out.println("How old are you? ");
			int age = jack.nextInt();
			if (age > 30)
			{
				System.out.println(name + ", you are old!");
			}
			else
			{
				System.out.println("nice!");
			}
			System.out.print("How tall are you?: ");
			double height = jack.nextDouble();
			if (height > 6.0)
			{
				System.out.println(name + ", you are tall!");
			}
			else if (height > 5.0)
			{
				System.out.println(name + ", good height");
			}
			else
			{
				System.out.println(name + ", you are short! :P");
			}
			// will get rid of the newLine char from the previous input
			jack.nextLine();
			System.out.print("What is your fav color?: " );
			String color = jack.nextLine();
			System.out.println(color + " is your fav!");
			System.out.println("Are you feeling happy right now? Yes or No? ");
			String emotion = jack.nextLine();
			if (emotion.equals("Yes"))
			{
				System.out.println("Oh yay!");
			}
			else
			{
				System.out.println("Hope you feel better later! ");
			}
			System.out.println("Where are you from? I was manufactured in China ");
			String location = jack.nextLine();
			if (location.equals("New Jersey"))
			{
				System.out.println("We're there right now!" );
			}
			else
			{
				System.out.println(location + " sounds cool, I'd like to visit there one day. ");
			}
			System.out.println("Do you have any pets?");
			String pets = jack.nextLine();
			if (pets.equals("Yes" ))
			{
				System.out.println("I love animals!");
			}
			else
			{
				System.out.println("Aw, do you want any pets?");
				String pets2 = jack.nextLine();
			if (pets2.equals("Yes"))
			{
				System.out.println("Hopefully you can get one soon! ");
			}
			else
			{
				System.out.println("Well I can understand why you might not" );
			}
			}
			System.out.println("Say bye if you don't want to keep talking, or say a topic");
			input2 = jack.nextLine();
			//while (!response.equals("bye") && !response.equals("Bye"))
			//{
			//	response = jack.nextLine(); //I think the error is here.
			//}
			//System.out.println("It was nice getting to meet you! ");
			//response = jack.nextLine();
		}
		System.out.println("okay, bye then!!");
	}
}