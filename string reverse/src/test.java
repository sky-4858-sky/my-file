import java.lang.*;
import java.util.*;

class test
{
	public static void main(String[] args)
	{
		System.out.println(" enter a word. ");
		Scanner line = new Scanner(System.in);
		String str = line.nextLine();
		String reverse = "";

		for(int i = str.length() -1 ; i>=0; i--)
		{
			reverse= reverse + str.charAt(i);
		}

		
		int vCount = 0;
		str = str.toLowerCase();
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
						++vCount;
						
						
				}
			
		}
		System.out.println("no of vowels" + vCount);
		System.out.println(" the reversed word is :" + reverse);
	}
}