package easy;

public class Validate_Binary {

    public boolean isValidBST(TreeNode root) {
//        if (root == null) {
//            return true;
//        } else {
//            if ((root.left != null && root.val <= root.left.val) || (root.right != null && root.val >= root.right.val)) {
//                return false;
//            }
//            boolean rBool = isValidBST(root.left);
//            boolean lBool = isValidBST(root.right);
//
//            return (rBool && lBool);
//        }
        return BSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean BSTHelper(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.val < min || node.val > max) {
            return false;
        }

        return (BSTHelper(node.left, min, node.val - 1) && BSTHelper(node.right, node.val + 1, max));
    }
}
