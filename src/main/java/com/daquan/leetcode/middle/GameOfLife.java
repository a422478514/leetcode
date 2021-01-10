package com.daquan.leetcode.middle;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/7
 */
public class GameOfLife {

    public static void gameOfLife(int[][] board) {
        int x = board.length;
        int y = board[0].length;

        int [][]newBoard = new int[x][y];
        //双层for循环
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newBoard[i][j] = cal(i,j,board,x,y);
            }
        }
        //重新赋值
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }

    public static int cal(int x,int y,int[][] board,int m,int n){
        int sum = 0;
        //上 x-1 y
        if((x-1) >= 0){
            sum += board[x-1][y];
        }
        //下 x+1 y
        if((x+1) < m){
            sum += board[x+1][y];
        }
        //左 x y-1
        if((y-1) >= 0){
            sum += board[x][y-1];
        }
        //右 x y+1
        if((y+1) < n){
            sum += board[x][y+1];
        }
        //左上 x-1 y-1
        if((x-1) >= 0 && (y-1) >= 0){
            sum += board[x-1][y-1];
        }
        //左下 x+1 y-1
        if((x+1) < m && (y-1) >= 0){
            sum += board[x+1][y-1];
        }
        //右上 x-1 y+1
        if((x-1) >= 0 && (y+1) < n){
            sum += board[x-1][y+1];
        }
        //右下 x+1 y+1
        if((x+1) < m && (y+1) < n){
            sum += board[x+1][y+1];
        }

        if(sum < 2){
            return 0;
        }else if( sum >= 2 && sum <= 3){
            if(sum == 3 && board[x][y] == 0){
                return 1;
            }
            return board[x][y];
        }else{
            //不管是死细胞 活细胞都是死
            return 0;
        }
    }

    public static void main(String[] args) {
        gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
    }
}
