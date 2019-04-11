package JianZhiOffer.Q6;

/**
 * @author ZXY
 * @create 2019-03-12 10:31
 */
public class PrintListnodeRecu {
    public static void printListRecu(ListNode ln) {
        if (ln.listNode != null) {
            printListRecu(ln.listNode);
        }
        System.out.println(ln.value);
    }
}
