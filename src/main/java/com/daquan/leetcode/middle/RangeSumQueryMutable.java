package com.daquan.leetcode.middle;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/7
 */
public class RangeSumQueryMutable {

    int []nums;

    public void numArray(int[] nums) {
        this.nums = nums;
    }

    public void update(int i, int val) {
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum;
    }
}
