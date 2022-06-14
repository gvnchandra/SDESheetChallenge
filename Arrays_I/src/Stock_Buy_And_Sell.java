import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Buy_And_Sell {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> prices=new ArrayList<>();
        int n=s.nextInt();
        for (int i=0;i<n;i++){
            prices.add(s.nextInt());
        }
        System.out.println("Maximum profit is "+maximumProfit(prices));
    }
    public static int maximumProfit(ArrayList<Integer> prices){
        int min=Integer.MAX_VALUE, maxProfit=0;
        for (Integer price : prices) {
            min = Math.min(min, price);
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }
}
