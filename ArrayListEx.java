/*
* The below methods are exercises for Array Lists. The first method counts the number of
* a certain int in a given array list, and the second method removes 'e's from strings in
* an Array List of Strings.
* @author Ethan Malzberg
* 11/30/16
*/
import java.util.ArrayList;

public class ArrayListEx
{
	public static void main(String[] args)
	{
		System.out.println("Classwork: ");
		ArrayList<Integer> a = new ArrayList<Integer>(); //capacity is 10
		System.out.println(a.size());
		a.add(3);
		a.add(4);
		System.out.println(a.size()); //size of 2 right now
		System.out.println(a);
		
		Integer i = new Integer(5);
		a.add(i);
		System.out.println(a);
		i = 6;
		System.out.println(a);
		a.add(0, -3); //this is inserting -3 at index 0
		System.out.println(a);
		a.set(a.size()-1, 6);
		System.out.println(a);
		
		//a.add(9, 1); //index out of range error because you can only insert to a place
		// where there are items in it.
		
		a.add(a.size(), 1); //same thing as add -- just appending this to the last index
		System.out.println(a);
		
		//a.set(9, -2); must be a formal element that you are replacing, so this would not work
		
		a.remove(0);
		
		System.out.println(a.size());
		System.out.println(a);
		
		System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
		
		System.out.println("Homework: ");
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(2);
		arr.add(0);
		arr.add(-2);
		arr.add(4);
		arr.add(2);
		System.out.println(arr);
		countInt(arr, 2);
		System.out.println(arr);
		
		System.out.println("--------");
		
		ArrayList<String> arra = new ArrayList<String>();
		arra.add("eye");
		arra.add("e");
		arra.add("ethan");
		arra.add("hi");
		System.out.println(arra);
		removeE(arra);
		System.out.println(arra);
		
		
	}
	
	/*
	* This method counts the number of the specified int in the Array List of type int by
	* traversing through the array list (while loop) and checking if that value is the
	* specified int. If so, that int is removed, and the Array List is still traversed.
	*/
	public static void countInt(ArrayList<Integer> a, int n)
	{
		int counter = 0;
		while (counter < a.size())
		{
			int current = a.get(counter);
			
			if (current == n)
				a.remove(counter);
			else
				counter ++;
		}
		
	}
	
	/* 
	* This method goes through each String in an ArrayList of type String and removes Es
	* and replaces them with "X" by calling upon changeE, and then setting the new String
	* to that index in the Array List.
	*/ 
	public static void removeE(ArrayList<String> ar)
	{
		for(int i = 0; i < ar.size(); i++)
		{
			String str = changeE(ar.get(i));
			ar.set(i, str);
			
		}		
	}
	
	/* 
	* This is the helper method for removeE. It recursively calls upon each letter of the
	* given String from the Array List and then checks the first letter in that String. If
	* the letter is an "e", it is removed and replaced with an "x."
	* 
	*/ 
	public static String changeE(String s)
	{
		if (s.length() == 0)
			return s;
		else if (s.charAt(0) == ('e'))
			return "x" + changeE(s.substring(1));
		else
			return s.charAt(0) + changeE(s.substring(1));
	
	}
	
	
}































