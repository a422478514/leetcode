package com.daquan.leetcode.middle;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/15
 */
public class IntToRoman {

    //把所有组合做成数组并对应成int值
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //把所有组合情况做成数组
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        //for循环从大到小迭代values，找出比num小一点的数附加到字符串尾部
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            while (num >= value){
                num-=value;
                sb.append(symbols[i]);
            }
            if(num == 0){
                break;
            }
        }
        return sb.toString();
    }
}
