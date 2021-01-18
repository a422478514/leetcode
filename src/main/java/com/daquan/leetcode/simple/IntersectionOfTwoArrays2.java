package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/12
 */
public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int k = 0;
        int nums[] = new int[nums1.length];
        Map<Integer,Integer> nums1Map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums1.length; i++) {
            Integer n = nums1Map.get(nums1[i]);
            if(n == null){
                nums1Map.put(nums1[i],1);
            }else{
                nums1Map.put(nums1[i],n+1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(nums1Map.containsKey(nums2[i])){
                nums[k++] = nums2[i];
                Integer m = nums1Map.get(nums2[i]);
                if(m <= 1){
                    nums1Map.remove(nums2[i]);
                }else{
                    nums1Map.put(nums2[i],m-1);
                }
            }
        }
        int []numsCopy = new int[k];
        for (int i = 0; i < k; i++) {
            numsCopy[i] = nums[i];
        }
        return numsCopy;
    }
}
