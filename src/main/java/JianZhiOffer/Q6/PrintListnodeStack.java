package JianZhiOffer.Q6;

import java.util.ArrayDeque;

/**
 * @author ZXY
 * @create 2019-03-12 10:04
 */
public class PrintListnodeStack {
    public static void printList(ListNode ln) {
        ListNode tem = ln;
        ArrayDeque stack = new ArrayDeque();
        while(tem != null) {
            stack.push(tem.value);
            tem = tem.listNode;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.poll());
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.listNode = l2;
        l2.listNode = l3;
        l3.listNode = l4;
        l4.listNode = l5;
       // PrintListnodeRecu.printListRecu(l1);
        printList(l6);
    }
}
