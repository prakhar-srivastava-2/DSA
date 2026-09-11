        //      10
        //    /    \
        //   5      15
        //  / \    /  \
        // 3   7  12   20
        //    /
        //   6
// op=>10 5 3 7 6 15 12 20
public class PreorderTraversal{

    public static void preorder(TreeNode root){
        TreeNode curr = root;
        if(curr==null){
            return;
        }
        System.out.println(curr.val);
        preorder(curr.left);
        preorder(curr.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        root.left.right.left = new TreeNode(6);
        preorder(root);
    }
    // static class TreeNode {
    //     TreeNode left;
    //     TreeNode right;
    //     int val;

    //     TreeNode(int val) {
    //         this.val = val;
    //     }
    // }
}