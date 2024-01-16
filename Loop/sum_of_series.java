package Loop;
//1-2+3-4+5-6.....n
import java.util.Scanner;
public class sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which u want to perform the series operation");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            if(i%2 !=0){
                sum = sum+i;
                i++;
            }
            else{
                sum = sum-i;
                i++;
            }


        }
        System.out.println("sum of this series is "+sum);

    }
}
