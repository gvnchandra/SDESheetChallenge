import java.util.ArrayList;
import java.util.Scanner;

public class Rotate_Matrix_Clockwise {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> matrix) {
        int maxRow = matrix.size()- 1;
        int maxCol = matrix.get(0).size()- 1;
        int row = 0;
        int col = 0;

        while (row <maxRow && col <maxCol)
        {

            int previous = matrix.get(row+1).get(col);
            for (int i = col; i <= maxCol; i++)
            {
                int current = matrix.get(row).get(i);
                matrix.get(row).set(i, previous);
                previous = current;
            }
            row++;

            for (int i = row; i <= maxRow; i++)
            {
                int current = matrix.get(i).get(maxCol);
                matrix.get(i).set(maxCol, previous);
                previous = current;
            }
            maxCol--;


            for (int i = maxCol; i >= col; i--)
            {
                int current = matrix.get(maxRow).get(i);
                matrix.get(maxRow).set(i, previous);
                previous = current;
            }
            maxRow--;

            for (int i = maxRow; i >= row; i--)
            {
                int current = matrix.get(i).get(col);
                matrix.get(i).set(col, previous);
                previous = current;
            }
            col++;

        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(), c=s.nextInt();
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        for (int i=0;i<r;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for (int j=0;j<c;j++){
                row.add(s.nextInt());
            }
            mat.add(row);
        }

        rotateMatrix(mat);
        System.out.println(mat);
    }
}
