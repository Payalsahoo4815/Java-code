import java.util.Scanner;
public class Reverse3
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String s = sc.next();
		System.out.println("Original String : "+s);
		String rev = " ";
		for (int i = s.length()-1;i>=0;i--)
		{
			rev = rev +s.charAt(i);
		}
		System.out.println("Reverse String is : "+rev);
		
	}
}