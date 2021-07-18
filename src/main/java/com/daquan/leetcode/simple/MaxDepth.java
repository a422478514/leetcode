package com.daquan.leetcode.simple;

import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/7
 */
public class MaxDepth {
    int max = 0;
    public int maxDepth(Node root) {
        //
        if(root != null){
            dfs(root,0);
        }

        return max;
    }

    public int dfs(Node root,int deep){
        if(root != null){
            //当前深度+1
            deep++;
            max = deep > max ? deep : max;
            for(Node node : root.children){
                if(node != null){
                    dfs(node,deep);
                }
            }
        }
        return deep;
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
