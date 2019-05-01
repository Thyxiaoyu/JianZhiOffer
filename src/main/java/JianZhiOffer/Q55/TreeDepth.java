package JianZhiOffer.Q55;

/**
 * @author ThyXiaoyu
 * @create 2019-05-01 14:50
 */
public class TreeDepth {
    public static Integer treeDepth(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(treeDepth(root.left),treeDepth(root.right));
    }
}
