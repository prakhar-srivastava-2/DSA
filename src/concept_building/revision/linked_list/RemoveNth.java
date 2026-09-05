// 1 → 2 → 3 → 4 → 5 → null
// n = 2
//op = > 1 → 2 → 3 → 5 → null
public class RemoveNth{
    public static Node removeNth(Node head){
        int n = 2;
        if(head==null){
            return null;
        }
        Node dummy = new Node(0);
        dummy.next=  head;
        Node fast = dummy;
        Node slow = dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }


    private static class Node {
        int val;
        private Node next;
        public Node(int val) {
        }
    }
}