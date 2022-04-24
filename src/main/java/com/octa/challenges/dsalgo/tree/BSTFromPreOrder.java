package com.octa.challenges.dsalgo.tree;

public class BSTFromPreOrder {

    public static void main(String[] args) {
        int array[] = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree binarySearchTree = new BinarySearchTree(array[0]);
        for(int i=1; i<array.length; i++) {
            binarySearchTree.insert(binarySearchTree.root, array[i]);
        }
        binarySearchTree.inOrderTraversal(binarySearchTree.root);
    }


}
