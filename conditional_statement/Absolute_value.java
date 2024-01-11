package conditional_statement;
import java.util.Scanner;
public class Absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int n = sc.nextInt();
        if(n<0){
            n = n*(-1);
            System.out.println("The absolute value of the no. is "+n);
        }
        else{
            System.out.println("The absolute value of the no. is "+n);

        }

    }
}
