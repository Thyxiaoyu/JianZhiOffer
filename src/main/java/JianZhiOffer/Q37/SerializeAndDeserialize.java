package JianZhiOffer.Q37;

/**
 * @author ZXY
 * @create 2019-04-03 12:52
 * 老来多健忘，唯不忘相思
 */
public class SerializeAndDeserialize {
    private StringBuffer buffer = new StringBuffer();

    private void serialize(BinaryTreeNode root) {
        if (root == null) {
            buffer.append('$');
            return;
        }
        buffer.append(root.value);
        serialize(root.left);
        serialize(root.right);
    }

    private BinaryTreeNode head = new BinaryTreeNode(0);
    private boolean flag = true;


    //你说这么简单的一道题，我能写两个小时，我是猪啊！！！
    private BinaryTreeNode deserialize(StringBuffer sb) {
        if (sb.charAt(0) == '$') {
            sb.deleteCharAt(0);
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(sb.charAt(0) - 48);
        sb.deleteCharAt(0);
        root.left = deserialize(sb);
        root.right = deserialize(sb);
        return root;
        /*if (bufferArg.charAt(0) == '$') {
            head1.left = null;
            bufferArg.deleteCharAt(0);
            return;
        }
        head1.left = new BinaryTreeNode(bufferArg.charAt(0) - 48);
        bufferArg.deleteCharAt(0);
        deserialize(bufferArg, head1.left);
        if (bufferArg.charAt(0) == '$') {
            head1.right = null;
            bufferArg.deleteCharAt(0);
            return;
        }
        head1.right = new BinaryTreeNode(bufferArg.charAt(0) - 48);
        bufferArg.deleteCharAt(0);
        deserialize(bufferArg, head1.right);*/
        /*if (bufferArg.charAt(0) == '$') {
            head1 = null;
            bufferArg.deleteCharAt(0);
            return;
        }
        head1.setValue(bufferArg.charAt(0) - 48);
        bufferArg.deleteCharAt(0);
        System.out.println(head1);
        head1.left = new BinaryTreeNode(0);
        head1.right = new BinaryTreeNode(0);
        deserialize(bufferArg, head1.left);
        deserialize(bufferArg, head1.right);*/

    }

    public StringBuffer getSerialize(BinaryTreeNode root) {
        serialize(root);
        return buffer;
    }

    public BinaryTreeNode getDeserialize(StringBuffer bufferArg) {
       return deserialize(bufferArg);
    }
}
