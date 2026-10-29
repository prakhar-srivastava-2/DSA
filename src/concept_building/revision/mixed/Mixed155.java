public class Mixed155{
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode dummy = new ListNode(0);
        int carry=0;
        ListNode curr = dummy;
        while(curr1!=null || curr2!=null || carry>0){
            int num1 = curr1!=null?curr1.val:0;
            int num2 = curr2!=null?curr2.val:0;
            int num = num1+num2+carry;
            carry = num/10;
            int new_num = num%10;
            curr.next = new ListNode(new_num);
            curr=curr.next;
            if(curr1!=null){
                curr1 = curr1.next;
            }
            if(curr2!=null){
                curr2 = curr2.next;
            }

        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }

}