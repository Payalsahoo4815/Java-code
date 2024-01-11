package conditional_statement;
import java.util.Scanner;
public class Profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price of an item ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price of this item");
        int sp = sc.nextInt();
        if(cp<sp){
            System.out.print("Your profit is");
            int profit = sp-cp;
            System.out.println(profit);
        }
        else{
            System.out.print("your loss is ");
            int loss;
            loss = cp-sp;
            System.out.println(loss);
        }

    }
}
