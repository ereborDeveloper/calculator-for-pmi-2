package lecture1.model;

public class Factorial {
    public static long factorial(byte n) {
        long res = 1;
        for (long i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}