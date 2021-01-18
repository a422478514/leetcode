package com.daquan.leetcode.simple;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/1/12
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        if(s == null || s.equals("")){
            return -1;
        }
        //先保存magazine中的每个字符
        Map<Character,Integer> magMap = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer v = magMap.get(c);
            if(v == null){
                v= 0;
            }
            magMap.put(c,v+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(magMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return 0;
    }
}
