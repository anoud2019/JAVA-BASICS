public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1,3,7}));
        System.out.println(maxTriple(new int[]{5,4,2}));
        System.out.println(maxTriple(new int[]{1,9,3}));
        System.out.println(maxTriple(new int[]{1, 9, 3, 0, 5}));  // Output: 9
        System.out.println(maxTriple(new int[]{7}));
    }
    public static int maxTriple(int[] nums) {
        // If the array length is 1, return the only element
        if (nums.length == 1) return nums[0];
        // Find the largest among the first, middle, and last elements
        int largest = Math.max(nums[0], nums[nums.length - 1]);
        largest = Math.max(largest, nums[nums.length / 2]);
        return largest;  // Return the largest value as an int
    }
}
