public class Mixed152{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // Your solution
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
    public static void main(String[] args) {
        Mixed152 solution = new Mixed152();

        // Build the tree
        //         3
        //        / \
        //       5   1
        //      / \ / \
        //     6  2 0  8
        //       / \
        //      7   4

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Test Case 1: LCA of 5 and 1
        TreeNode p1 = root.left;
        TreeNode q1 = root.right;

        System.out.println(
            solution.lowestCommonAncestor(root, p1, q1).val
        ); // Expected: 3

        // Test Case 2: LCA of 5 and 4
        TreeNode p2 = root.left;
        TreeNode q2 = root.left.right.right;

        System.out.println(
            solution.lowestCommonAncestor(root, p2, q2).val
        ); // Expected: 5
    }
}