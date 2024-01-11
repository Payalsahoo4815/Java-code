package conditional_statement;
import java.util.Scanner;
public class Divisible_by_5_or_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("This number is divisible by either 3 or 5");
        }
        else{
            System.out.println("This number neither divisible by 5 nor by 3");
        }
    }
}
