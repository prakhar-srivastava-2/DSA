
// Output: false

// 1 → 2 → 3 → 4
//         ↑     ↓
//         └─────┘
// Output: true

public class LinkedListCycle{
    public static boolean hasCycle(Node head){
        // unoptimised
//         List<Node> traversed = new ArrayList<>();
//         boolean hasCycle = false;
//         if(head==null){
//             return false;
//         }
//         Node curr= head;
//         while(curr!=null){
//             if(traversed.contains(curr)){
//                 return true;
//             }
//             traversed.add(curr);
//             curr=curr.next;
//         }
//         return false;

    //more optimised
    Node slow = head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast==slow){
            return true;
        }
    }
    return false;
    }
}