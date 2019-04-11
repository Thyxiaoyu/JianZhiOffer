package JianZhiOffer.Q35;

/**
 * @author ZXY
 * @create 2019-04-03 9:16
 * 老来多健忘，唯不忘相思
 */
public class ComplexListNode {
    int value;
    ComplexListNode nextNode;
    ComplexListNode sibling;

    @Override
    public String toString() {
        return "ComplexListNode{" +
                "value=" + value +
                ", nextNode=" + nextNode +
                '}';
    }

    public ComplexListNode(int value) {
        this.value = value;
    }
}
