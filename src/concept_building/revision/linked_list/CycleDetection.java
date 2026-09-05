// 1 → 2 → 3 → 4
//         ↑   ↓
//         └───┘

public class CycleDetection{
    public static boolean hasCycle(Node head){
        if(head==null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }




    private static class Node {

        private Node next;

        public Node() {
        }
    }
}