package arrays1;

import java.util.Arrays;

public class DebuggerArray {

    public static void main(String[] args) {

        int nums3[] = new int[]{22,33,45,67,89,54,1,478,44,2};
        System.out.println(Arrays.toString(nums3));
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));

        for (int i = 0; i < nums3.length / 2; i++) {
            int temp = nums3 [i];
            nums3 [i] = nums3 [nums3.length - i - 1];
            nums3[nums3.length - i - 1] = temp;
        }
        System.out.println(Arrays.binarySearch(nums3,33));

    }

}
