package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class BinaryTreePaths {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<String> binaryTreePaths(TreeNode root) {
        Stack<Integer> s = new Stack<Integer>();
        List<String> list = new ArrayList<String>();
        postRootTravel(root,s,list);
        return list;
    }

    public void postRootTravel(TreeNode root,Stack<Integer> s,List<String> list){
        if(root != null){
            s.push(root.val);
            if(root.left == null && root.right == null){
                //是一条路径
                //遍历
                String str = "";
                for (int i = 0; i < s.size(); i++) {
                    str += s.get(i) ;
                    if( i != s.size() - 1){
                        str += "->";
                    }
                }
                list.add(str);
            }
            //左子树
            postRootTravel(root.left,s,list);
            //右子树
            postRootTravel(root.right,s,list);
            s.pop();
        }
    }
}
