public class Mixed70{
    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverseList(ListNode head) {
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

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode result = reverseList(head);

    ListNode curr = result;

    while(curr != null){
        System.out.print(curr.val + " ");
        curr = curr.next;
    }
}
}
// 1 → 2 → 3 → 4 → 5 → null