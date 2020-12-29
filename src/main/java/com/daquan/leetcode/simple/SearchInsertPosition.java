package com.daquan.leetcode.simple;

/**
 * 搜索插入位置
 * @Author zhangdaquan
 * @Date 2020/12/29
 */
public class SearchInsertPosition {

    
    public static int searchInsert(int[] nums, int target) {
        //顺序插入
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target){

            }else if(nums[i] == target){
                return i;
            }else{
                return i;
            }
        }
        return nums.length;
    }
}
