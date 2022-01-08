package com.daquan.leetcode.middle;

/**
 * 80. 删除有序数组中的重复项 II
 */
public class RemoveDuplicatesFromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //数组长度
        int len = nums.length;
        int i = 1;
        //用来记住当前数字出现的次数
        int count = 1;
        //用来标记当前新数组的插入位置的前一位
        int pos = 0;
        while (i < len){
            //如果当前数字等于标记数字，则说明是重复数字,count++
            if(nums[pos] == nums[i]){
                count++;
            }else {
                //count重新计数
                count = 1;
            }
            //如果count<2后移pos
            if(count <= 2){
                //如果不是重复数字且则要替换
                nums[pos+1] = nums[i];
                pos++;
            }
            //下一个元素
            i++;
        }
        //pos后的元素全部归0
//        while (pos < len){
//            nums[pos++] = 0;
//        }
        return pos+1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums);
    }
}
