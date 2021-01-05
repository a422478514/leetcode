package com.daquan.leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desc 存在重复元素
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
