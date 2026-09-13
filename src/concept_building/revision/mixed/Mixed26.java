public class Mixed26{
    public static Node deleteNFromEnd(Node head, int n){
        if (head==null){
            return null;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node mid  = dummy;
        Node fast = dummy;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null && fast.next!=null){
            fast = fast.next;
            mid = mid.next;
        }
        mid.next = mid.next.next;
        return dummy.next;
    }
}