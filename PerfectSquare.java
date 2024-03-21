import java.util.Scanner;
public class PerfectSquare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for perfect square or not");
		int n = sc.nextInt();
		double sqrt = Math.sqrt(n);
		System.out.println("Square root of the given no. is "+sqrt);
		double fsqrt = Math.floor(sqrt);
		System.out.println("floor Square root of the given no. is "+fsqrt);
		System.out.println("------------OUTPUT----------");
		if(sqrt-fsqrt==0)
			System.out.println("Given no. is a perfect square no.");
		else
			System.out.println("Given no. is not a perfect square no.");

	}
}