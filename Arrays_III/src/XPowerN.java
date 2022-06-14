import java.util.Scanner;

public class XPowerN {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int a=s.nextInt(), b=s.nextInt(), m=s.nextInt();
        long x=a, n=b, ans=1;
        while(n>0){
            if(n%2==0){
                x=(x*x)%m;
                n=n/2;
            }
            else{
                n-=1;
                ans=(ans*x)%m;
            }
        }

        System.out.println(a+" power "+b+" is "+ans);
    }
}
