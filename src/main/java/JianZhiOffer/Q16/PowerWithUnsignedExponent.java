package JianZhiOffer.Q16;

/**
 * @author ZXY
 * @create 2019-04-01 12:23
 * 老来多健忘，唯不忘相思
 */
public class PowerWithUnsignedExponent {
    public static double powerWithUnsignedExponent(double base, int exponent) throws Exception {
        if (base == 0 && exponent < 0) {
            System.out.println("底数为0的时候，指数不可以为负数！");
            throw new Exception("底数为0的时候，指数不可以为负数");
        }
        if (exponent == 0) return 1;
        int absExponent = exponent;
        if (exponent < 0) absExponent = exponent * (-1);
        double result = power(base, absExponent);
        if (exponent < 0) result = 1.0 / result;
        return result;
    }

    public static double power(double base, int exponent) {
        if (exponent == 1) return base;
        if (exponent == 2) return base * base;
        if ((int)(1 & exponent) == 0) {
            return power(base, exponent >> 1) * power(base, exponent >> 1);
        }
        return power(base, exponent >> 1) * power(base, exponent >> 1) * base;
    }
}
