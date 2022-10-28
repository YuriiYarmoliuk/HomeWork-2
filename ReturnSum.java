package HW2;

public class ReturnSum {

    public static void main(String[] args) {

        int[] nums = {4, 10, -7, 29, -44, 12, -124};

        int total = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) {
                total += nums[i];
            }
        }
        System.out.println("Sum of all positive numbers = " + total);
    }
}