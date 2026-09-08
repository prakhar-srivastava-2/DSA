public class Mixed14{
    public static Node removeNthFromEnd(Node head, int n){
        //1 → 2 → 3 → 4 → 5 → 6
        //op => 1 → 2 → 3 → 5 → 6
        //int n  =3;
        if(head==null){
            return null;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next;

        }
        slow.next = slow.next.next;
        return dummy.next;

    }
}