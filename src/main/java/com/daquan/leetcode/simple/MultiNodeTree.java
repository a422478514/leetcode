package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class MultiNodeTree {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        preorder(root,list);
        return list;
    }

    public void preorder(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        List<Node> nodeList = root.children;
        if(nodeList != null){
            for (int i = 0; i < nodeList.size(); i++) {
                preorder(nodeList.get(i),list);
            }
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


}
