package JianZhiOffer.Q54;

/**
 * @author ThyXiaoyu
 * @create 2019-05-01 14:28
 */
public class Q54Solution {
    public static void main(String[] args) {
        BinaryTreeNode l2 = new BinaryTreeNode(2);
        BinaryTreeNode l3 = new BinaryTreeNode(3);
        BinaryTreeNode l4 = new BinaryTreeNode(4);
        BinaryTreeNode l5 = new BinaryTreeNode(5);
        BinaryTreeNode l6 = new BinaryTreeNode(6);
        BinaryTreeNode l7 = new BinaryTreeNode(7);
        BinaryTreeNode l8 = new BinaryTreeNode(8);
        l5.left = l3;
        l5.right = l7;
        l3.left = l2;
        l3.right = l4;
        l7.left = l6;
        l7.right = l8;
        System.out.println(KthNode.kthNodeNew(l5, 3));
    }
}
