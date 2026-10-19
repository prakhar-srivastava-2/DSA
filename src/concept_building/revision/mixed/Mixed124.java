public class Mixed124{
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Mixed124 solution = new Mixed124();

        // Test case 1: [1,2,3,4,5], n = 2
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        head1 = solution.removeNthFromEnd(head1, 2);
        printList(head1); // Expected: 1 -> 2 -> 3 -> 5

        // Test case 2: [1], n = 1
        ListNode head2 = new ListNode(1);

        head2 = solution.removeNthFromEnd(head2, 1);
        printList(head2); // Expected: Empty list

        // Test case 3: [1,2], n = 1
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);

        head3 = solution.removeNthFromEnd(head3, 1);
        printList(head3); // Expected: 1
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}