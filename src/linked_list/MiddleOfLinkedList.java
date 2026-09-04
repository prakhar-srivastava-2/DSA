//1-2-3-4-5-null
//-3-4-5-null
public class MiddleOfLinkedList{
    public static Node findSomething(Node head){
        if (head==null){
            return null;
        }
        int count = 0;
        Node curr = head;
        while (curr!=null){
            count+=1;
            curr = curr.next;
        }
        //count = 5
        int mid = count/2;
        int counter = 0;
        curr=head;
        while(counter<mid && curr!=null){
            counter+=1;
            curr=curr.next;
        }
        head = curr;
        return head;

    }
}