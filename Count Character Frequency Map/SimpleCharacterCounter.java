import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase();  // Convert to lowercase

        HashMap<Character, Integer> vowelMap = new HashMap<>();
        HashMap<Character, Integer> consonantMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {  // Check if the character is alphabetic
                if ("aeiou".indexOf(ch) != -1) {
                    // If the vowel exists, increment its count; otherwise, set it to 1
                    if (vowelMap.containsKey(ch)) {
                        vowelMap.put(ch, vowelMap.get(ch) + 1);
                    } else {
                        vowelMap.put(ch, 1);
                    }
                } else {
                    // If the consonant exists, increment its count; otherwise, set it to 1
                    if (consonantMap.containsKey(ch)) {
                        consonantMap.put(ch, consonantMap.get(ch) + 1);
                    } else {
                        consonantMap.put(ch, 1);
                    }
                }
            }
        }

        // Display vowel frequencies
        System.out.println("Vowels:");
        for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Display consonant frequencies
        System.out.println("\nConsonants:");
        for (Map.Entry<Character, Integer> entry : consonantMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
