

public class LowestCommonAncestral{
    //     3
    //    / \
    //   5   1
    //  / \ / \
    // 6  2 0  8
    //   / \
    //  7   4
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
       if(root==null){
        return root;
       }
       if(root==p || root==q){
        return root;
       }
       TreeNode left = lowestCommonAncestor(root.left, p, q);
       TreeNode right = lowestCommonAncestor(root.right, p, q);
       if(left!=null && right!=null){
        return root;
       }
       return left!=null? left:right;
    }
}