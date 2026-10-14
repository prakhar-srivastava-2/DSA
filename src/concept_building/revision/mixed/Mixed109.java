public class Mixed109{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast=dummy;
        ListNode med = dummy;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            med = med.next;
        }
        med.next = med.next.next;
        return dummy.next;
    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Mixed109 solution = new Mixed109();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        ListNode result = solution.removeNthFromEnd(head, n);

        // Print the resulting linked list
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}