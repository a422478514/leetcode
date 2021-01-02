package com.daquan.leetcode.simple;

/**
 * @Desc 买卖股票的最佳时机
 * @Author zhangdaquan
 * @Date 2021/1/1
 */
public class ShareholderMaxProfit {

    public int maxProfit(int[] prices) {
        int min = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int m = prices[i] - prices[j];
                min = m < min ? m : min;
            }
        }
        return  -min;
    }

    public int maxProfit2(int[] prices) {
        //记录历史最低价
        int min = Integer.MAX_VALUE;
        //当天卖最高价值
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
            }else if( profit < (prices[i] - min)){
                profit = prices[i] - min;
            }
        }
        return profit;
    }

}
