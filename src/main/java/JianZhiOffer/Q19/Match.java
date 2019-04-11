package JianZhiOffer.Q19;

/**
 * @author ZXY
 * @create 2019-04-01 16:51
 * 老来多健忘，唯不忘相思
 */
public class Match {
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null || str.length == 0 || pattern.length == 0 ) return false;
        return matchCore(str, 0, pattern, 0);
    }

    public static boolean matchCore(char[] str, int strIndex, char[] pattern, int patIndex) {
        if (strIndex == str.length && patIndex == pattern.length) return true;
        if (strIndex == str.length || patIndex == pattern.length) return false;
        if (patIndex == pattern.length - 1 || pattern[patIndex + 1] != '*') {
            if (charMatch(str[strIndex], pattern[patIndex])) {
                return matchCore(str, strIndex + 1, pattern, patIndex + 1);
            } else {
                return false;
            }
        } else {
            if (!charMatch(str[strIndex], pattern[patIndex])) {
                return matchCore(str, strIndex, pattern, patIndex + 2);
            } else {
                return matchCore(str, strIndex + 1, pattern, patIndex + 2) ||
                        matchCore(str, strIndex + 1, pattern, patIndex) ||
                        matchCore(str, strIndex, pattern, patIndex + 2);
            }
        }
    }

    public static boolean charMatch(char a, char b) {
        if (b == '.') return true;
        if (a == b) return  true;
        return false;
    }
}
