package com.daquan.leetcode.simple;


import java.util.ArrayList;
import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/2/8
 */



public class FindModeInBinarySearchTree {

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

    int count = 0;  //记当前个数
    int max = 1;    //记最大值
    int pre_value = 0;  //记前一个value
    List<Integer> list = new ArrayList();  //一个个添加 只能用list

    public int[] findMode(TreeNode root) {
        BST(root);
        int [] result = new int [list.size()];  //初始化数组
        for(int i = 0; i < list.size(); i++) {  //list转array
            result[i] = list.get(i);
        }
        return result;
    }

    public void BST(TreeNode root) {    //左根右；中序遍历；从小到大
        if(root == null) return;
        BST(root.left);

        if(root.val == pre_value) { //如果和前一个相同 count+1
            count++;
        }  else {       //不同； 刷新count=1；刷新pre_value
            pre_value = root.val;
            count = 1;
        }
        if(count == max){   //如果是最大个数
            list.add(root.val); //加入list里
        } else if (count > max) {   //如果超过最大个数
            list.clear();   //清空整个list
            list.add(root.val); //加入list里（新的max）
            max = count;    //刷新max
        }

        BST(root.right);
    }
}
