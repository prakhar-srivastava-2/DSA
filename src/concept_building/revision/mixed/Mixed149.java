public class Mixed149{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    static int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
    // Your solution
        diameter=0;
        if(root==null){
            return 0;
        }
        height(root);
        return diameter;
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        diameter = Math.max(diameter,left+right);
        return 1+Math.max(left, right);
    }
    public static void main(String[] args) {
        Mixed149 solution = new Mixed149();

        // Tree: [1, 2, 3, 4, 5]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        System.out.println(solution.diameterOfBinaryTree(root1));
        // Expected output: 3

        // Tree: [1, 2]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        System.out.println(solution.diameterOfBinaryTree(root2));
        // Expected output: 1
    }
}