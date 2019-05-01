package JianZhiOffer.Q42;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 9:25
 */
public class FindMaxSumOfSubArray {
    public static Integer findMaxSumOfSubArray(int[] data) {
        if (data == null || data.length <= 0) return null;
        int length = data.length;
        int[] goal = new int[length];
        goal[0] = data[0];
        for (int i = 1; i < length; i++) {
            if (goal[i - 1] > 0) {
                goal[i] = goal[i - 1] + data[i];
            } else {
                goal[i] = data[i];
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (goal[i] >= ans) {
                ans = goal[i];
            }
        }
        return ans;
    }
}
