package JianZhiOffer.Q52;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 11:44
 */
public class ListNode {
    int key;
    ListNode next;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "key=" + key +
                '}';
    }
}
