public class ParenthesisExtractor {
    public static void main(String[] args) {
        String input="xyz(abc)123";
        System.out.println(parenBit(input));
    }
    public static String parenBit(String str){
        // If the first character is not '(', remove it and check again
        if (str.charAt(0)!= '('){
            return parenBit(str.substring(1));

        }
        // If the last character is not ')', remove it and check again
        if (str.charAt(str.length()-1)!=')'){
            return parenBit(str.substring(0,str.length()-1));
        }
        // If the string starts with '(' and ends with ')', return the string as it is
        return str;
    }
}
