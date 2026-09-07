//1->2-3->null
//4->5-6->null
//op => 5->7->9
public class AddTwoNodes{
    public static Node addTwoNumbers(Node l1, Node l2){
        Node curr1 = l1;
        Node curr2 = l2;
        int carry = 0;
        Node head = new Node(0);
        Node curr = head;
        while(curr1!=null || curr2!=null || carry>0){
            int d1 = (curr1 != null) ? curr1.val : 0;
            int d2 = (curr2 != null) ? curr2.val : 0;
            int d3 = d1+d2+carry;
            carry = d3/10;
            int newVal = d3%10;
            Node curr3 = new Node(newVal);
            curr.next = curr3;
            curr=curr.next;
            if (curr1!=null){
            curr1 = curr1.next;
            }
            if(curr2!=null){
            curr2 = curr2.next;
            }
        }
        return head.next;
    }
}