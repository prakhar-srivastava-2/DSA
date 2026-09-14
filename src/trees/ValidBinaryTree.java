
public class ValidBinaryTree{
    long prev = Long.MIN_VALUE;
    public boolean isValid(TreeNode root){
        if(root==null){
            return true;
        }
        if(!isValid(root.left)){
            return false;
        }
        if(root.val<=prev){
            return false;
        }
        prev = root.val;
        return isValid(root.right);
    }
}