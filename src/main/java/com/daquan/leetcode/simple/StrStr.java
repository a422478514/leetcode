package com.daquan.leetcode.simple;

/**
 * 实现 strStr()
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class StrStr {


    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.equals("")){
            return 0;
        }
        //从haystack逐个遍历
        for (int i = 0; i < haystack.length(); i++) {
            int k = i;//标记haystack的遍历到的位置
            //和needle中的字符逐个遍历
            int j = 0;

            while(k < haystack.length() && j < needle.length()){
                if(haystack.charAt(k) != needle.charAt(j)){
                    break;
                }
                k++;
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
}
