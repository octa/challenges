package com.octa.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A94_InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || current!=null) {
            if(current!=null) {
                stack.push(current);
                current = current.left;
            }
            else {
                TreeNode node = stack.pop();
                inOrder.add(node.val);
                current = node.right;
            }
        }
        return inOrder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        A94_InorderTraversal inorderTraversal = new A94_InorderTraversal();
        List<Integer> node = inorderTraversal.inorderTraversal(root);
        node.stream().forEach(System.out::println);
    }

    /*
    private List<Integer> array = new ArrayList();

    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return array;
    }

    public void inOrder(TreeNode root) {
        if(root!=null) {
            inOrder(root.left);
            array.add(root.val);
            inOrder(root.right);
        }
    }
    */
}
