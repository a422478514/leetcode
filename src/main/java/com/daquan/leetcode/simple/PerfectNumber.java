package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/1
 */
public class PerfectNumber {
    public static  boolean checkPerfectNumber(int num) {
        //
        if(num <= 1){ return false;}
        int sum = 1;
        for (int i = 2; i*i <= num; i++) {
            if(num%i == 0){
                sum += i;
                if(i*i != num){
                    sum += (num/i);
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(496));
    }
}
