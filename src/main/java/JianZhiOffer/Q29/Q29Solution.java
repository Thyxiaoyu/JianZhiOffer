package JianZhiOffer.Q29;

/**
 * @author ZXY
 * @create 2019-04-02 16:13
 * 老来多健忘，唯不忘相思
 */
public class Q29Solution {
    public static void main(String[] args) {
        int[][] nums = new int[4][];
        nums[0] = new int[]{1,5,9,13};
        nums[1] = new int[]{2,6,10,14};
        nums[2] = new int[]{3,7,11,15};
        nums[3] = new int[]{4,8,12,16};
        PrintMatrixClockWisely.printMatrixClockWisely(nums, 4, 4);
    }
}
