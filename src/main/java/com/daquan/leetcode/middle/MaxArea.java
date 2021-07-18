package com.daquan.leetcode.middle;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/14
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while (l < r){
            //计算最大容积
            int c = (r-l)*Math.min(height[r],height[l]);
            if(c > max){
                max = c;
            }
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
