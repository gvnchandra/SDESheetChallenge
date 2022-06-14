import java.util.Scanner;

public class Set_Matrix_Zeroes {
    public static void setZeros(int[][] m) {
        int r=m.length, c=m[0].length;
        boolean col1=true;

        for(int i=0;i<r;i++){
            if(m[i][0]==0)
                col1=false;
            for(int j=1;j<c;j++){
                if(m[i][j]==0){
                    m[i][0]=0;
                    m[0][j]=0;
                }
            }
        }

        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=1;j--){
                if(m[i][0]==0 || m[0][j]==0)
                    m[i][j]=0;
            }
            if(!col1)
                m[i][0]=0;
        }


    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int r=s.nextInt(), c=s.nextInt();
        int [][] ma=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ma[i][j]=s.nextInt();
            }
        }

        //met1
        /*traverse elements from first to last and if zero found, then
         make all the elements along its row and column as -1 except zero if found
        lastly replace all -1's with zeroes.*/

        //met2
        /*Take two dummy arrays d1 and d2 where size of d1 is the no.of rows and d2's size is no.of columns
         traverse all the elements, if zero found then make corresponding dummy row and dummy column as zero
         */


        //most efficient method
        //making first row and first column acts as a dummy row and dummy column
        setZeros(ma);

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(ma[i][j]+" ");
            }
            System.out.println();
        }

        //Time: O(rxc)
        //Space: O(1)
    }
}
