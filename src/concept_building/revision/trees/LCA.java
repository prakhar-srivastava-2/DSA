public class LCA{
    //     3
    //    / \
    //   5   1
    //  / \
    // 6   2
    //    / \
    //   7   4

    public TreeNode lowestCommonAncestral(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return root;
        }

        if(root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestral(root.left, p, q);
        TreeNode right = lowestCommonAncestral(root.right, p, q);
        if(left!=null && right!=null){
            return root;
        }
        return left!=null?left:right;
    }

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        public TreeNode() {
        }
    }
}