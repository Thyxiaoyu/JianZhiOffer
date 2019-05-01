package JianZhiOffer.Q49;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 9:23
 */
public class GetUglyNumber {
    public static Integer getUglyNumber(int index) {
        if (index <= 0) return null;
        if (index <= 2) return index;
        int m2 = 1;
        int m3 = 0;
        int m5 = 0;
        int[] goal = new int[index];
        goal[0] = 1;
        goal[1] = 2;
        for (int i = 2; i < index; i++) {
            goal[i] = Math.min(goal[m2] * 2, Math.min(goal[m3] * 3, goal[m5] * 5));
            while (goal[m2] * 2 <= goal[i]) m2++;
            while (goal[m3] * 3 <= goal[i]) m3++;
            while (goal[m5] * 5 <= goal[i]) m5++;
        }
        return goal[index - 1];
    }
}
