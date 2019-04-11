package JianZhiOffer.Q28;

/**
 * @author ZXY
 * @create 2019-04-02 15:01
 * 老来多健忘，唯不忘相思
 */
public class IsSymmetrical {
    public static boolean isSymmetrical(BinaryTreeNode root) {
        if (root == null) return false;
        return isSymmetricalCore(root.left, root.right);
    }

    public static boolean isSymmetricalCore(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.value == root2.value && isSymmetricalCore(root1.left, root2.right) &&
                isSymmetricalCore(root1.right, root2.left);
    }
}
