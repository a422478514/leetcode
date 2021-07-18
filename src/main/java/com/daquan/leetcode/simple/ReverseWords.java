package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/7
 */
public class ReverseWords {
    public String reverseWords(String s) {
        char [] arr = s.toCharArray();
        int i = 0;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == ' ' || k == (arr.length-1)){
                //交换i - (k-1)
                int l = i;
                int r = (k == (arr.length-1)) ? k : (k-1);
                while (l < r){
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
                i = k+1;
            }
        }
        return new String(arr);
    }
}
