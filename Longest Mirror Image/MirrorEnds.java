public class MirrorEnds {
    public static void main(String[] args) {
        System.out.println(getMirrorEnds("abXYZba")); // Output: "ab"
        System.out.println(getMirrorEnds("abca"));    // Output: "a"
        System.out.println(getMirrorEnds("aba"));
        System.out.println(getMirrorEnds("abba")); // Output: "abab"


    }
    public static String getMirrorEnds(String str) {
        String result = "";// Using a normal string to store the result
        for (int i = 0; i < str.length(); i++) {
            // Check if the characters match from both ends
            if (str.charAt(i) == str.charAt(str.length() - i-1)) {
                // Append the matching character to the result
                result += str.charAt(i);
            }
            else {
                break;// Exit the loop if they don't match
            }
        }
        return result;// Return the resulting string
    }
}
