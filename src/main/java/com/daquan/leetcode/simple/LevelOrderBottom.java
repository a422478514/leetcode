package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 二叉树的层序遍历 II
 * @Author zhangdaquan
 * @Date 2020/12/31
 */
public class LevelOrderBottom {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    //
     List<List<Integer>> listList = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        maxDepth(root, 0);
        for (int i = 0; i < listList.size()/2; i++) {
            List temp = listList.get(i);
            int j = listList.size() - i -1;
            listList.set(i,listList.get(j));
            listList.set(j,temp);
        }
        return listList;
    }

    public int maxDepth(TreeNode t, int height){
        if(t != null){
            if(height == listList.size()){
                listList.add(new ArrayList<Integer>());
            }
            List<Integer> list = listList.get(height);
            list.add(t.val);
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
