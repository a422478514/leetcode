package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/12
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int n = num/2;
        for (int i = 1; i <= n; i++) {
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}
