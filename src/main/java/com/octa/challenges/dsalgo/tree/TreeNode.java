package com.octa.challenges.dsalgo.tree;

public class TreeNode<T> {

    T a;
    TreeNode left, right;

    public TreeNode(T a) {
        this.a = a;
        this.left = null;
        this.right = null;
    }

    public T getItem() {
        return a;
    }

    public void setItem(T a) {
        this.a = a;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
