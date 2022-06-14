public class Intersection_Of_A_Linked_Lists {

    static int findIntersection(LinkedListNode h1, LinkedListNode h2){

        //if intersection found, return the node's data otherwise return -1

        LinkedListNode a=h1, b=h2;
        while(a!=b){
            a=(a==null)?h2:a.next;
            b=(b==null)?h1:b.next;
        }
        if(a==null)
            return -1;
        return a.data;
    }
}
