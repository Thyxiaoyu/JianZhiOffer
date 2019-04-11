package JianZhiOffer.Q18;

/**
 * @author ZXY
 * @create 2019-04-01 16:17
 * 老来多健忘，唯不忘相思
 * 这是别人做的，比我的好一万倍啊
 */
public class DeleteDuplicationNew {
    public static ListNode deleteDuplicationNew(ListNode head) {
        if (head == null) return null;
        ListNode pre = new ListNode();
        pre.nextNode = head;
        ListNode tem = pre;
        ListNode nowNode = head;
        while (nowNode != null) {
            if (nowNode.nextNode != null && nowNode.value == nowNode.nextNode.value) {
                while (nowNode.nextNode != null && nowNode.value == nowNode.nextNode.value) {
                    nowNode = nowNode.nextNode;
                }
                pre.nextNode = nowNode.nextNode;
            } else {
                pre = nowNode;
            }
            nowNode = nowNode.nextNode;
        }
        return tem.nextNode;
    }
}
