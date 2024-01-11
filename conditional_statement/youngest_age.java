package conditional_statement;
import java.util.Scanner;
public class youngest_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ram's age: ");
        int ram = sc.nextInt();
        System.out.print("enter shyam's age: ");
        int shyam = sc.nextInt();
        System.out.print("enter ajay's age: ");
        int ajay = sc.nextInt();
        if (ram<shyam && ram<ajay){
            System.out.println("Ram is youngest having age "+ram);
        }
        else if (shyam<ram && shyam<ajay){
            System.out.println("Shyam is youngest having age "+shyam);
        }
        else{
            System.out.println("Ajay is youngest "+ajay);
        }

    }
}
