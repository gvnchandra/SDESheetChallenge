public class Detect_Cycle_In_A_LL {
    public static boolean detectCycle(LinkedListNode head) {
        LinkedListNode sl=head, fa=head.next;
        while(fa!=null && fa.next!=null){
            if(sl==fa)
                return true;
            sl=sl.next;
            fa=fa.next.next;

        }
        return false;
    }
}
