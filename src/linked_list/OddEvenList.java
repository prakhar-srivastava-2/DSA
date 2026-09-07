// 1 → 2 → 3 → 4 → 5 → null

//1 → 3 → 5 → 2 → 4 → null

public class OddEvenList{
    public static Node oddEvenList(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node even = head.next;
        Node odd = head;
        Node evenHead = even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd=odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}