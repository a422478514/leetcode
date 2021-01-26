package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/19
 */
public class MinimumArrayElements {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;//找到最小的数字
        for (int i = 0; i < nums.length; i++) {
            if( min > nums[i] ){
                min = nums[i];
            }
        }
        //找出所有数字和min的差值之和
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i] - min;
        }
        return sum;
    }
}
