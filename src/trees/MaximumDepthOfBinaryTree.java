public class MaximumDepthOfBinaryTree{
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(depth(root.left),depth(root.right));
    }
    //main function();
}