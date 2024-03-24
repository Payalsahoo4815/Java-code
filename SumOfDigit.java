import java.util.Scanner;
public class SumOfDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		while(n>0)
		{
			sum = sum + (n%10);
			n = n/10;
			count++;
		}
		System.out.println("Total sum of digits: "+sum);
	}
}