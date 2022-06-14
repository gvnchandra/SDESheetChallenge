import java.util.Scanner;

public class Middle_Of_A_Linked_List {
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

        Node sl=head, fa=head;
        while (fa!=null && fa.next!=null){
            sl=sl.next;
            fa =fa.next.next;
        }

        System.out.println("Middle of the linked list is "+sl.data);
    }
}
