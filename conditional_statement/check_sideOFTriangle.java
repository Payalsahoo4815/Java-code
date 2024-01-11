package conditional_statement;
import java.util.Scanner;
public class check_sideOFTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int a = sc.nextInt();
        System.out.println("Enter the second side");
        int b = sc.nextInt();
        System.out.println("Enter the third side");
        int c = sc.nextInt();
        if (a+b>c && b+c>a && a+c>b){
            System.out.println("this is a triangle");
        }
        else{
            System.out.println("This is not satisfied the condition for a traingle");
        }
    }
}
