//list A = 4-1-8-4-5
//list B = 5-6-1-8-4-5
public class IntersectionAtNode{
    public static Node intersect(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        if (head1==null || head2==null){
            return null;
        }
        while(curr1!=curr2){
            if(curr1==null){
                curr1 = head2;
            }
            else{
                curr1 = curr1.next;
            }

            if(curr2==null){
                curr2 = head1;

            }
            else{
                curr2=curr2.next;
            }
        }
        return curr1;
    }
}
