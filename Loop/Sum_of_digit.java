package Loop;
import java.util.Scanner;
public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int original =n;
        int r;
        int sum = 0;
        while(n>0){
             r =n%10;
             n = n/10;
             sum = sum+r;

        }
        System.out.println("sum of digit of "+original+" is "+sum);
    }
}
