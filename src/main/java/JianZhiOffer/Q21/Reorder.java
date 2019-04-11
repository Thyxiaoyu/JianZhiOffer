package JianZhiOffer.Q21;

/**
 * @author ZXY
 * @create 2019-04-01 21:22
 * 老来多健忘，唯不忘相思
 */
public class Reorder {
    public int[] reorder(int[] nums,Judge judge) {
        if (nums == null || nums.length == 0) return null;
        int start = 0;
        int end = nums.length - 1;
        while (end > start) {
            if (!judge.judge(nums[start])) start++;
            if (judge.judge(nums[end])) end--;
            if (end > start && judge.judge(nums[start]) && !judge.judge(nums[end])) {
                int tem = nums[start];
                nums[start] = nums[end];
                nums[end] = tem;
            }
        }
        return nums;
    }
}
