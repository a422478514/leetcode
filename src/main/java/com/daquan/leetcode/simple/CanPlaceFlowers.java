package com.daquan.leetcode.simple;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if((flowerbed[0] == 0 && n == 1) || n == 0){
                return true;
            }
            return false;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if( i == 0){
                if(flowerbed[i+1] == 0 && flowerbed[i] == 0){
                    flowerbed[0] = 1;
                    n--;
                }
                continue;
            }
            if(i == flowerbed.length-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
                continue;
            }
            //前后都不能有花，则栽花
            if( flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
