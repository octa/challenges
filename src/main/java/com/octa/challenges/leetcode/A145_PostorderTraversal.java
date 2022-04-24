package com.octa.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class A145_PostorderTraversal {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return array;
    }

    public void postOrder(TreeNode root) {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            array.add(root.val);
        }
    }
}
