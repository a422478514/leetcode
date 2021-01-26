package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/19
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        if(s.length() <= 1){
            return false;
        }
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            //要能整除i
            if(len%i != 0){
                continue;
            }
            boolean b = true;
            for (int j = 0; j < s.length()-i; j=j+1) {
                if(s.charAt(j) != s.charAt(j+i)){
                    b = false;
                    break;
                }
            }
            if(b){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aaaaaaaaaaaaa"));
    }
}
