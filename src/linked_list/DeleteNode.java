//10 → 20 → 30 → 40 → 50 → null
//value = 30
//10 → 20 → 40 → 50 → null

public class DeleteNode{
    public static Node deleteNode(Node head, int value){
        Node curr=head;
        if(head==null){
            return null;
        }
        if(curr.val == value){
            head = curr.next;
            return head;

        }
        while(curr.next !=null){
            if(curr.next.val == value){
                curr.next=curr.next.next;
                return head;
            }
            curr=curr.next;
        }
        return head;


    }
}