import java.util.Scanner;

public class StringRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Enter the string with characters to remove: ");
        String s2 = sc.nextLine();

        // Call the method and display the result
        String result=removeSubstring(s, s2);
        System.out.println("The string after removing: "+result );

        sc.close();
    }
    public static String removeSubstring(String s, String s2) {
        // Loop through each character of s2
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            // Check if the character exists in s
            while (s.contains(c+"")) {
                // If the character exists, remove it
                s = s.replace(c+"", "");
            }
        }
        return s;
    }
}
