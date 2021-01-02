package com.daquan.leetcode.simple;

/**
 * @Desc 验证回文串
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if( s == null || s == ""){
            return true;
        }
        String pattern = "[^A-Za-z0-9]";
        //提前处理字符
        s = s.replaceAll(pattern,"");
        s = s.toLowerCase();

        if(s == ""){
            return true;
        }

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_a"));
        System.out.println(123);
    }
}
