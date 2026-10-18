public class Mixed121 {
    static Integer prev = null;
    public static boolean ValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!ValidBST(root.left)) {
            return false;
        }

        if (prev != null && root.val <= prev) {
            return false;
        }

        prev = root.val;

        return ValidBST(root.right);
    }
    public static boolean isValidBST(TreeNode root){
        prev = null;
        return ValidBST(root);
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Mixed121 sol = new Mixed121();
        // Test 1: Valid BST
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        System.out.println("Test 1 (Valid BST): " + sol.isValidBST(root1));
        // Expected: true


        // Test 2: Invalid BST
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        System.out.println("Test 2 (Invalid BST): " + sol.isValidBST(root2));
        // Expected: false


        // Test 3: Call method again with a smaller valid BST
        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(1);
        root3.right = new TreeNode(3);

        System.out.println("Test 3 (Repeated call): " + sol.isValidBST(root3));
        // Expected: true


        // Test 4: Integer.MIN_VALUE boundary
        TreeNode root4 = new TreeNode(Integer.MIN_VALUE);
        root4.right = new TreeNode(0);

        System.out.println("Test 4 (MIN_VALUE): " + sol.isValidBST(root4));
        // Expected: true


        // Test 5: Integer.MAX_VALUE boundary
        TreeNode root5 = new TreeNode(Integer.MAX_VALUE);
        root5.left = new TreeNode(0);

        System.out.println("Test 5 (MAX_VALUE): " + sol.isValidBST(root5));
        // Expected: true
    }
}