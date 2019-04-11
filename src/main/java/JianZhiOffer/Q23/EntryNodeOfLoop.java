package JianZhiOffer.Q23;

/**
 * @author ZXY
 * @create 2019-04-01 22:36
 * 老来多健忘，唯不忘相思
 */
public class EntryNodeOfLoop {
    public static ListNode entryNodeOfLoop(ListNode head) {
        if (head == null) return null;
        int flag = existLoopAndnums(head);
        if (flag == -1) return null;
        ListNode start = head;
        ListNode end = head;
        for (int i = 0; i < flag; i++) {
            end = end.nextNode;
        }
        while (start != end) {
            start = start.nextNode;
            end = end.nextNode;
        }
        return start;
    }


    public static int existLoopAndnums(ListNode head) {
        if (head.nextNode == null) return -1;
        ListNode fast = head.nextNode;
        ListNode slow = head;
        ListNode tem = null;
        while (slow != fast) {
            slow = slow.nextNode;
            if (fast.nextNode != null && fast.nextNode.nextNode != null) {
                fast = fast.nextNode.nextNode;
            } else {
                return -1;
            }
        }
        int count = 1;
        fast = fast.nextNode;
        while (slow != fast) {
            count++;
            fast = fast.nextNode;
        }
        return count;
    }
}
