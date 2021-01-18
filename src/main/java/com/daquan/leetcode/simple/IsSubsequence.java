package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/13
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        //同时遍历s和t
        int sLen = s.length();
        int tLen = t.length();
        //下标
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < sLen && tIndex < tLen){
            char sc = s.charAt(sIndex);
            char tc = t.charAt(tIndex);
            if(sc == tc){
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == sLen;
    }
}
