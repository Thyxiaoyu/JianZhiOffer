package JianZhiOffer.Q66;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 21:55
 */
public class Multiply {
    public static void multiply(int[] nums) {
        if (nums == null || nums.length <= 0) return;
        int length = nums.length;
        int[] ans = new int[length];
        int[] tem1 = new int[length];
        int[] tem2 = new int[length];
        tem1[0] = 1;
        for (int i = 1; i < length; i++) {
            tem1[i] = tem1[i - 1] * nums[i - 1];
        }
        tem2[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            tem2[i] = tem2[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < length; i++) {
            ans[i] = tem1[i] * tem2[i];
            System.out.print(ans[i] + " ");
        }
    }
}
