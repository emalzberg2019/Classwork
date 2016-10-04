/**
* This method simulates a Monty Hall Game and returns 1 if switch win
* and returns 0 otherwise
* Gives random number (1 - 3) for carDoor, and same for userPick. If they're the same,
* then it returns 1 (they won!) Otherwise it returns 0.
* @return int return 1 if switch in, 0 otherwise
*/

public class MontyHallSimulation
{
	public static void main(String[] args)
	{
		String input = args[0];
		
		int numSim = Integer.parseInt(input); //turns string into an int
		System.out.println(numSim);
		
		int switchWin = 0;

		for(int i = 0; i < numSim; i ++)
			switchWin += game();
			
		double percentSwitchWin = format((double) switchWin / numSim * 100);
		double percentStayWin = format(100 - percentSwitchWin);
		System.out.println("% switch_win: " + percentSwitchWin);
		System.out.println("% stay_win: " + (100 - percentSwitchWin));
	}
	
	/**
	* This method takes in a double and truncates it 2 decimal places
	* @param d the double input to be truncated
	* @return double formatted to 2 decimal places
	*/
	
	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp / 100.0; // if you divided it by just 100 with the ".0" then because of int
		// division, you would lose the decimal (always round down)
		
	}
/**
* @return int return 1 if switch win, 0 otherwise
* we're doing an int as the return value so that we can keep track of the switchFin (rather
* than choosing true or false)
*/
	public static int game()
	{
		int carDoor = (int)(Math.random() * 3 + 1);
		int userPick = (int)(Math.random() * 3 + 1);
		
		if (carDoor == userPick)
			return 0;
		else
			return 1;
	}
	
}