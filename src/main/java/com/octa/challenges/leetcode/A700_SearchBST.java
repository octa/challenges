package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.TreeNode;

public class A700_SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        if(val < root.val) {
            root = searchBST(root.left, val);
        }
        else {
            root = searchBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        //[18,2,22,null,null,null,63,null,84,null,null]
        //63
        TreeNode root = new TreeNode(18);
        root.left = new TreeNode(2);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(63);
        root.right.right.right = new TreeNode(84);
        A700_SearchBST node = new A700_SearchBST();
        TreeNode search = node.searchBST(root, 63);
        inOrder(search);

    }

    public static void inOrder(TreeNode root) {
        if(root!=null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }
}
