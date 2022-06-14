import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Reversing_A_Linked_List {
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

        //reversing a linked list
        Node pre=null, curr=head, next;
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
        Node t=head;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
