public class vowels {
    public static void main(String[] args) {
        String  str="Real madrid is the best club in the world";
        int vowelCount = 0;
        for (char c : str.toCharArray()) {

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(vowelCount);
    }
}
