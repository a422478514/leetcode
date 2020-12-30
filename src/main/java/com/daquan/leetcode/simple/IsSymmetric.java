package com.daquan.leetcode.simple;

/**
 * @Desc 对称二叉树
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class IsSymmetric {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public static boolean isSymmetric(TreeNode root) {
      return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode left,TreeNode right){
        if( left == null && right == null){
            return true;
        }
        if( left == null || right == null){
            return false;
        }
        return left.val == right.val && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;

        System.out.println(isSymmetric(root));
    }
}
