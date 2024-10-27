import java.util.HashMap;

public class SimpleDuplicateFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 4, 2, 5, 6, 2};
        HashMap<Integer, Integer> countMap = new HashMap<>();

        //  Count the occurrences of each number
        for (int number : numbers) {
            // If the number is already present, increment its count
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number) + 1);
            } else {
                // If not, add it to the map with a count of 1
                countMap.put(number, 1);
            }
        }

        System.out.println("Duplicate numbers:");
        int sumOfDistinctDuplicates = 0;

        for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int number = entry.getKey(); // Getting the number (the key)
            int count = entry.getValue(); // Getting how many times it appears (the value)

            // If the number is duplicated
            if (count > 1) {
                System.out.println("Number " + number + " appears " + count + " times");
                sumOfDistinctDuplicates += number; // Add the number to the sum only once
            }
        }
        System.out.println("Sum of distinct duplicate numbers: " + sumOfDistinctDuplicates);
    }
}
