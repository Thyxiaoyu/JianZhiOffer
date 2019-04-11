package JianZhiOffer.Q27;

/**
 * @author ZXY
 * @create 2019-04-02 14:31
 * 老来多健忘，唯不忘相思
 */
public class MirrorRecursively {
    public static BinaryTreeNode mirrorRecursively(BinaryTreeNode node) {
        exchangeNode(node);
        return node;
    }

    public static void exchangeNode(BinaryTreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        BinaryTreeNode tem = node.left;
        node.left = node.right;
        node.right = tem;
        exchangeNode(node.left);
        exchangeNode(node.right);
    }
}
