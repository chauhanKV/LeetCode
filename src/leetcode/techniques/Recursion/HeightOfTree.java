package leetcode.techniques.Recursion;

public class HeightOfTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
    //Memory Usage: 43.7 MB, less than 16.92% of Java online submissions for Maximum Depth of Binary Tree.
    //Next challenges:
    //Balanced Binary Tree
    //Minimum Depth of Binary Tree
    //Maximum Depth of N-ary Tree
    //Time Needed to Inform All Employees

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

}
