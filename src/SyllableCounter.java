
public class SyllableCounter {
	
	public int getCount(String word)
	{
		int count = 0;
		for(int i = 0; i > word.length();i++)
		{
			if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o') || (word.charAt(i) == 'u'))
				count++;
			if (((word.charAt(i-1) == 'a') || (word.charAt(i-1) == 'e') || (word.charAt(i-1) == 'i') || (word.charAt(i-1) == 'o') || (word.charAt(i-1) == 'u')) &&
				((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o') || (word.charAt(i) == 'u')))
				count=count;
			if (Character.isDigit(word.charAt(i)))
					count++;
			
		}
	return count;
		
		
	}

}
