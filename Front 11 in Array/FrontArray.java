import java.util.Arrays;

public class FrontArray {
    public static void main(String[] args) {
        //Arrays.toString() converts the array into a readable format, displaying the elements clearly
        System.out.println(Arrays.toString(front11(new int[]{1,2,3},new int[]{3,2,1})));
        System.out.println(Arrays.toString(front11(new int[]{9,8},new int[]{2,7})));
        System.out.println(Arrays.toString(front11(new int[]{6,3,4,5},new int[]{})));
        System.out.println(Arrays.toString(front11(new int[]{},new int[]{4})));
        System.out.println(Arrays.toString(front11(new int[]{},new int[]{})));

    }
    public static int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[0];  // Return an empty array if both arrays are empty
        }
        if (a.length == 0) {
            return new int[]{b[0]};  // Return an array with the first element of b if a is empty
        }
        if (b.length == 0) {
            return new int[]{a[0]};  // Return an array with the first element of a if b is empty
        }
        // If both arrays have elements, return an array with the first elements of both a and b
        return new int[]{a[0], b[0]};
    }

}
