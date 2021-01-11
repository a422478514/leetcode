package com.daquan.leetcode.simple;

/**
 * @Desc Nim 游戏
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
public class NimGame {

    public boolean canWinNim(int n) {
        int remain = n%8;
        if(remain == 4 || remain == 0){
            return false;
        }
        return true;
    }
}
