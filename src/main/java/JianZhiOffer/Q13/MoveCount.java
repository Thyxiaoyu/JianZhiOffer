package JianZhiOffer.Q13;

/**
 * @author ZXY
 * @create 2019-03-12 20:12
 * 老来多健忘，唯不忘相思
 */
public class MoveCount {
    public static int movingct(int threshold, int row, int col) {
        if (threshold <= 0 || row <= 0 || col <= 0) return 0;
        int count = 0;
        boolean[][] boo = new boolean[row][];
        for (int i = 0; i < row; i++) {
            boo[i] = new boolean[col];
            for (int j = 0; j < col; j++) {
                boo[i][j] = true;
            }
        }
        count = moveCore(threshold, row, col, boo, 0, 0);
        return count;
    }
    public static int moveCore(int threshold, int row, int col, boolean[][] boo, int rowIndex, int colIndex) {
        int count = 0;
        if (rowIndex >= 0 && rowIndex < row && colIndex >= 0 && colIndex < col && getSum(rowIndex, colIndex) <= threshold && boo[rowIndex][colIndex]) {
            boo[rowIndex][colIndex] = false;
            count = 1 + moveCore(threshold, row, col, boo, rowIndex + 1, colIndex) +
                    moveCore(threshold, row, col, boo, rowIndex - 1, colIndex) +
                    moveCore(threshold, row, col, boo, rowIndex, colIndex + 1) +
                    moveCore(threshold, row, col, boo, rowIndex, colIndex - 1);
        }
        return count;
    }
    public static int getSum(int row, int col) {
        int sum = 0;
        while (row > 0) {
            sum += row % 10;
            row /= 10;
        }
        while (col > 0) {
            sum += col % 10;
            col /= 10;
        }
        return sum;
    }
}
