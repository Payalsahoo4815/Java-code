package conditional_statement;
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int mark = sc.nextInt();
        if(mark>90){
            System.out.println("Excellent");
        }
        else if(mark>80){
            System.out.println("very good");
        }
        else if(mark>70){
            System.out.println("Good");
        }
        else if(mark>60){
            System.out.println("Can do better");
        }
        else if(mark>50){
            System.out.println("Average");
        }
        else if(mark>40){
            System.out.println("Below average");
        }
        else {
            System.out.println("Fail");
        }
    }
}
