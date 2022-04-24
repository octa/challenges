package com.octa.challenges.dsalgo.tree;

public class BinarySearchTree<T> {

    TreeNode root;

    public BinarySearchTree(T a) {
        TreeNode<T> treeNode = new TreeNode<>(a);
        this.root = treeNode;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode insert(TreeNode root, T a) {
        if(root==null) {
            root = new TreeNode(a);
            return root;
        }
        if((Integer)a>(Integer)root.getItem()) {
            root.right = insert(root.getRight(), a);
        }
        else {
            root.left = insert(root.getLeft(), a);
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if(root!=null) {
            inOrderTraversal(root.left);
            System.out.println(root.getItem());
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root) {
        if(root!=null) {
            System.out.println(root.getItem());
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root) {
        if(root!=null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.getItem());
        }
    }
}
