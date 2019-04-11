package JianZhiOffer.Q20;

/**
 * @author ZXY
 * @create 2019-04-01 19:55
 * 老来多健忘，唯不忘相思
 */
public class IsNumeric {
    int index;
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) return false;
        index = 0;
        boolean flag = scanInteger(str);
        if (index < str.length && str[index] == '.') {
            index++;
            flag = UnsignedInteger(str) || flag;
        }
        if (index < str.length && (str[index] == 'e' || str[index] == 'E')) {
            index ++;
            flag = scanInteger(str) && flag;
        }
        return index >= str.length && flag;
    }

    public boolean scanInteger(char[] str) {
        if (index < str.length && (str[index] == '+' || str[index] == '-')) {
            index++;
        }
        return UnsignedInteger(str);
    }

    public boolean UnsignedInteger(char[] str) {
        int tem = index;
        while (index < str.length && str[index] >= '0' && str[index] <= '9') {
            index++;
        }
        return index > tem;
    }
}
