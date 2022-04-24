package com.octa.challenges.leetcode;

public class A701_InsertBST {
    public class TreeNode {
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        if(val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}