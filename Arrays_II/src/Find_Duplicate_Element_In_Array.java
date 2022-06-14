import java.util.Scanner;

public class Find_Duplicate_Element_In_Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        //met1
        /*int mis=-1;
        for(int i=0;i<n;i++){
            int val=Math.abs(arr[i]);
            if(arr[val-1]<0)
                mis=val;
            else
                arr[val-1]=-arr[val-1];
        }
        System.out.println("Duplicate element is "+mis);*/

        //met2 (Linked list Cycle method)
        int sl=arr[0], fa=arr[0];
        do{
            sl=arr[sl];
            fa=arr[arr[fa]];
        }
        while (sl!=fa);
        fa=arr[0];
        while(sl!=fa){
            sl=arr[sl];
            fa=arr[fa];
        }
        System.out.println("Duplicate element is "+sl);
    }
}
