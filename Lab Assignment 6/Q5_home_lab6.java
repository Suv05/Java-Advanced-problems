public class Q5_home_lab6 {
    public static boolean areConsecutive(int num1, int num2, int num3) {
        // sort the numbers in ascending order
        int[] nums = { num1, num2, num3 };
        Arrays.sort(nums);

        // check if the numbers are consecutive
        return nums[0] + 1 == nums[1] && nums[1] + 1 == nums[2];
    }
    int num1 = 5;
    int num2 = 6;
    int num3 = 7;

    boolean result = areConsecutive(num1, num2, num3);
System.out.println(result); // prints true

}
