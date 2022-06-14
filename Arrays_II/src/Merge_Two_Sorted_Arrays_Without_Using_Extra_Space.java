import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Sorted_Arrays_Without_Using_Extra_Space {
    static void merge(int[] a1, int[] a2, int m, int n){
        for(int i=n-1;i>=0;i--){
            int last=a1[m-1];
            int j;
            for(j=m-2;j>=0 && a1[j]>a2[i];j--) {
                a1[j+1]=a1[j];
            }
            if(j!=m-2 || last>a2[i]){
                a1[j+1]=a2[i];
                a2[i]=last;
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt(), n=s.nextInt();
        int[] a1=new int[m],a2=new int[n];
        for(int i=0;i<m;i++){
            a1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            a2[i]=s.nextInt();
        }

        //using extra space
        /*int[] merg=new int[m+n];
        for(int i=0;i<m;i++){
            merg[i]=a1[i];
        }
        for(int j=0;j<n;j++){
            merg[m+j]=a2[j];
        }
        Arrays.sort(merg);
        for(int i=0;i<m+n;i++){
            System.out.print(merg[i]+" ");
        }*/

        //without using extra space
        merge(a1,a2,m,n);
        for(int i=0;i<m;i++){
            System.out.print(a1[i]+" ");
        }
        for(int i=0;i<n;i++){
            System.out.print(a2[i]+" ");
        }

    }
}
