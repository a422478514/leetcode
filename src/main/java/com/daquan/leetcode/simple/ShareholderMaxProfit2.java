package com.daquan.leetcode.simple;

/**
 * @Desc 买卖股票的最佳时机 II
 * @Author zhangdaquan
 * @Date 2021/1/1
 */
public class ShareholderMaxProfit2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length ; i++) {
            profit += Math.max(0,prices[i] - prices[i-1]);
        }
        return profit;
    }
}
