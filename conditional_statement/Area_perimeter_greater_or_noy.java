package conditional_statement;
import java.util.Scanner;
public class Area_perimeter_greater_or_noy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breadth");
        int b= sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if(area>perimeter){
            System.out.println("Area is greater than it's perimeter");
        }
        else if(area==perimeter){
            System.out.println("Area is equal to perimeter ");
        }
        else{
            System.out.println("Perimeter is graeter than it's area");
        }
    }
}
