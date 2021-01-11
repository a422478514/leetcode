package com.daquan.leetcode.simple;

import java.util.HashSet;
import java.util.Set;


/**
 * @Desc 两个数组的交集
 * @Author zhangdaquan
 * @Date 2021/1/11
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k = 0;
        Set<Integer> nums1Set = new HashSet<Integer>();
        Set<Integer> uniqueSet = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(nums1Set.contains(nums2[i])){
                uniqueSet.add(nums2[i]);
            }
        }
        int []numsCopy = new int[uniqueSet.size()];
        for (Integer i : uniqueSet){
            numsCopy[k++] = i;
        }
        return numsCopy;
    }
}
