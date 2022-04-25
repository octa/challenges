package com.octa.challenges.leetcode.domain;

public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public void inOrder(TreeNode root) {
            if(root!=null) {
                inOrder(root.left);
                System.out.println(root.val);
                inOrder(root.right);
            }
        }
}
