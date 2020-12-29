package com.daquan.leetcode.simple;

/**
 * @Desc 最大子序和
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            //前数之和>0才累加，否则直接抛弃
            if (sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            //判断sum是否大于max
            if(sum > max){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
