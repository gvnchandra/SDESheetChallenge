public class Delete_A_Given_Node {
    public static void deleteNode(LinkedListNode node) {
        //given that it is not the tail node
        //just copying the next node data and reference stored in next of the next node
        // to the current node
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
