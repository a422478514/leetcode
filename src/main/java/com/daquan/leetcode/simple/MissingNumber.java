package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size*(size+1)/2;
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }
}
