import java.util.ArrayList;
import java.util.Scanner;

public class Kadanes_Algorithm {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        ArrayList<Integer> subArray=new ArrayList<>();
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        long maxc=a[0], maxg=a[0];
        /*According to the kadane's algorithm, the maximum sum subarray ending at the current index could be either of these
         [x] single element at that index or
         [m,x] x combined with the maximum sum subarray ending at the previous index
        */

        int st=0, end=0;
        for (int i=1;i<n;i++){
            if(a[i]<maxc+a[i])
                maxc=maxc+a[i];
            else {
                maxc = a[i];
                st=i;
            }
            if (maxc>maxg) {
                maxg = maxc;
                end=i;
            }
        }

        subArray.add(st);
        subArray.add(end);

        if(maxg<0)
            System.out.println("Maximum sum is 0");
        else {
            System.out.println("Maximum sum is " + maxg);
            System.out.println("Subarray range is "+subArray);
        }
    }
}
