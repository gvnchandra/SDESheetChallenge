import java.util.Scanner;

public class Reversing_A_Linked_List {
    static LinkedListNode head;
    static void insert(int data){
        LinkedListNode n=new LinkedListNode(data);
        if (head==null){
            head=n;
        }
        else {
            LinkedListNode te=head;
            while (te.next!=null)
                te=te.next;
            te.next=n;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=0;i<n;i++){
            insert(s.nextInt());
        }

        //reversing a linked list
        LinkedListNode pre=null, curr=head, next;
        while (curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head=pre;

        //LL is reversed
        System.out.println("After reversing a linked list");
        display();
    }

    static void display() {
        LinkedListNode t=head;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
