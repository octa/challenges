package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.TreeNode;

public class A2236_RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return root.left.val+root.right.val == root.val;
    }
}
