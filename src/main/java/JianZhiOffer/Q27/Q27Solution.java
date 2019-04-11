package JianZhiOffer.Q27;


/**
 * @author ZXY
 * @create 2019-04-02 14:44
 * 老来多健忘，唯不忘相思
 */
public class Q27Solution {
    public static void main(String[] args) {
        BinaryTreeNode t1 = new BinaryTreeNode(8);
        BinaryTreeNode t2 = new BinaryTreeNode(6);
        BinaryTreeNode t3 = new BinaryTreeNode(10);
        BinaryTreeNode t4 = new BinaryTreeNode(5);
        BinaryTreeNode t5 = new BinaryTreeNode(7);
        BinaryTreeNode t6 = new BinaryTreeNode(9);
        BinaryTreeNode t7 = new BinaryTreeNode(11);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        System.out.println(MirrorRecursively.mirrorRecursively(t1));
    }
}
