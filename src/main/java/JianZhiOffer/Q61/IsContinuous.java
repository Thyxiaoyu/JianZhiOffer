package JianZhiOffer.Q61;

import java.util.Arrays;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 18:04
 */
public class IsContinuous {
    public static boolean isContinuous(int[] nums) {
        if (nums == null || nums.length != 5) return false;
        Arrays.sort(nums);
        int numberOf0 = 0;
        int numberOfGap = 0;
        for (int num : nums) {
            if (num == 0) numberOf0++;
        }
        int start = numberOf0;
        int end = start + 1;
        while (end < nums.length) {
            if (nums[start] == nums[end]) return false;
            numberOfGap += nums[end] - nums[start] - 1;
            start = end++;
        }
        return numberOf0 >= numberOfGap;

    }
}
