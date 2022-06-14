import java.util.Scanner;

public class Remove_Nth_Node {
    static Node head;
    static void insert(int data){
        Node n=new Node(data);
        if (head==null){
            head=n;
        }
        else {
            Node te=head;
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

        int k=s.nextInt();
        Node dummy=new Node(-1), fa=dummy, sl=dummy;
        dummy.next=head;
        for(int i=1;i<=k;i++){
            fa=fa.next;
        }
        while(fa.next!=null){
            fa=fa.next;
            sl=sl.next;
        }
        sl.next=sl.next.next;
        //Time: O(n)
        //Space: O(1)
        display(dummy.next);
    }

    static void display(Node res) {
        Node t=res;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
