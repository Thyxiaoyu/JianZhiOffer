package JianZhiOffer.Q17;

/**
 * @author ZXY
 * @create 2019-04-01 13:03
 * 老来多健忘，唯不忘相思
 */
public class Print1ToMaxOfNDigits {
    public static void print1ToMaxOfNDigits(int n) {
        if (n < 1) {
            System.out.println("你输入的n不是正整数！");
            return;
        }
        char[] number = new char[n];
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }
        printRecursively(number, n, 0);
    }

    public static void printRecursively(char[] number, int n, int index) {
        if (index == n - 1) {
            for (int i = 0; i < 10; i++) {
                number[index] = (char)('0' + i);
                printNumberChar(number, n);
                System.out.println();
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index] = (char)('0' + i);
            printRecursively(number, n, index + 1);
        }
    }

    public static void printNumberChar(char[] str, int n) {
        int i = 0;
        while (i < n && str[i] == '0') {
            i++;
        }
        for (int j = i; j < n; j++) {
            System.out.print(str[j]);
        }
    }
}
