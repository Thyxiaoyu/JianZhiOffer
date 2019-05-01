package JianZhiOffer.Q44;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 14:12
 */
public class DigitAtIndex {
    public static Integer digitAtIndex(int index) {
        if (index < 0) return null;
        if (index < 10) return index;
        index -= 10;
        int init = 2;
        while (index > 9*Math.pow(10,init - 1) * init) {
            index -= 9*Math.pow(10,init - 1) * init;
            init++;
        }
        int goal = (int) (Math.pow(10,init - 1) + index / init);
        char ans = String.valueOf(goal).charAt(index % init);
        return ans - '0';
    }
}
