public class TriangleBlockCounter {
    public static void main(String[] args) {
        System.out.println(countRowTriangle(0));
        System.out.println(countRowTriangle(1));
        System.out.println(countRowTriangle(2));
        System.out.println(countRowTriangle(3));
        System.out.println(countRowTriangle(4));
    }

    public static int countRowTriangle(int n) {
        // if there are no rows, return 0
        if (n == 0) {
            return 0;
        }
        // Recursively calculate the total number of blocks
        return n + countRowTriangle(n - 1);
    }
}
