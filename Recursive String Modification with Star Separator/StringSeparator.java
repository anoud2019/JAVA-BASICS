public class StringSeparator {
    public static void main(String[] args) {
        String input="Hello";
        System.out.println(allStar(input));
    }
    public static String allStar(String str){
        //  If the string length is 1 or 0, return it as is
        if (str.length()<=1){
            return str;
        }

        //Take the first character, add '*', and call allStar on the rest
        return str.charAt(0)+"*"+allStar(str.substring(1));
        }
}
