import java.util.Scanner;
public class ArmstrongForN
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is Armstrong or not");
		int num = sc.nextInt();
		int num1 = num;
		int num2 = num;
		int d =0;
		double armnum = 0;
		while(num2 != 0)
		{
			num2 = num2/10;
			d++;
		}
		while(num != 0)
		{
			armnum = armnum+Math.pow(num%10,d);
			num = num/10;
		}
		if(armnum==num1)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not  Armstrong");
			
	}
}