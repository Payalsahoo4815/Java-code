import java.util.Scanner;
public class EvenOddByBitwiseXor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. to check even or odd");
		int n = sc.nextInt();
		//Bitwise XOR
		if((n^1)==(n+1))
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
			
			
	}
}