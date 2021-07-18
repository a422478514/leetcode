package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/8
 */
public class FindTilt {
    int sum = 0;
    public int findTilt(TreeNode root) {
        travel(root);
        return sum;
    }

    public int travel(TreeNode root){
        if(root == null){
            return 0;
        }
        //计算左子树之和
        int left = travel(root.left);
        System.out.println(left);
        //计算右子树之和
        int right = travel(root.right);
        System.out.println(right);
        //计算当前高度差
        if(left > right){
            sum += left - right;
        }else{
            sum += right - left;
        }
        return left + right + root.val;
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
