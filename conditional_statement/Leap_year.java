package conditional_statement;
import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check it is a leap year or not:");
        int yr = sc.nextInt();
        if(yr%4==0){
            System.out.println("THis year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year ");
        }
    }
}
