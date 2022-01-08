package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;


public class PreorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        result.clear();
        recursive(root, result);
        return result;
    }

    void recursive(TreeNode root,List<Integer> result){
        if(root != null){
            result.add(root.val);
            recursive(root.left,result);
            recursive(root.right,result);
        }
    }
}
