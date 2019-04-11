package JianZhiOffer.Q15;

/**
 * @author ZXY
 * @create 2019-04-01 9:46
 * 老来多健忘，唯不忘相思
 */
public class NumberOf1 {
    public static int numberOf1(int goal) {
        if (goal == 0) return 0;
        int count = 0;
        int tem = 0;

       while (goal != 0) {
           tem = goal - 1;
           goal = goal & tem;
           count++;
       }

/*        } else if (goal < 0) {
            while (goal < 0) {
                tem = goal + 1;
                goal = goal & tem;
                count++;
            }
            count++;
        }*/
        return count;
    }
}
