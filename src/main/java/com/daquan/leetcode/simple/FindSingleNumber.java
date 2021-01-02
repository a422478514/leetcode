package com.daquan.leetcode.simple;

/**
 * @Desc 只出现一次的数字
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class FindSingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if( nums[i] == nums[j] && i != j){
                    isSingle = false;
                }
            }
            if(isSingle){
                return nums[i];
            }
        }
        return 0;
    }
}
