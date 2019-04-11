package JianZhiOffer.Q11;

/**
 * @author ZXY
 * @create 2019-03-12 16:13
 */
public class ArrayMin {
    public static int arrayMin(int[] arr) {
        if (arr == null) {
            System.out.println("兄弟，你输入的是空数组！");
            return -1;
        }
        if (arr[0] < arr[arr.length - 1]) return arr[0];
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            if (end == start + 1) return arr[end];
            int mid = (start + end) / 2;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) return minInorder(arr,start,end);
            if (arr[mid] >= arr[start]) {
                start = mid;
                continue;
            } else if (arr[mid] <= arr[end]) {
                end = mid;
                continue;
            }
        }
        return arr[0];
    }
    public static int minInorder(int[] arr,int start,int end) {
        int ans = arr[start];
        for (int i = start; i < end + 1; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
