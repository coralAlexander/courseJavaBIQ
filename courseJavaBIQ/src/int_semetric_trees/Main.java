package int_semetric_trees;

public class Main {

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        isSymmetric(node);
    }

    public static boolean isSymmetric(TreeNode root) {
        return  isSymmetricInternal(root , root);
    }

    private static boolean isSymmetricInternal(TreeNode tn1 , TreeNode tn2){
        if(tn1 == null || tn2 == null ){
            return false;
        }
        if(tn1 == null && tn2 == null){
            return true;
        }
        return (tn1.val == tn2.val) && isSymmetricInternal(tn1.left, tn2.right) && isSymmetricInternal(tn1.right , tn2.left);
    }
}
