package JianZhiOffer.Q21;

/**
 * @author ZXY
 * @create 2019-04-01 21:38
 * 老来多健忘，唯不忘相思
 */
public class isEven implements Judge {
    @Override
    public boolean judge(int i) {
        return  (i & 1) == 0;
    }
}
