package conditional_statement;
import java.util.Scanner;
public class Divisible_by_5_but_not_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        if (n%5==0 && n%3!=0){
            System.out.println("this number is divisible by 5 but not by 3");
        }
        else{
            System.out.println("This number is not satisfy the condition ");
        }
    }
}
