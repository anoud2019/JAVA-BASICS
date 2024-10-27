import java.util.Arrays; // Import the Arrays library
import java.util.HashMap;
import java.util.Map;

public class StringMatcher {
    public static void allSwap(String[] strings) {
        Map<Character, Integer> firstCharIndexMap = new HashMap<>();
        for (int i = 0; i< strings.length; i++) {
            char firstChar = strings[i].charAt(0); // Get the first character of the current string

            // Check if the first character is already in the map
            if (firstCharIndexMap.containsKey(firstChar)) {
                // If it exists, retrieve the corresponding index
                int previousIndex = firstCharIndexMap.get(firstChar);

                // Swap the strings
                String tempString = strings[i];
                strings[i] = strings[previousIndex];
                strings[previousIndex] = tempString;

                // Remove the character from the map after swapping
                firstCharIndexMap.remove(firstChar);
            } else {
                // If it doesn't exist, add the character and its index to the map
                firstCharIndexMap.put(firstChar, i);
            }
        }
    }

    public static void main(String[] args) {
        String[] strings = {"ax", "bx", "ay", "by", "ai", "aj"};
        allSwap(strings);
        System.out.println(Arrays.toString(strings));
    }
}
