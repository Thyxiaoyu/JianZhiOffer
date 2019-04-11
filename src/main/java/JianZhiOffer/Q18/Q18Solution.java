package JianZhiOffer.Q18;

/**
 * @author ZXY
 * @create 2019-04-01 14:20
 * 老来多健忘，唯不忘相思
 */
public class Q18Solution {
    public static void main(String[] args) {
/*        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.nextNode = l2;
        l2.nextNode = l3;
        l3.nextNode = l4;
        l4.nextNode = l5;
        l5.nextNode = l6;
        l6.nextNode = l7;
        ListNode head = new ListNode();
        head.nextNode = l1;
        DeleteNode.deleteNode(head, null);
        printNode(head);*/

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(2);
        ListNode l7 = new ListNode(2);
        l1.nextNode = l2;
        l2.nextNode = l3;
        l3.nextNode = l4;
        l4.nextNode = l5;
        l5.nextNode = l6;
        l6.nextNode = l7;
       // DeleteDuplication.deleteDuplication(l1);
      //  printNode(l1);
        printNode(DeleteDuplicationNew.deleteDuplicationNew(l1));
    }

    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.nextNode;
        }
    }
}
