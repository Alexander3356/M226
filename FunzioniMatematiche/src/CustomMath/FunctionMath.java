package CustomMath;

public class FunctionMath {

    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            x *= -1;
            return x;
        }
    }

    public static double abs(double x){
        if (x >= 0) {
            return x;
        } else {
            x *= -1;
            return x;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }


}
