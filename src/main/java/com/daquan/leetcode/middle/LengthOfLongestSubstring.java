package com.daquan.leetcode.middle;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {


    //滑动窗口
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int rk = -1;//右指针
        for (int i = 0; i < chars.length; i++) {
           if(i != 0){
               //左侧滑动
               set.remove(chars[i-1]);
           }
           while (rk+1 < chars.length && !set.contains(chars[rk+1])){
               rk++;
               set.add(chars[rk]);
           }
           maxLen = Math.max(maxLen,set.size());
        }
        return maxLen;
    }

    //暴力
//    public static int lengthOfLongestSubstring(String s) {
//        char[] chars = s.toCharArray();
//        Set<Character> set = new HashSet<>();
//        int maxLen = 0;
//        for (int i = 0; i < chars.length; i++) {
//            int j = i;
//            for (; j < chars.length; j++) {
//                if(set.contains(chars[j])){
//                    break;
//                }
//                set.add(chars[j]);
//            }
//            maxLen = Math.max(set.size(),maxLen);
//            if(j < chars.length){
//                set.remove(chars[j]);
//            }
//        }
//        return maxLen;
//    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("abcabcbb");
        System.out.println(123);
    }
}
