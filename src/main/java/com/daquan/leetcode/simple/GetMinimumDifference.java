package com.daquan.leetcode.simple;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/4
 */
public class GetMinimumDifference {
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


    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        int diff = Integer.MAX_VALUE;
        travelBefore(root,list);
        System.out.println(Arrays.toString(list.toArray()));
        //遍历找出最小值
        for (int i = 1; i < list.size(); i++) {
            if(diff > (list.get(i) - list.get(i-1))){
                diff = list.get(i) - list.get(i-1);
            }
        }
        return diff;
    }



    public static void travelBefore(TreeNode root,List<Integer> list){
        if(root != null){
            travelBefore(root.left,list);
            list.add(root.val);
            travelBefore(root.right,list);
        }
    }

    public static void main(String[] args) {

    }
}
