package main.java;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        BinaryTreeInorderTraversal inorderTraversal = new BinaryTreeInorderTraversal();
        System.out.println(inorderTraversal.inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            inorderTrav(root, list);
        }
        return list;
    }

    public void inorderTrav(TreeNode node, List<Integer> list) {
        if (node != null) {
            inorderTrav(node.left, list);
            list.add(node.val);
            inorderTrav(node.right, list);
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}