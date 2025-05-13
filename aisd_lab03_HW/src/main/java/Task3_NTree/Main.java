package Task3_NTree;

import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.addChild(1);
        root.addChild(2);
        root.addChild(3);
        root.addChild(4);

        root.descendants.get(0).addChild(11);
        root.descendants.get(0).addChild(12);

        root.descendants.get(2).addChild(31);

        TreeNode<Integer> temp = root.descendants.get(1);
        temp.addChild(21);
        temp.addChild(22);
        temp.addChild(23);
        temp.addChild(24);
//
        temp.descendants.get(2).addChild(231);
        temp.descendants.get(2).addChild(232);
        temp.descendants.get(2).addChild(233);
        temp.descendants.get(2).addChild(234);
        temp.descendants.get(2).addChild(235);

        System.out.println(obhod(root));
    }

    public static String obhod(TreeNode root) {
        if (root == null) {
            return "NULL";
        }

        String childrenStr;
        if (root.descendants.isEmpty()) {
            childrenStr = "NULL";
        } else {
            childrenStr = childrens(root.descendants, 0);
        }

        return "(" + root.value + ", " + childrenStr + ")";
    }

    //рекурсивная функция для обработки списка детей
    private static String childrens(ArrayList<TreeNode> children, int index) {
        if (index >= children.size()) {
            return "";
        }

        String currentChildStr = obhod(children.get(index));
        String remainingChildrenStr = childrens(children, index + 1);

        if (remainingChildrenStr.isEmpty()) {
            return currentChildStr;
        } else {
            return currentChildStr + ", " + remainingChildrenStr;
        }
    }


    public static class TreeNode <T> {
        ArrayList<TreeNode> descendants = new ArrayList<>();
        T value;

        public TreeNode(T value) {
            this.value = value;
        }

        public void addChild(T value) {
            TreeNode<T> treeNode = new TreeNode<>(value);
            descendants.add(treeNode);
        }

        public TreeNode getInfo(TreeNode treeNode) {
            return treeNode;
        }

    }
}
