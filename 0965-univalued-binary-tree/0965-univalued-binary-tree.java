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
    public void help(TreeNode root, HashSet<Integer> set){
        if(root == null) return ;

        set.add(root.val);
        help(root.left, set);
        help(root.right, set);
    }
    public boolean isUnivalTree(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        help(root, set);

        return set.size()==1;

    }
}