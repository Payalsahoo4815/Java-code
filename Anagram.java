import java.util.Scanner;
import java.util.Arrays;
public class Anagram
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string to check anagram or not.");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			char[] a1 = s1.toCharArray(); //String to char array
			char[] a2 = s2.toCharArray();
			Arrays.sort(a1);//sorting
			Arrays.sort(a2);
			boolean result = Arrays.equals(a1,a2);
			if(result)
				System.out.println("It is a Anagram");
			else
				System.out.println("It is not a Anagram");
				
		}
		else
			System.out.println("It is not  a Anagram");
	}
}