public class CommonEndArray {
    public static void main(String[] args) {
        System.out.println(commonEnd(new int[]{1,2,3},new int[]{1,3,4}));
        System.out.println(commonEnd(new int[]{2,3,4},new int[]{4,3,2}));
        System.out.println(commonEnd(new int[]{4,9,0},new int[]{2,3,1}));
        System.out.println(commonEnd(new int[]{0,3,2},new int[]{2,0,3}));
        System.out.println(commonEnd(new int[]{1,2,4},new int[]{1,3,4}));
    }
    public static boolean  commonEnd(int[] a, int[] b) {
        // Check if the first element of both arrays is the same OR
        // Check if the last element of both arrays is the same
        return a[0] == b[0] ||a[a.length - 1] == b[a.length - 1];

    }

}
