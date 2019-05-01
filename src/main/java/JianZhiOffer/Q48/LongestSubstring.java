package JianZhiOffer.Q48;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 8:50
 */
public class LongestSubstring {
    public static Integer longestSubstring(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        char[] goal = str.toCharArray();
        int[] alp = new int[26];
        int last = 1;
//        int now = 0;
        alp[goal[0] - 'a'] = 1;
        int ans = 1;
        for (int i = 1; i < str.length(); i++) {
            int tem = goal[i] - 'a';
            if (alp[tem] == 0 || (i - alp[tem]) >= ans) {
                last++;
                ans = ans > last ? ans:last;
                alp[tem] = i + 1;
            } else {
                last = i - alp[tem] + 1;
                alp[tem] = i + 1;
                ans = ans > last ? ans:last;
            }
        }
        return ans;
    }
}
