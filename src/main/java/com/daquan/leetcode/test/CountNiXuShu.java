package com.daquan.leetcode.test;

import java.util.Arrays;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/17
 */
public class CountNiXuShu {

    public long count = 0;   //全局变量，使用合并排序，计算逆序对数
    //使用归并排序方法计算数组A中的逆序对数
    public void getReverseCount(int[] A) {
        if(A.length > 1) {
            int[] leftA = getHalfArray(A, 0);   //数组A的左半边元素
            int[] rightA = getHalfArray(A, 1);  //数组A的右半边元素
            getReverseCount(leftA);
            getReverseCount(rightA);
            mergeArray(A, leftA, rightA);
        }
    }
    //根据judge值判断，获取数组A的左半边元素或者右半边元素
    public int[] getHalfArray(int[] A, int judge) {
        int[] result;
        if(judge == 0) {   //返回数组A的左半边
            result = new int[A.length / 2];
            for(int i = 0;i < A.length / 2;i++)
                result[i] = A[i];
        } else {    //返回数组的右半边
            result= new int[A.length - A.length / 2];
            for(int i = 0;i < A.length - A.length / 2;i++)
                result[i] = A[A.length / 2 + i];
        }
        return result;
    }
    //合并数组A的左半边和右半边元素，并按照非降序序列排列
    public void mergeArray(int[] A, int[] leftA, int[] rightA) {
        int len = 0;
        int i = 0;
        int j = 0;
        int lenL = leftA.length;
        int lenR = rightA.length;
        while(i < lenL && j < lenR) {
            if(leftA[i] > rightA[j]) {
                System.out.println("左边界："+A[len] + " 右边界：" + rightA[j] + " 逆序数长度：" + (lenL - i));
                A[len++] = rightA[j++]; //将rightA[j]放在leftA[i]元素之前，那么leftA[i]之后lenL - i个元素均大于rightA[j]
                count += (lenL - i);   //合并之前，leftA中元素是非降序排列，rightA中元素也是非降序排列。所以，此时就新增lenL -　i个逆序对
            } else {
                A[len++] = leftA[i++];
            }
        }
        while(i < lenL)
            A[len++] = leftA[i++];
        while(j < lenR)
            A[len++] = rightA[j++];
    }

    public static void main(String[] args){
        long t1 = System.currentTimeMillis();
        int []a = new int[]{11,0,-14,-7,17,-2,16,22};
        CountNiXuShu test = new CountNiXuShu();
        int[] A = a;
        test.getReverseCount(A);
        long t2 = System.currentTimeMillis();
        System.out.println("分治法得到结果："+test.count+"， 耗时："+(t2 - t1)+"毫秒");
    }
}
