package JianZhiOffer.Q43;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 9:57
 */
public class NumberOf1 {
    public static Integer numberOf1(int n) {
        if (n == 0) return 0;
        if (n < 10) {
            return 1;
        }
        String s = String.valueOf(n);
        return numberOf1Core(s);
    }

    private static Integer numberOf1Core(String s) {
        if (s == null || s.length() <= 0) return 0;
        if (s.length() == 1) return s.charAt(0) > '0'? 1:0;
        int count = 0;
        int tem = s.length();
        int first = s.charAt(0) - '0';
        if (first == 0) return numberOf1Core(s.substring(1));
        if (first == 1) {
            count = Integer.parseInt(s.substring(1)) + 1;
            count += (tem - 1) * Math.pow(10,tem - 2);
        } else {
            count = (int) Math.pow(10,(tem -1));
            count += (tem - 1) * Math.pow(10, tem -2) * first;
        }
        return count + numberOf1Core(s.substring(1));
    }
}
