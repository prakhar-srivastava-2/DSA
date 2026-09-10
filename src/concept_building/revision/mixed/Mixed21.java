import java.util.HashMap;
public class Mixed21{
    public static Node removeDuplicates(Node head){
        HashMap<Integer,Integer> visited = new HashMap<>();
        if(head==null){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        while(curr!=null && curr.next!=null){
            visited.put(curr.next.val, visited.getOrDefault(curr.next.val, 0)+1);
            curr=curr.next;
        }
        curr=dummy;
        while(curr!=null && curr.next!=null){
            if(visited.get(curr.next.val)>1){
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}