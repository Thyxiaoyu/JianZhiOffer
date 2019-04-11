package JianZhiOffer.Q36;

/**
 * @author ZXY
 * @create 2019-04-03 10:48
 * 老来多健忘，唯不忘相思
 */
public class Convert {
    public static BinaryTreeNode lastNode = null;
    public static boolean flag = true;
    public static BinaryTreeNode goal = null;

    public static BinaryTreeNode convert(BinaryTreeNode root) {
        if (root == null) return null;
        convertNode(root);
        return goal;
    }

    public static void convertNode(BinaryTreeNode root) {
        if (root.left != null) {
            convert(root.left);
        }

        if (lastNode != null) {
            lastNode.right = root;
        }
        root.left = lastNode;
        lastNode = root;
        if (flag) {
            flag = false;
            goal = root;
        }
        if (root.right != null) {

            convert(root.right);
        }
//        return goal;
    }
}
