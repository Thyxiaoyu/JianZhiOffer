package JianZhiOffer.Q63;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 20:32
 */
public class MaxDiff {
    public static Integer maxDiff(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return null;
        int minNum = numbers[0];
        int maxDiff = numbers[1] - minNum;
        if (maxDiff < 0) minNum = numbers[1];
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] - minNum > maxDiff) maxDiff =  numbers[i] - minNum;
            if (numbers[i] < minNum) minNum = numbers[i];
        }
        return maxDiff;
    }
}
