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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null ) return 0;
        ArrayList<Long> sumcounter = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        long sum = 0;

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null) {
                sumcounter.add(sum);
                sum = 0;
                if(q.isEmpty()) break;
                q.add(null);
                continue;
            }
            sum += curr.val;
            if(curr.left != null ) q.add(curr.left);
            if(curr.right != null ) q.add(curr.right);
        }

        Collections.sort(sumcounter);
        if (k > sumcounter.size()) return -1;

        return sumcounter.get(sumcounter.size() - k);
    }
}