import java.util.Scanner;
public class AgeCal
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your current age :");
int c_age = sc.nextInt();
int p_age = c_age-(c_age%10);
int n_age = c_age+(c_age/10);
System.out.println("The current age is "+c_age);
System.out.println("The previous age is "+p_age);
System.out.println("The next age is "+n_age);
}
}

