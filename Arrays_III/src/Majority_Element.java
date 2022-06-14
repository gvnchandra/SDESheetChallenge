import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int co=0, ele=-1;
        for(int i=0;i<n;i++){
            if(co==0)
                ele=a[i];
            if(ele==a[i])
                co+=1;
            else
                co-=1;
        }

        co=0;
        for(int i=0;i<n;i++){
            if(a[i]==ele)
                co+=1;
        }
        if(co>n/2)
            System.out.println("Majority element is "+ele);
        else
            System.out.println("Not found");

    }
}
