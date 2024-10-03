public class GStatusChecker {
    public static void main(String[] args) {
        System.out.println(happyGChecker("xxggxx"));
        System.out.println(happyGChecker("xxgxx"));
        System.out.println(happyGChecker("xxggyygxx"));
        System.out.println(happyGChecker("gggxxggg"));
        System.out.println(happyGChecker("g"));
    }

    public static boolean happyGChecker(String input) {
        // Loop through the string to check every 'g'
        for (int i = 0; i < input.length(); i++) {
            // If we find a 'g', check if it's happy
            if (input.charAt(i) == 'g') {
                // Check if the 'g' has a neighboring 'g' on the left or right
                if (!(i > 0 && input.charAt(i - 1) == 'g') && !(i < input.length() - 1 && input.charAt(i + 1) == 'g')) {
                    // If it doesn't have a neighboring 'g', it's not happy
                    return false;
                }
            }
        }
        // If we loop through the entire string and all 'g's are happy, return true
        return true;
    }

}
