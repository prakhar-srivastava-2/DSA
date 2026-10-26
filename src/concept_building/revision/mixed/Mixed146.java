public class Mixed146{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean isValidBST(TreeNode root){
        int prev = Integer.MIN_VALUE;
        return validateBST(root,prev);
    }
    public static boolean validateBST(TreeNode root, int prev){
        if(root==null){
            return true;
        }
        if(!validateBST(root.left, prev)){
            return false;
        }
        if(root.val<prev){
            return false;
        }
        prev  = root.val;
        return validateBST(root.right, prev);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println(isValidBST(root)); // true

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(8);

        System.out.println(isValidBST(root2)); // false
    }
}