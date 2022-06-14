import java.util.Scanner;

public class Count_Inversions {
    static long merge(long[] a, int l, int m, int r){
        long c=0;
        int n1=m-l+1;
        int n2=r-m;
        long[] lhalf=new long[n1];
        long[] rhalf=new long[n2];
        //coping data to array 1
        for(int i=0;i<n1;i++){
            lhalf[i]=a[l+i];
        }
        //copying data to array 2
        for(int j=0;j<n2;j++){
            rhalf[j]=a[m+1+j];
        }
        int i=0,j=0, k=l;
        while (i<n1 && j<n2){
            if(lhalf[i]<=rhalf[j]){
                a[k]=lhalf[i];
                i++;
            }
            else {
                c+=n1-i;
                a[k]=rhalf[j];
                j++;
            }
            k++;
        }

        // if any pending elements in left half
        while(i<n1){
            a[k]=lhalf[i];
            i++;
            k++;
        }
        //pending elements in right half
        while(j<n2){
            a[k]=rhalf[j];
            j++;
            k++;
        }
        return c;
    }
    static long sort(long[] a, int l,int r){
        long c=0;
        if(l<r){
            int m=l+(r-l)/2;
            //sort the first half
            c+=sort(a, l,m);
            //sort the second half
            c+=sort(a,m+1,r);

            //merging both arrays
            c+=merge(a,l,m,r);
        }
        return c;
    }
    static long inversionCount(long a[], long n)
    {
        int l=0, r=(int)n-1;
        return sort(a,l,r);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        System.out.println("No.of inversions is "+inversionCount(arr,n));
        //time: O(nlogn)
        //space : O(n)
    }
}
