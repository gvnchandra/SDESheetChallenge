import java.util.Scanner;

public class Search_In_A_2D_Matrix {
    static boolean search(int[][] mat, int se){
        int m=mat.length, n=mat[0].length;
        int l=0, h=m*n-1;

        //can think of as 1d array because of the property that both rows and columns are sorted and
        // first element of each row is grater than the last element of previous row

        while (l<=h){
            int mid=(l+h)/2, r=mid/n, c=mid%n;
            if(mat[r][c]==se)
                return true;
            else if(se<mat[r][c])
                h=mid-1;
            else
                l=mid+1;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt(), n=s.nextInt();
        int[][] mat =new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int se=s.nextInt();
        if(search(mat, se))
            System.out.println("Element "+se+" is found");
        else
            System.out.println("Element "+se+" is not found");
    }
}
