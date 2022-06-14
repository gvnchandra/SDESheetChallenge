import java.util.Scanner;

public class Missing_And_Repeating_Number {
    public static int[] missingAndRepeating(int[] arr, int n) {

        int[] res = new int[2];

         /* Will hold xor of all elements
       and numbers from 1 to n  */
        int xor1;

        /* Will have only single set bit of xor1 */
        int set_bit_no, x, y;

        int i;
        x = 0;
        y = 0;

        xor1 = arr[0];

        /* Get the xor of all array elements  */
        for (i = 1; i < n; i++)
            xor1 = xor1 ^ arr[i];

        /* XOR the previous result with numbers from
       1 to n*/
        for (i = 1; i <= n; i++)
            xor1 = xor1 ^ i;

        /* Get the rightmost set bit in set_bit_no */
        set_bit_no = xor1 & -xor1;

        /* Now divide elements into two sets by comparing
    rightmost set bit of xor1 with the bit at the same
    position in each element. Also, get XORs of two
    sets. The two XORs are the output elements. The
    following two for loops serve the purpose */

        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0)
                x = x ^ arr[i];

            else
                y = y ^ arr[i];
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0)
                x = x ^ i;

            else
                y = y ^ i;
        }


        /* *x and *y hold the desired output elements */


        boolean u = false, v = false;
        for (i = 0; i < n; i++) {
            if (arr[i] == x)
                u = true;
            else if (arr[i] == y)
                v = true;
        }

        if (!u) {
            res[0] = x;
            res[1] = y;
        } else {
            res[0] = y;
            res[1] = x;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] res = missingAndRepeating(arr, n);
        System.out.println("Missing is " + res[0] + " and Repeating number is " + res[1]);
    }
}
