
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed36{
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer>result = new ArrayList<>();
    List<List<Integer>>res = new ArrayList<>();
    Deque<TreeNode>val = new ArrayDeque<>();
    if(root==null){
        return result;
    }
    val.offer(root);
    while(!val.isEmpty()){
        List<Integer>vals = new ArrayList<>();
        int size = val.size();

        for(int i=0;i<size;i++){
        TreeNode curr = val.poll();
        vals.add(curr.val);
        if(curr.left!=null){
            val.offer(curr.left);
        }
        if(curr.right!=null){
            val.offer(curr.right);
        }
        }
        res.add(vals);
    }
    for(int i=0;i<res.size();i++){
        result.add(res.get(i).get(res.get(i).size()-1));
    }
    return result;
}
}