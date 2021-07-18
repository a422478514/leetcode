package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/8
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        int [][] newMat = new int[r][c];
        int rr = 0;
        int cc = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                //先铺第一行的c列
                if(cc < c){
                }else{
                    rr++;
                    cc = 0;
                }
                newMat[rr][cc] = mat[i][j];
                cc++;
            }
        }
        return newMat;
    }
}
