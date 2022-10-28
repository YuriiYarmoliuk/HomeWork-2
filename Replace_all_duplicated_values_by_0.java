package HW2;

import java.util.Arrays;

public class Replace_all_duplicated_values_by_0 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3, 1, 4, 2, 8, 3};

        int[] nums2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                    nums2[j] = nums[j];
                } else {
                    nums2[i] = nums[i];
                }
            }
        }
        System.out.println( Arrays.toString(nums));
    }
}