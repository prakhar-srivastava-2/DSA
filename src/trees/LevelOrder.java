
import java.util.ArrayDeque;
import java.util.Deque;

public class LevelOrder{
    public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Deque<TreeNode>level = new ArrayDeque<>();
        level.offer(root);
        while(!level.isEmpty()){
            TreeNode curr = level.poll();
            System.out.println(curr.val);

            if(curr.left!=null){
                level.offer(curr.left);
            }
            if(curr.right!=null){
                level.offer(curr.right);
            }

        }
    }
}