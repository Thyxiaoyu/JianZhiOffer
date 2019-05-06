package JianZhiOffer.Q59;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 14:59
 */
//ArrayList中的toString方法可以直接将集合中的数字打印成一个数组
//这道题的问题二，将数值和下标封装成一个简单的类存在队列中实现max函数功能
public class MaxInWindows {
    public static ArrayList<Integer> maxInWindows(int[] data, int k) {
        if (data == null || data.length < k || k <= 0) return null;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> tem = new ArrayDeque<>();
        tem.addLast(0);
        int indexNow = 1;
        while (indexNow < data.length) {
            if (indexNow >= k) {
                ans.add(data[tem.peekFirst()]);
            }
            while (!tem.isEmpty() && data[tem.peekLast()] <= data[indexNow]) {
                tem.removeLast();
            }
            tem.addLast(indexNow);
            if (indexNow - tem.peekFirst() >= k) tem.removeFirst();
            indexNow++;
        }
        if (indexNow >= k - 1) {
            ans.add(data[tem.peekFirst()]);
        }
        System.out.println(ans.toString());
        System.out.println(Arrays.toString(ans.toArray()));
        return ans;
    }
}
