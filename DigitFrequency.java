import java.util.Scanner;
public class DigitFrequency
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int d;
		String s = String.valueOf(num);
		int []arr = new int [10];
		for(int i = 0;i<s.length();i++)
		{
			d = Integer.parseInt(String.valueOf(s.charAt(i)));
			arr[d]++;
		
		}
		for (int j = 0;j<10;j++)
		{
			System.out.print(arr[j]+"-");
		}
		int max = arr[0];
		int pos = 0;
		for(int j=0;j<9;j++)
		{
			if(arr[j+1]>max)
			{
				max = arr[j+1];
				pos = j+1;
			}
		}
		System.out.println();
		System.out.println("Most Frequent number is :"+pos);
	}
}