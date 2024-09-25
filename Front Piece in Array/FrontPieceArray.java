import java.util.Arrays;

public class FrontPieceArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(new int[]{3,7,5,9})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece(new int[]{2, 4})));
        System.out.println(Arrays.toString(frontPiece(new int[]{2})));
        System.out.println(Arrays.toString(frontPiece(new int[]{})));

    }
    public static int[] frontPiece(int[] a) {
        // Return the first two elements if the array has two or more elements
        if (a.length >= 2){
            return new int[]{a[0], a[1]};
        }
        // Return the array as is if it has less than 2 elements
        return a;
    }
}
