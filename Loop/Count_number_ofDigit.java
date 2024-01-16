package Loop;
import java.util.Scanner;
public class Count_number_ofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num_of_digit = 0;
        while(n>0){
            n = n/10;
            num_of_digit++;
        }
        System.out.println("your entered number having " +num_of_digit+" digit");
    }
}
