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

    /*
    class Solution {
        static int idx;
        public int kthSmallest(TreeNode root, int k) {
            idx=0;
            int ans[]=new int[1];
            inOrder(root,k,ans);
            return ans[0];
        }

        static void inOrder(TreeNode root,int k,int ans[]) {
            if(root==null)
                return;
            inOrder(root.left,k,ans);
            idx++;
            if(idx==k)
                ans[0]=root.val;
            inOrder(root.right,k,ans);
        }
    }
     */

}
