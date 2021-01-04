package com.daquan.leetcode.simple;

/**
 * @Desc 多数元素
 * @Author zhangdaquan
 * @Date 2021/1/4
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int cur = nums[0];//指向当前元素
        int total = 1;
        //数量大于n/2，则可假设至少有2个连续的数字
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != cur){
                total--;
                if(total == 0){
                    cur = nums[i];
                    total = 1;
                }
            }else{
                total++;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,1,1,1,1,2,2}));
    }
}
