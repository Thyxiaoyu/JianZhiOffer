package JianZhiOffer.Q46;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 15:19
 */
public class GetTranslationCount {
    public static Integer getTranslationCount(int num) {
        if (num < 0) return null;
        char[] number = String.valueOf(num).toCharArray();
        int length = number.length;
        int[] ans = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            int count = 0;
            if (i < length -1) {
                count = ans[i + 1];
            } else {
                count = 1;
            }
            if (i < length -1) {
                int tem = (number[i] - '0') * 10 + (number[i + 1] - '0');
                if (tem >= 10 && tem <= 25) {
                    if (i < length -2) {
                        count += ans[i + 2];
                    } else {
                        count += 1;
                    }
                }
            }
            ans[i] = count;
        }
        return ans[0];
    }
}
