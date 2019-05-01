package JianZhiOffer.Q52;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 11:46
 */
public class FirstCommonNode {
    public static ListNode firstCommonNode(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) return null;
        int length1 = 0;
        int length2 = 0;
        ListNode ans = null;
        ListNode tem = head1;
        while (tem != null) {
            length1++;
            tem = tem.next;
        }
        tem = head2;
        while (tem != null) {
            length2++;
            tem = tem.next;
        }
        if (length1 >= length2) {
            for (int i = 0; i < length1 - length2; i++) {
                head1 = head1.next;
            }
            while (head1 != head2) {
                head1 = head1.next;
                head2 = head2.next;
            }
        } else {
            for (int i = 0; i < length2 - length1; i++) {
                head2 = head2.next;
            }
            while (head1 != head2) {
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return head1;
    }
}
