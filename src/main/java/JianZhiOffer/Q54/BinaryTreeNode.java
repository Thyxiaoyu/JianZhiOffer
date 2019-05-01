package JianZhiOffer.Q54;

/**
 * @author ThyXiaoyu
 * @create 2019-05-01 14:16
 */
public class BinaryTreeNode {
    int key;
    BinaryTreeNode left;
    BinaryTreeNode right;

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "key=" + key +
                '}';
    }

    public BinaryTreeNode(int key) {
        this.key = key;
    }
}
