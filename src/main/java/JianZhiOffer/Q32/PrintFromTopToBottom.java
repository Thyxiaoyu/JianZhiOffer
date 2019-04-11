package JianZhiOffer.Q32;

import java.util.ArrayDeque;

/**
 * @author ZXY
 * @create 2019-04-02 19:31
 * 老来多健忘，唯不忘相思
 */
public class PrintFromTopToBottom {
    public static void printFromTopToBottom(BinaryTreeNode root) {
        if (root == null) return;
        ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
        queue.offer(root);
        BinaryTreeNode tem = null;
        while (!queue.isEmpty()) {
            tem = queue.poll();
            if (tem.left != null) queue.offer(tem.left);
            if (tem.right != null) queue.offer(tem.right);
            System.out.print(tem.value + " ");
        }
    }

    public static void printFromTopToBottomByRows(BinaryTreeNode root) {
        if (root == null) return;
        ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
        queue.offer(root);
        BinaryTreeNode tem = null;
        int cur = 1;
        int nextFloor = 0;
        while (!queue.isEmpty()) {
            tem = queue.poll();
            cur--;
            if (tem.left != null) {
                queue.offer(tem.left);
                nextFloor++;
            }
            if (tem.right != null) {
                queue.offer(tem.right);
                nextFloor++;
            }
            System.out.print(tem.value + " ");
            if (cur == 0) {
                cur = nextFloor;
                nextFloor = 0;
                System.out.println();
            }
        }
    }

    public static void printFromTopToBottomByZhi(BinaryTreeNode root) {
        if (root == null) return;
        ArrayDeque<BinaryTreeNode> queue1 = new ArrayDeque<BinaryTreeNode>();
        ArrayDeque<BinaryTreeNode> queue2 = new ArrayDeque<BinaryTreeNode>();
        BinaryTreeNode tem = null;
        int cur = 1;
        boolean isOdd = true;
        int nextFloor = 0;
        queue1.offer(root);
        while ((isOdd && !queue1.isEmpty()) || (!isOdd && !queue2.isEmpty())) {
            if (isOdd) {
                tem = queue1.pop();
                cur--;
                if (tem.left != null) {
                    queue2.push(tem.left);
                    nextFloor++;
                }
                if (tem.right != null) {
                    queue2.push(tem.right);
                    nextFloor++;
                }
                System.out.print(tem.value + " ");
                if (cur == 0) {
                    cur = nextFloor;
                    nextFloor = 0;
                    System.out.println();
                    isOdd = !isOdd;
                }
            } else if (!isOdd) {
                tem = queue2.pop();
                cur--;
                if (tem.right != null) {
                    queue1.push(tem.right);
                    nextFloor++;
                }
                if (tem.left != null) {
                    queue1.push(tem.left);
                    nextFloor++;
                }
                System.out.print(tem.value + " ");
                if (cur == 0) {
                    cur = nextFloor;
                    nextFloor = 0;
                    System.out.println();
                    isOdd = !isOdd;
                }
            }
        }
    }
}
