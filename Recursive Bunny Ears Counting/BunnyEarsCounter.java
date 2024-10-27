public class BunnyEarsCounter {
    public static int countBunnyEars(int n) {
        // no bunnies
        if (n == 0) {
            return 0;
        }

        // Check if the current bunny is odd or even
        if (n % 2 == 1) { // Odd bunny
            return 2 + countBunnyEars(n - 1); // 2 ears for odd bunnies
        } else { // Even bunny
            return 3 + countBunnyEars(n - 1); // 3 ears for even bunnies
        }
    }

    public static void main(String[] args) {
        System.out.println(countBunnyEars(0));
        System.out.println(countBunnyEars(1));
        System.out.println(countBunnyEars(2));
        System.out.println(countBunnyEars(3));
        System.out.println(countBunnyEars(4));
    }
}
