import java.util.Scanner;
public class Leapyear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check leap year  : ");
		int year = sc.nextInt();
		boolean leap = false;
		if(year%4==0)
		{	
			if(year%100==0)//Checking for century year
			{
				if(year%400==0)
					leap =  true;
				else
					leap = false;
			}
			else
				leap = true; //making leap year true for non century years.
		}
		if(leap)
			System.out.println(year+" is a leap year ");
		else
			System.out.println(year+" is not a leap year ");
			
			
	}
}