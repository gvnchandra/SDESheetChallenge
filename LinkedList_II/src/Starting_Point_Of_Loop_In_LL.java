public class Starting_Point_Of_Loop_In_LL {
    public static LinkedListNode firstNode(LinkedListNode head)
    {
        LinkedListNode sl=head, fa=head;
        while(fa!=null && fa.next!=null){
            sl=sl.next;
            fa=fa.next.next;
            if(sl==fa){
                //cycle is detected
                sl=head;
                if(sl==fa){
                    return sl;
                }
                else{
                    while(sl.next!=fa.next){
                        sl=sl.next;
                        fa=fa.next;
                    }
                    return sl.next;
                }
            }
        }
        return null;
    }
}
