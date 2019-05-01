package JianZhiOffer.Q52;

import JianZhiOffer.Q50.FirstRepeatingChar;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 11:58
 */
public class Q52Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
//        ListNode l1 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l6;
        l6.next = l7;
        l4.next = l5;
        l5.next = l6;
        System.out.println(FirstCommonNode.firstCommonNode(l1, l4));
    }
}
