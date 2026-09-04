//1 → 2 → 3 → 4 → 5 → null
//n = 2
//1 → 2 → 3 → 5 → null
public class RemoveNthNode{
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next  = head;
        Node slow = dummy;
        Node fast = dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
