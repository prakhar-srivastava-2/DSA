// List 1: 1 → 3 → 5 → null
// List 2: 2 → 4 → 6 → null

//1 → 2 → 3 → 4 → 5 → 6 → null
public class MergeTwoSortedList{
    public static Node mergeTwoLists(Node list1, Node list2){
        Node curr1 = list1;
        Node curr2 = list2;
        if(curr1==null){
            return curr2;
        }
        if (curr2 == null){
            return curr1;
        }
        Node dummy = new Node(0);
        Node tail  =dummy;
        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                tail.next = curr1;
                curr1=curr1.next;
            }
            else{
                tail.next = curr2;
                curr2  = curr2.next;
            }
            tail = tail.next;
        }
        tail.next = (curr1!=null)?curr1:curr2;
        return dummy.next;
    }

    }
