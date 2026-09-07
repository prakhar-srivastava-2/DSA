//1 → 2 → 2 → 1 → null
//true;
public class LinkedListPalindrome{
    public static boolean palindrome(Node head){
        Node fast = head;
        Node mid = head;
        if(head==null){
            return true;
        }
        while(fast!=null && fast.next!=null){
            mid = mid.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr2 = mid;
        Node next;
        while (curr2!=null){
            next = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = next;
        }
        Node curr = head;
        Node curr1 = prev;
        while(curr1!=null){
            if(curr.val!=curr1.val){
                return false;
            }
            curr = curr.next;
            curr1 = curr1.next;
        }
        return true;
    }
}