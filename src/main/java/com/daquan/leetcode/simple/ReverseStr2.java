package com.daquan.leetcode.simple;

/**
 * @Desc 反转字符串 II
 * @Author zhangdaquan
 * @Date 2021/7/5
 */
public class ReverseStr2 {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int start = 0; start < charArray.length; start += 2*k) {
            int i = start;
            int j = Math.min(start + k - 1, charArray.length -1);
            while (i < j){
                char tmp = charArray[i];
                charArray[i++] = charArray[j];
                charArray[j--] = tmp;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {

    }
}
