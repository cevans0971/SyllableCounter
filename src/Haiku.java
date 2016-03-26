import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Haiku {
	SyllableCounter counter;
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
	 
		String l = null;
		String line = br.readLine();
		while(line != null)
		{
			l += line;
		}
		String[] lines = l.split("\n");
		for(int i = 0; i < lines.length; i++)
		{
			if(isHaiku(lines[i],lines[i+1],lines[i+2]))
			{
				System.out.println(lines[i]);
				System.out.println(lines[i+1]);
				System.out.println(lines[i+2]);

			}
				
		}
		
	}



public static boolean isHaiku(String line1, String line2, String line3) {
	int totalCount1 = 0;
	int totalCount2 = 0;
	int totalCount3 = 0;
	String[] one = line1.split(" ");
	String[] two = line2.split(" ");
	String[] three = line3.split(" ");
	for(int i = 0; i < one.length; i++)
	{
		totalCount1 += counter.getCount(one[i]);
	}
	for(int i = 0; i < one.length; i++)
	{
		totalCount2 += counter.getCount(two[i]);
	}
	for(int i = 0; i < one.length; i++)
	{
		totalCount3 += counter.getCount(three[i]);
	}
	if((totalCount1 != 5) || (totalCount2 != 7) || (totalCount3 != 5))
		return false;
	else return true;
}

}