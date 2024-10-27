import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class StringFirstSwapper {
    public static void main(String[] args) {
        String[] words = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println(Arrays.toString(firstSwap(words)));
    }

    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> firstOccurrence = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);  // Extract the first character.

            // If the character is already in the map and swap hasn't been disabled (-1).
            if (firstOccurrence.containsKey(firstChar)) {
                int swapIndex = firstOccurrence.get(firstChar);  // Get the stored index.

                if (swapIndex != -1) {  // If swap is allowed.
                    // Perform the swap.
                    String temp = strings[i];
                    strings[i] = strings[swapIndex];
                    strings[swapIndex] = temp;

                    // Disable further swaps for this character.
                    firstOccurrence.put(firstChar, -1);
                }
            } else {
                // If this is the first occurrence, store the index.
                firstOccurrence.put(firstChar, i);
            }
        }

        return strings;  // Return the modified array.
    }
}
