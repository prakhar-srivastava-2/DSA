
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed48{
    public static List<Integer> rightSideView(TreeNode root){
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode>queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer>val = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                val.add(curr.val);
                if(curr.left!=null){
                queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            res.add(val);
        }
        for(int i=0;i<res.size();i++){
            result.add(res.get(i).get(res.get(i).size()-1));
        }
        return result;

    }
    public static void main(String[] args) {

    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(4);

    List<Integer> result = rightSideView(root);

    System.out.println(result);
}
static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
}