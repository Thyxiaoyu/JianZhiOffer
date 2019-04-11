package JianZhiOffer.Q30;

import java.util.ArrayDeque;

/**
 * @author ZXY
 * @create 2019-04-02 16:42
 * 老来多健忘，唯不忘相思
 */
public class StackWithMin {
    private ArrayDeque<Integer> data = new ArrayDeque();
    private ArrayDeque<Integer> min = new ArrayDeque();
    public void push(Integer goal) {
        if (data.isEmpty() && min.isEmpty()) {
            data.push(goal);
            min.push(goal);
            return;
        }
        data.push(goal);
        min.push(Math.min(min.peekFirst(), goal));
    }

    public Integer pop() {
        min.pop();
        return data.pop();
    }

    public Integer min() {
        return min.peekFirst();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return "StackWithMin{" +
                "data=" + data +
                '}';
    }
}
