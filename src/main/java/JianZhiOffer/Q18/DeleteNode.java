package JianZhiOffer.Q18;


/**
 * @author ZXY
 * @create 2019-04-01 14:07
 * 老来多健忘，唯不忘相思
 */
public class DeleteNode {
    public static void deleteNode(ListNode head, ListNode p) {
        if (head == null || p == null) {
            System.out.println("小子，你输入的节点不对！");
            return;
        }
        if (p.nextNode != null) {
            ListNode q = p.nextNode;
            p.value = q.value;
            p.nextNode = q.nextNode;
            q.nextNode = null;
        } else if (head.nextNode != p) {
            ListNode tem = head;
            while (tem.nextNode != p) {
                tem = tem.nextNode;
            }
            tem.nextNode = null;
        } else {
            head.nextNode = null;
        }
    }
}
