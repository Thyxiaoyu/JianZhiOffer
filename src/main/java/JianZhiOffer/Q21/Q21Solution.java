package JianZhiOffer.Q21;

import java.util.Arrays;

/**
 * @author ZXY
 * @create 2019-04-01 21:37
 * 老来多健忘，唯不忘相思
 */
public class Q21Solution {
    public static void main(String[] args) {
        int[] a = new int[]{39,41,14,24,34,44,54,3,1,5,7,9,37,35};
        System.out.println(Arrays.toString(new Reorder().reorder(a, new isEven())));
    }
}
