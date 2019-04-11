package JianZhiOffer.Q32;

/**
 * @author ZXY
 * @create 2019-03-12 11:05
 */
public class BinaryTreeNode {
    int value;
    BinaryTreeNode left;

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    BinaryTreeNode right;
    //BinaryTreeNode father;
    public BinaryTreeNode(int value) {
        this.value = value;
    }
}
