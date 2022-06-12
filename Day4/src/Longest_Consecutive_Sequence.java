import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }


        Set<Integer> has= new HashSet<>();
        for (int i=0;i<n;i++){
            has.add(a[i]);
        }

        int maxCount=0;
        for(int val:a){
            //checking if the previous element exists in Hashmap
            //because we are trying to find the minimum element in the sequence
            if(!has.contains(val-1)){
                int curr=1, currNum=val+1;
                while(has.contains(currNum)) {
                    curr++;
                    currNum++;
                }
                maxCount=Math.max(maxCount, curr);
            }
        }

        System.out.println("Longest Consecutive Sequence is "+maxCount);
    }
}
