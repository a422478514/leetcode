package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/26
 */
public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int arr[] = new int[2];
        int sqrt = (int)Math.sqrt(area);
        while (area%sqrt != 0){
            sqrt--;
        }
        arr[0] = area/sqrt;
        arr[1] = sqrt;
        return arr;
    }
}
