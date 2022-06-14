import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Pairs {
    static int merge(int[] arr, int l, int m, int h){
        int i, j=m+1, co=0;
        for(i=l;i<=m;i++) {
            while (j <= h && arr[i] > 2 * arr[j]) {
                j++;
            }
            co+=(j-(m+1));
        }

        ArrayList<Integer> temp=new ArrayList<>();
        int left=l, right=m+1;
        while(left<=m && right<=h){
            if(arr[left]<arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        while (left<=m){
            temp.add(arr[left++]);
        }

        while(right<=h){
            temp.add(arr[right++]);
        }

        for(int k=l;k<=h;k++){
            arr[k]=temp.get(k-l);
        }

        return co;
    }
    static int mergeSort(int[] arr, int l, int h){
        //using merge sort
        if(l>=h)
            return 0;

        int mid=l+(h-l)/2;
        int co=mergeSort(arr,l,mid);
        co+=mergeSort(arr, mid+1,h);
        co+=merge(arr, l, mid, h);

        return co;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int co;

        //brute force approach
        /*for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j])
                    co+=1;
            }
        }*/

        //method2
        //merge sort
        int l=0, h=arr.length-1;
        co= mergeSort(arr,l,h);
        System.out.println(co);
    }
}
