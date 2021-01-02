package com.daquan.leetcode.simple;

/**
 * @Desc 路径总和
 * @Author zhangdaquan
 * @Date 2021/1/1
 */
public class TreeHasPathSum {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    boolean has = false;

    public boolean hasPathSum(TreeNode root, int sum) {
      if(root != null){
          calPathSum(root,sum,0);
          return has;
      }
      return false;
    }

    public void calPathSum(TreeNode root, int sum,int cur) {
        if(root != null){
            cur += root.val;
            //如果是叶子结点，且和是sum，则返回true
            if(root.left == null && root.right == null && cur == sum){
                has = true;
            }
            //迭代左子树
            calPathSum(root.left,sum,cur);
            //迭代右子树
            calPathSum(root.right,sum,cur);
        }
    }

}
