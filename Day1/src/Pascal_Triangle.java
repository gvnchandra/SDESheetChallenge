import java.util.ArrayList;
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Long>> tri=new ArrayList<>();
        ArrayList<Long> row, preRow=null;

        for(int i=0;i<n;i++){
            row=new ArrayList<>();

            for(int j=0;j<=i;j++){
                // first and last elements should be '1' in any row in triangle
                if(j==0 || j==i)
                    row.add(1L);
                // otherwise below is the case
                else
                    row.add(preRow.get(j)+preRow.get(j-1));
            }
            preRow=row;
            tri.add(row);
        }

        System.out.println(tri);
        //Time: O(n^2) where n is the number of rows
    }
}
