public class ThreeMethods
{
	/**
 	* Finds the first instance of s in line, starting at the position start
 	* @param o the orignal string 
 	* @param s the string to find 
 	* @param start the position to start searching.
 	* @return the index of first instance of s if the string is found OR -1 if not found.
 	*/
	public static void main(String[] args)
	{
	System.out.println("Find String: ");
	System.out.println(findString("racecar", "car", 3));
	System.out.println(findString("abcabcabc", "abc", 2));
	System.out.println(findString("abcd", "ef", 1));
	System.out.println("-----------------");
	
	System.out.println("Count Strings: ");
	System.out.println(countStrings("abcdabcdabcd", "ab"));
	System.out.println(countStrings("ethan", "et"));
	System.out.println(countStrings("ethan", "hello"));
	System.out.println("-----------------");
	
	System.out.println("Reverse Italics: ");
	System.out.println(convertItalics("Hello_bye"));
	System.out.println(convertItalics("H_ello_bye"));
	System.out.println(convertItalics("hi__"));
	System.out.println(convertItalics("hello___Ethan_!"));
	System.out.println("-----------------");
	}
	
	public static int findString(String o, String s, int start)
	{
		o = o.substring(start);
		int index = o.indexOf(s);
		if (index == -1)
			return -1;
		else
			return index + start;
	}
	
	/**
	* Counts the number of times instances of s appear in the main string.
 	* @param o the original string
 	* @param s the string to find.
 	* @return the number of times the string appears in the line
 	*/
	public static int countStrings(String o, String s)
	{
		int counter = 0;
		int find = findString(o, s, 0);
		while (find != -1)
		{
			o = o.substring(0, find) + o.substring(find + 1); //because it's inclusive
			find = findString(o, s, 0);
			counter += 1;
		}
		return counter;
	}
	
	/**
 	* Replace all instances of underscores in the line given by
 	* line with italics tags.  There must be an even number of underscores
 	* in the line, and they will be replaced by <I>, </I>, alternating.
 	* @param string line a string with 0 or more underscores
 	* @return line: underscores replaced w/ <I> </I> or original  if odd num of _'s.
 	*/
 	
 	public static String convertItalics (String line)
	{
		int count = countStrings(line, "_"); //this count checks the instances of underscores
		//in the string
		int position = 0; //this count checks the position of the underscore for <i> vs. <\i>
		int index = 0;
		if (count % 2 == 0)
		{
			while (count > 0)
			{
				int traverser = findString(line, "_", index); //finds first instance of underscore
				
				if(line.charAt(traverser) == '_' && line.charAt(traverser + 1) != '_')
				{
					if (position % 2 == 0)
					{
						line = line.substring(0, traverser) + "<I>" + line.substring(traverser + 1);
						count -= 1;
						position += 1;
						index = traverser + 1;
					}
					else
					{
						line = line.substring(0, traverser) + "</I>" + line.substring(traverser + 1);
						count -= 1;
						position += 1;
						index = traverser + 1;
					}
				}
				else if (line.charAt(traverser) == '_' && line.charAt(traverser + 1) == '_')
				{
					count -= 2;
					index = traverser + 2;
				}
			}
		}
		return line;
	}
}	











