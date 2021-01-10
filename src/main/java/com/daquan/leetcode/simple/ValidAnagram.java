package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/10
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        //把s每个字母放进map里，value为出现次数
        Map<String,Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.charAt(i)+"";
            Integer v = sMap.get(str);
            if(v == null){
                v = 0;
            }
            v++;
            sMap.put(str,v);
        }
        //判断t
        for (int i = 0; i < t.length(); i++) {
            String str = t.charAt(i)+"";
            Integer v = sMap.get(str);
            if(v == null){
                return false;
            }
            v--;
            if(v == 0){
                sMap.remove(str);
            }else{
                sMap.put(str,v);
            }
        }
        return sMap.isEmpty();
    }
}
