package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class FindLHS {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int lhs = 0;
        for (int i = 0; i < nums.length; i++) {
            int v = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],v);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer a = map.getOrDefault(nums[i],0);
            Integer b = map.getOrDefault(nums[i] + 1, 0);
            if(b != 0 && (a+b) > lhs){
                lhs = a + b;
            }
        }
        return lhs;
    }
}
