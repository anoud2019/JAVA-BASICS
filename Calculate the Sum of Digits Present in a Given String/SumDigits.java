public class DigitsSummation {
    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("chocolate"));
    }
    public static int sumDigits(String s) {
        int sum = 0;
        for(char c : s.toCharArray()) {
            // If the character is a digit, convert it to its integer value and add to sum
            if(Character.isDigit(c)) {
                sum += Character.getNumericValue(c);// Converts char to int and adds to sum
            }
        }


        return sum;
    }
}
