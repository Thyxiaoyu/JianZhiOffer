package JianZhiOffer.Q7;

/**
 * @author ZXY
 * @create 2019-03-12 13:18
 */
public class Q7Solution {
    public static void lookNode(BinaryTreeNode root) {
        System.out.println("节点" + root.value);
        if (root.left != null) {
            System.out.print("节点" + root.value + "的左节点为：");
            lookNode(root.left);
        }
        if (root.right!= null) {
            System.out.print("节点" + root.value + "的右节点为：");
            lookNode(root.right);
        }
    }
    public static void main(String[] args) {
        int[] preorder = new int[] {1};
        int[] inorder = new int[] {1};
       BinaryTreeNode root = BTNConstruct.btnConstruct(preorder, inorder);
        //BinaryTreeNode root = BTNConstruct.btnConstruct(null, null);
        //BinaryTreeNode nullroot = null;
        lookNode(root);
    }
}
