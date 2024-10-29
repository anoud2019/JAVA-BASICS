public class TargetSumSelector {
    public static void main(String[] args) {
        int[] nums = {2, 5, 10, 4};
        int target = 12;
        int start = 0;
        System.out.println(groupNoAdj(start, nums, target));
    }

    public static boolean groupNoAdj(int s, int[] num, int t) {
        if (t == 0) {
            return true;
        }
        if (s >= num.length) {
            return false;
        }
        if (groupNoAdj(s + 2, num, t - num[s])) {
            return true;
        }
        return groupNoAdj(s + 1, num, t);
    }
}
