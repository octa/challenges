package com.octa.challenges.dsalgo.tree;

public class Bootstrapper {

    public static void main(String[] args) {
        Integer a = 2;
        BinarySearchTree binarySearchTree = new BinarySearchTree(a);
        binarySearchTree.insert(binarySearchTree.root, 4);
        binarySearchTree.insert(binarySearchTree.root, 1);
        binarySearchTree.insert(binarySearchTree.root, 3);
        binarySearchTree.insert(binarySearchTree.root, 5);
        System.out.println(binarySearchTree.getRoot().getItem());
        System.out.println(binarySearchTree.getRoot().getLeft().getItem());
        System.out.println(binarySearchTree.getRoot().getRight().getItem());
        System.out.println("Inorder traversal");
        binarySearchTree.inOrderTraversal(binarySearchTree.root);
        System.out.println("Preorder traversal");
        binarySearchTree.preOrderTraversal(binarySearchTree.root);
        System.out.println("Postorder traversal");
        binarySearchTree.postOrderTraversal(binarySearchTree.root);
        System.out.println("Search");
        TreeNode node = binarySearchTree.search(binarySearchTree.root, 4);
        System.out.println(node == null? "Not found": node.getItem());
        binarySearchTree.delete(binarySearchTree.root, 4);
        binarySearchTree.inOrderTraversal(binarySearchTree.root);
    }
}
