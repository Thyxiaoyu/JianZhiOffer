package JianZhiOffer.Q53;

/**
 * @author ThyXiaoyu
 * @create 2019-04-30 12:39
 */
public class GetNumberOfK {
    public static Integer getNumberOfK(int[] data, int k) {
        if (data == null || data.length <= 0) {
            return null;
        }
        int first = getFirstOfK(data,k,0,data.length - 1);
        int last = getLastOfk(data,k,0,data.length - 1);
        if (first == -1 || last == -1) return null;
        return last - first + 1;
    }

    private static Integer getFirstOfK(int[] data, int k, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] == k) {
                if (mid == 0 || data[mid - 1] != k) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else if (data[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    private static Integer getLastOfk(int[] data, int k, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] == k) {
                if (mid == data.length - 1 || data[mid + 1] != k) {
                    return mid;
                } else {
                    start = start + 1;
                }
            } else if (data[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
