package JianZhiOffer.Q29;

/**
 * @author ZXY
 * @create 2019-04-02 15:47
 * 老来多健忘，唯不忘相思
 */
public class PrintMatrixClockWisely {
    public static void printMatrixClockWisely(int[][] nums, int columns, int rows) {
        if (nums == null || columns <= 0 || rows <= 0) {
            return;
        }
        int start = 0;
        while (columns > start * 2 && rows > start * 2) {
            printMatrixInCircle(nums, columns, rows, start);
            start++;
        }
    }

    public static void printMatrixInCircle(int[][] nums, int columns, int rows, int start) {
        int endX = columns - 1 -start;
        int endY = rows - 1 - start;
        for (int i = start; i <= endX; i++) {
            System.out.println(nums[i][start]);
        }
        if (endY > start) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.println(nums[endX][i]);
            }
            if (endX > start) {
                for (int i = endX - 1; i >= start; i--) {
                    System.out.println(nums[i][endY]);
                }
                if (endY > start + 1) {
                    for (int i = endY - 1; i > start; i--) {
                        System.out.println(nums[start][i]);
                    }
                }
            }
        }

    }
}
