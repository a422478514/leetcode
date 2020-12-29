package com.daquan.leetcode.simple;

/**
 * @Desc 删除重复数字
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int k = 0;//计数

        for (int i = 1; i < nums.length; i++) {
            //如果两数相等，则跳过
            if(nums[k] == nums[i]){

            }else{
                k++;
                //交换数字位置
                nums[k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
