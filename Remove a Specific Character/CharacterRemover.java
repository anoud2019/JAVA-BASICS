public class CharacterRemover {
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();  // To build the new string without the given character

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);  // Append the character if it's not the one to remove
            }
        }

        return result.toString();  // Convert StringBuilder to String and return it
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'l';
        System.out.println("After removal: " + removeCharacter(str, ch));  // Output: "heo word"
    }
}
