package com.daquan.leetcode.simple;

/**
 * @Desc 3的幂
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n%3 == 0){
            n=n/3;
        }
        return n==1;
    }
}
