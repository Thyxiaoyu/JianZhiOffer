package JianZhiOffer.Q8;

/**
 * @author ZXY
 * @create 2019-03-12 14:27
 */
public class Q8Solution {
    public static void main(String[] args) {
        BinaryTreeNode a = new BinaryTreeNode("a");
        BinaryTreeNode b = new BinaryTreeNode("b");
        BinaryTreeNode c = new BinaryTreeNode("c");
        BinaryTreeNode d = new BinaryTreeNode("d");
        BinaryTreeNode e = new BinaryTreeNode("e");
        BinaryTreeNode f = new BinaryTreeNode("f");
        BinaryTreeNode g = new BinaryTreeNode("g");
        BinaryTreeNode h = new BinaryTreeNode("h");
        BinaryTreeNode i = new BinaryTreeNode("i");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        b.father = a;
        d.father =b;
        e.left = h;
        e.right = i;
        e.father =b;
        h.father = e;
        i.father = e;
        c.father = a;
        c.left = f;
        c.right = g;
        f.father = c;
        g.father = c;
        System.out.println(NextBinaryNode.nextNode(g).value);
    }
}
