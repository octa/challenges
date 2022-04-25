package com.octa.challenges.leetcode;

import com.octa.challenges.leetcode.domain.ListNode;
import com.octa.challenges.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class A109_SortedListToBST {

    public static void main(String[] args) {
        ListNode array = new ListNode(-10);
        array.next = new ListNode(-3);
        array.next.next = new ListNode(0);
        array.next.next.next = new ListNode(5);
        array.next.next.next.next = new ListNode(9);

        A109_SortedListToBST sortedListToBST = new A109_SortedListToBST();
        TreeNode root = sortedListToBST.sortedListToBST(array);
        root.inOrder(root);
    }

    public TreeNode sortedListToBST(ListNode head) {
        List array = listToArray(head);
        return buildTree(array, 0, array.size()-1);
    }

    public TreeNode buildTree(List<Integer> array, int min, int max) {
        if(min > max) {
            return null;
        }
        int mid = (min+max)/2;
        TreeNode root = new TreeNode(array.get(mid));
        root.left = buildTree(array, min, mid-1);
        root.right = buildTree(array, mid+1, max);
        return root;
    }

    public List listToArray(ListNode head) {
        //int size = size(head);
        List<Integer> array = new ArrayList();
        ListNode marker = head;
        while(marker!=null) {
            array.add(marker.val);
            marker = marker.next;
        }
        return array;
    }

    public int size(ListNode head) {
        int size = 0;
        ListNode marker = head;
        while(marker!=null) {
            size++;
            marker = head.next;
        }
        return size;
    }
}
