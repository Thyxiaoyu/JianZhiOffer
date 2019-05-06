package JianZhiOffer.Q57;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 9:44
 */
public class FindNumbersWithSum {
    public static void findNumbersWithSum(int[] data, int sum) {
        if (data == null || data.length <= 0) return;
        int start = 0;
        int end = data.length - 1;
        while (start < end && data[start] + data[end] != sum) {
            if (data[start] + data[end] < sum) {
                start++;
            } else {
                end--;
            }
        }
        if (data[start] + data[end] == sum) {
            System.out.println("两个数字分别是：" + data[start] + "和" + data[end]);
        }
    }
}
