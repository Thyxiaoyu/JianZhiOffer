package JianZhiOffer.Q45;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 14:37
 */
public class PrintMinNumber {
    public static void printMinNumber(int[] nums) {
        if (nums == null || nums.length <= 0) return;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(String.valueOf(num));
        }
        arrayList.sort((o1, o2) -> {
            String strO1 = o1 + o2;
            String strO2 = o2 + o1;
            return strO1.compareTo(strO2);
        });
        for (String s : arrayList) {
            System.out.print(s);
        }
    }
}
