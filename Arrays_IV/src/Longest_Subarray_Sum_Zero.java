import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subarray_Sum_Zero {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        //naive approach
        //generate all subarrays and check for sum zero

        //method2
        int sum=0, len=0;
        HashMap<Integer, Integer> has=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==0){
                len=i+1;
            }
            if(has.containsKey(sum)){
                len=Math.max(len, i-has.get(sum));
            }
            else {
                has.put(sum, i);
            }
        }

        System.out.println("Length is "+len);
    }
}
