package JianZhiOffer.Q26;

/**
 * @author ZXY
 * @create 2019-04-02 10:25
 * 老来多健忘，唯不忘相思
 */
public class HasSubtree {
    public static boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null || root2 == null) return false;
        boolean result = false;
        if (root1.value == root2.value) {
            result = result || DoesTree1HaveTree2(root1, root2);
        }

        result = result || hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
        return result;
    }

    public static boolean DoesTree1HaveTree2(BinaryTreeNode tree1, BinaryTreeNode tree2) {
        if (tree1 == null || tree2 == null || tree1.value != tree2.value) return false;
        boolean left = true;
        boolean right = true;
        if (tree2.left != null) left = DoesTree1HaveTree2(tree1.left, tree2.left);
        if (tree2.right != null) right = DoesTree1HaveTree2(tree1.right, tree2.right);
        return left && right;
    }
}
