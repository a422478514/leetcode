package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 杨辉三角 II
 * @Author zhangdaquan
 * @Date 2021/1/1
 */
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            return list;
        }
        List<List<Integer>> listList = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowIndex+1; i++) {
            if(i == 0){
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                listList.add(list);
            }else if(i == 1){
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(1);
                listList.add(list);
            }else {
                List<Integer> list = new ArrayList<Integer>();
                List<Integer> preList = listList.get(i-1);
                list.add(1);
                for (int j = 1; j < i; j++) {
                    list.add(preList.get(j-1)+preList.get(j));
                }
                list.add(1);
                listList.add(list);
            }
        }
        return listList.get(rowIndex);
    }
}
