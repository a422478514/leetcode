package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/26
 */
public class MaxConsecutiveOnes {
    //[1,1,0,1,1,1]
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                sum++;
                if(max < sum){
                    max = sum;
                }
            }else{
                //重新计数
                sum = 0;
            }
        }
        return max;
    }
}
