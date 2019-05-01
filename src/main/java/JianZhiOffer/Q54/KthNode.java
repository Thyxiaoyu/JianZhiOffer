package JianZhiOffer.Q54;

/**
 * @author ThyXiaoyu
 * @create 2019-05-01 14:17
 */
public class KthNode {
    private static int kth = 0;
    public static BinaryTreeNode kthNode(BinaryTreeNode root, int k) {
        if (root == null || k < 1) return null;
        BinaryTreeNode goal = null;
        if (root.left != null) {
            goal = kthNode(root.left,k);
        }
        if (goal == null) {
            if (k == 1) {
                goal = root;
            }
            k--;
        }
        if (goal == null && root.right != null) {
            goal = kthNode(root.right,k);
        }
        return goal;
    }

    public static BinaryTreeNode kthNodeNew(BinaryTreeNode root, int k) {
        if (root == null || k < 1) return null;
        kth = k;
        return kthNodeNewCore(root);
    }

    private static BinaryTreeNode kthNodeNewCore(BinaryTreeNode root) {
        BinaryTreeNode goal = null;
        if (root.left != null) {
            goal = kthNodeNewCore(root.left);
        }
        if (goal == null) {
            if (kth == 1) {
                goal = root;
            }
            kth--;
        }
        if (goal == null && root.right != null) {
            goal = kthNodeNewCore(root.right);
        }
        return goal;
    }
}
