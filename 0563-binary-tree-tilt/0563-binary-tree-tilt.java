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
    int tilt = 0;
    public int solve(TreeNode root){
        if(root == null) return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        tilt += Math.abs(r - l);
        return root.val + l + r;
    }
    public int findTilt(TreeNode root) {
        solve(root);
        return tilt;
    }
}