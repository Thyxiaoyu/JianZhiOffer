package JianZhiOffer.Q23;


/**
 * @author ZXY
 * @create 2019-04-01 23:16
 * 老来多健忘，唯不忘相思
 */
public class Q23Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.nextNode = l2;
        l2.nextNode = l1;
        l2.nextNode = l3;
        l3.nextNode = l4;
        l4.nextNode = l5;
        l5.nextNode = l6;
        l6.nextNode = l7;
        l7.nextNode = l3;
        System.out.println(EntryNodeOfLoop.entryNodeOfLoop(null));
    }
}
