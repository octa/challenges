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

    public TreeNode search(TreeNode root, T a) {
        if(root.getItem() == a) {
            return root;
        }
        if(root.getLeft() == null || root.getRight() == null) {
            return null;
        }
        if((Integer)a < (Integer)root.getLeft().getItem()) {
            root = search(root.getLeft(), a);
        }
        else {
            root = search(root.getRight(), a);
        }
        return root;
    }

    public TreeNode delete(TreeNode root, T a) {

        if(root == null) {
            return root;
        }

        if((Integer) a < (Integer) root.getItem()) {
            root.left = delete(root.getLeft(), a);
        }
        else if((Integer) a > (Integer) root.getItem()){
            root.right = delete(root.getRight(), a);
        }
        else {
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            root.a = findMin(root.right);
            root.right = delete(root.right, (T) root.a);
        }

        return root;
    }

    public T findMin(TreeNode node) {
        T min = (T) node.a;
        while(node.left!=null) {
            min = (T) node.left.a;
            node = node.left;
        }
        return min;
    }

}

//                          2
//                        /   \
//                       1     4
//                           /  \
//                          3    5