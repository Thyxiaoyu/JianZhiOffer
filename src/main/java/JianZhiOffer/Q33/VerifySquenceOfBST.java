package JianZhiOffer.Q33;

import java.util.Arrays;

/**
 * @author ZXY
 * @create 2019-04-02 21:17
 * 老来多健忘，唯不忘相思
 */
public class VerifySquenceOfBST {
    public static boolean verifySquenceOfBST(int[] squence) {
        if (squence == null) return false;
        if (squence.length == 0 || squence.length == 1) return true;
        int length = squence.length;
        int root = squence[length - 1];
        int i =0;
        for (; i < length - 1; i++) {
            if (squence[i] > root) {
                break;
            }
        }
        int index = i;
        for (; i < length - 1; i++) {
            if (squence[i] < root) return false;
        }

        return verifySquenceOfBST(Arrays.copyOfRange(squence, 0, index)) &&
                verifySquenceOfBST(Arrays.copyOfRange(squence, index, length - 1));
    }
}
