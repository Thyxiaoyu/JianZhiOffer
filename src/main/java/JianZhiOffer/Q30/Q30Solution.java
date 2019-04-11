package JianZhiOffer.Q30;

/**
 * @author ZXY
 * @create 2019-04-02 16:53
 */
public class Q30Solution {
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.pop();
        System.out.println(stack.min());
    }
}
