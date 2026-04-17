/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode help(TreeNode root, int target){
        if(root == null ) return root;

        root.left = help(root.left, target);
        root.right = help(root.right, target);

        if(root.left == null && root.right == null && root.val == target){
            root = null; 
        }

        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return help(root, target);

    }
}