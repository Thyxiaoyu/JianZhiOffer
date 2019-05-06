package JianZhiOffer.Q62;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 18:22
 */
//last = (last + m) % i;灵魂公式呀
public class LastRemaining {
    public static Integer lastRemaining(int n, int m) {
        if (n < 1 || m < 1) return null;
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }
}
