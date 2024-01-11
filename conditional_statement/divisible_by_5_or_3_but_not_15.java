package conditional_statement;
import java.util.Scanner;
public class divisible_by_5_or_3_but_not_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%15!=0 && (n%3==0 || n%5==0)){
            System.out.println("This number is divisible by either 5 or 3 but not by 15");
        }
        else{
            System.out.println("not statisfied the condition");
        }

    }
}
