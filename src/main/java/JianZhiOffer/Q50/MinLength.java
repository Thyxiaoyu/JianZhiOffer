package JianZhiOffer.Q50;

/**
 * @author ZXY
 * @create 2019-04-05 20:51
 * 老来多健忘，唯不忘相思
 */
public class MinLength {
    public static int minLength(int n, String str) {
        if (str == null || n <= 0) return 0;
        return minLengthCore(n, str, 0);
    }

    public static int minLengthCore(int n, String str, int index) {
        if (index >= n) return 0;
        if (index == n - 1) return 1;
        if (str.charAt(index) != str.charAt(index + 1)) {
            return minLengthCore(n, str, index + 2);
        }
        return 1 + minLengthCore(n, str, index + 1);
    }
}
