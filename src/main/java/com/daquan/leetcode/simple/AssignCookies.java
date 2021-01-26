package com.daquan.leetcode.simple;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/19
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        //给孩子胃口排序
        //给饼干大小排序
        Arrays.sort(g);
        Arrays.sort(s);
        //从左到右喂孩子
        int i = 0;
        int j = 0;
        int k = 0;//能喂饱k个孩子
        while (i < g.length && j < s.length){
            //如果g[i] > s[j] 喂不饱孩子，则需要下一块更大的饼干
            if(g[i] > s[j]){
                j++;
            }else{
                i++;
                j++;
                k++;
            }
        }
        return k;
    }
}
