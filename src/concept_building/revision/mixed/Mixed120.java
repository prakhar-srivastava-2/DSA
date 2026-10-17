public class Mixed120{
    int val = Integer.MIN_VALUE;
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val<=val){
            return false;
        }
        val = root.val;
        return isValidBST(root.right);
    // Your code
    }
    public static void main(String[] args) {
        Mixed120 solution = new Mixed120();

        // Example 1: Valid BST
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(8);

        System.out.println(solution.isValidBST(root1)); // true

        // Example 2: Invalid BST
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(8);

        System.out.println(solution.isValidBST(root2)); // false

        // Example 3: Empty tree
        System.out.println(solution.isValidBST(null)); // true
    }
}