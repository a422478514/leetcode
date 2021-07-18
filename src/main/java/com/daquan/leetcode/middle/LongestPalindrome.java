package com.daquan.leetcode.middle;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/11
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            //left = i right = i向两边扩展
            int len1 = expandAroundCenter(s, i, i);
            //left = i right = i+1 向两边扩展
            int len2 = expandAroundCenter(s, i, i + 1);
            //找到扩展后最大值
            int len = Math.max(len1, len2);
            //和历史比较
            if (len > end - start) {
                //如果是历史最大则计算字符串起始结束位置
                //计算起始位置
                start = i - (len - 1) / 2;
                //计算结束位置
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
