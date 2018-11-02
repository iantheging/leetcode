package easy;

import java.util.LinkedList;

public class Depth_of_Binary {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
