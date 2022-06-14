import java.util.Scanner;

public class Merge_Two_Linked_Lists {
    static Node h1, h2;
    static void insert1(int data){
        Node n=new Node(data);
        if (h1==null){
            h1=n;
        }
        else {
            Node te=h1;
            while (te.next!=null)
                te=te.next;
            te.next=n;
        }
    }
    static void insert2(int data){
        Node n=new Node(data);
        if (h2==null){
            h2=n;
        }
        else {
            Node te=h2;
            while (te.next!=null)
                te=te.next;
            te.next=n;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        for(int i=1;i<=n1;i++){
            insert1(s.nextInt());
        }
        int n2=s.nextInt();
        for(int j=1;j<=n2;j++){
            insert2(s.nextInt());
        }

        // Among h1 and h2, least value node assigned will be h1 always
        if(h1.data>h2.data){
            Node t=h1;
            h1=h2;
            h2=t;
        }

        Node res=h1;
        while (h2 != null){
            Node temp=null;
            while (h1!=null && h1.data<=h2.data){
                temp=h1;
                h1=h1.next;
            }
            temp.next=h2;

            Node t=h1;
            h1=h2;
            h2=t;
        }
        display(res);
        //Time: O(n1+n2)
        //Space: O(1)
    }
    static void display(Node res) {
        Node t=res;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
