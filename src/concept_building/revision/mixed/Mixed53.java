
import java.util.HashSet;
import java.util.Set;

public class Mixed53{
    static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
    public static ListNode removeDuplicates(ListNode head){
        Set<Integer>set = new HashSet<>();
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr!=null && curr.next!=null){
            if(set.contains(curr.next.val)){
                curr.next = curr.next.next;
            }
            else{
                set.add(curr.next.val);
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(3);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next = new ListNode(1);
    head.next.next.next.next.next.next = new ListNode(5);

    ListNode result = removeDuplicates(head);

    ListNode curr = result;

    while(curr != null){
        System.out.print(curr.val);

        if(curr.next != null){
            System.out.print(" -> ");
        }

        curr = curr.next;
    }
}
}