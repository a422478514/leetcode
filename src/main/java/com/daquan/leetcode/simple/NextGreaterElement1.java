package com.daquan.leetcode.simple;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/26
 */
public class NextGreaterElement1 {
    //nums1 = [4,1,2], nums2 = [1,3,4,2]
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length];
        Arrays.fill(nums,-1);
        for (int i = 0; i < nums1.length; i++) {
            //是否找到和i相等的
            boolean founded = false;
            for (int j = 0; j < nums2.length; j++) {
                 if(nums1[i] == nums2[j]){
                     founded = true;
                 }
                 if(founded && nums1[i] < nums2[j]){
                     nums[i] = nums2[j];
                     break;
                 }
            }
        }
        return nums;
    }

//    public int[] nextGreaterElement(int[] findNums, int[] nums) {
//        Stack < Integer > stack = new Stack < > ();
//        HashMap < Integer, Integer > map = new HashMap < > ();
//        int[] res = new int[findNums.length];
//        for (int i = 0; i < nums.length; i++) {
//            while (!stack.empty() && nums[i] > stack.peek())
//                map.put(stack.pop(), nums[i]);
//            stack.push(nums[i]);
//        }
//        while (!stack.empty())
//            map.put(stack.pop(), -1);
//        for (int i = 0; i < findNums.length; i++) {
//            res[i] = map.get(findNums[i]);
//        }
//        return res;
//    }

}
