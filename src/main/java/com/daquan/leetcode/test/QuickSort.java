package com.daquan.leetcode.test;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/17
 */
public class QuickSort {
    //快速排序
   static void quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            System.out.println("排序中：主元=" + x + " 左边界= " + l + " 右边界=" + r + " 当前数组=" + Arrays.toString(s));
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{15, 8, 23, 9, 32, 5, 1, 17};
        System.out.println("排序前："+Arrays.toString(arr));
        quick_sort(arr,0,arr.length-1);
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
