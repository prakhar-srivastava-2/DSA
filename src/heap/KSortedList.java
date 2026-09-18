
import java.util.PriorityQueue;

public class KSortedList{
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>heap = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];

        }
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
            heap.offer(lists[i]);
            }
        }

        while(!heap.isEmpty()){
            ListNode Node = heap.poll();
            curr.next = Node;
            curr = curr.next;
            if(Node.next!=null){
                heap.offer(Node.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(5);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode l3 = new ListNode(2);
    l3.next = new ListNode(6);

    ListNode[] lists = {l1, l2, l3};

    ListNode result = mergeKLists(lists);

    ListNode curr = result;

    while (curr != null) {
        System.out.print(curr.val + " ");

        curr = curr.next;
    }
}

}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}