public class Reverse_LinkedList_In_Groups_K {
    static LinkedListNode reverse(LinkedListNode head, int n, int[] a){
        LinkedListNode dum=new LinkedListNode(-1);
        dum.next=head;
        LinkedListNode pre=dum, curr=head, next=dum;

        int co=0;
        while(curr!=null){
            co+=1;
            curr=curr.next;
        }

        int in=0;
        while(co>0 && in<n){
            curr=pre.next;
            next=curr.next;
            //int x=co>a[in]?a[in]:co;
            int x=Math.min(co, a[in]);
            if(x==0){
                in++;
                continue;
            }
            //if there are x elements then x-1 links need to be changed
            for(int i=1;i<x;i++){
                curr.next=next.next;
                next.next=pre.next;
                pre.next=next;
                next=curr.next;
            }
            co-=x;
            pre=curr;
            in++;
        }

        return dum.next;
    }
}
