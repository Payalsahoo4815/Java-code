import java.util.Scanner;
public class EvenOddByBitwiseAnd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. to check even or odd");
		int n = sc.nextInt();
		//Bitwise AND
		if((n&1)==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
			
			
	}
}