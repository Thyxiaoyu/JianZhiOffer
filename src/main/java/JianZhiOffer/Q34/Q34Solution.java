package JianZhiOffer.Q34;

/**
 * @author ZXY
 * @create 2019-04-02 22:42
 * 老来多健忘，唯不忘相思
 */
public class Q34Solution {
    public static void main(String[] args) {
        /*ArrayDeque a = new ArrayDeque();
        a.push(1);
        a.push(2);
        a.push(3);
        Iterator b = a.descendingIterator();
        while (b.hasNext()) {
            System.out.println(b.next());
        }*/
        BinaryTreeNode t1 = new BinaryTreeNode(11);
        BinaryTreeNode t2 = new BinaryTreeNode(5);
        BinaryTreeNode t3 = new BinaryTreeNode(12);
        BinaryTreeNode t4 = new BinaryTreeNode(4);
        BinaryTreeNode t5 = new BinaryTreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        new FindPath().findPath(t1, 22);
    }
}
