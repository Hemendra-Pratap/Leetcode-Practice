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
    public static TreeNode InOrderSUck(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public TreeNode help(TreeNode root, int key){
            if(root == null) return null;
            if(root.val < key)  root.right = help(root.right, key);
            else if(root.val > key)  root.left = help(root.left, key);
            else{
                // no child
                if(root.left == null && root.right == null){
                    return null;
                }
                if(root.left == null) {
                    return root.right;
                }
                if(root.right == null){
                    return root.left;
                }
                TreeNode IS = InOrderSUck(root.right);
                root.val  = IS.val;
                root.right = help(root.right, IS.val);
            }
            return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return help(root, key);
    }
}