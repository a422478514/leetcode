package com.daquan.leetcode.simple;

/**
 * @Desc 合并两个有序数组
 * @Author zhangdaquan
 * @Date 2020/12/30
 */
public class MergeSortedArr {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums3 = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n){
            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                i++;
            }else{
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n){
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        for (int l = 0; l < (m+n); l++) {
            nums1[l] = nums3[l];
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1},1,new int[]{},0);
        System.out.println();
    }
}
