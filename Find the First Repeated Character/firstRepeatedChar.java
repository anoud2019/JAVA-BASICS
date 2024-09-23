import java.util.HashSet;

public class firstRepeatedChar {
    public static void main(String[] args) {
        String input = "Alanoud said AlGhadani";
        System.out.println(firstRepeaterChar(input));
    }

    public static Character firstRepeaterChar(String input) {
        HashSet<Character> letters = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (letters.contains(c)) {
                return c;
            }
            letters.add(c);
        }
        return null;
    }

}
