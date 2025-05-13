package Task2_StringTree;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.right = new TreeNode<>(3);
        root.right.right = new TreeNode<>(2);
        root.right.right.right = new TreeNode<>(1);
        root.left = new TreeNode<>(9);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        System.out.println(obhod(root));
    }

    public static String obhod(TreeNode root) {
        if (root == null) {
            return "NULL";
        }
        return "'(" + root.value + ", " + obhod(root.left) + ", " + obhod(root.right) + ")'";
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
