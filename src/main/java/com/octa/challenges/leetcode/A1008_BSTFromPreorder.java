package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.TreeNode;

public class A1008_BSTFromPreorder {

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1; i<preorder.length; i++) {
            insert(root, preorder[i]);
        }
        return root;
    }

    public TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        if(val < root.val) {
            root.left = insert(root.left, val);
        }
        else if(val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
