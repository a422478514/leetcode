package com.daquan.leetcode.middle;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desc
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 *
 * 示例 1:
 *
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * @Author zhangdaquan
 * @Date 2021/1/6
 */
public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }

    public static int findDuplicate2(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[Math.abs(nums[i])] < 0)
                return Math.abs(nums[i]);
            else
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
        }
        return 0;
    }

    public static int findDuplicate3(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static int findDuplicate4(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println(slow);
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate4(new int[]{3,1,3,4,2}));
    }
}
