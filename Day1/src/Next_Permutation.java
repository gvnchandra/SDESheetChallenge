import java.util.ArrayList;
import java.util.Scanner;

public class Next_Permutation {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> pe=new ArrayList<>();
        for (int i=0;i<n;i++){
            pe.add(s.nextInt());
        }
        System.out.println(nextPermutation(pe));
    }
    static ArrayList<Integer> nextPermutation(ArrayList<Integer> pe)
    {
        int n=pe.size();
        if(n==1){
            return pe;
        }
        int i=n-2;
        while(i>=0 && pe.get(i)>=pe.get(i+1)) i--;
        if(i>=0){
            int j=n-1;
            while(pe.get(j)<=pe.get(i)) j--;
            swap(pe, i,j);
        }
        reverse(pe, i+1, n-1);
        return pe;

    }
    static void swap(ArrayList<Integer> pe, int i, int j) {
        int tmp = pe.get(i);
        pe.set(i, pe.get(j));
        pe.set(j, tmp);
    }

    static void reverse(ArrayList<Integer> pe, int i, int j) {
        while(i < j) swap(pe, i++, j--);
    }
}
