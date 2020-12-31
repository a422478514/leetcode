package com.daquan.leetcode.simple;

/**
 * @Desc 二叉树的最大深度
 * @Author zhangdaquan
 * @Date 2020/12/31
 */
public class TreeMaxDeep {
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

    public static int maxDepth(TreeNode root) {
        //return maxDepth(root,0);

        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static int maxDepth(TreeNode t,int height){
        if(t != null){
            //遍历左子树
            height++;
            int leftHeigh = maxDepth(t.left,height);
            int rightHeigh = maxDepth(t.right,height);
            if(leftHeigh > rightHeigh){
                return leftHeigh;
            }else{
                return rightHeigh;
            }
        }

        return height;
    }


}
