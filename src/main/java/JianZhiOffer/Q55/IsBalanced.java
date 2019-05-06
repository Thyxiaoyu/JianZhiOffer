package JianZhiOffer.Q55;

/**
 * @author ThyXiaoyu
 * @create 2019-05-01 15:20
 */
//这里返回-1代表不是平衡的
public class IsBalanced {
    public static Integer isBalanced(BinaryTreeNode root) {
        if (root == null) return 0;
        int left = isBalanced(root.left);
        int right = isBalanced(root.right);
        if (left >= 0 && right >= 0 && left - right >= -1 && left - right <= 1) {
            return 1 + Math.max(left,right);
        }
        return -1;
    }
}
