public class Mixed39{
    private static int prev = Integer.MIN_VALUE;
    public static boolean validateBST(TreeNode root){
        if(root==null){
            return true;
        }

        if(!validateBST(root.left)){
            return false;
        }
        if(root.val<=prev){
            return false;
        }
        prev = root.val;

        return validateBST(root.right);

    }
}