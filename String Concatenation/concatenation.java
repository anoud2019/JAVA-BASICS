public class concatenation {
    public static void main(String[] args) {
        System.out.println(minCat("Hello","He"));
        System.out.println(minCat("Name","Ali"));
        System.out.println(minCat("Oman","Omar"));
    }


    public static String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if(aLength == bLength) {
         return a+" "+b;

        }else if (aLength > bLength) {
            int diff = aLength - bLength;
            a = a.substring(diff, aLength);


        }
        else {
            int diff = bLength - aLength;
            b = b.substring(diff, bLength);
        }
        return a+b;

    }
}
