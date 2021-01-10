package com.daquan.leetcode.middle;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/7
 */
public class LongestIncreasingSubsequence {
    //answer
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        //定义dp数组，dp数组中的每个值存放着对应nums数组中每个位置的最长上升子序列
        int[] dp = new int[n];
        //每个位置的最长上升子序列最小也为1，即他自身（比如递减序列），可以填充为1
        Arrays.fill(dp, 1);
        //求nums中的每个位置的最长上升子序列，将值放到对应位置处的dp数组中
        for(int i = 0; i < nums.length; ++i){
            //状态转移方程
            for(int j = 0; j < i; ++j){
                //如果前面有小于nums[i]的数，那么就令当前dp[i] = dp[j] + 1，因为有多钟组合，我们取最大的一组值放到dp[i]中
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        //最终得到的dp数组就是每个位置的最长上升子序列的值，我们求出最大值就是该答案的解
        int res = 0;
        for(int k = 0; k < dp.length; k++){
            res = Math.max(res, dp[k]);
        }
        return res;
    }
    //answer2
    public static int lengthOfLIS2(int[] nums) {
        int n = nums.length;
        //新建数组dp[i]保存以num[i]结尾的最大子序列长度
        int []dp = new int[n];
        //初始化，最大子序列长度最少也是1，即自身
        Arrays.fill(dp,1);
        int max = 1;

        //确定以num[i]结尾的最大子序列长度
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                //确定状态转移方程
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                if(max < dp[i]){
                    max = dp[i];
                }
            }
        }


        return max;
    }

}
