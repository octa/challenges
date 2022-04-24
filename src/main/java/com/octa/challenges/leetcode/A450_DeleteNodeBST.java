package com.octa.challenges.leetcode;

public class A450_DeleteNodeBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) {
            return root;
        }
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            int minimum = findMinimum(root.right);
            root.val = minimum;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    public int findMinimum(TreeNode root) {
        int minimum = root.val;
        while(root.left!=null) {
            minimum = root.left.val;
            root = root.left;
        }
        return minimum;
    }
}
