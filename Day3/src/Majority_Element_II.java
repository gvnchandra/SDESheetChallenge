import java.util.ArrayList;
import java.util.Scanner;

public class Majority_Element_II {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), c1=0, c2=0, num1=-1, num2=-1, co1=0, co2=0;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        //boyer moore voting algorithm
        for(int val:arr){
            if(val==num1)
                c1++;
            else if(val==num2)
                c2++;
            else if(c1==0){
                num1=val;
                c1=1;
            }
            else if(c2==0){
                num2=val;
                c2=1;
            }
            else {
                c1--;
                c2--;
            }
        }

        for(int val:arr){
            if(val==num1)
                co1+=1;
            else if(val==num2)
                co2+=1;
        }

        // num1 and num2 must be checked to ensure that those are the majority elements
        ArrayList<Integer> res=new ArrayList<>();
        if(co1>n/3)
            res.add(num1);
        if(co2>n/3)
            res.add(num2);
        System.out.println("Majority elements are "+res);
    }
}
