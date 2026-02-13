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
    int diameter = 0;
    private int dfs(TreeNode node){
        if(node == null) return 0;

        int l = dfs(node.left);
        int r = dfs(node.right);

        diameter =  Math.max(l+r, diameter);

        return Math.max(l , r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }
}