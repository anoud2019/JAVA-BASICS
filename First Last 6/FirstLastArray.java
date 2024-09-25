public class FirstLastArray {
    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1,2,6}));
        System.out.println(firstLast6(new int[]{6,1,2,3}));
        System.out.println(firstLast6(new int[]{13,6,1,2,3}));
        System.out.println(firstLast6(new int[]{3,1,2,3,0,6}));
        System.out.println(firstLast6(new int[]{1,2,3,4,5,7,9}));
    }
    public static boolean firstLast6(int[] numbers) {
        // Check if the first element or the last element is 6
       return numbers[0] == 6 || numbers[numbers.length -1]== 6;
    }
}
