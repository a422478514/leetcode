package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        while(num != 0 && (num % 2 == 0 || num % 3 == 0 || num % 5 == 0)){
            if(num%5 == 0){
                num = num/5;
            }
            if(num%3 == 0){
                num = num/3;
            }
            if(num%2 == 0){
                num = num/2;
            }
        }

        return num == 1;
    }

    public static void main(String[] args) {
        int number = 6;
    }
}
