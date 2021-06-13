package int_maxdepthoftree;

public class Solution {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNodes root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }
}



