package com.daquan.leetcode.test;

import java.math.BigDecimal;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/8
 */
public class Test {
    public static void main(String[] args) {
        BigDecimal mtCommissionRate;
        mtCommissionRate = new BigDecimal(-0.01);
        if(mtCommissionRate.compareTo(new BigDecimal(0)) < 0  || mtCommissionRate.compareTo(new BigDecimal(100))  > 0){
            System.out.println(123);
        }else{
            System.out.println(234);
        }
    }
}
