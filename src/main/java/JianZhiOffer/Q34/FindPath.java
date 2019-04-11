package JianZhiOffer.Q34;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * @author ZXY
 * @create 2019-04-02 22:29
 * 老来多健忘，唯不忘相思
 */
public class FindPath {
    private ArrayDeque<Integer> path = new ArrayDeque<Integer>();
    public void findPath(BinaryTreeNode root, int sum) {
        if (root == null) return;
        path.push(root.value);
        if (root.value == sum && root.left == null && root.right == null) {
            Iterator iterator = path.descendingIterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
        if (root.left != null) {
            findPath(root.left, sum - root.value);
        }
        if (root.right != null) {
            findPath(root.right, sum - root.value);
        }
        path.pop();
    }
}
