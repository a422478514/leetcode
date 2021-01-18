package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/16
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        //统计字符出现过的次数
        int []cell = new int[128];
        //
        for (int i = 0; i < s.length(); i++) {
            cell[s.charAt(i)]++;
        }
        //计算能够出现的最大回文数
        int count = 0;
        for (int i = 0; i < cell.length; i++) {
            count += cell[i]/2*2;
            if(cell[i]%2==1 && count%2==0){
                count++;
            }
        }

        return count;
    }

}
