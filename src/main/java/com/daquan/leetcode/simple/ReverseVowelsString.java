package com.daquan.leetcode.simple;

import java.util.Arrays;

/**
 * @Desc 反转字符串中的元音字母
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
public class ReverseVowelsString {
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        String[] sarr = s.split("");
        while (i < j){
            //从左边找元音
            while(!isYuanYin(s.charAt(i)) && i < j){
                i++;
            }
            while(!isYuanYin(s.charAt(j)) && i < j){
                j--;
            }
            if(i < j){
                //swap
                String temp = sarr[i];
                sarr[i] = sarr[j];
                sarr[j] = temp;
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < sarr.length; k++) {
            sb.append(sarr[k]);
        }
        return sb.toString();
    }

    public static boolean isYuanYin(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
