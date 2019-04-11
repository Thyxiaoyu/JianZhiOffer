package JianZhiOffer.Q35;

/**
 * @author ZXY
 * @create 2019-04-03 9:18
 * 老来多健忘，唯不忘相思
 */
public class ComplexListNodeClone {
    public static ComplexListNode complexListNodeClone(ComplexListNode head) {
        if (head == null) return null;
        cloneNodes(head);
        connectSiblingNodes(head);
        return reconnectNodes(head);
    }

    public static void cloneNodes(ComplexListNode head) {
        ComplexListNode pre = head;
        ComplexListNode suf = pre;
        ComplexListNode goal;
        while (pre != null) {
            suf = pre.nextNode;
            goal = new ComplexListNode(pre.value);
            pre.nextNode = goal;
            goal.nextNode = suf;
            pre = suf;
        }

    }

    public static void connectSiblingNodes(ComplexListNode head) {
        ComplexListNode node = head;
        ComplexListNode clone = node;
        while (node != null) {
            clone = node.nextNode;
            if (node.sibling != null) clone.sibling = node.sibling.nextNode;
            node = clone.nextNode;
        }
    }

    public static ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode original = head;
        ComplexListNode clone = head.nextNode;
        ComplexListNode headClone = null;
        ComplexListNode nextNode = null;
        while (original != null) {
            headClone = original.nextNode;
            nextNode = headClone.nextNode;
            original.nextNode = nextNode;
            if (nextNode != null) headClone.nextNode = nextNode.nextNode;
            original = original.nextNode;
            headClone = headClone.nextNode;
        }
        return clone;
    }
}
