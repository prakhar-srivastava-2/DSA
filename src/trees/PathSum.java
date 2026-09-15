public class PathSum{
//         5
//        / \
//       4   8
//      /   / \
//     11  13  4
//    /  \      \
//   7    2      1

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }
        targetSum-=root.val;
    return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}