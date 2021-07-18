package com.daquan.leetcode.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i],i);
        }
        int minIndex = 9999;
        List<String> str = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            int cur = i+map1.getOrDefault(list2[i],99999);
            if(minIndex > cur){
                str.clear();
                minIndex = cur;
                str.add(list2[i]);
            }else if(minIndex == cur){
                str.add(list2[i]);
            }
        }
        return str.toArray(new String[0]);
    }
}
