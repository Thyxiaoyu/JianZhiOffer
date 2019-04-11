package JianZhiOffer.Q22;

/**
 * @author ZXY
 * @create 2019-04-01 22:08
 * 老来多健忘，唯不忘相思
 */
public class FindKthToTail {
    public static ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode goal = head;
        ListNode end = head;
        for (int i = 0; i < k - 1; i++) {
            if (end.nextNode != null) {
                end = end.nextNode;
            } else {
                return null;
            }
        }
        while (end.nextNode != null) {
            end = end.nextNode;
            goal = goal.nextNode;
        }
        return goal;
    }
}
