public class Mixed129{
    static class ListNode{
        ListNode next;
        int val;
        public ListNode(int val){
            this.val = val;

        }
    }
    public ListNode reverseList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Mixed129 solution = new Mixed129();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }
        System.out.println(" -> null");
    }
}