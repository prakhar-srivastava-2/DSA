public class BSTSearch{
    public TreeNode search(TreeNode root, int k){
        if(root==null){
            return null;
        }
        if(root.val==k){
            return root;
        }
        if(root.val<k)
        {
            return search(root.right,k);
        }
        if(root.val>k){
            return search(root.left, k);
        }
        return null;
    }
}