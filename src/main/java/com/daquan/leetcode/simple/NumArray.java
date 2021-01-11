package com.daquan.leetcode.simple;

/**
 * @Desc 区域和检索 - 数组不可变
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
class NumArray {

    int nums[] ;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum+=nums[k];
        }
        return sum;
    }
}