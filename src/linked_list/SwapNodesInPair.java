//1 → 2 → 3 → 4
//2 → 1 → 4 → 3
public class SwapNodesInPair{
    public static Node swapNodes(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node first = head;
        Node second = head.next;

        while(second!=null && second.next!=null){
            Node third = second.next;
            prev.next = second;
            second.next = first;
            first.next = third;

            prev = first;
            first=third;

            if(first!=null){
                second = first.next;
            }

        }
        return dummy.next;



    }
}