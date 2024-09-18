public class EvenNumbersAndDays {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
//looping through switch
        for (int j = 1; j <= 7; j++) {
//using switch ...
            switch (j) {
                case 1:
                    System.out.println(j + " :Sunday");
                    break;
                case 2:
                    System.out.println(j + " : Monday");
                    break;
                case 3:
                    System.out.println(j + " :Tuesday");
                    break;
                case 4:
                    System.out.println(j + " :Wednesday");
                    break;
                case 5:
                    System.out.println(j + " :Thursday");
                    break;
                case 6:
                    System.out.println(j + " :Friday");
                    break;
                case 7:
                    System.out.println(j + " :Saturday");
                    break;
                default:
                    System.out.println("Invalid day number");
            }
        }
    }
}
