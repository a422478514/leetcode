package com.daquan.leetcode.simple;

/**
 * @Desc 计数质数
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum += judge(i)?1:0;
        }
        return sum;
    }

    public boolean judge(int num){
        //判断是否是质数
        for (int i = 2; i * i <=num; i++) {
            //说明能整除
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
