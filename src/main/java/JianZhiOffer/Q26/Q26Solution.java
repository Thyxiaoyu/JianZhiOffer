package JianZhiOffer.Q26;

/**
 * @author ZXY
 * @create 2019-04-02 10:58
 * 老来多健忘，唯不忘相思
 */
public class Q26Solution {
    public static void main(String[] args) {
        BinaryTreeNode t1 = new BinaryTreeNode(8);
        BinaryTreeNode t2 = new BinaryTreeNode(8);
        BinaryTreeNode t3 = new BinaryTreeNode(7);
        BinaryTreeNode t4 = new BinaryTreeNode(9);
        BinaryTreeNode t5 = new BinaryTreeNode(2);
        BinaryTreeNode t6 = new BinaryTreeNode(4);
        BinaryTreeNode t7 = new BinaryTreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;
        t5.right = t7;

        BinaryTreeNode g1 = new BinaryTreeNode(8);
        BinaryTreeNode g2 = new BinaryTreeNode(9);
        BinaryTreeNode g3 = new BinaryTreeNode(3);
        g1.left = g2;
        g1.right = g3;
        System.out.println(HasSubtree.hasSubtree(t1, null));
    }
}
