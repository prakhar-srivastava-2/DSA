public class Mixed73{
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

        // Create nodes
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        // Create linked list:
        // 3 -> 2 -> 0 -> -4
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Create cycle:
        // -4 -> 2
        n4.next = n2;

        System.out.println(hasCycle(n1));
    }

    public static boolean hasCycle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode slow =head;
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow  =slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}