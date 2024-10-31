public class SumGroupChecker {
    public static void main(String[] args) {
        int[] nums = {2, 5, 10, 4};
        int target = 19;
        System.out.println(groupSum5(0, nums, target));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        }
        if (start >= nums.length) {
            return false;
        }

        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            } else {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }

        boolean includeCurrent = groupSum5(start + 1, nums, target - nums[start]);
        boolean excludeCurrent = groupSum5(start + 1, nums, target);
        return includeCurrent || excludeCurrent;
    }
}
