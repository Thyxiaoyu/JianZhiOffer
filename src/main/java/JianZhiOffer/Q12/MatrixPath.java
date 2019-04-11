package JianZhiOffer.Q12;

/**
 * @author ZXY
 * @create 2019-03-12 17:13
 */
public class MatrixPath {
    public static boolean hasPath(char[][] matriCh, char[] str) {
        if (matriCh == null || str == null) return false;
        int row = matriCh.length;
        int col = matriCh[0].length;
        boolean[][] boo = new boolean[row][];
        for (int i = 0; i < row; i++) {
            boo[i] = new boolean[col];
            for (int j = 0; j < col; j++) {
                boo[i][j] = true;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (hasPathCore(matriCh, str, 0, boo, row, col, i, j)) return true;
            }
        }
        return false;
    }
    public static boolean hasPathCore(char[][] matriCh, char[] str, int strIndex, boolean[][] boo, int row, int col, int rowIndex, int colIndex) {
        if (strIndex >= str.length) return true;
        char goal = str[strIndex];
//        System.out.println("rowIndex:" + rowIndex + "---" + "row:" + row + "-----colIndex:" + colIndex + "---col:"  +
//                col + "---boo:" + boo[rowIndex][colIndex] + "---goal:" + goal + "---mat:" + matriCh[rowIndex][colIndex]);
        if (rowIndex >= 0 && rowIndex < row && colIndex >= 0 && colIndex <col && boo[rowIndex][colIndex] && goal == matriCh[rowIndex][colIndex]) {
            strIndex++;
            boo[rowIndex][colIndex] = false;
            return hasPathCore(matriCh, str, strIndex, boo, row, col, rowIndex - 1, colIndex) ||
                    hasPathCore(matriCh, str, strIndex, boo, row, col, rowIndex + 1, colIndex) ||
                    hasPathCore(matriCh, str, strIndex, boo, row, col, rowIndex, colIndex - 1) ||
                    hasPathCore(matriCh, str, strIndex, boo, row, col, rowIndex, colIndex + 1);
        }
        return false;
    }
}
