import java.util.HashMap;
import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        String st=s.nextLine();
        HashMap<Character, Integer> has=new HashMap<>();
        int n=st.length();

        int l=0, len=0;
        for(int r=0;r<n;r++){
            if(has.containsKey(st.charAt(r))){
                l=Math.max(has.get(st.charAt(r))+1, l);
            }
            has.put(st.charAt(r),r);
            len=Math.max(len, r-l+1);
        }

        System.out.println(len);
    }
}
