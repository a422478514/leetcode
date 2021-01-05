package com.daquan.leetcode.simple;

/**
 * @Desc 存在重复元素 II
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length-1; i++) {
            //从后向前遍历
            for (int j = nums.length-1; j > i; j--) {
                if(nums[i] == nums[j] && (j-i) <=k){
                    return true;
                }
            }
        }
        return false;
    }
}
