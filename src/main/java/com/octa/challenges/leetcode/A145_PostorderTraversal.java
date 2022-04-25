package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class A145_PostorderTraversal {

    private List<Integer> array = new ArrayList();

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return array;
    }

    public void postOrder(TreeNode root) {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            array.add(root.val);
        }
    }
}
