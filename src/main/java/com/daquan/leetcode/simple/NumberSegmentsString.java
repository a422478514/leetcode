package com.daquan.leetcode.simple;

/**
 * @Desc 字符串中的单词数
 * @Author zhangdaquan
 * @Date 2021/1/19
 */
public class NumberSegmentsString {
    public static int countSegments(String s) {
        char pre = ' ';
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            //判断当前字符不是空格且前一个是空格
            if(s.charAt(i) != ' ' && pre == ' '){
                sum++;
            }
            pre = s.charAt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }
}
