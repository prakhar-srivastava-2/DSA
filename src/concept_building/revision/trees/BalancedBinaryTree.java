public class BalancedBinaryTree{
    public boolean isBalanced(TreeNode root) {
        if(depth(root)!=-1){
            return true;
        }
        return false;
    }

    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = depth(root.left);
        if(left==-1){
            return -1;
        }

        int right = depth(root.right);
        if(right==-1){
            return -1;
        }

        if(Math.abs(right-left)>1){
            return -1;
        }

    return 1+Math.max(left,right);
    }

}