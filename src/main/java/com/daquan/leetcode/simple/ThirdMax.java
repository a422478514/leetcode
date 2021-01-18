package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/16
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean has = false;
        for (int i = 0; i < nums.length; i++) {
            //第一次找最大值
            if(max <= nums[i]){
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            //第一次找最大值
            if(nums[i] != max && second <= nums[i]){
                second = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            //第一次找最大值
            if(nums[i] != max && nums[i] != second && third <= nums[i]){
                third = nums[i];
                has = true;
            }
        }
        return has ? third : max;
    }
}
