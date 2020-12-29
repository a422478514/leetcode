package com.daquan.leetcode.simple;

/**
 * @Desc 是否是回文数
 * @Author zhangdaquan
 * @Date 2020/12/28
 */
public class Palindrome {

    public static boolean isPalindrome(int x) {
        int _x = x;
        //1.算出数字是几位数
        int newX = 0;
        while( x > 0){
            newX = (newX*10) + (x%10);
            x=x/10;
        }
        return _x == newX;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }

}
