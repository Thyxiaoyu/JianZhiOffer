package JianZhiOffer.Q10;

/**
 * @author ZXY
 * @create 2019-03-12 15:36
 */
public class Fibonacci {
    public static long fibonacci(int n) {
        long[] result = new long[n + 1];
        if (n < 2) return n;
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
                result[i] = result[i - 2] + result[i - 1];
        }
        return result[n];
    }
}
