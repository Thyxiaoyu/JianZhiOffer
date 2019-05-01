package JianZhiOffer.Q47;

/**
 * @author ThyXiaoyu
 * @create 2019-04-29 15:49
 */
public class GetMaxValue {
    public static Integer getMaxValue(int[][] values) {
        if (values == null || values.length <= 0 || values[0] == null || values[0].length <= 0) return null;
        int row = values[0].length;
        int col = values.length;
        int[] value = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int left = 0;
                int up = value[j];
                if (j > 0) left = value[j - 1];
                value[j] = Math.max(up, left) + values[i][j];
            }
        }
        return value[col - 1];
    }
}
