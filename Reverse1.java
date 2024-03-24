import java.util.Scanner;
public class Reverse1
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println("----------OUTPUT-----------");
		System.out.println("The number is : "+n);
		int rev = 0;
		while(n>0)
		{
			rev = (rev*10)+(n%10);
			n = n/10;
		}
		System.out.println("After reverse the no. is : "+rev);
		
	}
}