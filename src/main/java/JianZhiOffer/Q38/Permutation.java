package JianZhiOffer.Q38;

/**
 * @author ZXY
 * @create 2019-04-03 16:00
 * 老来多健忘，唯不忘相思
 */
public class Permutation {

    public void permutation(char[] str, int index, int n) {
        if (str == null || str.length == 0 || n < 1) {
            System.out.println("你输入的参数有问题！");
            return;
        }
        if (index == n - 1) {
            System.out.println(str);
            return;
        }
        for (int i = index; i < n; i++) {
            char tem = str[index];
            str[index] = str[i];
            str[i] = tem;
            permutation(str, index + 1, n);

            str[i] = str[index];
            str[index] = tem;

            /*tem = str[index];
            str[index] = str[i];
            str[i] = tem;*/
        }
    }
}
