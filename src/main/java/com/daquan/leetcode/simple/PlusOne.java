package com.daquan.leetcode.simple;

import java.util.Arrays;

/**
 * @Desc 加一
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
            //加完之后更新数字
            int j = digits.length-1;
            while(j >= 0){
                int v = digits[j];
                if(v == 9){
                    digits[j] = 0;
                }else{
                    digits[j] = digits[j]+1;
                    break;
                }
                j--;
            }
            //说明越界了，高位补1
            if(j == -1 && digits[0] == 0){
                int []newDigits = new int[digits.length+1];
                newDigits[0] = 1;
                for (int i = 0; i < digits.length; i++) {
                    newDigits[i+1] = digits[i];
                }
                return newDigits;
            }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }
}
