public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(powerN(3,1));
        System.out.println(powerN(3,2));
        System.out.println(powerN(3,3));
    }
    public static int powerN(int base,int n){
        // if n is 1, return base
        if (n==1){
            return base;
        }
        // multiply base with the result of powerN(base, n - 1)
        return base*powerN(base,n-1);
    }
}

