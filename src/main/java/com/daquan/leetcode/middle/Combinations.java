package com.daquan.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
        List curResult = new ArrayList();
        dfs(finalResult,curResult,1,n,k);
        return finalResult;
    }

    /**
     * 递归
     * @param finalResult 最终结果集
     * @param curResult 封装临时结果集
     * @param cur 当前遍历到的数字
     * @param n 数字最大值
     * @param k 用来计数
     */
    public void dfs(List<List<Integer>> finalResult,List curResult,int cur,int n,int k){
        //当前已凑成K个数字了
        if(k <= 0){
            finalResult.add(new ArrayList<Integer>(curResult));
            return;
        }
        //已搜索到尾部
        if(cur > n){
            return;
        }
        //尝试添加当前数字
        curResult.add(cur);
        dfs(finalResult,curResult,cur+1,n,k-1);
        //回溯，删除当前数字
        curResult.remove(curResult.size()-1);
        dfs(finalResult,curResult,cur+1,n,k);
    }
}
