package JianZhiOffer.Q50;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 10:05
 */
public class FirstRepeatingChar {
    public static Character firstRepeatingChar(String str) {
        if (str == null || str.length() <= 0) return null;
        int[] goal = new int[256];
        char[] tem = str.toCharArray();
        for (char c : tem) {
            goal[c]++;
        }
        for (char c : tem) {
            if (goal[c] == 1) return c;
        }
        return null;
    }
}
