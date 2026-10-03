public class Mixed83{
        static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {

        // TreeNode root = new TreeNode(3);

        // root.left = new TreeNode(9);

        // root.right = new TreeNode(20);
        // root.right.left = new TreeNode(15);
        // root.right.right = new TreeNode(7);

        // int result = maxDepth(root);

        // System.out.println(result);
        TreeNode root = new TreeNode(1);

    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    root.right.right.left = new TreeNode(4);
    root.right.right.left.right = new TreeNode(5);

    int result = maxDepth(root);

    System.out.println(result);
    }
}