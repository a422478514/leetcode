package com.daquan.leetcode.simple;

import java.math.BigInteger;

/**
 * @Desc 2的幂
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        BigInteger _1024 = new BigInteger("1024");
        BigInteger nBig = new BigInteger(String.valueOf(n));
        BigInteger sum = new BigInteger("1");
        while (sum.compareTo(nBig) < 0){
            sum = sum.multiply(_1024);
        }
        for (int i = 0; i < 10; i++) {
            if(sum.compareTo(nBig) == 0){
                return true;
            }
            sum = sum.divide(new BigInteger("2"));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
