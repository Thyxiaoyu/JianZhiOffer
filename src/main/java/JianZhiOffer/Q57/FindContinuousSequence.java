package JianZhiOffer.Q57;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 10:01
 */
public class FindContinuousSequence {
    public static void findContinuousSequence(int sum) {
        if (sum < 3) return;
        int start = 1;
        int end = 2;
        int tem = 3;
        int termi = (sum + 1) / 2;
        while (start < termi) {
            if (tem == sum) {
                for (int i = start; i <= end; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                end++;
                tem += end;
            } else if (tem < sum) {
                end++;
                tem += end;
            } else {
                tem -= start;
                start++;
            }
        }
    }
}
