package JianZhiOffer.Q37;

/**
 * @author ZXY
 * @create 2019-04-03 12:56
 * 老来多健忘，唯不忘相思
 */
public class Q37Solution {
    public static void main(String[] args) {
        BinaryTreeNode b1 = new BinaryTreeNode(1);
        BinaryTreeNode b2 = new BinaryTreeNode(2);
        BinaryTreeNode b3 = new BinaryTreeNode(3);
        BinaryTreeNode b4 = new BinaryTreeNode(4);
        BinaryTreeNode b5 = new BinaryTreeNode(5);
        BinaryTreeNode b6 = new BinaryTreeNode(6);
        b1.left = b2;
        b1.right = b3;
        b2.left = b4;
        b3.left = b5;
        b3.right = b6;
        SerializeAndDeserialize serializeAndDeserialize = new SerializeAndDeserialize();
//        System.out.println(serializeAndDeserialize.getSerialize(b1));
        StringBuffer serialize = serializeAndDeserialize.getSerialize(b1);
        System.out.println(serialize);
        System.out.println(serializeAndDeserialize.getDeserialize(serialize));
        //System.out.println(new BinaryTreeNode('1' - 48));
    }
}
