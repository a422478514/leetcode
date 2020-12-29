package com.daquan.leetcode.simple;

/**
 * @Desc 删除数组中指定元素
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class RemoveTargetDuplicates {

    public static int removeElement(int[] nums, int val) {
        int k = 0;//计数
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
            }else{
                //遇到不一样的元素，且可以向前移动，则向前
                    nums[k] = nums[i];

                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));
    }
}
