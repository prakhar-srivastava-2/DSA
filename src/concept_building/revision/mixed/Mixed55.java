public class Mixed55{
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return null;
        }
        if(p==root || q==root){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left!=right){
            return root;
        }
        return (left!=null?left:right);
    }
    public static void main(String[] args) {

        /*
                 3
                / \
               5   1
              / \ / \
             6  2 0  8
               / \
              7   4
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;                    // 5
        TreeNode q = root.right;                   // 1

        TreeNode result = lowestCommonAncestor(root, p, q);

        System.out.println("LCA: " + result.val);
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}