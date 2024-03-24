import java.util.Scanner;
public class Reverse2
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println("----------OUTPUT-----------");
		System.out.println("The number is : "+n);
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer rev = sb.reverse();
		System.out.println("After reverse the no. is : "+rev);
		
	}
}