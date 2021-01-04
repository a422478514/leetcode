package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class ConvertToTitle {
    public String convertToTitle(int n) {
        String sarr[] = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                "P","Q","R","S","T","U","V","W","X","Y","Z"};
        String s = "";

        //先确定有几个字母
        while(n != 0){
            //为什么-1
            s = sarr[(n-1)%26] + s;
            n = (n-1)/26;
        }
        return s;
    }
}
