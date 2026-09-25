
import java.util.LinkedHashMap;

public class Mixed59{
    static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

    public static ListNode deleteDuplicates(ListNode head){
        if (head==null){
            return null;
        }

        LinkedHashMap<Integer,Integer>map = new LinkedHashMap<>();
        ListNode curr = head;
        while(curr!=null){
            if(map.containsKey(curr.val)){
                map.put(curr.val,map.get(curr.val)+1);
            }
            else{
                map.put(curr.val,1);
            }
            curr = curr.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode current  = dummy;
        curr = head;
        while(curr!=null){
            if(map.get(curr.val)==1){
                current.next = curr;
                current = current.next;
            }
            curr = curr.next;
        }
        current.next = null;
        return dummy.next;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode result = deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
    }
}
}