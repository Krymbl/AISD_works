package Task6_CountPotomki;

import javax.swing.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.right = new TreeNode<>(3);
        root.left = new TreeNode<>(9);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        System.out.println(obhod(root));
    }

    public static int obhod(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1 + obhod(root.right) + obhod(root.left);
        System.out.println(root.value + " " + count);
        return count;
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
