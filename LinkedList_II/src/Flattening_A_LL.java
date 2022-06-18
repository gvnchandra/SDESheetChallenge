public class Flattening_A_LL {
    static Node merge(Node a, Node b){
        Node res=new Node(-1);
        Node temp=res;

        //Implementing merge sort
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.child=a;
                a=a.child;
            }
            else{
                temp.child=b;
                b=b.child;
            }
            temp=temp.child;
        }

        //if linked list has some nodes remaining
        if(a!=null)
            temp.child=a;
        else
            temp.child=b;
        return res.child;
    }
    public static Node flattenLinkedList(Node root) {
        if(root==null || root.next==null)
            return root;
        root.next=flattenLinkedList(root.next);
        root=merge(root,root.next);
        return root;
    }
}
