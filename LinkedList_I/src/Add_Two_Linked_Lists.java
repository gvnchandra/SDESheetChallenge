import java.util.Scanner;

public class Add_Two_Linked_Lists {
    static LinkedListNode h1, h2;
    static void insert1(int data){
        LinkedListNode n=new LinkedListNode(data);
        if (h1==null){
            h1=n;
        }
        else {
            LinkedListNode te=h1;
            while (te.next!=null)
                te=te.next;
            te.next=n;
        }
    }
    static void insert2(int data){
        LinkedListNode n=new LinkedListNode(data);
        if (h2==null){
            h2=n;
        }
        else {
            LinkedListNode te=h2;
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

        LinkedListNode dum=new LinkedListNode(-1), temp=dum;
        int carry=0;
        while(h1!=null || h2!=null || carry==1){
            int sum=0;
            if(h1!=null){
                sum+=h1.data;
                h1=h1.next;
            }
            if(h2!=null){
                sum+=h2.data;
                h2=h2.next;
            }

            sum+=carry;
            carry=sum/10;
            temp.next= new LinkedListNode(sum%10);
            temp=temp.next;
        }
        //Time: O(max(n1,n2))
        //Space: O(1)
        display(dum.next);
    }
    static void display(LinkedListNode res) {
        LinkedListNode t=res;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
