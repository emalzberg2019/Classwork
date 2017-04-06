public class PracticeProblems0
{
	public static void main(String[] args)
	{
		System.out.println(countPairs("axa"));
		System.out.println(countPairs("axax"));
		System.out.println(countPairs("axbx"));
		System.out.println("----------");
		
		System.out.println(removeTags("<b>Strings are immutable</b>"));
		System.out.println(removeTags("Strings are immutable"));

	}
	
	public static int countPairs(String check)
	{
		if (check.length() <= 2)
			return 0;
			
		else if (check.substring(0, 1).equals(check.substring(2, 3)))
			return 1 + countPairs(check.substring(1));
			
		else
			return 0 + countPairs(check.substring(1));
	}
	
	public static String removeTags(String x)
	{
		if (x.indexOf("<") == -1)
			return x;
		else
			return x.substring(3, x.length() - 4);
	}
	
	/**
	public static int addNums()
	{
		
	}
	*/
}