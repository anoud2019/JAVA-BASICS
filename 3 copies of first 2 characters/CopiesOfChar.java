public class CopiesOfChar {
    public static void main(String[] args) {
        System.out.println(extraFornt("welcome"));
        System.out.println(extraFornt("were"));
        System.out.println(extraFornt("we"));
        System.out.println(extraFornt("w"));
    }
    public static String extraFornt(String str) {
        String copies = "";
        if (str.length() == 1) {
            copies =str+str+str;
            return copies;
        }
        if (str.length() >=2) {
            String newWord=str.substring(0,2);
            {
                copies=newWord+newWord+newWord;
                return copies;
            }
        }
        return copies;
    }
}
