package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 汇总区间
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums == null || nums.length == 0){
            return list;
        }
        //汇总
        int startNum = nums[0];
        int endNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(endNum+1 == nums[i]){
                //两数相邻，则连续
                endNum = nums[i];
            }else{
                //不连续了，重新记录
                if(startNum == endNum){
                    list.add(startNum+"");
                }else {
                    list.add(startNum+"->"+endNum);
                }
                //重新初始化起始
                startNum = nums[i];
                endNum = nums[i];
            }
        }
        //不连续了，重新记录
        if(startNum == endNum){
            list.add(startNum+"");
        }else {
            list.add(startNum+"->"+endNum);
        }
        return list;
    }
}
