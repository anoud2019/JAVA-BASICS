public class ClumpCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(arr)); // Output: 2
    }

    public static int countClumps(int[] arr) {
        int count = 0;
        boolean inClump = false;

        // Start loop from 1 to avoid accessing arr[-1]
        for (int i = 1; i < arr.length; i++) {
            // Check if current element is the same as the previous one
            if (arr[i] == arr[i - 1]) {
                // If not already in a clump, we found a new clump
                if (!inClump) {
                    count++;  // Increment clump count
                    inClump = true;  // Set flag to indicate we're in a clump
                }
            } else {
                // If elements are different, we're no longer in a clump
                inClump = false;
            }
        }

        return count;
    }
}
