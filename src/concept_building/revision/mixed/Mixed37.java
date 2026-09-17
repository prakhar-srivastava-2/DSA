
import java.util.HashSet;
import java.util.Set;

public class Mixed37{
    public ListNode unsort(ListNode head){
        if(head==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr  = dummy;
        Set<ListNode>set = new HashSet<>();
        while(curr!=null && curr.next!=null){
            if(set.contains(curr.next)){
                curr.next = curr.next.next;
            }
            else{
                set.add(curr.next);
            }
            curr = curr.next;
        }
        return dummy.next;

    }
}