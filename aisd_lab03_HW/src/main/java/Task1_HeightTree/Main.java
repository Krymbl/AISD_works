package Task1_HeightTree;

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

    public static int obhod(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int coutLeft = 1 + obhod(root.left);
        int coutRight = 1 + obhod(root.right);
        return coutLeft > coutRight ? coutLeft : coutRight;
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
