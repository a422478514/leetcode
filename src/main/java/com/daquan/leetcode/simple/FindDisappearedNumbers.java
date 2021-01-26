package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/19
 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int copy[] = new int[nums.length];
        Arrays.fill(copy,0);
        for (int i = 0; i < nums.length; i++) {
            copy[nums[i]-1]++;
        }
        for (int i = 0; i < copy.length; i++) {
            if(copy[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
