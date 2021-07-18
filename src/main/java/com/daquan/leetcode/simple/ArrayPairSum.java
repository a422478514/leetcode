package com.daquan.leetcode.simple;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/8
 */
public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int v = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2 == 0){
                v+= nums[i];
            }
        }
        return v;
    }

    public static void main(String[] args) {
        int [] num = new int[]{10,5,2,1,4,6};
        System.out.println(arrayPairSum(num));
    }

}
