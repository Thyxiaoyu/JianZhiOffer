package JianZhiOffer.Q28;


/**
 * @author ZXY
 * @create 2019-04-02 15:26
 * 老来多健忘，唯不忘相思
 */
public class Q28Solution {
    public static void main(String[] args) {
        BinaryTreeNode t1 = new BinaryTreeNode(7);
        BinaryTreeNode t2 = new BinaryTreeNode(7);
        BinaryTreeNode t3 = new BinaryTreeNode(7);
        BinaryTreeNode t4 = new BinaryTreeNode(7);
        BinaryTreeNode t5 = new BinaryTreeNode(7);
        BinaryTreeNode t6 = new BinaryTreeNode(7);
        BinaryTreeNode t7 = new BinaryTreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        System.out.println(IsSymmetrical.isSymmetrical(t1));
    }
}
