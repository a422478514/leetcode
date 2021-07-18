package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/6
 */
public class DiameterOfBinaryTree {
    //保存计算时最大值
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root);

        return max;
    }

    public int dfs(TreeNode root){
        if(root == null) {return 0;}
        //递归
        if(root.left != null || root.right != null){
            //找出左子树最大值
            int left = root.left == null ? 0 : (dfs(root.left)+1);
            //找出右子树最大值
            int right = root.right == null ? 0 : (dfs(root.right)+1);
            //计算左子树+右子树最大值之和与max比
            max = Math.max(max,left+right);
            return Math.max(left,right);
        }
        return 0;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
