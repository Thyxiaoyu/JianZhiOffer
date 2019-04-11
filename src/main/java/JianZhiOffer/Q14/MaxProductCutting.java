package JianZhiOffer.Q14;

/**
 * @author ZXY
 * @create 2019-03-12 22:33
 * 老来多健忘，唯不忘相思
 */
public class MaxProductCutting {
    public static int maxProduct(int length) {
        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;
        int max = 0;
        int time = length /3;
        int re = length % 3;
        if (re == 0) {
            max = (int) Math.pow((double) 3,(double) time);
        } else if (re == 1) {
            max = (int) Math.pow((double) 3,(double) time -1) * 4;
        } else {
            max = (int) Math.pow((double) 3,(double) time) * 2;
        }
        return max;
    }
}
