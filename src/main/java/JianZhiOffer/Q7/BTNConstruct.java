package JianZhiOffer.Q7;

import java.util.Arrays;

/**
 * @author ZXY
 * @create 2019-03-12 11:06
 */
public class BTNConstruct {

    public static BinaryTreeNode btnConstruct(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            System.out.println("输入的序列为空！");
            return null;
        }
        if (preorder.length == 1 && inorder.length != 1 || preorder.length != 1 && inorder.length == 1 || preorder.length == 1 && preorder[0] != inorder[0]) {
            System.out.println("输入的前序遍历序列和中序遍历序列不匹配！");
            return null;
        }
        if (preorder.length == 1) return new BinaryTreeNode(preorder[0]);
        BinaryTreeNode root = new BinaryTreeNode(preorder[0]);
        int length = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) length = i;
        }
        if (length > 0) root.left = btnConstruct(Arrays.copyOfRange(preorder,1,length + 1),
                Arrays.copyOfRange(inorder,0,length));
        if (length < inorder.length - 1) root.right = btnConstruct(Arrays.copyOfRange(preorder,length + 1,preorder.length),
                Arrays.copyOfRange(inorder,length + 1,inorder.length));
        return root;
    }
}
