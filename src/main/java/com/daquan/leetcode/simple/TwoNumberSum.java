package com.daquan.leetcode.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Desc 两数之和
 * @Author zhangdaquan
 * @Date 2020/12/28
 */
public class TwoNumberSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] newArr = new int[2];
        //把数字存入map<，下标>中
        Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();

        //迭代数组中元素，并判断map中是否存在与之能组合成target的元素
        for(int i = 0 ; i < nums.length ; i++){
            if( numMap.containsKey(target - nums[i])){
                newArr[0] = i;
                newArr[1] = numMap.get(target - nums[i]);
            }else {
                numMap.put(nums[i],i);
            }
        }
        return newArr;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int [] newArr = new int[2];
       //双层for循环

        for (int i = 0; i < nums.length-1; i++) {
            int num = nums[i];

            for (int j = i+1; j < nums.length; j++) {
                if( num == (target - nums[j])){
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int []arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr,9)));

    }
}
