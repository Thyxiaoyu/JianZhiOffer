package JianZhiOffer.Q33;

import java.util.Arrays;

/**
 * @author ZXY
 * @create 2019-04-02 21:32
 * 老来多健忘，唯不忘相思
 */
public class Q33Solution {
    public static void main(String[] args) {
        int[] a = new int[]{5,7,6,9,11,10,8};
        int[] c = new int[]{7,4,6,5};
        int[] b = Arrays.copyOfRange(a, 0, 0);
//        System.out.println(Arrays.toString(b));
        System.out.println(VerifySquenceOfBST.verifySquenceOfBST(null));
    }
}
