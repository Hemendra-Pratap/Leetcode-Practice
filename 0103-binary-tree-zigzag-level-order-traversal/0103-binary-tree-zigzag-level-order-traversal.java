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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.add(root);

        int checker = 1;
        while(!dq.isEmpty()){
            int size = dq.size();
            Deque<Integer> level = new ArrayDeque<>();
            for(int i=0;i<size;i++){
                TreeNode curr = dq.poll();
                if(checker%2==0){
                    //right
                    level.addFirst(curr.val);
                }else{
                    // left
                    level.addLast(curr.val);
                }

                if(curr.left != null) dq.add(curr.left);
                if(curr.right != null) dq.add(curr.right);
            }

            res.add(new ArrayList<>(level));
            checker++;
        }

        return res;
    }
}