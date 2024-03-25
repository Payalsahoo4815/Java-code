import java.util.Scanner;
public class Factor
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print its Factor:");
		int num = sc.nextInt();
		System.out.print(" factors are : ");
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
		
	}
}