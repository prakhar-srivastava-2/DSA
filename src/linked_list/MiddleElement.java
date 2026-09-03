public class MiddleElement{
    public static void main(String[] args) {
        Node head = null;
        //10->20->30->40->50
        Node curr = head;
        Node left = curr;
        Node right = curr;
        while(right!=null&& right.next!=null){
            left = left.next;
            right = right.next.next;
        }
        System.out.println(left.val);

    }
}