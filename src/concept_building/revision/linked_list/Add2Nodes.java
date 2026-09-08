// l1: 9 → 9 → 9
// l2: 1

// Output: 0 → 0 → 0 → 1
public class Add2Nodes{
    public static Node addTwoNumbers(Node l1, Node l2){

        Node curr1 = l1;
        Node curr2 = l2;
        Node dummy = new Node(0);
        Node curr3 = dummy;
        int carry = 0;
        while(curr1!=null || curr2!=null || carry>0){
            int d1 = (curr1!=null) ? curr1.val:0;
            int d2 = (curr2!=null) ? curr2.val:0;
            int d3 = d1+d2+carry;
            carry = d3/10;
            int num = d3%10;
            Node curr4 = new Node(num);
            curr3.next = curr4;
            curr3 = curr3.next;

            if(curr1!=null){
                curr1=curr1.next;
            }
            if(curr2!=null){
                curr2 = curr2.next;
            }
        }
        return dummy.next;

    }














    private static class Node {

        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;

        }
    }
}