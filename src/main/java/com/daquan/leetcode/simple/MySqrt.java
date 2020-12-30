package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class MySqrt {
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while( start < end ){
            int mid = (start+end)/2;
            if((x/mid) == mid){
                    return mid;
                }
                if((x/mid) <= mid){
                    end = mid - 1;
                }
                if((x/mid) >= mid){
                    start = mid + 1;
                }
        }
        //矫正下最后的结果
        if((x/start) < start){
            return  start -1;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
