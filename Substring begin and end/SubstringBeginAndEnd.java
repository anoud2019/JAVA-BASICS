public class SubstringBeginAndEnd {
    public static void main(String[] args) {
        System.out.println(wtihout2("HelloHe"));
        System.out.println(wtihout2("HelloHi"));
        System.out.println(wtihout2("Hi"));
    }
    public static String wtihout2(String str) {
        int length = str.length();
        if (length <2) {
            return str;
        }
        if (str.substring(0,2).equals(str.substring(str.length()-2))) {
            return str.substring(2);

        }

        return str;
    }
}
