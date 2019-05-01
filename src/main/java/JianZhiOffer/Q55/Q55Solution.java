package JianZhiOffer.Q55;

/**
 * @author ThyXiaoyu
 * @create 2019-05-01 14:53
 */
public class Q55Solution {
    public static void main(String[] args) {
        BinaryTreeNode b1 = new BinaryTreeNode(1);
        BinaryTreeNode b2 = new BinaryTreeNode(2);
        BinaryTreeNode b3 = new BinaryTreeNode(3);
        BinaryTreeNode b4 = new BinaryTreeNode(4);
        BinaryTreeNode b5 = new BinaryTreeNode(5);
        BinaryTreeNode b6 = new BinaryTreeNode(6);
        BinaryTreeNode b7 = new BinaryTreeNode(7);
        b1.left = b2;
        b1.right = b3;
        b2.left = b4;
        b2.right = b5;
        b3.right = b6;
        b5.left = b7;
        System.out.println(TreeDepth.treeDepth(null));
    }
}
