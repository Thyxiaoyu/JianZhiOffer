package JianZhiOffer.Q31;

import java.util.ArrayDeque;

/**
 * @author ZXY
 * @create 2019-04-02 18:50
 * 老来多健忘，唯不忘相思
 */
public class IsPopOrder {
    public static boolean isPopOrder(int[] push, int[] pop) {
        if (push == null || pop == null || push.length != pop.length) return false;
        int n = push.length;
        int dataIndex = 0;
        ArrayDeque<Integer> data = new ArrayDeque<Integer>();
        ArrayDeque<Integer> assist = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            while ((data.isEmpty() || data.peekFirst() != pop[i]) && dataIndex < n) {
                data.push(push[dataIndex++]);
            }
            if (data.peekFirst() == pop[i]) {
                data.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
