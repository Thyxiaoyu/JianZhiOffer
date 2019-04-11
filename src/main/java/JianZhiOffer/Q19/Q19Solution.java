package JianZhiOffer.Q19;

/**
 * @author ZXY
 * @create 2019-04-01 19:23
 * 老来多健忘，唯不忘相思
 */
public class Q19Solution {
    public static void main(String[] args) {
        char[] a = new char[]{'a','a','a','a','a','a'};
        char[] b = new char[]{'a','.','a'};
        char[] c = new char[]{'a','b','*','a','c','*','a'};
        char[] d = new char[]{'a','*','c'};
        System.out.println(Match.match(a, d));
    }
}
