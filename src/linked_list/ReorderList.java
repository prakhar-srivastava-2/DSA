//1 → 2 → 3 → 4 → 5 → null
//1 → 5 → 2 → 4 → 3 → null

public class ReorderList{
    public static void reorderList(Node head){
        if(head==null){
            return;
        }
        Node mid = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            mid = mid.next;
            fast=fast.next.next;
        }
        Node curr = head;
        while(curr.next!=mid){
            curr = curr.next;
        }
        curr.next=null;


        Node curr2 = mid;
        Node prev = null;
        Node next;
        while(curr2!=null){
            next = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = next;
        }
        curr = head;
        Node curr1 = prev;

        while(curr1!=null){
            Node firstNext = curr.next;
            Node secondNext = curr1.next;
            curr.next = curr1;
            curr1.next = firstNext;
            curr = firstNext;
            curr1 = secondNext;
        }
    }
}