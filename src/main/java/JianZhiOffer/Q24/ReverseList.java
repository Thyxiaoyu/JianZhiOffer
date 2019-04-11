package JianZhiOffer.Q24;

/**
 * @author ZXY
 * @create 2019-04-02 9:16
 * 老来多健忘，唯不忘相思
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.nextNode == null) return head;
        ListNode pre = null;
        ListNode goal = head;
        ListNode suf = head.nextNode;
        while (suf != null) {
            goal.nextNode = pre;
            pre = goal;
            goal = suf;
            suf = suf.nextNode;
        }
        goal.nextNode = pre;
        return goal;
    }
}
