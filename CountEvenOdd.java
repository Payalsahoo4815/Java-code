import java.util.Scanner;
public class CountEvenOdd
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int count_even=0,count_odd=0;
		int sum_even=0,sum_odd=0;
		int rem = 0;
		while(n>0)
		{
			rem = n%10;
			if(rem%2==0)
			{
				sum_even = sum_even+rem;
				count_even++;
			}
			else
			{
				sum_odd=sum_odd+rem;
				count_odd++;
			}
			n = n/10;
		}
		System.out.println("Total no. of even in the given number : "+count_even);
		System.out.println("Total no. of odd in the given number : "+count_odd);
		System.out.println("Sum of all even digit : "+sum_even);
		System.out.println("Sum of all odd digit : "+sum_odd);
	}
}