public class LCA2{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null){
        return null;
    }
    if(p==root || q==root){
        return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if(left!=null && right!=null){
        return root;
    }
    return left!=null?left:right;
}
}