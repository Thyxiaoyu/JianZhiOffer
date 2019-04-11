package JianZhiOffer.Q8;

/**
 * @author ZXY
 * @create 2019-03-12 13:56
 */
public class NextBinaryNode {
    public static BinaryTreeNode nextNode(BinaryTreeNode pNode) {
        if (pNode.right != null) {
            BinaryTreeNode tem = pNode.right;
            while (tem.left != null) {
                tem = tem.left;
            }
            return tem;
        } else if (pNode.father.left == pNode) {
            return pNode.father;
        } else if (pNode.father.right == pNode) {
            BinaryTreeNode tem = pNode;
            while (tem.father != null && tem == tem.father.right) {
                tem = tem.father;
            }
            if (tem.father !=null && tem == tem.father.left) {
                return tem.father;
            }
        }
        return new BinaryTreeNode("这个节点已经没有下一节点啦！！");
    }
}
