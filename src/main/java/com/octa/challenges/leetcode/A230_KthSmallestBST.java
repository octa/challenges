package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class A230_KthSmallestBST {

    List<Integer> array = new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return array.get(k-1);
    }

    public TreeNode inOrder(TreeNode root) {
        if(root!=null) {
            inOrder(root.left);
            array.add(root.val);
            inOrder(root.right);
        }
        return root;
    }

}
