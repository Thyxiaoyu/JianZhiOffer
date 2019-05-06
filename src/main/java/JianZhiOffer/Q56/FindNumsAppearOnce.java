package JianZhiOffer.Q56;

import java.util.ArrayList;

/**
 * @author ThyXiaoyu
 * @create 2019-05-03 23:24
 */
//异或符号是“^”，与的符号是“&”，与 在if中要加括号。
public class FindNumsAppearOnce {
    public static void findNumsAppearOnce(int[] nums) {
        if (nums == null || nums.length <= 0) return;
        int tem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tem = tem ^ nums[i];
        }
        int indexBit = findFirstBitIs1(tem);
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int num : nums) {
            if (isBit1(num,indexBit)) {
                nums1.add(num);
            } else {
                nums2.add(num);
            }
        }
        int num1 = nums1.get(0);
        int num2 = nums2.get(0);
        for (int i = 1; i < nums1.size(); i++) {
            num1 = num1 ^ nums1.get(i);
        }
        for (int i = 1; i < nums2.size(); i++) {
            num2 = num2 ^ nums2.get(i);
        }
        System.out.println(num1);
        System.out.println(num2);
    }

    private static Integer findFirstBitIs1(int num) {
        int indexBit = 0;
        while ((num & 1) == 0 && indexBit < 8 * Integer.SIZE) {
            num = num >> 1;
            indexBit++;
        }
        return indexBit;
    }

    private static boolean isBit1(int num, int indexbit) {
        num = num >> indexbit;
        return (num & 1) == 1;
    }
}
