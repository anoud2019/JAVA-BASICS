import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(swapEnds(new int[]{4,9,7})));
        System.out.println(Arrays.toString(swapEnds(new int[]{0,8})));
        System.out.println(Arrays.toString(swapEnds(new int[]{1})));
    }
    public static int[] swapEnds(int[] arr) {
        // Store the first element of the array in 'last'
        int last= arr[0];
        // Store the last element of the array in 'first'
        int first= arr[arr.length-1];
        // Assign the last element (stored in 'first') to the first position of the array
        arr[0]= first;
        // Assign the first element (stored in 'last') to the last position of the array
        arr[arr.length-1]= last;
        // Return the modified array
        return arr;
    }
}
