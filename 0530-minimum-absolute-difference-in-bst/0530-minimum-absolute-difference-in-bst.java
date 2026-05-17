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
    TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;

    public void help(TreeNode root){
        if(root == null ) return;

        help(root.left);
        
        if(prev != null){
            int currDiff = root.val - prev.val;
            minDiff = Math.min(currDiff, minDiff);
        }

        prev = root;

        help(root.right);

    }
    public int getMinimumDifference(TreeNode root) {
        help(root);
        return minDiff;
    }
}


















