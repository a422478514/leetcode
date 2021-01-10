package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class LowestCommonAncestor {

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

      while(true){
          //如果p>root && q>root，右边找
          if(p.val > root.val && q.val > root.val){
              root = root.right;
          }else if(p.val < root.val && q.val < root.val){
              root = root.left;
          }else{
              break;
          }
          //如果p<root && q<root，左边找
          //如果已找到
      }
      return root;
    }
}
