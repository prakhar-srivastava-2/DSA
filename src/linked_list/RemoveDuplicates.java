//1 → 1 → 2 → 3 → 3 → 4 → 4 → 5 → null
//1 → 2 → 3 → 4 → 5 → null

public class RemoveDuplicates{
    public static Node removeDuplicates(Node head){
        if(head==null){
            return null;
        }
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }
            else{
            curr = curr.next;
            }
        }
        return head;

    }
}