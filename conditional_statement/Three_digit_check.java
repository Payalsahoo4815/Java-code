package conditional_statement;
import java.util.Scanner;
public class Three_digit_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if(n<1000 && n>99)
        {
            System.out.println("yes it is a three digit number");
        }
        else {
            System.out.println("no it is not a three digit number");
        }
   }
}
