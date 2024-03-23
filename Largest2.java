import java.util.Scanner;
public class Largest2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int n1 = sc.nextInt();//20
		int n2 = sc.nextInt();//4
		int n3 = sc.nextInt();//56
		int l1,l2;
		l1 = n1>n2?n1:n2;//20>4,l1=20
		l2 = n3>l1?n3:l1;//56>20,l2=56
		System.out.println("Largest is : "+l2);
		
		

	}
}