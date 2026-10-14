
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed110{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode>queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
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
            result.add(res);
        }
        return result;
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Mixed110 solution = new Mixed110();

        // Create binary tree:
        //         3
        //        / \
        //       9   20
        //          /  \
        //         15   7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = solution.levelOrder(root);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}