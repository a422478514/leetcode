package com.daquan.leetcode.simple;

/**
 * @Desc 平衡二叉树
 * @Author zhangdaquan
 * @Date 2020/12/31
 */
public class IsBalancedTree {
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

    public boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        maxDepth(root,0);
        return isBalanced;
    }

    public int maxDepth(TreeNode t, int height){
        if(t != null){
            //遍历左子树
            height++;
            int leftHeigh = maxDepth(t.left,height);
            int rightHeigh = maxDepth(t.right,height);
            if(leftHeigh > rightHeigh){
                if( (leftHeigh - rightHeigh) > 1){
                    isBalanced = false;
                }
                return leftHeigh;
            }else{
                if( (rightHeigh - leftHeigh) > 1){
                    isBalanced = false;
                }
                return rightHeigh;
            }
        }
        return height;
    }

}
