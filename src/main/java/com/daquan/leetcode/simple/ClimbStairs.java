package com.daquan.leetcode.simple;

/**
 * @Desc 爬楼梯
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class ClimbStairs {

    static int arr[] = new int[100];
    //递归
    public static int climbStairs(int n) {
        if(arr[n] != 0){
            return arr[n];
        }
        //尝试从缓存中获取
        if(n == 1){
            arr[1] = 1;
            return 1;
        }
        if(n == 2){
            arr[2] = 2;
            return 2;
        }
        arr[n] = climbStairs(n-1) + climbStairs(n-2);
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
