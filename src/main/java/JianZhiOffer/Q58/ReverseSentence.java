package JianZhiOffer.Q58;

/**
 * @author ThyXiaoyu
 * @create 2019-05-06 10:17
 */
//还有一个是左旋转字符串，我觉得直接切割移动到字符串的尾部就可以了。如果说不可以使用辅助空间的话，就是分成两部分，完成三次reverse。
public class ReverseSentence {
    public static void reverseSentence(String str) {
        if (str == null || str.length() <= 0) return;
        char[] goal = str.toCharArray();
        reverse(goal, 0 , goal.length - 1);
        int start = 0;
        int end = 0;
        while (end <= goal.length) {
            if (end == goal.length || goal[end] == ' ') {
                reverse(goal,start,end - 1);
                start = ++end;
            } else {
                end++;
            }
        }
        for (char c : goal) {
            System.out.print(c);
        }
    }

    private static void reverse(char[] chars, int start, int end) {
        /*int start = 0;
        int end = chars.length - 1;*/
        while (start < end) {
            char tem = chars[start];
            chars[start] = chars[end];
            chars[end] = tem;
            start++;
            end--;
        }
    }
}
