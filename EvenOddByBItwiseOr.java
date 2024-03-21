import java.util.Scanner;
public class EvenOddByBitwiseOr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. to check even or odd");
		int n = sc.nextInt();
		//Bitwise OR
		if((n|1)>n)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
			
			
	}
}