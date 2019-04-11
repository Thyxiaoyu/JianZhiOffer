package JianZhiOffer.Q35;

/**
 * @author ZXY
 * @create 2019-04-03 9:38
 * 老来多健忘，唯不忘相思
 */
public class Q35Solution {
    public static void main(String[] args) {
        ComplexListNode n1 = new ComplexListNode(1);
        ComplexListNode n2 = new ComplexListNode(2);
        ComplexListNode n3 = new ComplexListNode(3);
        ComplexListNode n4 = new ComplexListNode(4);
        ComplexListNode n5 = new ComplexListNode(5);
        n1.nextNode = n2;
       // n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;
        n1.sibling = n2;
        n2.sibling =n1;
        //n4.sibling = n2;
        System.out.println(ComplexListNodeClone.complexListNodeClone(n1));
        System.out.println(n1.sibling);
    }
}
