package com.daquan.leetcode.simple;

import java.math.BigInteger;

/**
 * @Desc 阶乘后的零
 * @Author zhangdaquan
 * @Date 2021/1/4
 */
public class TrailingZeroes {

    public static int trailingZeroes(int n) {
        BigInteger nFactorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }

        int zeroCount = 0;

        while (nFactorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            nFactorial = nFactorial.divide(BigInteger.TEN);
            zeroCount++;
        }

        return zeroCount;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
}
