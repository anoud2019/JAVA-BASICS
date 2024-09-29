public class MaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlok("hoopla"));
        System.out.println(maxBlok("abbcccddBBBxx"));
        System.out.println(maxBlok(""));

    }
    public static int maxBlok(String s) {

        int len = s.length();
        if (len==0)
            return 0;

        int max = 0;
        int current =1;

        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is the same as the previous one
            if (s.charAt(i) == s.charAt(i-1)) {
                current++;// Increment the size of the current block
            }
            else {
                // Update the maximum block size if the current block is larger
                max = Math.max(max, current);
                current = 1;// Reset the current block size to 1 for the new character
            }
        }
        // Return the maximum block size, considering the last block in the string
        return Math.max(max, current);
    }
}
