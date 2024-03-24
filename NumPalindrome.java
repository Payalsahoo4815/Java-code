import java.util.Scanner;
public class NumPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int n1 = n;
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10+n%10;
			n = n/10;
			
		}
		System.out.println("The original number is : "+n1);
		System.out.println("Reverse number is : "+rev);
		if(n1 == rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not a Palindrome");
		
		
	}
}