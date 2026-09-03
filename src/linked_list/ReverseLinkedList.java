//10 → 20 → 30 → 40 → 50 → null
//50 → 40 → 30 → 20 → 10 → null
public class ReverseLinkedList{
    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;

        }
        return prev;

    }
}