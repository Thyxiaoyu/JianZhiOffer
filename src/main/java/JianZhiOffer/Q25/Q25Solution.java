package JianZhiOffer.Q25;


/**
 * @author ZXY
 * @create 2019-04-02 10:02
 * 老来多健忘，唯不忘相思
 */
public class Q25Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        l1.nextNode = l3;
        l2.nextNode = l4;
        l3.nextNode = l5;
        l4.nextNode = l6;
        l5.nextNode = l7;
        l6.nextNode = l8;
        printNode(Merge.merge(l1, l2));
    }


    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.nextNode;
        }
    }
}
