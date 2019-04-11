package JianZhiOffer.Q9;

/**
 * @author ZXY
 * @create 2019-03-12 15:03
 */
public class Q9Solution {
    public static void main(String[] args) {
        StackQueue tem = new StackQueue();
        tem.appendTail(3);
        tem.appendTail(4);
        tem.appendTail(5);
        tem.appendTail("哈哈哈！没想到吧！我又回来啦！");
//        System.out.println(tem.deleteHead());
        while (!tem.isEmpty()) {
            System.out.println(tem.deleteHead());
        }
    }
}
