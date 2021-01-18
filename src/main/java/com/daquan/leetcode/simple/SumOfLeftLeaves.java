package com.daquan.leetcode.simple;

import java.util.Stack;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/13
 */
public class SumOfLeftLeaves {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        //借助队列层序遍历
        Stack<TreeNode> treeStack = new Stack<TreeNode>();
        //先root进队
        treeStack.push(root);
        //依次出队
        int sum = 0;
        while (!treeStack.isEmpty()){
            TreeNode cur = treeStack.pop();
            //判断cur的左节点是不是叶子结点，是则累加
            if(cur.left != null && cur.left.left == null && cur.left.right == null){
                sum += cur.left.val;
            }
            //进左
            if(cur.left != null){
                treeStack.push(cur.left);
            }
            //进右
            if(cur.right != null) {
                treeStack.push(cur.right);
            }
        }
        return sum;
    }
}
