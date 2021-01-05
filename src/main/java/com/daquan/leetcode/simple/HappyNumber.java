package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Desc 快乐数
 * @Author zhangdaquan
 * @Date 2021/1/5
 */
public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (true){
            //已经构成循环了
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            List<Integer> list = new ArrayList<Integer>();
            //找出每个位置的数字，并保存
            while(n > 10){
                list.add(n%10);
                n = n/10;
            }
            if(n == 10){
                list.add(1);
                list.add(0);
            }else{
                list.add(n);
            }
            //计算总和
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i) * list.get(i);
            }
            if(sum == 1){
                return true;
            }
            n = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }
}
