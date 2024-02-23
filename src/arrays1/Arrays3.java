package arrays1;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {

        int[] arrs = new int[3];
        arrs[0] = 4;

        System.out.println(Arrays.toString(arrs));
         //                            длина
        String  [] str = new String[4];
      // индекс
        str [3] = "Zarina";
        str[2] = "Zamira";
        System.out.println(Arrays.toString(str));

         //      mnogomernye massivy
        int nums [] [] = new int[3][2];
         nums [0] [0] = 23;
         nums [0] [1] = 23;
         nums [1] [0] = 25;
         nums [1] [1] = 26;
         nums [2] [1] = 28;

        System.out.println(Arrays.deepToString(nums));


    }
}
