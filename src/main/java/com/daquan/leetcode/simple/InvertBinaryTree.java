package com.daquan.leetcode.simple;

/**
 * @Desc 翻转二叉树
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class InvertBinaryTree {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public TreeNode invertTree(TreeNode root) {
      if(root == null){
          return null;
      }
      TreeNode right = invertTree(root.left);
      TreeNode  left = invertTree(root.right);
      root.right = left;
      root.left = right;
      return root;
    }
}
