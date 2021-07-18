package com.daquan.leetcode.middle;

import java.util.Arrays;

/**
 * @Desc 16. 最接近的三数之和
 * @Author zhangdaquan
 * @Date 2021/7/17
 */
public class ThreeSumClosest {
//    public static int threeSumClosest(int[] nums, int target) {
//        // 排序
//        Arrays.sort(nums);
//        int closestNum = nums[0] + nums[1] + nums[2];
//        for (int i = 0; i < nums.length - 2; i++) {
//            int l = i + 1, r = nums.length - 1;
//            while (l < r) {
//                int threeSum = nums[l] + nums[r] + nums[i];
//                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
//                    closestNum = threeSum;
//                }
//                if (threeSum > target) {
//                    r--;
//                } else if (threeSum < target) {
//                    l++;
//                } else {
//                    // 如果已经等于target的话, 肯定是最接近的
//                    return target;
//                }
//
//            }
//
//        }
//
//        return closestNum;
//    }

    public static int threeSumClosest(int[] nums, int target) {
        // 排序
        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            //从左开始遍历
            int l = i + 1;
            //从右开始遍历
            int r = nums.length - 1;
            while (l < r) {
                //计算三数总和
                int threeSum = nums[i] + nums[l] + nums[r];
                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                    //说明新的三数和更接近
                    closestNum = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    return target;
                }
            }
        }
        return closestNum;
    }

    public static void main(String[] args) {
        int i = threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(i);
    }
}
