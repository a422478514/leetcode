package com.daquan.leetcode.simple;

/**
 * @Desc 相同的树
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class IsSameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p != null && q != null){
            //比较左叶子节点是否一致
            boolean b = isSameTree(p.left,q.left);
            boolean bb = p.val == q.val;
            boolean bbb = isSameTree(p.right,q.right);

            return b && bb && bbb;
        }else{
            if( p == null && q == null){
                return true;
            }else{
                return false;
            }
        }

    }


    public static void main(String[] args) {

    }

}
