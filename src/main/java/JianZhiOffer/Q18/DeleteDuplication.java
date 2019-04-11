package JianZhiOffer.Q18;

/**
 * @author ZXY
 * @create 2019-04-01 14:41
 * 老来多健忘，唯不忘相思
 * 这个写的太差了，勉强能用
 */
public class DeleteDuplication {
    public static void deleteDuplication(ListNode head) {
        if (head == null) return;
        ListNode pre = new ListNode();
        pre.nextNode = head;
/*        while (pre.nextNode != null) {
            deleteNode(pre);
        }*/
        deleteNode(pre);

    }

    public static void deleteNode(ListNode pre) {
        if (pre.nextNode.nextNode == null) {
            pre = pre.nextNode;
            return;
        }

        if (pre.nextNode.value != pre.nextNode.nextNode.value) {
            pre = pre.nextNode;
            deleteNode(pre);
            return;
        } else {
            ListNode tem = pre.nextNode.nextNode;
            if (tem.nextNode == null) {
                pre.nextNode = null;
                return;
            }
            while (tem.value == tem.nextNode.value) {
                tem = tem.nextNode;
                if (tem.nextNode == null) {
                    pre.nextNode = null;
                    return;
                }
            }

            pre.nextNode = tem.nextNode;
        }
        //  if (pre.nextNode == null) return;
        deleteNode(pre);
    }
}


/**这是别人做的
 *
 *
 * 
 *
 *
 */
