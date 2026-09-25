
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Mixed60{

    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>>result = new ArrayList<>();
        Deque<TreeNode>queue = new ArrayDeque<>();
        if(root==null){
            return result;
        }
        queue.offer(root);
        int x=0;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer>res = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                res.add(curr.val);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            if(x%2==1){
                Collections.reverse(res);
            }
            result.add(res);
            x++;
        }

        return result;
    }

    public static void main(String[] args) {

    /*
             3
            / \
           9   20
              /  \
             15   7
    */

    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    List<List<Integer>> result = zigzagLevelOrder(root);

    System.out.println(result);
}

}