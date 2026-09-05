// 1 → 2 → 3 → 4 → 5 → null
// 5 → 4 → 3 → 2 → 1 → null
public class Reversing{
    public static Node reverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node curr  = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    private static class Node {

        private Node next;

        public Node() {
        }
    }
}
