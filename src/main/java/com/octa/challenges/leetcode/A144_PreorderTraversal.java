package com.octa.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class A144_PreorderTraversal {
    private List<Integer> array = new ArrayList();

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return array;
    }

    public void preOrder(TreeNode root) {
        if(root!=null) {
            array.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
