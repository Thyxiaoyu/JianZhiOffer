package JianZhiOffer.Q60;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 17:06
 */

/**
 * 可以考虑用一个二维数组来保存要用的两个数组，通过int flag = 0；来调整要用的数组，以此减少重复代码数量。或者在一开始定义一个
 * 临时的数组引用变量，在开头那里选择此次循环要操作的数组？
 */
public class PrintPropability {
    public static void printPropability(int number) {
        if (number < 1) return;
        int maxSum = 6 * number;
        int length = maxSum * 6 + 1;
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        boolean flag = true;
        for (int i = 1; i <= 6; i++) {
            array1[i] = 1;
        }
        for (int i = 2; i <= number; i++) {
            if (flag) {
                for (int j = 0; j < i; j++) {
                    array2[j] = 0;
                }
                for (int j = i; j <= i * 6; j++) {
                    array2[j] = 0;
                    for (int k = 1; k <= 6 && j - k > 0; k++) {
                        array2[j] += array1[j - k];
                    }
                }
                flag = false;
            } else {
                for (int j = 0; j < i; j++) {
                    array1[j] = 0;
                }
                for (int j = i; j <= i * 6; j++) {
                    array1[j] = 0;
                    for (int k = 1; k <= 6 && j - k > 0; k++) {
                        array1[j] += array2[j - k];
                    }
                }
                flag = true;
            }
        }
        int sum = 0;
        if (flag) {
            for (int i = number; i < number * 6 + 1; i++) {
                System.out.println("骰子点数为" + i + "的次数为" + array1[i]);
                System.out.println("骰子点数为" + i + "的概率为" + array1[i] / Math.pow(6,number));
                sum += array1[i];
            }

        } else {
            for (int i = number; i < number * 6 + 1; i++) {
                System.out.println("骰子点数为" + i + "的次数为" + array2[i]);
                System.out.println("骰子点数为" + i + "的概率为" + array2[i] / Math.pow(6,number));
                sum += array2[i];
            }
        }
        System.out.println(sum);
        System.out.println( Math.pow(6,number));
    }
}
