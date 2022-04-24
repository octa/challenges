package com.octa.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class A144_PreorderTraversal {
    private List<Integer> array = new ArrayList();

    public static class TreeNode {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return array;
    }

    public void preOrder(TreeNode root) {
        if(root!=null) {
            array.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
