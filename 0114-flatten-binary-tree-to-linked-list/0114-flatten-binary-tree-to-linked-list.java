class Solution {
    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }

        ArrayList<TreeNode> list = new ArrayList<>();

        // Preorder traversal
        preorder(root, list);

        // Connect nodes
        for (int i = 0; i < list.size() - 1; i++) {
            TreeNode current = list.get(i);
            TreeNode next = list.get(i + 1);

            current.left = null;
            current.right = next;
        }

        // Last node
        TreeNode last = list.get(list.size() - 1);
        last.left = null;
        last.right = null;
    }

    public void preorder(TreeNode root, ArrayList<TreeNode> list) {

        if (root == null) {
            return;
        }

        list.add(root);

        preorder(root.left, list);
        preorder(root.right, list);
    }
}