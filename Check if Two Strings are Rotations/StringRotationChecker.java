public class StringRotationChecker {
    public static boolean areRotations(String str1, String str2) {
        // Check if lengths are equal, if not they can't be rotations
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself and check if str2 is a substring
        String combined = str1 + str1;
        return combined.contains(str2);
    }

    public static void main(String[] args) {
        // Test case 1: Rotations
        String str1 = "hello";
        String str2 = "llohe"; // This is a valid rotation of str1
        System.out.println("Are rotations: " + areRotations(str1, str2)); // Should print true

        // Test case 2: Not rotations
        String str3 = "hello";
        String str4 = "world"; // This is not a rotation of str3
        System.out.println("Are rotations: " + areRotations(str3, str4)); // Should print false
    }
}
