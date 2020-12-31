package com.daquan.leetcode.simple;

/**
 * @Desc 二叉树的最小深度
 * @Author zhangdaquan
 * @Date 2020/12/31
 */
public class TreeMinDepth {
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
    public int minDepth(TreeNode root) {
        return minDepth(root,0);
    }

    public static int minDepth(TreeNode t, int height){
        if(t != null){
            //遍历左子树
            height++;
            int leftHeigh = minDepth(t.left,height);
            int rightHeigh = minDepth(t.right,height);
            //是叶子结点
            if( t.left == null && t.right == null){
                return height;
            }
            //不是叶子结点
            //左空则返回右子树最小高度
            if(t.left == null){
                return rightHeigh;
            }
            //右空则返回左子树最小高度
            if(t.right == null){
                return leftHeigh;
            }
            //都不空则返回两边最小高度
            if(leftHeigh < rightHeigh){
                return leftHeigh;
            }else{
                return rightHeigh;
            }
        }
        return height;
    }
    //未实现
    public static int minDepth2(TreeNode t){
        if(t == null){
            int leftHight = minDepth2(t.left);
            int rightHeight = minDepth2(t.right);
            //是叶子结点
            if( t.left == null && t.right == null){
                return 1;
            }
            //不是叶子结点
            //左空则返回右子树最小高度
            if(t.left == null){
                return rightHeight + 1;
            }
            //右空则返回左子树最小高度
            if(t.right == null){
                return leftHight + 1;
            }
            //都不空则返回两边最小高度
            if(leftHight < rightHeight){
                return leftHight + 1;
            }else{
                return rightHeight + 1;
            }
        }
         return 0;
    }
}
