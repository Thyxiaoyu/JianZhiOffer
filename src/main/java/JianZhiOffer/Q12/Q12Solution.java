package JianZhiOffer.Q12;

/**
 * @author ZXY
 * @create 2019-03-12 18:45
 */
public class Q12Solution {
    public static void main(String[] args) {
        char[][] matCh = new char[4][3];
        char[][] matChNew = new char[4][1];
        matChNew[0] = new char[] {'a'};
        matChNew[1] = new char[] {'a'};
        matChNew[2] = new char[] {'a'};
        matChNew[3] = new char[] {'d'};
        matCh[0] = new char[] {'a','c','j'};
        matCh[1] = new char[] {'b','f','d'};
        matCh[2] = new char[] {'t','c','e'};
        matCh[3] = new char[] {'g','s','h'};
        System.out.println(MatrixPath.hasPath(null, new char[]{'a'}));
    }
}
