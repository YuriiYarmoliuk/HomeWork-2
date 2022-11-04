package HW2;

public class AveragNumbers {

    public static void main(String[] args) {

        int[] nums = {4, 10, 7, 25, 15, 12};

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i] ;
        }
        double avarage = 0;
        for (int i = 0; i < nums.length; i++){
            avarage =(double) total / nums.length;
        }
        System.out.println("Avarage of a list of numbers = " +  avarage);
    }
}
