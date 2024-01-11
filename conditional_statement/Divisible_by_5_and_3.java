package conditional_statement;
import java.util.Scanner;
public class Divisible_by_5_and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("This number is divisible by 5 and 3 both");
        }
        else{
            System.out.println("This number is not divisible by both");
        }
    }
}
