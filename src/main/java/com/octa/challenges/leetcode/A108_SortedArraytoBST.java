package com.octa.challenges.leetcode;

public class A108_SortedArraytoBST {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        A108_SortedArraytoBST sortedArraytoBST = new A108_SortedArraytoBST();
        TreeNode node = sortedArraytoBST.sortedArrayToBST(nums);
        System.out.println(node);
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }

    public TreeNode buildTree(int[] nums, int min, int max) {
        if(min > max) {
            return null;
        }
        int mid = (min+max)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, min, mid-1);
        node.right = buildTree(nums, mid+1, max);
        return node;
    }
}
