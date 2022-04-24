package com.octa.challenges.dsalgo.tree;

import java.util.ArrayList;
import java.util.List;

public class BalancingTree {

    public static<T> void main(String[] args) {
        Integer a = 8;
        BinarySearchTree binarySearchTree = new BinarySearchTree(a);
        binarySearchTree.insert(binarySearchTree.root, 5);
        binarySearchTree.insert(binarySearchTree.root, 4);
        binarySearchTree.insert(binarySearchTree.root, 3);
        binarySearchTree.insert(binarySearchTree.root, 2);
        binarySearchTree.insert(binarySearchTree.root, 1);
        binarySearchTree.inOrderTraversal(binarySearchTree.root);

        BalancingTree balancingTree = new BalancingTree();
        List<T> inOrder = new ArrayList<T>();
        balancingTree.inOrderToArray(binarySearchTree.root, inOrder);
        System.out.println("Balanced tree");
        TreeNode root = balancingTree.balance(inOrder, 0, inOrder.size()-1);
        BinarySearchTree binarySearchTree1 = new BinarySearchTree(null);
        binarySearchTree1.setRoot(root);
        binarySearchTree1.inOrderTraversal(binarySearchTree1.root);

    }

    public <T> void inOrderToArray(TreeNode<T> root, List<T> inOrder) {
        if(root!=null) {
            inOrderToArray(root.left, inOrder);
            inOrder.add(root.a);
            inOrderToArray(root.right, inOrder);
        }
    }

    public <T> TreeNode balance(List<T> inOrder, int min, int max) {
        if(min > max) {
            return null;
        }
        int mid = (min+max)/2;
        TreeNode root = new TreeNode(inOrder.get(mid));
        root.left = balance(inOrder, min, mid-1);
        root.right = balance(inOrder, mid+1, max);
        return root;
    }
}
