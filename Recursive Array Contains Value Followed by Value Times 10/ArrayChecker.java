public class ArrayChecker {
    public static void main(String[] args) {
        int[] nums={3,30,4};
        System.out.println(array220(nums,0)); // Start from index 0

    }
    public static boolean array220(int[] nums,int index){
        // If fewer than 2 elements remain, return false
        if (index>=nums.length-1){
        return false;}
        // Check if the current element is followed by itself * 10
        if (nums[index]*10==nums[index+1]){
            return true;


        }
        // Recursively check the next index
        return array220(nums,index+1);
    }
}
