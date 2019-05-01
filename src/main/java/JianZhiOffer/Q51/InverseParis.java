package JianZhiOffer.Q51;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 11:00
 */
public class InverseParis {
    public static Integer inversePairs(int[] data) {
        if (data == null || data.length <= 0) return null;
        int[] copy = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        return inverseCore(data,copy,0,data.length - 1);
    }

    public static Integer inverseCore(int[] data, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = data[start];
            return 0;
        }
        int length = (end - start) / 2;
        int left = inverseCore(copy,data,start,start + length);
        int right = inverseCore(copy,data,start + length + 1,end);
        int i = start + length;
        int j = end;
        int count = 0;
        int indexOfCopy = end;
        while (i >= start && j >= start + length + 1) {
            if (data[i] > data[j]) {
                count += j - start - length;
                copy[indexOfCopy--] = data[i--];
            } else {
                copy[indexOfCopy--] = data[j--];
            }
        }
        for (;i >= start; i--) {
            copy[indexOfCopy--] = data[i];
        }
        for (;j >= start + length + 1; j--) {
            copy[indexOfCopy--] = data[j];
        }
        return left + right + count;
    }
}
