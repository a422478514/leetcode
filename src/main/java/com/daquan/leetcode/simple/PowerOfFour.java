package com.daquan.leetcode.simple;

/**
 * @Desc 4的幂
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if( n < 4){
            return false;
        }
        while (n%4 == 0){
            n=n/4;
        }
        return  n == 1;
    }
}
