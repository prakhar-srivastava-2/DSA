
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LevelOrderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root){
        return order(root);
    }

    public List<List<Integer>> order(TreeNode root){
        Deque<TreeNode> level = new ArrayDeque<>();
        List<List<Integer>> nums = new ArrayList<>();
        if(root==null){
            return nums;
        }
        level.offer(root);
        while(!level.isEmpty()){
            int size = level.size();
            List<Integer> num = new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode curr = level.poll();
            num.add(curr.val);
            if(curr.left!=null){
                level.offer(curr.left);
            }
            if(curr.right!=null){
                level.offer(curr.right);
            }
        }
            nums.add(num);
        }
        return nums;

    }
}