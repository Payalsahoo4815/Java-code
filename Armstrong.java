import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is Armstrong or not");
		int num = sc.nextInt();
		int num1 = num;
		double armnum = 0;
		while(num != 0)
		{
			armnum = armnum+Math.pow(num%10,3);
			num = num/10;
		}
		if(armnum==num1)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not  Armstrong");
			
	}
}