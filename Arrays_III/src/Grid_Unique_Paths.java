import java.util.Scanner;

public class Grid_Unique_Paths {
    static int noOfPathsByRec(int r, int c, int m, int n){
        if(r==m-1 && c==n-1)
            return 1;
        if(r>=m || c>=n)
            return 0;
        return noOfPathsByRec(r, c+1, m, n)+noOfPathsByRec(r+1,c,m,n);
    }
    static int noOfPathsByDP(int[][] dp,int r, int c, int m, int n){
        if(r==m-1 && c==n-1)
            return 1;
        if(r>=m || c>=n)
            return 0;
        if(dp[r][c]!=-1)
            return dp[r][c];
        return dp[r][c]=noOfPathsByDP(dp, r+1,c,m,n)+noOfPathsByDP(dp,r,c+1,m,n);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt(), n=s.nextInt();


        //int st=0, en=0;

        //method 1
        //this can be solved by using recursion
        /*int co=noOfPathsByRec(st,en,m,n);*/
        // time complexity: exponential time
        //space: O(1)

        //method2
        //using Dynamic Programming solution
        /*int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int co=noOfPathsByDP(dp,st,en, m, n);*/
        //time: O(mxn)
        //space: O(mxn)

        //method3
        //using combinations
        int N=m+n-2, r=m-1; // or r=n-1
        int co=1;
        for(int i=1;i<=r;i++){
            co=co*(N-r+i)/i;
        }
        System.out.println("No.of ways is "+co);

        //time: O(m-1) or O(n-1)
        //space: O(1)
    }
}
