package com.daquan.leetcode.simple;

import java.util.HashMap;

/**
 * @Desc 两数之和
 * @Author zhangdaquan
 * @Date 2021/1/2
 */
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target-numbers[i])){
               int [] arr = new int[2];
               arr[0] = map.get(target-numbers[i])+1;
               arr[1] = i+1;
               return arr;
            }else{
                map.put(numbers[i],i);
            }
        }
        return null;
    }
}
