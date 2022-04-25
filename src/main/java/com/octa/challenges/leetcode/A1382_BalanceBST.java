package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class A1382_BalanceBST {
    List<Integer> array = new ArrayList();
    public TreeNode balanceBST(TreeNode root) {
        inOrderToArrayList(root);
        return balance(array, 0, array.size()-1);
    }

    public void inOrderToArrayList(TreeNode root) {
        if(root!=null) {
            inOrderToArrayList(root.left);
            array.add(root.val);
            inOrderToArrayList(root.right);
        }
    }

    public TreeNode balance(List<Integer> array, int min, int max) {
        if(min > max) {
            return null;
        }
        int mid = (min+max)/2;
        TreeNode root = new TreeNode(array.get(mid));
        root.left = balance(array, min, mid-1);
        root.right = balance(array, mid+1, max);
        return root;
    }
}
