public class LargestSubstring {
    public static void main(String[] args) {
        String input = "catcowcat";
        String sub = "cow";

        System.out.println(strDist(input, sub));
    }

    public static int strDist(String str, String sub) {
        if (!str.contains(sub)) {
            return 0;
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }
        // If the string starts and ends with the substring, return the length of the string
        return str.length();
    }
}
