public class DiameterOfATree{
    public int diameterOfBinaryTree(TreeNode root) {
    depth(root);
    return diameter;
}
    int diameter = 0;
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = 0;
        int right=0;
        if(root.left!=null){
        left = depth(root.left);
        }
        if(root.right!=null){
        right = depth(root.right);
        }
        diameter = Math.max(diameter,left+right);
        return 1+Math.max(left,right);

    }
}