class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class LinkedListTraversal{
public static void main(String[] args) {
    Node node1 = new Node(10);
    Node node2 = new Node(20);
    Node node3 = new Node(30);
    Node node4 = new Node(40);

    Node head = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next=node4;

    Node current = head;
    while(current.next!=null){
        current = current.next;
    }
    current.next = insertAtEnd(50);

    Node curr = head;
    while(curr!=null){
        System.out.println(curr.val+" ");
        curr=curr.next;
    }
}
    public static Node insertAtEnd(int val){
        return new Node(val);
    }
}