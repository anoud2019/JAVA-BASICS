public class TeenSumCalculator {

    // Main method that returns the sum of the three values with teen rules applied
    public int noTeenSum(int a, int b, int c) {
        // Apply the fixTeen helper method to each number and return their sum
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    // Helper method that fixes the number according to the teen rule
    public int fixTeen(int n) {
        // Check if the number is in the teen range (between 13 and 19)
        if (n >= 13 && n <= 19) {
            // If it's 15 or 16, return the number itself
            if (n == 15 || n == 16) {
                return n;
            }
            // Otherwise, for other teen numbers, return 0
            return 0;
        } else {
            // If the number is not in the teen range, return the number as is
            return n;
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        TeenSumCalculator calculator = new TeenSumCalculator();

        System.out.println(calculator.noTeenSum(1, 2, 3));
        System.out.println(calculator.noTeenSum(2, 13, 1));
        System.out.println(calculator.noTeenSum(2, 1, 14));
    }
}
