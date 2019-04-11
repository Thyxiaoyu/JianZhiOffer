package JianZhiOffer.Q25;


/**
 * @author ZXY
 * @create 2019-04-02 9:44
 * 老来多健忘，唯不忘相思
 */
public class Merge {
    public static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        ListNode p = head1;
        ListNode q = head2;
        ListNode goal = null;
        if (p.value < q.value) {
            goal = p;
            p = p.nextNode;
        } else {
            goal = q;
            q = q.nextNode;
        }
        ListNode tem = goal;
        while (p != null && q != null) {
            if (p.value < q.value) {
                tem.nextNode = p;
                tem = tem.nextNode;
                p = p.nextNode;
            } else {
                tem.nextNode = q;
                tem = tem.nextNode;
                q = q.nextNode;
            }
        }
        if (p == null) {
            tem.nextNode = q;
        } else {
            tem.nextNode = p;
        }
        return goal;
    }
}
