// Input:  1 → 2 → 3 → 4 → 5, value = 1
// Output: 2 → 3 → 4 → 5

public class DeleteNode{
    public static Node deleteNode(Node head, int value){
        if (head==null){
            return head;
        }
        if(head.val==value){
            head=head.next;
            return head;
        }
        Node curr = head;
        while (curr!=null && curr.next!=null){
            if(curr.next.val==value){
                curr.next=curr.next.next;
                return head;
            }
            curr=curr.next;
        }
        return head;
    }

















    private static class Node {

        private Node next;
        private int val;

        public Node() {
        }
    }
}
