public class ChocolatePackager {

    // Method to calculate the number of small bars to use
    public int makeChocolate(int small, int big, int goal) {
        // Calculate the maximum number of big bars we can use without exceeding the goal
        int bigBarsToUse = Math.min(goal / 5, big);

        // Calculate the remaining weight after using the big bars
        int remainingWeight = goal - (bigBarsToUse * 5);

        // Check if we have enough small bars to cover the remaining weight
        if (remainingWeight <= small) {
            return remainingWeight; // Return the remaining weight (number of small bars needed)
        } else {
            return -1; // It's not possible to make the exact weight
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        ChocolatePackager packager = new ChocolatePackager();

        // Test the solution with some examples
        System.out.println(packager.makeChocolate(4, 1, 9));
        System.out.println(packager.makeChocolate(4, 1, 10));
        System.out.println(packager.makeChocolate(4, 1, 7));
    }
}
