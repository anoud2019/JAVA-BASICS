public class RoundNumbers {

    // Main method that calculates the sum of the rounded numbers
    public int roundSum(int a, int b, int c) {
        // Call the round10 helper method for each number and return their sum
        return round10(a) + round10(b) + round10(c);
    }

    // Helper method that rounds the number to the nearest multiple of 10
    public int round10(int num) {
        // Get the last digit of the number
        int rd = num % 10;

        // If the last digit is 5 or greater, round up
        if (rd >= 5)
            return num + 10 - rd;

        // If the last digit is less than 5, round down
        return num - rd;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        RoundNumbers rn = new RoundNumbers();

        // Test the solution with some examples
        System.out.println(rn.roundSum(16, 17, 18)); // Should print 60
        System.out.println(rn.roundSum(12, 13, 14)); // Should print 30
        System.out.println(rn.roundSum(6, 4, 4));    // Should print 10
    }
}
