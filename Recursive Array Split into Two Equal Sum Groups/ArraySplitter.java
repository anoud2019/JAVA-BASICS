public class ArraySplitter {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3};
        System.out.println(splitHelp(nums));
    }

    public static boolean splitHelp(int[] nums) {
        return splitArray(0, nums, 0, 0);
    }

    public static boolean splitArray(int index, int[] nums, int sum1, int sum2) {

        if (index == nums.length) {
            return sum1 == sum2;
        }
        int currentNumber = nums[index];
        boolean arr1 = splitArray(index + 1, nums, sum1 + currentNumber, sum2);
        boolean arr2 = splitArray(index + 1, nums, sum1, sum2 + currentNumber);
        return arr1 || arr2;
    }
}
