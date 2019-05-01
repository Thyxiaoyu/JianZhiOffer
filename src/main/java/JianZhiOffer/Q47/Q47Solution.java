package JianZhiOffer.Q47;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 16:16
 */
public class Q47Solution {
    public static void main(String[] args) {
        int[][] test = new int[4][];
        test[0] = new int[]{1,12,5,3};
        test[1] = new int[]{10,2,7,7};
        test[2] = new int[]{3,9,4,16};
        test[3] = new int[]{8,6,11,5};
        System.out.println(GetMaxValue.getMaxValue(test));
    }
}
