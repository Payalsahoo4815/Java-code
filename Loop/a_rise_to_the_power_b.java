package Loop;
import java.util.Scanner;
public class a_rise_to_the_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        int a = sc.nextInt();
        System.out.println("Enter the power ");
        int b = sc.nextInt();
        int ans=1;
        for(int i=1; i<=b ;i++){
            ans= ans *a;
        }
        System.out.println(a+"raise to the power "+b+" is "+ans);
    }
}
