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
    final List<Integer> list = new ArrayList<>();
    public void help(TreeNode root ){
        // if(root1 == null && root2 == null) return ;
        if(root == null) return;
        // if(root2 == null) return;
        list.add(root.val);
        help(root.left);
        // if(root1 != null )list.add(root1.val);
        // if(root2 != null )list.add(root2.val);
        help(root.right);

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        help(root1);
        help(root2);
        Collections.sort(list);
        return list;
    }
}