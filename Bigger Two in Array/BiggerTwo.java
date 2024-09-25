import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{1, 3})));  // Output: [1, 3]
        System.out.println(Arrays.toString(biggerTwo(new int[]{2, 5}, new int[]{1, 3})));  // Output: [2, 5]
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{1, 2})));  // Output: [1, 2]
    }
    public static int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];  // Calculate the sum of the first array
        int bSum = b[0] + b[1];  // Calculate the sum of the second array

        // Return the appropriate array based on the sums
        if (aSum >= bSum) {
            return a;  // Return a if it has a larger or equal sum
        }
        return b;      // Return b if it has a larger sum
    }
}
