import java.util.HashMap;
import java.util.Scanner;

public class Count_Subarrays_With_XOR_K {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        int k=s.nextInt();
        int xor=0, co=0;
        HashMap<Integer, Integer> has=new HashMap<>();
        for(int val:a){
            xor=xor^val;
            if(has.containsKey(xor^k))
                co+=has.get(xor^k);
            if (xor==k)
                co++;
            has.put(xor, has.getOrDefault(xor,0)+1);
        }

        System.out.println("Count of subarrays having xor as "+k+" is "+co);
    }
}
