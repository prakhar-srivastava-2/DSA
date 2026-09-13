public class SymetricTree{
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        if(root.left==null || root.right==null){
            return false;
        }
        if(root.left.val != root.right.val){
            return false;
        }
        return isMirror(root.left,root.right);

    }
    private boolean isMirror(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}