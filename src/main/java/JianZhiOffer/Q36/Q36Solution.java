package JianZhiOffer.Q36;


/**
 * @author ZXY
 * @create 2019-04-03 12:04
 * 老来多健忘，唯不忘相思
 */
public class Q36Solution {
    public static void main(String[] args) {
        BinaryTreeNode t1 = new BinaryTreeNode(10);
        BinaryTreeNode t2 = new BinaryTreeNode(6);
        BinaryTreeNode t3 = new BinaryTreeNode(14);
        BinaryTreeNode t4 = new BinaryTreeNode(4);
        BinaryTreeNode t5 = new BinaryTreeNode(8);
        BinaryTreeNode t6 = new BinaryTreeNode(12);
        BinaryTreeNode t7 = new BinaryTreeNode(16);
        /*t1.left = t2;
        t1.right = t3;*/
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        System.out.println(Convert.convert(t1));
    }
}
