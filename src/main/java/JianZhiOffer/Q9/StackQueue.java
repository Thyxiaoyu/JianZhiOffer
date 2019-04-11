package JianZhiOffer.Q9;

import java.util.ArrayDeque;

/**
 * @author ZXY
 * @create 2019-03-12 14:55
 */
public class StackQueue {
    ArrayDeque stack1 = new ArrayDeque();
    ArrayDeque stack2 = new ArrayDeque();
    public void appendTail(Object o) {
        stack1.push(o);
    }
    public Object deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    //判断这个队列是否为空
    public boolean isEmpty() {
        if (stack1.isEmpty() && stack2.isEmpty()) return true;
        return false;
    }
}
