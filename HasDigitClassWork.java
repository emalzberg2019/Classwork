public class HasDigitClassWork
{
	public static void main(String[] args)
	{
		System.out.println("Checks if string has digit: ");
		System.out.println(hasDigit("abc"));
		System.out.println(hasDigit("ab1"));
		System.out.println(hasDigit("a45bc"));
		System.out.println(hasDigit("ethan"));
		
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		System.out.println("Iterative:");
		System.out.println(isPalindromeIterative("racecar"));
		System.out.println(isPalindromeIterative("hi"));
		System.out.println(isPalindromeIterative("123421"));
		System.out.println(isPalindromeIterative("484"));
		System.out.println(isPalindromeIterative("tacocat"));
		System.out.println(isPalindromeIterative("eye"));
		System.out.println(isPalindromeIterative("bye"));
		
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		System.out.println("Recursive:");
		System.out.println(isPalindromeRecursive("racecar"));
		System.out.println(isPalindromeRecursive("hi"));
		System.out.println(isPalindromeRecursive("123421"));
		System.out.println(isPalindromeRecursive("484"));
		System.out.println(isPalindromeRecursive("tacocat"));
		System.out.println(isPalindromeRecursive("eye"));
		System.out.println(isPalindromeRecursive("bye"));
		
		
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		System.out.println("Iterative Substring:");
		System.out.println(isPalindromeIterativeSubstring("racecar"));
		System.out.println(isPalindromeIterativeSubstring("hi"));
		System.out.println(isPalindromeIterativeSubstring("123421"));
		System.out.println(isPalindromeIterativeSubstring("484"));
		System.out.println(isPalindromeIterativeSubstring("tacocat"));
		System.out.println(isPalindromeIterativeSubstring("eye"));
		System.out.println(isPalindromeIterativeSubstring("bye"));
		
	
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		System.out.println("Recursive Substring:");
		System.out.println(isPalindromeRecursiveSubstring("racecar"));
		System.out.println(isPalindromeRecursiveSubstring("hi"));
		System.out.println(isPalindromeRecursiveSubstring("123421"));
		System.out.println(isPalindromeRecursiveSubstring("484"));
		System.out.println(isPalindromeRecursiveSubstring("tacocat"));
		System.out.println(isPalindromeRecursiveSubstring("eye"));
		System.out.println(isPalindromeRecursiveSubstring("bye"));
	}
	
	/**
	* This method takes in a string and returns true if the given
	* string has a digit (return false otherwise.)
	* Algorithm: typecast into ASCII and check if it is within the ASCII range
	* @param s the given string to check whether it has a digit
	* @return boolean true if it has a digit, false otherwise
	*/
	public static boolean hasDigit(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if ((s.charAt(i) <= 57) && (s.charAt(i) >= 48))
				return true;
		}
		return false;
	}
	/**
	* This method takes in a String and returns true if the given String is a
	* palindrome. Using iteration and charAt
	* @param s the String to check whether it is a palindrome
	* @return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindromeIterative(String s)
	{
		int last = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++)
		{
			if (s.charAt(i) == s.charAt(last))
				last -= 1;
			else
				return false;
		} 
		return true;
	}
	
	/**
	* This method takes in a String and returns true if the given String is a
	* palindrome. Using recursion and charAt
	* @param s the String to check whether it is a palindrome
	* @return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindromeRecursive(String s)
	{
		if (s.length() <= 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindromeRecursive(s.substring(1, s.length() - 1));
		else
			return false;
	}
	
	/**
	* This method takes in a String and returns true if the given String is a
	* palindrome. Using iteration and substring
	* @param s the String to check whether it is a palindrome
	* @return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindromeIterativeSubstring(String s)
	{
		int last = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++)
		{
			
			if (s.substring(i, i + 1).equals(s.substring(last, last + 1)))
				last -= 1;
			else
				return false;
		} 
		return true;
	}
	
	/**
	* This method takes in a String and returns true if the given String is a
	* palindrome. Using recursion and substring
	* @param s the String to check whether it is a palindrome
	* @return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindromeRecursiveSubstring(String s)
	{
		if (s.length() <= 1)
			return true;
		if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())))
			return isPalindromeRecursive(s.substring(1, s.length() - 1));
		else
			return false;
	}
}



