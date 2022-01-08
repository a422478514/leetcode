package com.daquan.leetcode.simple;

public class HammingWeight {
    public int hammingWeight(int n) {
        //令n与2的i次与，当不为0时则必有一个1
        int ret = 0;
        int cur = 1;
        for (int i = 0; i < 32; i++){
            cur = cur<<1;
            if((cur&n) != 0){
                ret++;
            }
        }
        return ret;
    }
}
