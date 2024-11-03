public class GroupSumChecker {

    public static void main(String[] args) {
        int[] nums = {2, 4, 8};
        int start = 0;
        int target = 10;
        System.out.println(groupSumClump(start, nums, target)); // Expected output: true
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        }
        if (start >= nums.length) {
            return false;
        }

        int currentElement = nums[start];
        int i = start + 1;

        for (; i < nums.length && nums[i] == nums[start]; i++) {
            currentElement += nums[i];
        }

        boolean includeClump = groupSumClump(i, nums, target - currentElement);
        boolean excludeClump = groupSumClump(i, nums, target);

        return includeClump || excludeClump;
    }
}
