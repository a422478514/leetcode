package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/19
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int i = 0;
        while(n > 0)
        {
            i++;
            n -= i;
        }
        if(n < 0)
            return i-1;

        return i;
    }
}
