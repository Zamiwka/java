package arrays1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class Arrays4 {
    public static void main(String[] args) {
        Example[] arr = {new Example(), new Example()};
        System.out.println(Arrays.toString(arr));
        int [] src = {1,2,3,4,7};
        int [] dest = new  int[src.length];
        for (int i = 0; i < dest.length; i++){
            dest[i] = src[i];

        }
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));

        // kopirovanie 2

        int[] dest2 = Arrays.copyOf(src,src.length);
        System.out.println(dest2);
        System.out.println(Arrays.toString(dest2));

        int[] dest3 = Arrays.copyOfRange(src, 1,6);
        System.out.println(Arrays.toString(dest3));

        int[] nums = new int[15];
        Arrays.fill(nums,8);
        System.out.println(Arrays.toString(nums));

        String[] words =new String[8];
        Arrays.fill(words,"New");
        System.out.println(Arrays.toString(words));

        String[] words2 = new String[8];
        Arrays.fill(words2,5, 8,"New");
        System.out.println(Arrays.toString(words2));





    }
}




