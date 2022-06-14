import java.util.Scanner;

public class Sort_An_Array_0s_1s_2s {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        //dutch national flag algorithm
        int l=0, m=0, h=a.length-1;

        while(m<=h){
            if(a[m]==0){
               swap(a,l,m);
               l++;
               m++;
            }
            else if(a[m]==1){
                m++;
            }
            else {
                swap(a, m,h);
               h--;
            }
        }

        for(int val:a){
            System.out.print(val+" ");
        }
    }
    static void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
