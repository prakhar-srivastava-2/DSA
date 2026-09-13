public class BalancedBinaryTree{
    //optimised approach
    public boolean isBalanced(TreeNode root){
        return depth(root)!=-1;

    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left  = depth(root.left);
        if(left==-1){
            return -1;
        }
        int right  = depth(root.right);
        if(right==-1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return 1+Math.max(left,right);
    }
}
    // public boolean isBalanced(TreeNode root){
    //     if(root==null){
    //         return true;
    //     }

    //     if(Math.abs(depth(root.left) - depth(root.right))>1){
    //         return false;
    //     }
    //     return isBalanced(root.left) && isBalanced(root.right);

    // }
    // public int depth(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     return 1+Math.max(depth(root.left),depth(root.right));
    // }
