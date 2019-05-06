package JianZhiOffer.Q65;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 21:40
 */
public class Add {
    public static Integer add(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry != 0) {
            sum = add(sum,carry);
        }
        return sum;
    }
}
