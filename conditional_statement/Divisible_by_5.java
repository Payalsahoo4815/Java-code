package conditional_statement;
import java.util.Scanner;
public class Divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("Number is not divisible by 5");
        }
    }
}
