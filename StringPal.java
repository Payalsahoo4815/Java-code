import java.util.Scanner;

public class StringPal 
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s = sc.next();

        String rev = ""; // Initialize with an empty string
        for (int i = s.length() - 1; i >= 0; i--) 
		{
            rev = rev + s.charAt(i);
        }
        System.out.println("Original String : " + s);
        System.out.println("Reverse String is : " + rev);
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}