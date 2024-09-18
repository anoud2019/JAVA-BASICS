public class array {
    public static void main(String[] args) {
        int[] numbers= {55,2,40,100,30,123};
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
