package com.daquan.leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return set.size() > len ? len : set.size();
    }
}
