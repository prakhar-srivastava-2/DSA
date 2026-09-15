public class Mixed33{
    static long val = Long.MIN_VALUE;
    public static boolean validateBST(TreeNode root){
        if(root==null){
            return true;
        }
        if(!validateBST(root.left)){
            return false;
        }
        if(root.val<=val){
            return false;
        }
        val = root.val;
        return validateBST(root.right);

    }

    private static class TreeNode {

        private TreeNode left;
        private long val;
        private TreeNode right;

        public TreeNode(long val) {
            this.val = val;
        }
    }
}