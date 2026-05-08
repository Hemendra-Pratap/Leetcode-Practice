class Solution {

    public static TreeNode inorderSucc(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public TreeNode help(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) {
            root.right = help(root.right, key);
        }else if (root.val > key) {
            root.left = help(root.left, key);
        }else {
            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2: one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // case 3: two children
            TreeNode is = inorderSucc(root.right);
            root.val = is.val;
            root.right = help(root.right, is.val);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        return help(root, key);
    }
}