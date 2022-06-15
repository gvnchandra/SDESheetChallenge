import java.util.Scanner;

public class Linked_List_Palindrome_Or_Not {
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
    static boolean isPalindrome(LinkedListNode head){
        //finding the middle of a linked list
        LinkedListNode sl=head, fa=head;
        while(fa.next!=null && fa.next.next!=null){
            sl=sl.next;
            fa=fa.next.next;
        }
        //found middle of LL

        //Reversing linked list right half
        sl.next=reverse(sl.next);

        //moving slow pointer by one step to to mark the beginning of right half
        sl=sl.next;

        while (sl!=null){
            if (sl.data!=head.data)
                return false;
            sl=sl.next;
            head=head.next;
        }
        return true;

    }
    static LinkedListNode reverse(LinkedListNode curr){
        LinkedListNode prev=null, next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=0;i<n;i++){
            insert(s.nextInt());
        }

        // to check if it is a palindrome or not, do reverse the right half of linkedlist
        if(isPalindrome(head))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}
