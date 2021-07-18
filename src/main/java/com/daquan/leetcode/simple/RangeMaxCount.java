package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class RangeMaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0){
            return m*n;
        }
        int row = Integer.MAX_VALUE;
        int col = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            row = Math.min(row,ops[i][0]);
            col = Math.min(col,ops[i][1]);
        }
        return row*col;
    }
    

    public static void main(String[] args) {
    }
}
