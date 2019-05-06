package JianZhiOffer.Q64;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 20:47
 */
public class SumSolution {
    public static Integer sumSolution(int n) {
        int sum = n;
        boolean tem = n > 0 && (sum += sumSolution(n - 1)) > 0;
        return sum;
    }
}
