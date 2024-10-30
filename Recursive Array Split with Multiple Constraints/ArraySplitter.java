public class ArraySplitter {
    public static void main(String[] args) {
        int [] nums={2,4,2};
        System.out.println(split53(nums));
    }
    public static boolean split53(int[] nums){
        return canSplit(nums,0,0,0);
    }
    public static boolean  canSplit(int[] nums,int index,int sum1,int sum2){
        if (index==nums.length){
            return sum1==sum2;
        }
        if (nums[index]%5==0){
            return canSplit(nums, index+1, sum1+nums[index], sum2);

        } else if (nums[index]%3==0) {
            return canSplit(nums,index+1,sum1,sum2+nums[index]);

        }
        boolean group5=canSplit(nums, index+1, sum1+nums[index], sum2);
        boolean group3=canSplit(nums,index+1,sum1,sum2+nums[index]);
        return group5||group3;
    }
}
