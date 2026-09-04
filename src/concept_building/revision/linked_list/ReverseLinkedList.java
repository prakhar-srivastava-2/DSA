
import javax.crypto.NullCipher;

//1 → 2 → 3 → 4 → 5 → null
//5 → 4 → 3 → 2 → 1 → null
public class ReverseLinkedList{
    public static Node reverseList(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node previous = null;
        Node next;
        Node curr=head;

        while(curr!=null){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr=next;
        }
        return previous;
    }


















    private static class Node {

        private Node next;

        public Node() {
        }
    }
}