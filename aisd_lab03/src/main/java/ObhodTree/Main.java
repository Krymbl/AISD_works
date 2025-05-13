package ObhodTree;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.right = new TreeNode<>(3);
        root.left = new TreeNode<>(9);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        System.out.println(preOrder(root));
    }

    public static boolean preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        return true;
    }

    public static class TreeNode <T> {
        TreeNode left;
        TreeNode right;
        T value;

        public TreeNode(T value) {
            this.value = value;
        }
    }
}
