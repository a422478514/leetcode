package com.daquan.leetcode.simple;

/**
 * @Desc 反转字符串
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
public class ReverseString {
    public void reverseString(char[] s) {
        if(s.length < 2){
            return;
        }
        for (int i = 0; i < s.length / 2; i++) {
            //swap
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
