package JianZhiOffer.Q39;

import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @author ZXY
 * @create 2019-04-03 17:20
 * 老来多健忘，唯不忘相思
 */
public class MoreThanHalfNum {
    public static Integer moreThanHalfNum(int[] nums) {
        if (nums == null || nums.length <= 0) return null;
        int ans = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                ans = num;
                count = 1;
                continue;
            }
            if (ans == num) {
                count++;
            } else {
                count--;
            }
        }
        if (isMoreThanHalf(nums,ans)) {
            return ans;
        }
        return null;
    }


    private static boolean isMoreThanHalf(int[] nums, int number) {
        int times = 0;
        for (int num : nums) {
           if (num == number) {
               times++;
           }
        }
        return times * 2 > nums.length;
    }
}
